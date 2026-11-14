public class Bucles {
    public static void main(String[] args) {
        System.out.println("--- Bucle for ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Práctica " + i);
        }

        System.out.println("--- Bucle while ---");
        int intentos = 3;
        while (intentos > 0) {
            System.out.println("Te quedan " + intentos + " intentos");
            intentos = intentos - 1;
        }
        System.out.println("¡Se acabaron los intentos!");
    }
}