public class RegistroEstudiantes {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Estudiante[] grupo = new Estudiante[3];

        for (int i = 0; i < grupo.length; i++) {
            System.out.print("Nombre del estudiante #" + (i + 1) + ": ");
            String nombre = lector.nextLine().trim();
            while (nombre.isEmpty()) {
                System.out.print("El nombre no puede quedar vacío. Escribe el nombre: ");
                nombre = lector.nextLine().trim();
            }

            System.out.print("Edad: ");
            int edad = lector.nextInt();
            while (edad < 5 || edad > 100) {
                System.out.print("Edad inválida (entre 5 y 100). Intenta de nuevo: ");
                edad = lector.nextInt();
            }
            lector.nextLine(); // limpia el salto de línea pendiente

            grupo[i] = new Estudiante(nombre, edad);
        }

        int contador = 0;
        for (int i = 0; i < grupo.length; i++) {
            if (grupo[i].getEdad() >= 15) {
                contador = contador + 1;
            }
        }

        System.out.println("--- Registro completo ---");
        for (int i = 0; i < grupo.length; i++) {
            grupo[i].mostrarFicha();
        }
        System.out.println("Estudiantes de 15 años o más: " + contador);

        lector.close();
    }
}