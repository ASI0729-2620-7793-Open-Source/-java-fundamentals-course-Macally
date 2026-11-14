# Guion de la Lección 1: ¿Qué es programar y qué es Java?

## Detalles de la Lección
* **Duración aproximada:** 4 minutos
* **Público objetivo:** Estudiantes de secundaria (12 a 17 años)
* **Herramientas:** Diapositivas visuales y JDoodle (100% en línea)

---

## Estructura del Video

### Bloque 1: ¿Qué es programar? 
* **[En pantalla]:** Portada animada "Lección 1 · Tu primer programa" y diapositiva con la pregunta "¿Cómo se crean las apps y los videojuegos?".
* **[Texto de apoyo visual]:** `Programar = dar instrucciones a la computadora`
* **[Narración (Voz en off)]:** 
> "¿Alguna vez te preguntaste cómo se hacen las aplicaciones del celular o los videojuegos que juegas? Todas ellas están hechas con instrucciones que le damos a la computadora. Escribir estas instrucciones se llama **programar**, y en este curso vas a aprender a hacerlo con Java."

### Bloque 2: ¿Qué es Java y dónde vamos a programar? 
* **[En pantalla]:** Diapositiva con la historia de Java y las tarjetas "Editor del curso" y "Ejemplo mínimo".
* **[Texto de apoyo visual]:** `Java (1995) · Apps · Videojuegos · Sistemas` y `JDoodle: en línea, gratis y sin instalar`
* **[Narración]:** 
> "Pero primero, ¿qué es Java? Java es un lenguaje de programación creado en el año 1995. Se usa para crear aplicaciones, videojuegos y sistemas que usan millones de personas todos los días. Y lo mejor: es uno de los mejores lenguajes para empezar, porque su sintaxis es clara y parecida al inglés.
> 
> Para programar necesitas un lugar donde escribir el código. Nosotros usaremos **JDoodle**, un editor de código que funciona en línea. Es gratuito y no necesitas instalar nada: solo abre tu navegador. ¡Vamos con nuestro primer programa! Abre JDoodle y escribe junto a mí las siguientes líneas."

### Bloque 3: La estructura de todo programa en Java 
* **[En pantalla]:** Cambiar a JDoodle (código ampliado a la izquierda). A la derecha se arma el panel "Partes del programa".
* **[Textos flotantes en edición]:** 
  * `public class HolaMundo = El nombre de nuestro programa`
  * `main( ) = Punto de partida: aquí empieza`
  * `class › main › instrucciones` (diagrama de cajas anidadas "Estructura")
* **[Narración]:** 
> "Ya estando en JDoodle, podemos observar la estructura de todo programa. Lleva `public class HolaMundo`: **HolaMundo** vendría a ser el nombre de nuestro programa. Dentro de él está `main`, que es el **punto de partida**: la computadora empieza a ejecutar justo aquí, justo dentro de esta instrucción."

### Bloque 4: Mostrar mensajes y comentarios 
* **[En pantalla]:** Se escribe la instrucción de impresión. Aparecen las tarjetas "Anatomía de println" y "Comentarios".
* **[Texto de apoyo visual]:** 
  * `System.out.println("Hola");` → `System` el sistema · `.out` la salida · `.println` imprime una línea · `( )` los paréntesis
  * `// esto no se ejecuta`
* **[Código que se escribe en JDoodle]:**
  ```java
  //System.out.println("Texto");
  ```
* **[Narración]:** 
> "Ahora agregaremos una instrucción para mostrar un mensaje. Para ello utilizaremos un comando llamado `System.out.println`. Después colocaremos unos paréntesis, dentro de los paréntesis dos comillas, y dentro de esas comillas cualquier texto que se nos ocurra.
> 
> También cabe aclarar que, cuando escriban código, todo lo que pongan después de dos barritas `//` —así sean comandos que sí funcionan— se considerará un **comentario**. Esto puede servir para cuando trabajen en grupo, para mostrar indicaciones o para no olvidar para qué sirve cada parte."

### Bloque 5: Escribimos y ejecutamos nuestro primer programa 
* **[En pantalla]:** Tarjeta "¡Escribe junto a mí!" mostrando cada línea mientras se escribe. Animación del botón **Execute** y recorte de la consola real.
* **[Código que se escribe en JDoodle]:**
  ```java
  System.out.println("Hola Mundo, Estoy aprendiendo Java.");
  System.out.println("Este es mi primer programa en Java.");
  ```
* **[Narración]:** 
> "Por lo tanto, ahora empezaré a escribir justamente lo que está en el comentario: `System.out.println`, abro paréntesis, coloco las comillas y, dentro de ellas, un mensaje como *'Hola Mundo, estoy aprendiendo Java'*. También colocaremos otra línea que diga *'Este es mi primer programa en Java'*.
> 
> Luego de haber escrito nuestro código, pulsaremos el botón **Execute** y, si todo salió bien, verás cómo tu mensaje está impreso en la consola. Aquí están justamente los mensajes que acabamos de escribir."

### Bloque 6: Pausa Interactiva y Cierre 
* **[En pantalla]:** Escena "¡TU TURNO!" con el ícono de pausa animado al ritmo de la voz, la lista de pasos del reto y la franja `PAUSA EL VIDEO`. Luego la diapositiva de cierre con la tarjeta "¡Lección 1 completada!" y "Próxima lección: Variables y tipos de datos".
* **[Texto de apoyo visual]:** `¡PAUSA PARA PRACTICAR!` · Chips `Java` `JDoodle` `println` `// comentarios`
* **[Narración]:** 
> "Ahora es tu turno. Reto: cambia el texto entre comillas por tu nombre y tu color favorito. Vuelve a ejecutar y observa cómo cambia el resultado. Pausa el video y prepárate para practicar.
> 
> *(Breve pausa de silencio en el video)*
> 
> Y eso sería todo por la lección del día de hoy. En la siguiente lección aprenderemos a guardar información dentro del programa, ya que veremos las **variables y los tipos de datos**."

---

## Código de Referencia para la Lección

**Código de Inicio (Starter - Para el estudiante):**
```java
public class HolaMundo {
    public static void main(String[] args) {
        // Escribe tu primer programa aquí
    }
}
```

**Código Final (Completed):**
```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo! Estoy aprendiendo Java.");
        System.out.println("Este es mi primer programa.");
    }
}
```

**Reto de Participación — Saludo personalizado (Solución):**
```java
public class Reto1 {
    public static void main(String[] args) {
        System.out.println("Me llamo: Ana Torres");
        System.out.println("Tengo 15 años");
        System.out.println("Mi color favorito es: azul");
    }
}
```
