# Guion de la Lección 2: Variables y tipos de datos

## Detalles de la Lección
* **Duración aproximada:** 8 minutos
* **Público objetivo:** Estudiantes de secundaria (12 a 17 años)
* **Herramientas:** Diapositivas visuales y JDoodle (100% en línea)

---

## Estructura del Video

### Bloque 1: Una variable es una caja con etiqueta 
* **[En pantalla]:** Diapositiva "Una variable es una caja con etiqueta". Animación de una caja de cartón con la etiqueta `edad` y el chip `int`.
* **[Texto de apoyo visual]:** `Variable = tipo + nombre + valor` → `int edad = 15;`
* **[Narración (Voz en off)]:** 
> "Para que un programa recuerde información, necesitamos guardar datos. En Java, para eso usamos las **variables**. Piensa en ellas como cajas con etiquetas donde guardas un valor.
> 
> Declarar una variable tiene tres partes: el **tipo de dato**, el **nombre** y el **valor**. Por ejemplo, `int edad = 15;` significa: crea una caja llamada `edad`, de tipo entero, que guarda el número 15."

### Bloque 2: Los tipos de datos 
* **[En pantalla]:** Se resalta cada columna de la tabla de la diapositiva mientras aparece su tarjeta en el panel "Tipos de datos".
* **[Texto de apoyo visual]:** 
  * `int` → números enteros (`int edad = 15;`)
  * `double` → números con decimales (`double promedio = 18.5;`)
  * `String` → texto (`String nombre = "Lucía";`)
  * `boolean` → verdadero o falso (`boolean activo = true;`)
  * `char` → un solo carácter (`char inicial = 'L';`)
* **[Narración]:** 
> "Podemos ver aquí, por ejemplo, que `int` es el tipo que representa los **números enteros**; `double`, los **números con decimales**; `String` es el tipo de variable que guarda **texto**; `boolean` guarda datos de tipo **verdadero o falso**, representados como `true` o `false`; y, por último, el tipo de dato `char`, que es **un solo carácter**."

### Bloque 3: Reglas rápidas 
* **[En pantalla]:** Se resalta la fila "Reglas rápidas" de la diapositiva. Transición a la tarjeta "¡A programar! Práctica en JDoodle".
* **[Texto de apoyo visual]:** `"texto"` comillas dobles · `'c'` comillas simples · `18.5` decimales con punto · nombres sin espacios
* **[Narración]:** 
> "Cuidado con los detalles: el texto va entre **comillas dobles**, el carácter entre **comillas simples** y los decimales usan **punto**. Además, los nombres de variables no llevan espacios, y es mejor usar nombres que tengan sentido, como `edad` o `nombre`. ¡Vamos a programarlo en JDoodle! Escribe el código que mostraremos a continuación."

### Bloque 4: Demostración en Vivo — Declarar las variables 
* **[En pantalla]:** JDoodle ampliado a la izquierda. A la derecha, el panel "Memoria del programa": cada variable aparece como una caja que se llena con su valor al escribirla. Tarjetas TIP para `"Lucía"` y `'L'`.
* **[Textos flotantes en edición]:** 
  * `"Lucía" = Los String van entre comillas dobles`
  * `'L' = char: una sola letra entre comillas simples`
* **[Código que se escribe en JDoodle]:**
  ```java
  int edad = 15;
  double promedio = 18.5;
  String nombre = "Lucía";
  boolean esEstudiante = true;
  char inicial = 'L';
  ```
* **[Narración]:** 
> "Ahora nos encontramos en JDoodle. Aquí podemos observar que tenemos un código base: el programa `Variables`, que es justamente lo que vamos a aprender en la lección de hoy. Como explicamos antes, vamos a declarar aquí nuestras variables, justo como dice el comentario.
> 
> Primero colocamos una variable de tipo entero llamada `edad`, con un valor de 15. También una variable de tipo `double` llamada `promedio`, con un valor de 18.5, por poner un ejemplo. Vamos a crear una variable de tipo `String` llamada `nombre`; como indicamos en la parte teórica, el texto tiene que ir dentro de las **comillas dobles**, así que colocaremos *'Lucía'*. También crearemos una variable `boolean` llamada `esEstudiante`, con el valor `true`. Y por último, una variable `char` llamada `inicial`, la letra inicial de esa persona, con **una sola comilla**, ya que las variables `char` tienen que seguir esta regla."

### Bloque 5: Demostración en Vivo — Mostrar los valores 
* **[En pantalla]:** Tarjeta TIP `System.out.println()`. Las líneas de impresión se completan una por una. Animación del botón **Execute** y recorte de la consola real.
* **[Texto de apoyo visual]:** `"Nombre: " + nombre` → el `+` une texto con el valor de la variable
* **[Código que se escribe en JDoodle]:**
  ```java
  System.out.println("Nombre: " + nombre);
  System.out.println("Edad: " + edad);
  System.out.println("Promedio: " + promedio);
  System.out.println("¿Es estudiante? " + esEstudiante);
  System.out.println("Inicial: " + inicial);
  ```
* **[Narración]:** 
> "Después de haber asignado el valor de todas las variables, vamos a mostrarlas en pantalla con el comando que aprendimos en la lección anterior: `System.out.println`. Dentro del paréntesis colocamos las comillas con el texto *'Nombre: '*, un espacio, y el signo **más**. Observa cómo el operador `+` combina el texto con el valor de la variable.
> 
> Luego continuamos con los demás datos: *'Edad: '* más la variable `edad`, *'Promedio: '* más `promedio`, *'¿Es estudiante? '* más `esEstudiante`, y por último *'Inicial: '* más `inicial`.
> 
> Le damos a **Ejecutar** y, como pueden ver, sale: Nombre Lucía, Edad 15, Promedio 18.5, Es estudiante `true` y la inicial L. Todos esos valores los guardamos en variables en la primera parte del código y los imprimimos en la segunda parte, llamando a las variables junto con un texto gracias al `+`."

### Bloque 6: Pausa Interactiva y Cierre 
* **[En pantalla]:** Escena "¡TU TURNO!" con el ícono de pausa, los pasos del reto y las cajas `edad` = 17 y `nombre` = "Alex" con el chip `= ASIGNACIÓN`.
* **[Texto de apoyo visual]:** `int edad = 17;` · `String nombre = "Alex";`
* **[Narración]:** 
> "Ahora, de reto: crea las variables con tus propios datos en JDoodle. Cambia el valor de `edad` a tu edad real y el de `nombre` al tuyo. Recuerda: cambiar el valor de una variable se llama **asignación** y se hace con el signo igual. Pausa el video y prepárate para practicar.
> 
> *(Breve pausa de silencio en el video)*
> 
> Y eso es todo por la lección de hoy. En la próxima lección veremos cómo hacer cálculos y comparaciones con esos datos: **operadores y expresiones**. ¡Muchas gracias por su atención!"

---

## Código de Referencia para la Lección

**Código de Inicio (Starter - Para el estudiante):**
```java
public class Variables {
    public static void main(String[] args) {
        // Declara aquí tus variables
        int edad = 15;

        // Muestra el valor en pantalla
    }
}
```

**Código Final (Completed):**
```java
public class Variables {
    public static void main(String[] args) {
        int edad = 15;
        double promedio = 18.5;
        String nombre = "Lucía";
        boolean esEstudiante = true;
        char inicial = 'L';

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("¿Es estudiante? " + esEstudiante);
        System.out.println("Inicial: " + inicial);
    }
}
```

**Reto de Participación — Ficha de datos (Solución):**
```java
public class Reto2 {
    public static void main(String[] args) {
        int edad = 15;
        double promedio = 18.5;
        String nombre = "Ana Torres";
        boolean matriculado = true;
        char inicial = 'A';

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("¿Matriculado? " + matriculado);
        System.out.println("Inicial: " + inicial);
    }
}
```
