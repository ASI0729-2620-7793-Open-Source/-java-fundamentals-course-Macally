import java.util.Scanner;

class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarFicha() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad);
    }
}

public class RegistroEstudiantes {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Estudiante[] grupo = new Estudiante[3];

        for (int i = 0; i < grupo.length; i++) {
            // Validación 1: el nombre no puede quedar vacío
            String nombre = "";
            while (nombre.isEmpty()) {
                System.out.print("Nombre del estudiante #" + (i + 1) + ": ");
                nombre = lector.nextLine().trim();
                if (nombre.isEmpty()) {
                    System.out.println("El nombre no puede quedar vacío. Intenta de nuevo.");
                }
            }

            // Validación 2: la edad debe ser un número entre 5 y 100
            int edad = -1;
            while (edad < 5 || edad > 100) {
                System.out.print("Edad (entre 5 y 100): ");
                if (lector.hasNextInt()) {
                    edad = lector.nextInt();
                } else {
                    System.out.println("Escribe un número válido.");
                }
                lector.nextLine(); // limpia el salto de línea pendiente
                if (edad < 5 || edad > 100) {
                    System.out.println("Edad fuera de rango. Intenta de nuevo.");
                }
            }

            grupo[i] = new Estudiante(nombre, edad);
        }

        System.out.println("--- Registro completo ---");
        for (int i = 0; i < grupo.length; i++) {
            grupo[i].mostrarFicha();
        }

        lector.close();
    }
}