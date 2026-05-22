import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas = 3, columnas = 4;
        double[][] matriz = new double[filas][columnas];

        System.out.println("--- Matriz 3x4 (12 valores) - Punto de Silla ---");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Posición [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextDouble();
            }
        }

        boolean encontrado = false;

        System.out.println("\nBuscando Puntos de Silla...");
        for (int i = 0; i < filas; i++) {

            double minFila = matriz[i][0];
            int colDelMin = 0;

            for (int j = 1; j < columnas; j++) {
                if (matriz[i][j] < minFila) {
                    minFila = matriz[i][j];
                    colDelMin = j;
                }
            }


            boolean esPuntoSilla = true;
            for (int k = 0; k < filas; k++) {
                if (matriz[k][colDelMin] > minFila) {
                    esPuntoSilla = false;
                    break;
                }
            }


            if (esPuntoSilla) {
                System.out.println("> ¡Punto de silla encontrado! Valor: " + minFila +
                        " en la posición Fila " + i + ", Columna " + colDelMin);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("> No se encontró ningún punto de silla en esta matriz.");
        }
        sc.close();
    }
}