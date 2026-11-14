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