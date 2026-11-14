# Guion de la Lección 3: Operadores y expresiones

## Detalles de la Lección
* **Duración aproximada:** 6.5 minutos
* **Público objetivo:** Estudiantes de secundaria (12 a 17 años)
* **Herramientas:** Diapositivas visuales y JDoodle (100% en línea)

---

## Estructura del Video

### Bloque 1: Tres familias de operadores 
* **[En pantalla]:** Portada animada "Lección 3 · Operadores" (una calculadora escribe `10 + 3 = 13`). Luego la diapositiva "Tres familias de operadores" con la franja "Tres familias de operadores" que se ilumina en cada una.
* **[Texto de apoyo visual]:** `Aritméticos + - * / %` · `Lógicos && || !` · `Comparación < > <= >=`
* **[Narración (Voz en off)]:** 
> "Bueno, en la lección número 3 vamos a ver el tema de los **operadores**. En este caso tenemos tres familias de operadores: los **aritméticos**, los **lógicos** y los de **comparación**, además de algunas notas de Java, ya que estamos en el lenguaje Java."

### Bloque 2: Objetivo de la lección 
* **[En pantalla]:** Panel "Objetivo" con tres tarjetas: calcular, comparar y combinar.
* **[Texto de apoyo visual]:** `10 + 3 → 13` · `17 >= 12 → true` · `true && false → false`
* **[Narración]:** 
> "Entonces, nuestro objetivo en esta sesión sería que el estudiante realice **cálculos y comparaciones** usando operadores matemáticos, de comparación y lógicos."

### Bloque 3: Operadores aritméticos y el residuo 
* **[En pantalla]:** Se resalta en la diapositiva la línea `+ - * / %`. Aparecen las cuatro tarjetas de operaciones y, después, la animación de 10 galletas repartidas en 3 platos (sobra 1).
* **[Texto de apoyo visual]:** `+ suma · - resta · * multiplicación · / división` y `10 % 3 = 1`
* **[Narración]:** 
> "Los programas también tienen que calcular; por eso siempre existen los operadores. Los aritméticos son los de toda la vida: la **suma**, la **resta**, la **multiplicación** y la **división**.
> 
> Lo que puede parecer un poco raro es el tema del **porcentaje** `%`: este es el **residuo**, es decir, lo que sobra al dividir. Un ejemplo sería: si divides 10 entre 3, sobra 1. Es decir, el residuo de 10 entre 3 es 1. Okay, vamos a la zona de programación."

### Bloque 4: Demostración en Vivo — Una pequeña calculadora 
* **[En pantalla]:** JDoodle ampliado. Panel "Operadores aritméticos" (filas `a + b`, `a - b`, `a * b` que se iluminan al escribirse) y tarjetas "La calculadora" (cajas `int a = 10`, `int b = 3`), "Texto + cuenta" y "Multiplicar" (la `×` tachada se convierte en `*`).
* **[Textos flotantes en edición]:** 
  * `"Suma: " + (a+b) = El paréntesis hace la cuenta primero`
  * `En Java no existe la ×, se usa el asterisco *`
* **[Código que se escribe en JDoodle]:**
  ```java
  System.out.println("Suma: " + (a+b));
  System.out.println("Resta: " + (a-b));
  System.out.println("Multiplicacion: " + (a*b));
  ```
* **[Narración]:** 
> "Bueno, empezamos la programación de la lección número 3: es una pequeña calculadora. Aquí tenemos que poner `System.out.println`, como en los pasos anteriores. Escribimos el texto *'Suma: '*, lo concatenamos con un **más** y abrimos un paréntesis para sumar los datos: en este caso será `a + b`. Cerramos con punto y coma.
> 
> Abajo, otra vez `System.out.println`, en este caso para la **resta**: *'Resta: '* más `a - b`. Y en la siguiente línea vamos a poner la **multiplicación**. Fíjense: para la multiplicación, en Java se usa el **asterisco**: `a * b`. El asterisco reemplaza a la equis de multiplicación."

### Bloque 5: Probamos y vemos la división entera 
* **[En pantalla]:** Animación del botón **Execute** y aparece el recuadro "Consola · salida real". Tarjetas "Probamos" (checks en 13, 7 y 30) y "División" (`10 / 3 = 3` y "¿y el 3.33…?").
* **[Texto de apoyo visual]:** `Entre números enteros (int), Java se queda solo con la parte entera`
* **[Código que se escribe en JDoodle]:**
  ```java
  System.out.println("Division: " + (a/b));
  ```
* **[Narración]:** 
> "Vamos a comprobar en el *output* cómo se ve: la suma es correcta, 10 más 3, 13; 10 menos 3, 7; y 10 por 3, 30.
> 
> Siguiendo con el último `println`, ponemos la **división**: `a / b`. Se ejecuta con normalidad y, como se dan cuenta, la división da **3**. Lo que sobra no aparece: entre números enteros, Java se queda solo con la parte entera."

### Bloque 6: El residuo con `%` 
* **[En pantalla]:** Tarjeta "Residuo %" con la animación de las galletas y el chip `10 % 3 = 1`. Execute y consola.
* **[Código que se escribe en JDoodle]:**
  ```java
  System.out.println("Residuo: " + (a%b));
  ```
* **[Narración]:** 
> "Todo lo que resta sería el **residuo**, y para eso usaremos el **módulo** `%`, como hemos visto anteriormente, que sirve para ver cuál es el residuo. `System.out.println`, *'Residuo: '*, concatenamos con un más y, entre paréntesis, `a % b`. Ejecutamos y vemos el número **1**: lo que sobra de dividir 10 entre 3."

### Bloque 7: Comparaciones y el operador lógico `&&` 
* **[En pantalla]:** Tarjetas "Comparación" (caja `int edad`) y "¿Puede tomar el curso?" con los chips `13 <= edad`, `&&`, `edad <= 17` y una recta numérica que marca el rango.
* **[Texto de apoyo visual]:** `&& = las dos condiciones deben cumplirse`
* **[Código que se escribe en JDoodle]:**
  ```java
  int edad = 17;
  System.out.println("Puede tomar este curso?" + (13<=edad && edad<=17));
  ```
* **[Narración]:** 
> "Y entrando ahora a la sección de **comparaciones**, vamos a hacer una comparación con la edad. Ponemos una variable de tipo `int` llamada `edad`, que en este caso va a ser **17**, y cerramos con punto y coma.
> 
> Ahora hacemos la expresión con `System.out.println`. Ponemos el texto *'¿Puede tomar este curso?'*, un más, y abrimos el paréntesis para hacer la pequeña comparación: la edad tiene que ser **de 13 hasta 17**. Es decir, `13 <= edad` **y** `edad <= 17`: las dos condiciones tienen que cumplirse."

### Bloque 8: Un error común y la prueba final 
* **[En pantalla]:** Tarjeta "¡Un error!" con `error: ';' expected` y el chip verde `;`. Luego la tarjeta "true o false": `edad = 17 → true ✓` y `edad = 20 → false ✗`.
* **[Narración]:** 
> "Okay, faltaba un **punto y coma** al final de la línea; por eso Java nos marcaba error. Lo agregamos y ahora sí se muestra de manera correcta: **true**, porque 17 está dentro del rango.
> 
> Digamos que yo le pongo **20 años**. ¿Qué va a salir? **false**: es falso. Y con esto acaba esta sección. Ahora vamos a dejarles un reto para ustedes."

### Bloque 9: Pausa Interactiva y Cierre 
* **[En pantalla]:** Escena "¡TU TURNO!" con el ícono de pausa, los pasos del reto, un recuadro con los comentarios del reto y la pista `a > b → responde true o false`. Luego la pantalla "¡Lección 3 completada!" con la tarjeta "Próxima lección: Estructuras de control".
* **[Texto de apoyo visual]:** `¡PAUSA PARA PRACTICAR!` · `// suma, resta, multiplicación, división y residuo` · `// ¿a es mayor que b?`
* **[Narración]:** 
> "Bueno, este sería el reto para todos ustedes: teniendo una variable `a` y una variable `b`, tienen que mostrar la **suma, resta, multiplicación, división y residuo**, como en la clase. Y también tienen que ver si `a` es **mayor que** `b`. Me despido: ¡muchos éxitos y mucha suerte!"

---

## Código de Referencia para la Lección

**Código Final (Completed):**
```java
public class Operadores {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("Suma: " + (a + b));          // 13
        System.out.println("Resta: " + (a - b));         // 7
        System.out.println("Multiplicación: " + (a * b));// 30
        System.out.println("División: " + (a / b));      // 3
        System.out.println("Residuo: " + (a % b));       // 1

        int edad = 17;
        System.out.println("¿Puede tomar el curso? " + (edad >= 12 && edad <= 17));
    }
}
```

**Reto de Participación — Mini calculadora (Solución):**
```java
public class Reto3 {
    public static void main(String[] args) {
        int a = 12;
        int b = 5;

        System.out.println("Suma: " + (a + b));              // 17
        System.out.println("Resta: " + (a - b));             // 7
        System.out.println("Multiplicación: " + (a * b));    // 60
        System.out.println("División: " + (a / b));          // 2
        System.out.println("Residuo: " + (a % b));           // 2
        System.out.println("¿a es mayor que b? " + (a > b)); // true
    }
}
```
