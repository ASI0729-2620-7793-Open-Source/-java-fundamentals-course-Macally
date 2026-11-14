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