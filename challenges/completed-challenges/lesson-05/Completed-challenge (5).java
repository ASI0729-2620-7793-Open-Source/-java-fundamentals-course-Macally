public class Reto5 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            System.out.println("Faltan " + i + " segundos");
        }

        int total = 0;
        int numero = 1;
        while (numero <= 5) {
            total = total + numero;
            numero = numero + 1;
        }
        System.out.println("La suma del 1 al 5 es: " + total); // 15
    }
}