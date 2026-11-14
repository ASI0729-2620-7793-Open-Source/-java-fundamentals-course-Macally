class Mascota {
    String nombre;
    String tipo;
    int energia;

    public Mascota(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.energia = 100;
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + ", un " + tipo + ".");
    }

    public void jugar() {
        if (energia > 0) {
            energia = energia - 10;
            System.out.println(nombre + " jugó. Energía: " + energia);
        } else {
            System.out.println(nombre + " está cansado y descansa.");
        }
    }
}

public class MainMascota {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Luna", "gato");
        Mascota mascota2 = new Mascota("Rocky", "perro");

        mascota1.presentarse();
        mascota2.presentarse();

        mascota1.jugar();
        mascota1.jugar();
        mascota1.jugar();
    }
}