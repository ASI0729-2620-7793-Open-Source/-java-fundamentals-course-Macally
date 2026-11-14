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

    public void mostrarFicha() {
        System.out.println(getNombre() + " - Promedio: " + getPromedio());
   }
}

public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 20) {
            this.promedio = promedio;
        } else {
            System.out.println("Promedio inválido: debe estar entre 0 y 20.");
        }
}