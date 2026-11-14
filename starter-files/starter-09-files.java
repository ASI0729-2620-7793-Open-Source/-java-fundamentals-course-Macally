class Estudiante {
    private String nombre;
    private double promedio;

    public Estudiante(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 20) {
            this.promedio = promedio;
        } else {
            System.out.println("Promedio inválido: debe estar entre 0 y 20.");
        }
    }
}

public class Curso {
    public static void main(String[] args) {
        Estudiante ana = new Estudiante("Ana", 18.5);
        System.out.println(ana.getNombre() + " tiene " + ana.getPromedio());

        ana.setPromedio(99); // inválido: el setter lo rechaza
        System.out.println("Ana queda con: " + ana.getPromedio());
    }
}