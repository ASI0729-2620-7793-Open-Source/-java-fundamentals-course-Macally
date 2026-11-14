import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("¿Cuál es tu nombre? ");
        String nombre = lector.nextLine();

        System.out.print("¿Cuántos años tienes? ");
        int edad = lector.nextInt();
        // Falta una línea: limpia el Enter pendiente antes de leer la ciudad

        System.out.print("¿En qué ciudad vives? ");
        String ciudad = lector.nextLine();

        System.out.println(nombre + ", " + edad + " años, vive en " + ciudad + ".");
        lector.close();
    }
}