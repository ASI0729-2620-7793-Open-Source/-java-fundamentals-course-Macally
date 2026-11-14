class Mascota {
    String nombre;      // atributo: característica
    String tipo;

    public Mascota(String nombre, String tipo) {   // constructor
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void presentarse() {                    // método: comportamiento
        System.out.println("Hola, soy " + nombre + " y soy un " + tipo + ".");
    }
}