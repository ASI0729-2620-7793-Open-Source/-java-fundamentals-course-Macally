# Guion de la Lección 4: Estructuras de control: Decisiones con if-else

## Detalles de la Lección
* **Duración aproximada:** 7 minutos
* **Público objetivo:** Estudiantes de secundaria (12 a 17 años)
* **Herramientas:** Diapositivas visuales y JDoodle (100% en línea)

---

## Estructura del Video

### Bloque 1: Estructuras de control: if y else 
* **[En pantalla]:** Portada animada "Lección 4 · Estructuras de control" (un rombo `¿edad?` que se divide en `true` y `false`). Luego la diapositiva "Estructuras de control" con el título resaltado y aparecen los chips `if` y `else`.
* **[Texto de apoyo visual]:** `if` · `else` · `&&` · `true / false`
* **[Narración (Voz en off)]:** 
> "Bueno, aquí vamos con la lección número 4, que es la de **estructuras de control**. En este caso vamos a estar hablando de los `if` y los `else` en Java."

### Bloque 2: Objetivo de la lección 
* **[En pantalla]:** Se resalta el objetivo en la diapositiva. Panel "Objetivo" con un camino que se divide en "camino A" y "camino B".
* **[Texto de apoyo visual]:** `Que tu programa elija entre caminos` · chips `if` `else` `condiciones combinadas`
* **[Narración]:** 
> "En este caso, nuestro objetivo es que el estudiante haga que su programa **elija entre caminos** usando `if`, `else` y **condiciones combinadas**."

### Bloque 3: El programa elige su ruta 
* **[En pantalla]:** Se resalta el bloque negro "IF-ELSE" de la diapositiva. Panel "El programa elige su ruta" con tres caminos de colores.
* **[Texto de apoyo visual]:** `el usuario o el sistema → elige entre diferentes rutas`
* **[Narración]:** 
> "En sí, el `if-else` permite que el usuario o el sistema pueda **elegir entre diferentes rutas**."

### Bloque 4: Un ejemplo y por qué importa 
* **[En pantalla]:** Panel "Ejemplo" con un rombo `edad == 10` que se divide en "camino de 10 años" (true) y "otro camino" (false). Después, el panel "¿Por qué importa?".
* **[Texto de apoyo visual]:** `Solo pasa por ese camino si la condición es true` · `Los programas siempre reciben información… y con ella eligen qué camino seguir`
* **[Narración]:** 
> "Por ejemplo, alguien que tenga 10 años pasa por un camino que es solamente para los que tienen 10 años, y así con diferentes opciones. Es una de las maneras más importantes de manejar la información, porque siempre el programa va a estar pidiendo información para tomar ciertos caminos."

### Bloque 5: Demostración en Vivo — La misión y la condición 
* **[En pantalla]:** JDoodle ampliado con el programa `Reto4`. Panel "Estructura if / else" y tarjetas "La misión" (cajas `edad = 15` y `matriculado = true`) y "La condición" (chips `edad >= 12`, `&&`, `edad <= 17` y una recta numérica).
* **[Texto de apoyo visual]:** `&& = dos condiciones al mismo tiempo`
* **[Código que se escribe en JDoodle]:**
  ```java
  if(edad>=12 && edad<=17)
  ```
* **[Narración]:** 
> "Bueno, entonces en nuestra lección 4 vamos a ver qué nos dice el ejercicio. Primero nos pide que muestre si puede tomar el curso, entre **12 y 17 años**. Tenemos una variable para la edad. Y ahora nos dice que, si está **matriculado**, muestre *'Adelante'*, y si no, *'Matricúlate primero'*.
> 
> Es algo sencillo con lo que vimos en la teoría. Vamos a hacer un `if`: si se cumple esta condición, continúa. Ponemos que la edad sea **mayor o igual a 12** y, para hacer otra condición —o sea, dos condiciones al mismo tiempo— usamos `&&` y ponemos que la edad sea **menor o igual a 17**."

### Bloque 6: Si se cumple y si no (`else`) 
* **[En pantalla]:** Tarjetas "Si se cumple" (banner `Sí puede tomar el curso`) y "Si no: else".
* **[Código que se escribe en JDoodle]:**
  ```java
  {
      System.out.println("Si puede tomar el curso");
  }
  else{
      System.out.println("No puede tomar el curso");
  }
  ```
* **[Narración]:** 
> "Abrimos las llaves y, adentro, ponemos `System.out.println` con *'Sí puede tomar el curso'*.
> 
> Y en caso de que no se cumpla, se pone el `else`: si se cumple lo de arriba, entra ahí; si no se cumple con ambas condiciones, muestra *'No puede tomar el curso'*."

### Bloque 7: Un `if` dentro de otro `if` 
* **[En pantalla]:** Tarjetas "if dentro de if" (cajas anidadas) y "¿Cómo decide?" (rombo `condición` → true: primer bloque / false: else).
* **[Texto de apoyo visual]:** `El if solo pregunta: ¿true o false?`
* **[Código que se escribe en JDoodle]:**
  ```java
  if(matriculado)
  {
      System.out.println("Adelante");
  }
  else
  {
      System.out.println("Matriculate primero");
  }
  ```
* **[Narración]:** 
> "Ahora, en caso de que sí pueda tomar el curso, necesitamos ingresar más información: es como 'si se cumple esto, ya se cumple lo otro'; así se encadenan. Entonces ponemos: si está matriculado. Recuerden que la variable `matriculado` estaba presente acá: te devuelve `true` o `false`. Todos los `if` funcionan con **true o false**: si esta condición es falsa, pasa directamente al `else`; si es verdadera, pasa directamente a la primera sección.
> 
> Si `matriculado` es verdadero, nos tiene que decir *'Adelante'*; y en caso de que no esté matriculado, que sea `false`, nos dice que se matricule primero: *'Matricúlate primero'*."

### Bloque 8: Probamos el código (y el error del punto y coma) 
* **[En pantalla]:** Animación del botón **Execute**, recuadro "Consola · salida real" con `4 errors: ';' expected`. Tarjeta "¡Faltan los ;!" (`if (…)` sin `;` = validación · `println("…");` con `;` = instrucción). Luego la tarjeta "Probamos" con tres casos.
* **[Narración]:** 
> "Ahora sí, ejecutamos el código y no se ejecuta: nos faltó poner los **punto y coma**. Recuerda siempre poner punto y coma al final de cada instrucción, como `System.out.println`, ya que con esto el programa sabe dónde acaba la instrucción. El `if` no lleva punto y coma porque es parte del código de **validación**; el `println` sí, porque es una instrucción para imprimir.
> 
> Seguimos y ejecutamos. Con **6 años**: *'No puede tomar el curso'*. Vamos a poner **12** y funciona con normalidad: *'Sí puede tomar el curso'* y, como está matriculado, *'Adelante'*. Ahora vamos a poner `matriculado` en `false` y nos dice que se matricule primero. Y esa sería la resolución aplicando `if` y `else`."

### Bloque 9: Pausa Interactiva y Cierre 
* **[En pantalla]:** Escena "¡TU TURNO!" con el ícono de pausa, la tarjeta "Recuerda: el if solo pregunta ¿true o false?" y los pasos del reto. Luego la pantalla "¡Lección 4 completada!" con la tarjeta "Próxima lección: Bucles: for y while".
* **[Texto de apoyo visual]:** `¡PAUSA PARA PRACTICAR!` · `boolean matriculado → if (matriculado) basta`
* **[Narración]:** 
> "Bueno, ahora como reto les estamos dejando hacer algo parecido. Recuerden que los `if` preguntan si es `true` o `false`: preguntan si la condición es verdadera. Una variable `boolean` ya es automáticamente ese dato, así que también tengan eso en cuenta.
> 
> El reto les pide que muestren si puede tomar el curso, **entre 12 y 17 años**, como dije anteriormente; si está matriculado, *'Adelante'*; y si no está matriculado, que se muestre *'Matricúlate primero'*. ¡Muchos éxitos!"

---

## Código de Referencia para la Lección

**Código Final (Completed):**
```java
public class Decisiones {
    public static void main(String[] args) {
        int edad = 15;
        String pais = "Perú";

        if (edad >= 12 && edad <= 17) {
            System.out.println("¡Bienvenido al curso!");
        } else {
            System.out.println("Este curso es para estudiantes de secundaria.");
        }

        if (pais.equals("Perú")) {
            System.out.println("Eres de Perú.");
        } else {
            System.out.println("Eres de otro país.");
        }

        if (edad < 12) {
            System.out.println("Todavía es muy pronto, ¡vuelve pronto!");
        }
    }
}
```

**Reto de Participación — ¿Puedes tomar el curso? (Solución):**
```java
public class Reto4 {
    public static void main(String[] args) {
        int edad = 15;
        boolean matriculado = true;

        if (edad >= 12 && edad <= 17) {
            System.out.println("Puedes tomar el curso.");
        } else {
            System.out.println("Este curso es para estudiantes de secundaria.");
        }

        if (matriculado) {
            System.out.println("Adelante, ya estás matriculado.");
        } else {
            System.out.println("Matrículate primero en tu colegio.");
        }
    }
}
```
