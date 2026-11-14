# Guion de la Lección 6: Métodos (funciones) y parámetros

## Detalles de la Lección
* **Duración aproximada:** 8.5 minutos
* **Público objetivo:** Estudiantes de secundaria (12 a 17 años)
* **Herramientas:** Diapositivas visuales y JDoodle (100% en línea)

---

## Estructura del Video

### Bloque 1: ¿Qué es un método y qué es un parámetro? 
* **[En pantalla]:** Portada animada "Lección 6 · Métodos y parámetros" y diapositiva de teoría.
* **[Texto de apoyo visual]:** `Método = bloque de código con nombre que realiza una tarea` · `Parámetro = dato que recibe el método` · `void` vs `return`
* **[Narración (Voz en off)]:** 
> "En esta lección aprenderemos qué son los **métodos** y los **parámetros**. Un método es un bloque de código que tiene un nombre y realiza una tarea determinada. Su principal ventaja es que nos permite **reutilizar instrucciones** y evitar escribir el mismo código varias veces. Los parámetros son los **datos que recibe un método** para poder trabajar con distintos valores.
> 
> También veremos que algunos métodos utilizan `void` cuando **no devuelven ningún resultado**, mientras que otros pueden **devolver un valor** utilizando `return`. A continuación veremos estos conceptos aplicados directamente en código."

### Bloque 2: Demostración en Vivo — El método `saludar` (void) 
* **[En pantalla]:** JDoodle ampliado. Panel "Métodos del programa" (se agrega una fila por método) y tarjeta "Método void" que señala el nombre del método y su parámetro.
* **[Textos flotantes en edición]:** 
  * `saludar(String nombre) = void · muestra un saludo`
  * `"¡Hola," + nombre + "!…" = El + une el texto con el parámetro`
* **[Código que se escribe en JDoodle]:**
  ```java
  public static void saludar(String nombre){
      System.out.println("¡Hola,"+nombre+"!Bienvenido al curso.");
  }
  ```
* **[Narración]:** 
> "Bueno, primero vamos a crear nuestra clase llamada `Metodos`. Ahora vamos a crear nuestro primer método, llamado `saludar`. Este método recibe un parámetro llamado `nombre`, y ese parámetro es un dato que enviamos al método para que pueda trabajar con diferentes valores. Dentro del método vamos a mostrar un saludo que consta de lo siguiente: *'¡Hola,'* más el nombre más *'¡Bienvenido al curso!'*.
> 
> Aquí también podemos observar la palabra `void`, ya que `void` significa que este método **realiza una acción pero no devuelve ningún resultado**."

### Bloque 3: Métodos que devuelven un valor: `doble` y `sumar` 
* **[En pantalla]:** Tarjetas "Método con return" (`static int doble(int numero)`) y "Dos parámetros" (`static int sumar(int a, int b)`).
* **[Textos flotantes en edición]:** 
  * `doble(int numero) = int · devuelve el número × 2`
  * `sumar(int a, int b) = int · devuelve a + b`
* **[Código que se escribe en JDoodle]:**
  ```java
  public static int doble(int numero){
      return numero*2;
  }

  public static int sumar(int a, int b){
      return a + b;
  }
  ```
* **[Narración]:** 
> "Ahora vamos a crear un segundo método. Este método recibe un número como parámetro; luego escribimos `return` y el número, multiplicado por dos. La palabra `return` permite **devolver el resultado**: en este caso, el método devuelve el número multiplicado por dos. A diferencia del método anterior, aquí utilizamos `int` en lugar de `void`, porque este método **sí devuelve un número entero**.
> 
> Ahora vamos a crear un método que reciba **dos parámetros** y vamos a retornar la suma de estas dos variables. En este caso tenemos dos parámetros, `a` y `b`: el método suma ambos valores y devuelve el resultado."

### Bloque 4: El método `main` y reutilizar `saludar` 
* **[En pantalla]:** Tarjetas "Método main" (main llama a `saludar()`, `doble()` y `sumar()`) y "Reutilizar" (tres llamadas con nombres distintos y el chip `1 método · 3 usos`).
* **[Código que se escribe en JDoodle]:**
  ```java
  public static void main(String[] args){
      saludar("Ana");
      saludar("Diego");
      saludar("Sofía");
  ```
* **[Narración]:** 
> "Ahora vamos a crear nuestro método principal. Primero utilizamos el método `saludar`; vamos a usar nombres aleatorios. Aquí podemos observar que utilizamos **el mismo método tres veces**, pero enviando diferentes nombres. Esto nos permite reutilizar el mismo bloque de código sin tener que escribir nuevamente toda la instrucción."

### Bloque 5: Llamamos a `doble` y a `sumar` 
* **[En pantalla]:** Tarjetas "Llamar a doble(7)" (entra 7 → sale 14) y "Llamar a sumar(3, 4)" (entran 3 y 4 → sale 7). Animación del botón **Execute** y consola real.
* **[Código que se escribe en JDoodle]:**
  ```java
      int resultado = doble(7);
      System.out.println("El doble de 7 es:" + resultado);

      int total = sumar(3, 4);
      System.out.println("3 + 4= " + total);
  }
  ```
* **[Narración]:** 
> "Ahora utilizamos el método `doble`, que consiste en lo siguiente: guardamos su resultado en una variable y la mostramos, *'El doble de 7 es: '*. En este caso enviamos el número **7** al método; el método realiza el cálculo y **devuelve 14**, que guardamos en la variable `resultado`.
> 
> Y finalmente utilizamos el método `sumar`, enviando dos valores, en este caso **3 y 4**, y lo mostramos con *'3 + 4 = '*. Aquí enviamos los números 3 y 4, y el método devuelve como resultado **7**."

### Bloque 6: Resumen y ejecución completa 
* **[En pantalla]:** Tarjeta "Resumen" (`parámetro → el dato que ENTRA` · `return → el resultado que SALE` · `main → se ejecuta primero`), consola real con los tres saludos, el doble y la suma, y el banner `¡Los 3 métodos funcionan!`.
* **[Narración]:** 
> "Podemos resumirlo de una manera sencilla: el **parámetro** es el dato que **entra** al método y el **`return`** es el resultado que el método **devuelve**. También debemos recordar que `main` es un método; la diferencia es que `main` es el método que se ejecuta **primero** cuando inicia el programa.
> 
> Ahora ejecutamos el programa completo. Como se puede ver, comprobamos los tres saludos, el resultado del método `doble` y el resultado del método `sumar`."

### Bloque 7: Pausa Interactiva y Cierre 
* **[En pantalla]:** Escena "¡TU TURNO!" con el ícono de pausa y los pasos del reto (un rectángulo con `ancho` y `alto`). Luego la diapositiva de cierre "Métodos y parámetros — organiza tu código" y la tarjeta "¡Lección 6 completada!".
* **[Texto de apoyo visual]:** `areaRectangulo(ancho, alto) → return ancho * alto`
* **[Narración]:** 
> "Ahora es tu turno de participar utilizando lo aprendido en esta lección. Crea un método que permita calcular el **área de un rectángulo**. El método debe recibir como parámetros el **ancho** y el **alto**, y devolver el resultado correspondiente. Prueba el método utilizando diferentes valores y verifica que los resultados sean correctos. Pausa el video, intenta resolver el reto por tu cuenta y continúa para comparar tus resultados.
> 
> *(Breve pausa de silencio en el video)*
> 
> En esta lección aprendimos qué son los métodos y cómo nos permiten organizar y reutilizar nuestro código. También vimos cómo utilizar parámetros para enviar diferentes datos a un método, y cómo utilizar `return` para devolver un resultado."

---

## Código de Referencia para la Lección

**Código Final (Completed):**
```java
public class Metodos {
    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Bienvenido al curso.");
    }

    public static int doble(int numero) {
        return numero * 2;
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        saludar("Ana");
        saludar("Diego");
        saludar("Sofía");

        int resultado = doble(7);
        System.out.println("El doble de 7 es: " + resultado);

        int total = sumar(3, 4);
        System.out.println("3 + 4 = " + total);
    }
}
```

**Reto de Participación — Área de un rectángulo (Solución):**
```java
public class Reto6 {
    public static double areaRectangulo(double ancho, double alto) {
        return ancho * alto;
    }

    public static void main(String[] args) {
        System.out.println("Área: " + areaRectangulo(4, 3)); // 12
        System.out.println("Área: " + areaRectangulo(5, 2)); // 10
    }
}
```
