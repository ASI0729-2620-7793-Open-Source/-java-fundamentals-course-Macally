# Guion de la Lección 8: Introducción a la POO: Clases, objetos y constructores

## Detalles de la Lección
* **Duración aproximada:** 14 minutos
* **Público objetivo:** Estudiantes de secundaria (12 a 17 años)
* **Herramientas:** Diapositivas visuales y JDoodle (100% en línea)

---

## Estructura del Video

### Bloque 1: Objetivo de la lección 
* **[En pantalla]:** Portada animada "Lección 8 · Clases, objetos y constructores". Diapositiva de teoría con el objetivo resaltado y la franja "Conceptos de hoy".
* **[Texto de apoyo visual]:** `Define una clase con atributos, un constructor y métodos, y crea objetos con new` · chips `class` `new` `this` `constructor`
* **[Narración (Voz en off)]:** 
> "Bueno, ahora pasaremos a la lección 8, que es la **introducción a la POO: clases, objetos y constructores**. En esta clase nuestro objetivo es que ustedes puedan **definir una clase** con atributos, un constructor y métodos, y **crear objetos con `new`**."

### Bloque 2: La gran idea de la POO 
* **[En pantalla]:** Panel "La gran idea · POO" y luego "Plano y objetos": un plano azul `class Mascota` y dos objetos construidos a partir de él (Luna, el gato, y Rocky, el perro).
* **[Texto de apoyo visual]:** `Clase = el plano` · `Objeto = una instancia concreta de esa clase`
* **[Narración]:** 
> "Llegamos a la parte más importante del curso, que es la **programación orientada a objetos**. La idea es muy sencilla: en vez de pensar solo en instrucciones, pensamos en **cosas del mundo real** con características y comportamientos.
> 
> Una **clase** es el **plano** que define qué atributos tiene y qué hace, y un **objeto** es una **instancia concreta** de esa clase. Por ejemplo, tengamos en cuenta una clase `Mascota`: eso sería el plano, y Luna y Rocky son los objetos. Ahora pasaremos a verlo en código: esta clase va a tener sus atributos, un constructor y un método."

### Bloque 3: Demostración en Vivo — La clase `Mascota` 
* **[En pantalla]:** JDoodle ampliado. Panel "class Mascota" (atributos, constructor, métodos) y tarjetas "La clase es un molde", "Constructor" y "Método presentarse()".
* **[Textos flotantes en edición]:** 
  * `String nombre; String tipo; = atributos: características`
  * `this.nombre = nombre; = this = el objeto que estamos creando`
  * `presentarse() = método: comportamiento`
* **[Código de partida en JDoodle]:**
  ```java
  class Mascota {
      String nombre;
      String tipo;

      public Mascota(String nombre, String tipo) {
          this.nombre = nombre;
          this.tipo = tipo;
      }

      public void presentarse() {
          System.out.println("Hola, soy " + nombre + " y soy un " + tipo + ".");
      }
  }
  ```
* **[Narración]:** 
> "Voy a pasar a explicar este código por medio del editor JDoodle. Acá se ve la clase `Mascota`. Esta clase funciona como un **molde** para poder crear mascotas. Podemos ver que tiene dos atributos: `nombre` y `tipo`. El nombre nos permite guardar el nombre de nuestra mascota y el tipo nos permite indicar qué animal es.
> 
> El **constructor** `Mascota` recibe dos datos, nombre y tipo. Estos datos se guardan utilizando la palabra `this`, que hace referencia **al objeto que estamos creando**. El método `presentarse` permite que nuestra mascota diga su nombre y qué tipo de animal es; para mostrarlo utilizamos `System.out.println`."

### Bloque 4: Agregamos la energía 
* **[En pantalla]:** Tarjeta "Energía" con una batería que se llena hasta 100.
* **[Código que se agrega en JDoodle]:**
  ```java
  int energia;
  // ... dentro del constructor:
  this.energia = 100;
  ```
* **[Narración]:** 
> "Ahora vamos a modificar la clase para que cada mascota tenga **energía**. Lo hacemos debajo del atributo `tipo`, con `int energia`. Lo que logramos es que la mascota tenga nombre, tipo y energía: guarda su nombre, el tipo de mascota y su nivel de energía.
> 
> Lo mismo hacemos en el **constructor**: cuando creamos una mascota, automáticamente vamos a hacer que su energía **comience en 100**. Esto sucede porque le asignamos ese valor dentro del constructor."

### Bloque 5: El método `jugar()` 
* **[En pantalla]:** Tarjeta "Método jugar()" con la batería bajando de 10 en 10, y después "Siempre verifica" (`if (energia > 0)` antes de restar).
* **[Código que se agrega en JDoodle]:**
  ```java
  public void jugar() {
      if (energia > 0) {
          energia = energia - 10;
          System.out.println(nombre + " jugó. Energía: " + energia);
      } else {
          System.out.println(nombre + " está cansado y descansa.");
      }
  }
  ```
* **[Narración]:** 
> "Ahora vamos a crear un nuevo método llamado `jugar`. Aquí vamos a hacer: si la energía es **mayor que cero**, la energía va a ser igual a la energía **menos 10**; o sea, cada vez que juega le restamos 10 puntos y mostramos cuánta energía le queda. Si no, va a mostrar un mensaje que diga que **está cansado y descansa**. Para eso usamos `System.out.println` con el nombre y la energía.
> 
> Siempre recuerden algo muy importante: el `if` va a comprobar una condición; en la parte de la energía, siempre verificar que sea mayor a cero antes de restar los 10 puntos, y en la parte del `else`, lo que pasa cuando no se cumple la condición."

### Bloque 6: La clase principal y los objetos 
* **[En pantalla]:** Panel "class MainMascota" y tarjetas "Clase principal" y "Creamos 2 objetos" (Luna, gato · Rocky, perro), y "Los usamos".
* **[Código que se escribe en JDoodle]:**
  ```java
  public class MainMascota {
      public static void main(String[] args) {
          Mascota mascota1 = new Mascota("Luna", "gato");
          Mascota mascota2 = new Mascota("Rocky", "perro");

          mascota1.presentarse();
          mascota2.presentarse();

          mascota1.jugar();
          mascota1.jugar();
          mascota1.jugar();
      }
  }
  ```
* **[Narración]:** 
> "Bueno, vamos a pasar a crear la **clase principal**, `public class MainMascota`, con su `public static void main`. Lo que vamos a hacer es crear **dos objetos** a partir de nuestra clase `Mascota`. Lo primero: `Mascota mascota1 = new Mascota("Luna", "gato")`. Y luego Rocky, que sería la mascota 2, un perro. Para crear estos objetos utilizamos la palabra `new`, que **llama al constructor** y permite crear una nueva instancia de la clase. Y acá tenemos nuestras dos mascotas.
> 
> Ahora, debajo de estos objetos, vamos a hacer que se presenten y que jueguen: `mascota1.presentarse()`, `mascota2.presentarse()`, y llamamos a `jugar()`."

### Bloque 7: Ejecutamos el programa 
* **[En pantalla]:** Animación del botón **Execute**, consola real y tarjeta "Resultado" con las baterías de cada mascota.
* **[Narración]:** 
> "Ahora pasamos a ejecutar el programa. Lo que podemos ver es: *'Hola, soy Luna, un gato'* y *'Hola, soy Rocky, un perro'*, y luego cuántas veces jugó cada animal y su energía, que va bajando de 10 en 10. Así comprobamos que **cada objeto tiene sus propios datos** y que podemos usar sus métodos de manera independiente."

### Bloque 8: Pausa Interactiva y Cierre 
* **[En pantalla]:** Escena "¡TU TURNO!" con el ícono de pausa, los pasos del reto y una tercera mascota animada con su batería. Luego la diapositiva de cierre con "Lo que aprendiste", la tarjeta "¡Lección 8 completada!" y "Próxima lección".
* **[Texto de apoyo visual]:** `PAUSA EL VIDEO · TIENES 1 MINUTO` · `clase = plano · objeto = lo que construyes con new · this = este objeto`
* **[Narración]:** 
> "Es tu turno de crear un objeto propio. Pausa el video y abre en JDoodle el programa de las mascotas. Tu reto: crear una **tercera mascota** con el nombre y el tipo que quieras —por ejemplo, tu propia mascota o una inventada—. Haz que se presente y que juegue tres veces. Ejecuta el programa y comprueba que la energía **baja de 10 en 10**. Recuerda que cada objeto guarda sus propios datos, así que las otras mascotas no se ven afectadas. Cuando termines, continúa con el video. ¡Tienes un minuto!
> 
> *(Breve pausa de silencio en el video)*
> 
> ¡Excelente trabajo! Hoy diste tus primeros pasos en la programación orientada a objetos. Una **clase** es el plano y un **objeto** es lo que construimos con ese plano usando `new`. Viste que una clase tiene **atributos**, que son sus características; un **constructor**, que da los valores iniciales; y **métodos**, que son sus comportamientos; y que `this` significa *este objeto*. En la próxima lección protegeremos los datos de la clase con la **encapsulación** y guardaremos varios objetos en **arrays**."

---

## Código de Referencia para la Lección

**Código de Inicio (Starter - Para el estudiante):**
```java
class Mascota {
    String nombre;      // atributo: característica
    String tipo;

    public Mascota(String nombre, String tipo) {   // constructor
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void presentarse() {                    // método: comportamiento
        System.out.println("Hola, soy " + nombre + " y soy un " + tipo + ".");
    }
}
```

**Código Final (Completed):**
```java
class Mascota {
    String nombre;
    String tipo;
    int energia;

    public Mascota(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.energia = 100;
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + ", un " + tipo + ".");
    }

    public void jugar() {
        if (energia > 0) {
            energia = energia - 10;
            System.out.println(nombre + " jugó. Energía: " + energia);
        } else {
            System.out.println(nombre + " está cansado y descansa.");
        }
    }
}

public class MainMascota {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Luna", "gato");
        Mascota mascota2 = new Mascota("Rocky", "perro");

        mascota1.presentarse();
        mascota2.presentarse();

        mascota1.jugar();
        mascota1.jugar();
        mascota1.jugar();
    }
}
```

**Reto de Participación — Tu clase Videojuego (Solución):**
```java
class Videojuego {
    String titulo;
    int anio;

    public Videojuego(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
    }

    public void describir() {
        System.out.println(titulo + " (" + anio + ")");
    }
}

public class Reto8 {
    public static void main(String[] args) {
        Videojuego juego1 = new Videojuego("Aventura Espacial", 2024);
        Videojuego juego2 = new Videojuego("Carreras Urbanas", 2025);

        juego1.describir();
        juego2.describir();
    }
}
```
