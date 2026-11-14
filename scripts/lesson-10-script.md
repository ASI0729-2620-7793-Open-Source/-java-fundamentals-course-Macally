# Guion de la Lección 10: Proyecto final: Registro de Estudiantes y mejores prácticas

## Detalles de la Lección
* **Duración aproximada:** 11 minutos
* **Público objetivo:** Estudiantes de secundaria (12 a 17 años)
* **Herramientas:** Diapositivas visuales y JDoodle (100% en línea)

---

## Estructura del Video

### Bloque 1: Unimos todo 
* **[En pantalla]:** Portada animada "Lección 10 · Proyecto final: Registro de estudiantes". Panel con los chips de todo lo aprendido.
* **[Texto de apoyo visual]:** `clases · constructores · encapsulación · arrays · bucles · if · Scanner`
* **[Narración (Voz en off)]:** 
> "¡Llegaste a la última lección! Hoy unimos todo: clases, constructores, encapsulación, arrays, bucles, `if` y `Scanner`, todo para crear un **registro de estudiantes**: una aplicación que pide datos, **los valida** y los guarda en objetos."

### Bloque 2: Un detalle clave — la validación 
* **[En pantalla]:** Panel "Un detalle clave" con un campo de nombre vacío y una edad imposible tachados, y la tarjeta "Validación".
* **[Texto de apoyo visual]:** `Nunca confíes en lo que el usuario escribe` · `nombre vacío ✗ · edad imposible ✗ → volver a pedir con while`
* **[Narración]:** 
> "Un detalle clave de los programas reales: **nunca se confía en lo que el usuario escribe**. Si el nombre llega vacío o la edad es un número imposible, hay que detectarlo y volverlo a pedir. Eso es **validación**, y lo haremos con `while`, que ya conoces. Este es el código final: si vienes de las lecciones anteriores, ya conoces cada parte; solo falta combinarlas y agregar la validación."

### Bloque 3: Demostración en Vivo — El modelo `Estudiante` 
* **[En pantalla]:** JDoodle ampliado. Tarjetas "Importamos", "El modelo" (atributos privados), "Constructor" y "Getters".
* **[Narración]:** 
> "Primero importamos `Scanner`, una herramienta que nos permite leer los datos que el usuario escribe por teclado; en este caso la utilizaremos para ingresar el nombre y la edad de cada estudiante.
> 
> Ahora creamos la clase `Estudiante`, que será el modelo que utilizaremos para representar a cada estudiante. Declaramos dos atributos privados: `nombre`, de tipo `String`, para almacenar el nombre, y `edad`, de tipo `int`, para almacenar su edad. Recuerda: utilizamos `private` para proteger estos atributos y evitar que se modifiquen directamente desde fuera de la clase.
> 
> Después creamos el **constructor** `Estudiante`, que recibe dos parámetros: el nombre y la edad. Utilizamos `this.nombre` y `this.edad` para asignar los valores recibidos a los atributos del objeto; de esta manera, cada estudiante tendrá su propio nombre y edad. Ahora creamos los **getters**: `getNombre` devuelve el nombre del estudiante, mientras que `getEdad` retorna la edad. Estos métodos nos permiten consultar los atributos privados desde otras partes del programa. Y con el método `mostrarFicha` mostramos los datos del estudiante en pantalla, en una sola línea, con el nombre y la edad."

### Bloque 4: Preparamos el registro 
* **[En pantalla]:** Tarjeta "Preparamos el registro" con el lector y un array `grupo` de 3 casillas vacías.
* **[Narración]:** 
> "Ahora pasamos a la clase principal, llamada `RegistroEstudiantes`. Dentro encontramos el método `main`, que es donde comienza la ejecución de nuestro programa. Primero creamos un objeto `Scanner` llamado `lector`, que nos permite recibir los datos ingresados por el usuario. Después declaramos un array llamado `grupo`, de tipo `Estudiante`, con capacidad para almacenar **tres objetos**: aquí preparamos el espacio para registrar a tres estudiantes. Utilizamos un ciclo `for` para repetir el proceso de registro: la variable `i` comienza en cero y aumenta de uno en uno mientras sea menor que la cantidad de elementos del array."

### Bloque 5: Validar el nombre 
* **[En pantalla]:** Tarjeta "Validar el nombre" con `while (nombre.isEmpty())` y `trim()` quitando espacios.
* **[Texto de apoyo visual]:** `nextLine().trim()` → quita espacios al inicio y al final · `isEmpty()` → ¿está vacío?
* **[Narración]:** 
> "Antes de registrar al estudiante necesitamos **validar su nombre**. Primero declaramos la variable `nombre` como una cadena vacía. Después utilizamos un ciclo `while` que repetirá la solicitud **mientras el nombre esté vacío**: con `isEmpty()` comprobamos si la cadena no contiene ningún carácter. Luego utilizamos `nextLine()` para leer el nombre completo que ingrese el usuario; también utilizamos `trim()`, que elimina los espacios que se encuentran al inicio y al final del texto; y finalmente, con `isEmpty()`, comprobamos si el nombre está vacío. Si lo está, mostramos un mensaje y volvemos a solicitarlo. Así evitamos registrar a un estudiante sin nombre."

### Bloque 6: Validar la edad 
* **[En pantalla]:** Tarjetas "Validar la edad" (`while (edad < 5 || edad > 100)`), "¿Es un número?" (`hasNextInt()`) y "Fuera de rango".
* **[Texto de apoyo visual]:** `||` → basta con que una condición se cumpla · `hasNextInt()` → ¿es un número entero? · `nextLine()` → limpia el salto de línea pendiente
* **[Narración]:** 
> "Ahora vamos a **validar la edad**. Declaramos una variable entera `edad` y la inicializamos en **menos uno**. Utilizamos `while` para repetir la solicitud **mientras la edad sea menor que 5 o mayor que 100**. El operador de las dos líneas `||` significa que basta con que **una** de las dos condiciones se cumpla para repetir el ciclo.
> 
> Dentro del ciclo comprobamos que la edad sea un número: utilizamos `hasNextInt()` para comprobar si el dato ingresado es un número entero. Si el usuario escribe un número entero, lo guardamos en la variable `edad` utilizando `nextInt()`; en cambio, si ingresó un texto u otro dato que no sea entero, mostramos un mensaje indicando que debe escribir un número válido. Después usamos `nextLine()` para **limpiar el salto de línea** que queda pendiente después de leer la edad; esto permite que la siguiente lectura de texto funcione correctamente. Y volvemos a comprobar si la edad está dentro del rango permitido: si es menor que 5 o mayor que 100, mostramos un mensaje de error y, como todavía se cumple la condición del `while`, el programa vuelve a solicitar la edad."

### Bloque 7: Guardamos y mostramos el registro 
* **[En pantalla]:** Tarjetas "Guardamos el objeto" (las casillas del array se llenan), "Guardar y mostrar" y "Cerramos".
* **[Narración]:** 
> "Una vez que tenemos un nombre y una edad válidos, creamos un nuevo objeto de la clase `Estudiante`, le enviamos los valores al constructor y guardamos este objeto en la posición correspondiente del array. Este proceso se repite hasta completar el registro de los tres estudiantes. Cuando termina, mostramos un mensaje indicando que el registro está completo y utilizamos otro ciclo `for` para recorrer nuevamente el array: en cada posición accedemos al objeto `Estudiante` y llamamos a su método `mostrarFicha`. Finalmente **cerramos el `Scanner`**, porque ya terminamos de utilizarlo."

### Bloque 8: Probamos el programa 
* **[En pantalla]:** Animación del botón **Execute**, consola real con los mensajes de error y la tarjeta "Registro completo". Panel "El programa insiste".
* **[Narración]:** 
> "Ahora vamos a ejecutar el programa. Nos va a pedir el nombre del primer estudiante. Si colocamos una edad que está **fuera del rango**, el programa nos avisa y nos vuelve a pedir que lo intentemos; entonces colocamos una edad dentro del rango y continuamos con el formulario.
> 
> Ya que terminó de pedir los datos, vemos el **registro completo**: Juan tiene 5 años, María tiene 15 y Pedro tiene 89, tal como ingresamos los datos. Gracias al primer `while`, vuelve a preguntar hasta que el nombre tenga contenido; el segundo `while` rechaza las edades imposibles; y `hasNextInt()` comprueba que de verdad escribas un número y no una letra."

### Bloque 9: Pausa Interactiva 
* **[En pantalla]:** Texto grande `PAUSA EL VIDEO: PROVOCA 3 ERRORES Y COMPRUEBA QUE LOS RECHACE` con el ícono de pausa y la tarjeta "3 validaciones".
* **[Narración]:** 
> "Ejecuta el programa en JDoodle y provoca errores a propósito: escribe un **nombre vacío**, luego **letras en la edad** y luego una edad de **300**. Observa cómo el programa insiste en pedir el dato correcto en vez de guardar basura: eso se llama **validación**. Ahora te toca a ti: provoca tres errores de validación y comprueba que el programa los rechace. Puedes poner pausa al video.
> 
> *(Breve pausa de silencio en el video)*"

### Bloque 10: Mejores prácticas, errores comunes y Cierre 
* **[En pantalla]:** Panel "Mejores prácticas" con una lista numerada que aparece punto por punto y, después, la pantalla de cierre del curso.
* **[Texto de apoyo visual]:** 
  1. `Nombres claros: promedio, no x`
  2. `Sangría consistente`
  3. `Comenta lo importante (el porqué)`
  4. `Valida la entrada del usuario`
  5. `Lee el mensaje de error: indica la línea`
  6. `Errores típicos: ; olvidado · llaves mal cerradas · = vs == · string vs String · no limpiar el Scanner`
* **[Narración]:** 
> "Para cerrar, las mejores prácticas y los errores más comunes de los principiantes. **Número uno:** usa nombres claros, `promedio` y no `x`: los nombres explican qué guarda la variable. **Número dos:** sangría consistente; el código dentro de llaves va indentado para que sea más fácil de leer. **Número tres:** comenta lo importante; explica el porqué, no lo obvio. **Número cuatro:** valida la entrada del usuario; nunca confíes en un dato sin comprobar que tenga sentido. **Número cinco:** lee el mensaje de error; Java indica el número de línea del error, ahí está la pista. **Número seis**, errores típicos: olvidar el punto y coma, cerrar mal las llaves, confundir `=` (asignación) con `==` (comparación), escribir `string` con minúscula en vez de `String` con S mayúscula y no limpiar el `Scanner` después de `nextInt()`.
> 
> Recuerda: la práctica constante es la clave. Vuelve a ejecutar cada código, rómpelo a propósito y arréglalo: así se aprende a programar. Con esto termina el curso de **fundamentos de Java**. Ya sabes variables, operadores, decisiones, bucles, métodos, entrada de datos con validación y los fundamentos de la **programación orientada a objetos**. Sigue practicando con los retos de participación, explora los ejemplos del repositorio del curso… ¡y nos vemos en tu próxima aplicación!"

---

## Código de Referencia para la Lección

**Código Final (Completed):**
```java
import java.util.Scanner;

class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarFicha() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad);
    }
}

public class RegistroEstudiantes {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Estudiante[] grupo = new Estudiante[3];

        for (int i = 0; i < grupo.length; i++) {
            // Validación 1: el nombre no puede quedar vacío
            String nombre = "";
            while (nombre.isEmpty()) {
                System.out.print("Nombre del estudiante #" + (i + 1) + ": ");
                nombre = lector.nextLine().trim();
                if (nombre.isEmpty()) {
                    System.out.println("El nombre no puede quedar vacío. Intenta de nuevo.");
                }
            }

            // Validación 2: la edad debe ser un número entre 5 y 100
            int edad = -1;
            while (edad < 5 || edad > 100) {
                System.out.print("Edad (entre 5 y 100): ");
                if (lector.hasNextInt()) {
                    edad = lector.nextInt();
                } else {
                    System.out.println("Escribe un número válido.");
                }
                lector.nextLine(); // limpia el salto de línea pendiente
                if (edad < 5 || edad > 100) {
                    System.out.println("Edad fuera de rango. Intenta de nuevo.");
                }
            }

            grupo[i] = new Estudiante(nombre, edad);
        }

        System.out.println("--- Registro completo ---");
        for (int i = 0; i < grupo.length; i++) {
            grupo[i].mostrarFicha();
        }

        lector.close();
    }
}
```

**Reto de Participación — Extiende el registro (Solución: contador de estudiantes de 15 años o más):**
```java
int contador = 0;
for (int i = 0; i < grupo.length; i++) {
    if (grupo[i].getEdad() >= 15) {
        contador = contador + 1;
    }
}
System.out.println("Estudiantes de 15 años o más: " + contador);
```
