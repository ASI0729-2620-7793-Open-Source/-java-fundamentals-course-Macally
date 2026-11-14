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