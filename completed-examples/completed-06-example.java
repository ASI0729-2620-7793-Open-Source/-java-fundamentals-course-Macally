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