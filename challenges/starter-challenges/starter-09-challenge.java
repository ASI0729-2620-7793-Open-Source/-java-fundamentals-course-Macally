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
        // Valida: solo acepta promedios de 0 a 20
        this.promedio = promedio;
    }

    public void mostrarFicha() {
        System.out.println(getNombre() + " - Promedio: " + getPromedio());
    }
}

public class Reto9 {
    public static void main(String[] args) {
        Estudiante ana = new Estudiante("Ana", 18.5);
        ana.setPromedio(99); // ahora mismo esto deja 99: ¿está bien?
        ana.mostrarFicha();
    }
}