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
        Estudiante[] grupo = new Estudiante[2];

        // Pide los datos con validación y crea los objetos aquí
    }
}