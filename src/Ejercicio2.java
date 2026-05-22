import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[12];
        int suma = 0;

        System.out.println("--- Registro de 12 Números ---");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i]; // Acumulamos la suma directamente
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("\nLa suma total es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
}