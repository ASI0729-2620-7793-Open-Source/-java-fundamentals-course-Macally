# Guion de la Lección 9: Encapsulación (getters/setters) y arrays con objetos

## Detalles de la Lección
* **Duración aproximada:** 8 minutos
* **Público objetivo:** Estudiantes de secundaria (12 a 17 años)
* **Herramientas:** Diapositivas visuales y JDoodle (100% en línea)

---

## Estructura del Video

### Bloque 1: El problema y la regla de la encapsulación 
* **[En pantalla]:** Portada animada "Lección 9 · Encapsulación y arrays". Panel "El problema" (la batería de la mascota con `energia = -500`), "Hoy veremos" (Bloque 1: encapsulación · Bloque 2: arrays) y "La regla" (candados `private`, `get` para leer y `set` para modificar).
* **[Texto de apoyo visual]:** `private` → solo visible dentro de la clase · `get` → leer · `set` → modificar validando
* **[Narración (Voz en off)]:** 
> "En la lección anterior, cualquier parte del programa podía cambiar los atributos directamente, incluso con valores inválidos. En nuestra clase pasada, ¿qué hubiera pasado si alguien ponía la energía de la mascota en **menos 500**? La **encapsulación** evita esto.
> 
> Vamos a ir por partes: en esta clase primero explicaremos la encapsulación y después los arrays. Para comprender la encapsulación, la regla es simple: los atributos se declaran `private`, lo que quiere decir que **solamente son visibles dentro de la clase**, y se acceden desde afuera mediante `get` para **leer** y `set` para **modificar**, validando el valor antes."

### Bloque 2: Empezamos pequeño — la clase `Punto` 
* **[En pantalla]:** Diapositiva con el ejemplo `Punto` resaltado por partes y el panel "Empezamos pequeño".
* **[Texto de apoyo visual / Código en pantalla]:**
  ```java
  class Punto {
      private int x;

      public void setX(int x) {
          if (x >= 0 && x <= 100) {
              this.x = x;
          } else {
              System.out.println("El valor de x está fuera del rango");
          }
      }

      public int getX() {
          return x;
      }
  }
  ```
* **[Narración]:** 
> "Empezamos con el ejemplo más pequeño posible: una clase con un solo atributo. Tenemos la clase `Punto`. Dentro de `Punto` declaramos un atributo `private` de tipo `int` llamado `x`. Creamos la función `setX`, que recibe el valor de `x`, y le ponemos un `if`: si `x` es **mayor o igual que 0** y **menor o igual que 100**, se guarda el valor; caso contrario, en pantalla se mostrará que el valor de `x` está **fuera del rango**. A continuación utilizamos `setX` para escribir el valor, y `getX` nos lo retorna. **Sin validación, cualquiera podría poner un valor imposible.**"

### Bloque 3: De concepto a clase real — `Estudiante` 
* **[En pantalla]:** JDoodle ampliado. Panel "Atributos privados" (candados en `nombre` y `promedio`), tarjetas "Constructor", "Getters y setter" y "Validación" (rango 0–20).
* **[Textos flotantes en edición]:** 
  * `private String nombre; private double promedio;`
  * `getNombre() / getPromedio() = leen`
  * `setPromedio() = modifica solo si está entre 0 y 20`
* **[Narración]:** 
> "Ahora que ya tenemos un concepto de lo que es encapsulación, aplicaremos este patrón a una clase de verdad: la clase `Estudiante`, con dos atributos. Para ello iremos a nuestro editor, JDoodle.
> 
> Primero creamos la clase `Estudiante`, que nos servirá como modelo para crear objetos estudiante. Declaramos dos atributos privados: `nombre`, que almacena el nombre del estudiante, y `promedio`, que almacena su nota. Usamos `private` para proteger estos atributos. Después creamos el **constructor**, que recibe el nombre y el promedio cuando creamos un estudiante; con `this.nombre = nombre` asignamos el valor recibido al atributo de la clase.
> 
> Luego creamos los **getters**: uno nos permite obtener el nombre del estudiante y el otro consultar su promedio. El **setter** nos permite modificar el promedio, pero primero comprueba que esté **entre 0 y 20**: si cumple la condición, guarda el nuevo promedio; de lo contrario, muestra un mensaje de error."

### Bloque 4: Probamos el setter en `main` 
* **[En pantalla]:** Tarjeta con el objeto `ana` (18.5), el intento de `setPromedio(185)` rechazado con una ✗ y la consola real.
* **[Narración]:** 
> "Ahora tenemos la clase `Curso`, donde se encuentra el método `main`, que es el punto de inicio del programa. Aquí creamos un objeto llamado `ana` de tipo `Estudiante`, enviando su nombre y su promedio al constructor. Utilizamos los getters para mostrar el nombre y el promedio de Ana.
> 
> Ahora intentamos cambiar su promedio a **185**, pero supera el límite y el setter **lo rechaza**. Finalmente mostramos el promedio de Ana y comprobamos que **sigue siendo 18.5**, porque el valor anterior no fue reemplazado."

### Bloque 5: Tema 2 — Los arrays 
* **[En pantalla]:** Panel "Tema 2 · Arrays" con una fila de cajas numeradas `[0] [1] [2]` y la diapositiva del ejemplo `ArraysBasicos`.
* **[Texto de apoyo visual / Código en pantalla]:**
  ```java
  String[] materias = {"Matemática", "Comunicación", "Ciencia"};
  System.out.println(materias[0]);
  System.out.println(materias.length);
  for (int i = 0; i < materias.length; i++) {
      System.out.println(materias[i]);
  }
  ```
* **[Narración]:** 
> "Muy bien, ahora vamos con el segundo tema: los **arrays**. Un array es una **caja con varias posiciones numeradas** para guardar varios valores del mismo tipo. Empezamos con un ejemplo pequeño: un array de tres textos.
> 
> Miremos el siguiente ejemplo, donde creamos la clase `ArraysBasicos` y el método `main`, donde se ejecutará nuestro programa. Declaramos un array llamado `materias` que almacena tres elementos de tipo `String`. Mostramos el primer elemento del array —recordemos que **los índices empiezan en 0**—. Con `length` obtenemos la cantidad de elementos que tiene el array; en este caso son tres. Utilizamos un `for` para recorrer el array: mientras `i` sea menor que la cantidad de materias, mostramos cada elemento. Así podemos almacenar varios datos en un array y recorrerlos utilizando un ciclo `for`."

### Bloque 6: Pausa Interactiva 
* **[En pantalla]:** Texto grande `PAUSA EL VIDEO Y AGREGA UNA CUARTA MATERIA` con el ícono de pausa.
* **[Narración]:** 
> "Muy bien, ahora que tenemos los conceptos de encapsulamiento y de arrays, pongamos a prueba lo aprendido: **pon pausa al video y agrega una cuarta materia al array**. ¡Tú puedes hacerlo!
> 
> *(Breve pausa de silencio en el video)*"

### Bloque 7: Parte final — Combinamos todo 
* **[En pantalla]:** JDoodle con el código completo. Paneles "Todo junto" y "Array de objetos" (`grupo[0] = ana`, `grupo[1] = luis`, `grupo[2] = Carla`) y la consola real con las tres fichas.
* **[Narración]:** 
> "Por último, combinamos los dos bloques: la clase encapsulada de la parte uno dentro de un array de la parte dos. Primero tenemos la clase `Estudiante` con dos atributos privados, `nombre` y `promedio`. El constructor recibe esos datos y se los asigna al crear cada estudiante. Los métodos `getNombre` y `getPromedio` permiten consultar los datos de cada estudiante; el método `setPromedio` permite modificar el promedio, pero verifica que esté entre 0 y 20, y si no se cumple, muestra un mensaje de error. El método `mostrarFicha` muestra el nombre y el promedio del estudiante utilizando los getters.
> 
> En la clase `Curso` creamos dos objetos, **Ana y Luis**, cada uno con su nombre y su promedio. Después modificamos el promedio de Luis a **16**; luego intentamos asignarle **99**, pero el setter rechaza ese valor porque supera el límite permitido. Ahora creamos un array llamado `grupo` que puede almacenar **tres objetos** de tipo `Estudiante`: agregamos a Ana, a Luis y creamos una tercera estudiante, **Carla**. Finalmente utilizamos un ciclo `for` para recorrer el array y llamar al método `mostrarFicha` de cada estudiante.
> 
> De esta manera combinamos las clases, los objetos, la encapsulación, los métodos y los arrays, además de los ciclos, para administrar un grupo de estudiantes."

### Bloque 8: Cierre 
* **[En pantalla]:** Diapositiva de cierre con la tarjeta "¡Lección 9 completada!" y "Próxima lección · Final".
* **[Narración]:** 
> "¡Perfecto! En la lección final uniremos todo: clases, encapsulación, arrays, entrada de datos y validación, para crear un **registro de estudiantes completo**."

---

## Código de Referencia para la Lección

**Código Final (Completed):**
```java
class Estudiante {
    private String nombre;
    private double promedio;

    public Estudiante(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 20) {
            this.promedio = promedio;
        } else {
            System.out.println("Promedio inválido: debe estar entre 0 y 20.");
        }
    }

    public void mostrarFicha() {
        System.out.println(getNombre() + " - Promedio: " + getPromedio());
    }
}

public class Curso {
    public static void main(String[] args) {
        Estudiante ana = new Estudiante("Ana", 18.5);
        Estudiante luis = new Estudiante("Luis", 14.0);

        luis.setPromedio(16.0);
        luis.setPromedio(99); // inválido: el setter lo rechaza

        Estudiante[] grupo = new Estudiante[3];
        grupo[0] = ana;
        grupo[1] = luis;
        grupo[2] = new Estudiante("Carla", 19.0);

        for (int i = 0; i < grupo.length; i++) {
            grupo[i].mostrarFicha();
        }
    }
}
```

**Reto de Participación — Encapsulación y arrays (Solución, Parte A: validación del setter):**
```java
public void setPromedio(double promedio) {
    if (promedio >= 0 && promedio <= 20) {
        this.promedio = promedio;
    } else {
        System.out.println("Promedio inválido: debe estar entre 0 y 20.");
    }
}
```
