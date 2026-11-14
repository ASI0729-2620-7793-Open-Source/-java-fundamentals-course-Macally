class Videojuego {
    String titulo;
    int anio;

    public Videojuego(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
    }

    public void describir() {
        System.out.println(titulo + " (" + anio + ")");
    }
}

public class Reto8 {
    public static void main(String[] args) {
        Videojuego juego1 = new Videojuego("Aventura Espacial", 2024);
        Videojuego juego2 = new Videojuego("Carreras Urbanas", 2025);

        juego1.describir();
        juego2.describir();
    }
}