# Guion de la Lección 7: Entrada y salida básica con Scanner

## Detalles de la Lección
* **Duración aproximada:** 10.5 minutos
* **Público objetivo:** Estudiantes de secundaria (12 a 17 años)
* **Herramientas:** Diapositivas visuales y JDoodle (100% en línea)

---

## Estructura del Video

### Bloque 1: Objetivo — Programas que preguntan 
* **[En pantalla]:** Portada animada "Lección 7 · Entrada y salida con Scanner" (un teclado envía `nombre = "Ana"` al programa). Diapositiva de teoría con el objetivo resaltado y la franja "Conceptos de hoy".
* **[Texto de apoyo visual]:** `Leer datos del teclado y usarlos en tu programa` · chips `print / println` `Scanner` `import` `new Scanner(System.in)` `nextLine()` `nextInt()`
* **[Narración (Voz en off)]:** 
> "¡Un gusto, compañeros! Ahora veremos la lección 7, que es **entrada y salida básica con Scanner**. El objetivo es que ustedes puedan **leer datos del teclado** con `Scanner` y usarlos en su programa.
> 
> Hasta ahora nuestros programas solo mostraban mensajes, pero las aplicaciones reales también **preguntan**: ¿cuál es tu nombre?, ¿cuántos años tienes? En Java leemos datos del teclado con la clase `Scanner`, que forma parte de la **biblioteca estándar** de Java."

### Bloque 2: Importar la herramienta y los 3 pasos 
* **[En pantalla]:** Panel "Paso 0 · Importar" con la animación de `Scanner` saliendo de la "biblioteca Java" hacia "tu programa". Luego la tarjeta "Los 3 pasos".
* **[Texto de apoyo visual]:** 
  1. `import java.util.Scanner;` → Importar
  2. `Scanner lector = new Scanner(System.in);` → Crear el lector
  3. `nextLine()` texto · `nextInt()` números → Leer
* **[Narración]:** 
> "Podemos ver que `import java.util.Scanner;` cumple la función de **traer una herramienta** de la biblioteca de Java. Para usarla hacemos tres pasos: primero, el `import`; luego, **crear el lector**: `Scanner lector = new Scanner(System.in);`; y finalmente, **leer** con `nextLine()` para texto o `nextInt()` para números. Ahora vamos a implementarlo en JDoodle: vamos a programar una **tarjeta de presentación interactiva**."

### Bloque 3: Demostración en Vivo — El código base 
* **[En pantalla]:** JDoodle ampliado. Panel "Los 3 pasos de Scanner" y tarjeta "El código base" (`import`, `lector`, `print`, `nextLine()`).
* **[Código base en JDoodle]:**
  ```java
  import java.util.Scanner;

  public class EntradaSalida {
      public static void main(String[] args) {
          Scanner lector = new Scanner(System.in);

          System.out.print("¿Cuál es tu nombre? ");
          String nombre = lector.nextLine();
  ```
* **[Narración]:** 
> "Aquí tengo la base: el `import` que trae `Scanner`; creo el lector con `new Scanner(System.in)`, donde `System.in` significa **lo que llega del teclado**; luego hago la pregunta con `print` y guardo la respuesta en la variable `nombre` con `nextLine()`. Ahora falta pedir la edad y armar el saludo. Vamos a escribirlo juntos."

### Bloque 4: Pedir la edad y armar el saludo 
* **[En pantalla]:** Tarjeta "Misión" con la lista: preguntar la edad, leerla con `nextInt()`, armar el saludo y cerrar el lector. Tarjetas "¿Cuál uso?" (`nextLine()` lee TEXTO · `nextInt()` lee NÚMEROS), "El saludo" (chips `"Hola, " + nombre + "."`) y "Cerramos el lector".
* **[Código que se escribe en JDoodle]:**
  ```java
  System.out.print("¿Cuántos años tienes? ");
  int edad = lector.nextInt();

  System.out.println("Hola, " + nombre + ".");
  System.out.println("Tienes " + edad + " años.");

  lector.close();
  ```
* **[Narración]:** 
> "Debajo de las dos líneas del nombre ponemos otra pregunta: *'¿Cuántos años tienes?'*. Para leer la edad uso `nextInt()`, porque es un **número entero**, y lo guardo en una variable `int`. Recuerden: `nextLine()` para texto y `nextInt()` para números.
> 
> Ahora creamos el saludo: usamos el **más** para pegar texto con variables, *'Hola, '* más `nombre`. Y al final cerramos el lector con `lector.close()` cuando terminamos de usarlo."

### Bloque 5: Probamos y agregamos la ciudad 
* **[En pantalla]:** Animación del botón **Execute** y aparece "Consola · salida real". Tarjeta "Probamos" (`¿Cuál es tu nombre? Ana` · `¿Cuántos años tienes? 15` → banner `Hola, Ana. Tienes 15 años.`). Luego la tarjeta "Agregamos la ciudad".
* **[Código que se agrega en JDoodle]:**
  ```java
  System.out.print("¿En qué ciudad vives? ");
  String ciudad = lector.nextLine();
  // ... " y vives en " + ciudad
  ```
* **[Narración]:** 
> "Ejecutamos: nos pregunta cuál es nuestro nombre, ponemos *Ana*; cuántos años tenemos, *15*; y nos responde *'Hola, Ana. Tienes 15 años'*. 
> 
> Ahora procederemos a la siguiente parte, que sería **incluir la ciudad**. Agregamos la pregunta *'¿En qué ciudad vives?'*, la leemos con `nextLine()` y la sumamos al saludo con *' y vives en '* más `ciudad`."

### Bloque 6: ¡Un bug! El Enter pendiente 
* **[En pantalla]:** Tarjeta "¡Un bug!" (`¡Se saltó la pregunta de la ciudad!`) con la animación del teclado: `15` `⏎` → `nextInt()` toma el 15 y deja el ⏎ → `nextLine()` devuelve `""` (¡vacío!).
* **[Narración]:** 
> "Ejecutamos y respondemos: nombre, edad 15… ¿y la ciudad? **Se saltó la pregunta.** Esto pasa porque `nextInt()` solo lee el número y deja pendiente el **Enter**; el siguiente `nextLine()` se come ese Enter y la ciudad queda vacía."

### Bloque 7: La solución — limpiar con `nextLine()` 
* **[En pantalla]:** Tarjeta "La solución" con `lector.nextLine();  // limpia el Enter pendiente`, luego "Ahora sí funciona" con la animación del teclado completa (el primer `nextLine()` limpia, el segundo lee `"Lima"` ✓).
* **[Código que se agrega en JDoodle]:**
  ```java
  System.out.print("¿En qué ciudad vives? ");
  lector.nextLine(); // limpia el Enter que dejó nextInt()
  String ciudad = lector.nextLine();
  ```
* **[Narración]:** 
> "La solución: antes de leer la ciudad agregamos un `lector.nextLine()`. Ejecutamos y ahora **sí sale** la pregunta *'¿En qué ciudad vives?'*. Ese primer `nextLine()` no guarda nada en ninguna variable: **solo se come el Enter** que quedó pendiente. El segundo `nextLine()` ya lee la ciudad de verdad."

### Bloque 8: Último paso — toque final 
* **[En pantalla]:** Tarjeta "Último paso" con `println("¡Bienvenido al curso de Java!");` y luego "Pruébalo tú" (1. Borra la línea de limpieza · 2. Ejecuta: se salta la pregunta · 3. Vuelve a agregarla y comprueba).
* **[Código que se agrega en JDoodle]:**
  ```java
  System.out.println("¡Bienvenido al curso de Java!");
  ```
* **[Narración]:** 
> "Como último paso, le damos un toque final a la tarjeta con un mensaje de bienvenida. Y pruébalo tú: borra la línea de limpieza, ejecuta y verás que se salta la pregunta; luego vuelve a agregarla y comprueba que funciona."

### Bloque 9: Pausa Interactiva y Cierre 
* **[En pantalla]:** Escena "¡TU TURNO!" con el ícono de pausa, los pasos del reto, un recuadro donde se tacha y vuelve la línea `lector.nextLine();  // limpieza` y la consola "Sin la línea / Con la línea". Luego la diapositiva de cierre con la tarjeta "¡Lección 7 completada!", la "Regla de oro" y "Próxima lección: Programación orientada a objetos".
* **[Texto de apoyo visual]:** `REGLA DE ORO: Después de nextInt() agrega un nextLine() para limpiar el Enter pendiente`
* **[Narración]:** 
> "Ahora te toca a ti: abre en JDoodle el programa que acabamos de escribir. El reto tiene dos partes. Primero, **borra la línea `lector.nextLine()`** que está justo antes de leer la ciudad, ejecuta el programa, escribe tu nombre y tu edad, y observa lo que pasa. Segundo, **vuelve a agregar esa línea** y ejecuta de nuevo: ahora sí el programa debe esperar tu respuesta. Cuando lo logres, sigue con el video. ¡Tienes un minuto!
> 
> *(Breve pausa de silencio en el video)*
> 
> Muy bien: hoy aprendiste a leer datos del teclado con `Scanner`. Recuerda los tres pasos: **importar** la herramienta, **crear el lector** con `new Scanner(System.in)` y **leer** con `nextLine()` para texto o `nextInt()` para números. Y no olvides la **regla de oro**: después de `nextInt()` agrega un `nextLine()` para limpiar el Enter pendiente. En la próxima lección damos el gran salto a la **programación orientada a objetos**, creando clases y objetos. ¡Nos vemos ahí!"

---

## Código de Referencia para la Lección

**Código de Inicio (Starter - Para el estudiante):**
```java
import java.util.Scanner;

public class EntradaSalida {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("¿Cuál es tu nombre? ");
        String nombre = lector.nextLine();

        // Pide la edad y muestra el saludo completo
    }
}
```

**Código Final (Completed):**
```java
import java.util.Scanner;

public class EntradaSalida {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("¿Cuál es tu nombre? ");
        String nombre = lector.nextLine();

        System.out.print("¿Cuántos años tienes? ");
        int edad = lector.nextInt();

        System.out.print("¿En qué ciudad vives? ");
        lector.nextLine(); // paso 1: limpia el Enter que dejó nextInt()
        String ciudad = lector.nextLine(); // paso 2: ahora sí lee la ciudad

        System.out.println("Hola, " + nombre + ".");
        System.out.println("Tienes " + edad + " años y vives en " + ciudad + ".");
        System.out.println("¡Bienvenido al curso de Java!");

        lector.close();
    }
}
```

**Reto de Participación — Tarjeta de presentación (Solución):**
```java
import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("¿Cuál es tu nombre? ");
        String nombre = lector.nextLine();

        System.out.print("¿Cuántos años tienes? ");
        int edad = lector.nextInt();
        lector.nextLine(); // limpia el Enter pendiente

        System.out.print("¿En qué ciudad vives? ");
        String ciudad = lector.nextLine();

        System.out.println(nombre + ", " + edad + " años, vive en " + ciudad + ".");
        lector.close();
    }
}
```
