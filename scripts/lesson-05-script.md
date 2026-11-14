# Guion de la Lección 5: Bucles: for y while

## Detalles de la Lección
* **Duración aproximada:** 6.5 minutos
* **Público objetivo:** Estudiantes de secundaria (12 a 17 años)
* **Herramientas:** Diapositivas visuales y JDoodle (100% en línea)

---

## Estructura del Video

### Bloque 1: ¿Para qué sirven los bucles? 
* **[En pantalla]:** Portada animada "Lección 5 · Bucles: for y while" y diapositiva de teoría.
* **[Texto de apoyo visual]:** `for = sé cuántas veces repetir` · `while = repite mientras la condición sea verdadera`
* **[Narración (Voz en off)]:** 
> "En esta lección aprenderemos a utilizar los bucles `for` y `while`. Los bucles nos permiten **repetir instrucciones** sin necesidad de escribir el mismo código varias veces.
> 
> El `for` se utiliza cuando **sabemos cuántas veces** queremos repetir una acción. En cambio, el `while` se ejecuta **mientras una condición** continúe siendo verdadera. También debemos tener cuidado con los **bucles infinitos**, que pueden ocurrir cuando la condición del `while` nunca cambia. A continuación veremos estos conceptos aplicados en código."

### Bloque 2: Demostración en Vivo — Las tres partes del `for` 
* **[En pantalla]:** JDoodle ampliado. Tarjeta "Estructura" (`class Bucles`) y panel "Anatomía del for" con tres filas que se iluminan al escribirse.
* **[Textos flotantes en edición]:** 
  * `int i = 1 = INICIO: el contador empieza en 1`
  * `i <= 5 = CONDICIÓN: repite mientras sea true`
  * `i++ = ACTUALIZACIÓN: suma 1 en cada vuelta`
* **[Código que se escribe en JDoodle]:**
  ```java
  for(int i=1; i<=5; i++){
      System.out.println("Práctica" +i);
  }
  ```
* **[Narración]:** 
> "Primero creamos la clase y luego el método principal. Vamos a comenzar con el bucle `for`, que tiene tres partes importantes. Primero, `int i = 1`, que indica que nuestro contador **comienza en uno**. Luego tenemos `i <= 5`, que es la **condición**: el bucle seguirá ejecutándose mientras `i` sea menor o igual que cinco. Finalmente tenemos `i++`, que **aumenta el valor de `i` en uno** después de cada repetición.
> 
> Ahora colocamos lo siguiente: en este caso mostraremos la palabra *'Práctica'* junto con el valor actual de `i`."

### Bloque 3: Ejecutamos el `for` 
* **[En pantalla]:** Tarjeta "Dentro del for" con la animación del contador `i` dando vueltas. Animación del botón **Execute**, consola real con `Práctica1 … Práctica5` y el banner `¡5 repeticiones con 1 instrucción!`.
* **[Narración]:** 
> "Al ejecutar esta primera parte, podemos observar que aparecen las prácticas desde la 1 hasta la 5. De esta manera no necesitamos escribir cinco veces la misma instrucción: el `for` se encarga de repetirla automáticamente."

### Bloque 4: Demostración en Vivo — El bucle `while` 
* **[En pantalla]:** Panel "Anatomía del while" y tarjeta "¿Cómo funciona el while?" con un diagrama de flujo (`intentos > 0` → true: cuerpo del bucle / false: sale).
* **[Textos flotantes en edición]:** 
  * `int intentos = 3 = Variable de control`
  * `intentos > 0 = CONDICIÓN: repite mientras sea true`
  * `intentos = intentos - 1 = ACTUALIZACIÓN: ¡evita el bucle infinito!`
* **[Código que se escribe en JDoodle]:**
  ```java
  int intentos = 3;

  while(intentos>0){
      System.out.println("Te quedan "+intentos+" intentos");
      intentos = intentos - 1;
  }

  System.out.println("¡Se acabaron los intentos!");
  ```
* **[Narración]:** 
> "Ahora vamos a trabajar con el bucle `while`. Primero creamos una variable llamada `intentos` con el valor de **3**. Luego escribimos `while` y, entre paréntesis, `intentos > 0`. Esta condición indica que el bucle seguirá ejecutándose **mientras `intentos` sea mayor que cero**.
> 
> Dentro mostramos lo siguiente, que nos va a mostrar cuántos intentos quedan. Después vamos a **disminuir el valor de la variable en uno**, quedando de esta manera. Y finalmente mostramos un mensaje cuando el bucle termina."

### Bloque 5: ¡Cuidado con el bucle infinito! 
* **[En pantalla]:** Tarjeta "¡Cuidado! Bucle infinito" con el símbolo ∞ animado y la tarjeta "Al terminar" (el mensaje final sale de la caja).
* **[Texto de apoyo visual]:** `Sin intentos = intentos - 1: intentos siempre vale 3 → 3 > 0 es true → el programa nunca termina`
* **[Narración]:** 
> "Esta línea es muy importante porque permite que la condición vaya cambiando. Si no modificamos `intentos`, su valor siempre sería 3 y la condición seguiría siendo verdadera. Esto podría provocar que el programa continúe ejecutándose indefinidamente: lo que conocemos como un **bucle infinito**."

### Bloque 6: Ejecutamos el programa completo 
* **[En pantalla]:** Tarjeta "Resultado" (`for → Práctica1 … Práctica5`, `while → Te quedan 3 … 1`, `¡Se acabaron los intentos!`) y la consola real.
* **[Narración]:** 
> "Ahora ejecutamos el programa completo. Podemos observar que primero el `for` muestra las prácticas del 1 al 5 y, después, el `while` muestra los intentos desde 3 hasta 1, finalizando con el mensaje de que se acabaron los intentos."

### Bloque 7: Pausa Interactiva y Cierre 
* **[En pantalla]:** Escena "¡TU TURNO!" con el ícono de pausa, los pasos del reto, una cuenta regresiva animada `5 → 1` y la suma `1 + 2 + 3 + 4 + 5 = ?`, con el aviso `¡Evita el bucle infinito!`. Luego la diapositiva de cierre "Bucles: repetir tareas (for y while)" y la tarjeta "¡Lección 5 completada!".
* **[Texto de apoyo visual]:** `for → cuando conoces cuántas repeticiones` · `while → mientras una condición sea verdadera` · `i++ / -1 → actualiza la variable: evita bucles infinitos`
* **[Narración]:** 
> "Ahora es tu turno de participar utilizando lo aprendido en esta lección. Realiza una **cuenta regresiva del 5 al 1** empleando un bucle `for`. Luego utiliza un bucle `while` para obtener la **suma de los números del 1 al 5**. Recuerda revisar correctamente las condiciones y actualizar las variables para evitar un bucle infinito. Pausa el video, intenta resolver el reto por tu cuenta y, cuando termines, continúa para comparar tus resultados.
> 
> *(Breve pausa de silencio en el video)*
> 
> En esta lección aprendimos a utilizar los bucles `for` y `while` para repetir instrucciones. Vimos que el `for` es útil cuando conocemos la cantidad de repeticiones, y que el `while` permite repetir una acción mientras una condición sea verdadera. También aprendimos la importancia de actualizar correctamente las variables para evitar bucles infinitos. En la siguiente lección aprenderemos a organizar y reutilizar nuestro código utilizando **métodos y parámetros**."

---

## Código de Referencia para la Lección

**Código Final (Completed):**
```java
public class Bucles {
    public static void main(String[] args) {
        System.out.println("--- Bucle for ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Práctica " + i);
        }

        System.out.println("--- Bucle while ---");
        int intentos = 3;
        while (intentos > 0) {
            System.out.println("Te quedan " + intentos + " intentos");
            intentos = intentos - 1;
        }
        System.out.println("¡Se acabaron los intentos!");
    }
}
```

**Reto de Participación — Cuenta regresiva y suma (Solución):**
```java
public class Reto5 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            System.out.println("Faltan " + i + " segundos");
        }

        int total = 0;
        int numero = 1;
        while (numero <= 5) {
            total = total + numero;
            numero = numero + 1;
        }
        System.out.println("La suma del 1 al 5 es: " + total); // 15
    }
}
```
