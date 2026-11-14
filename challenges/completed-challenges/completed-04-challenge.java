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