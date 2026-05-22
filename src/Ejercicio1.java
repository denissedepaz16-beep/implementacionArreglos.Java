import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        String[] frutas = new String[10];

        System.out.println("--- Registro de Frutas ---");

        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Ingrese la fruta #" + (i + 1) + ": ");
            frutas[i] = scanner.nextLine();
        }

        System.out.println("\n--- Frutas en orden inverso ---");
        for (int i = frutas.length - 1; i >= 0; i--) {
            System.out.println(frutas[i]);
        }
    }
}