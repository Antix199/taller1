import java.util.Scanner;
import java.util.Random;

public class Metodos {

    static boolean validarDimensiones(int filas, int cols) {
        return filas > 0 && cols > 0;
    }

    static int[][] crearMatriz(int filas, int cols) {
        return new int[filas][cols];
    }

    static int generarRandom() {
        Random random = new Random();
        return random.nextInt(10);}

    static void llenarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = generarRandom();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas que desea crear: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas que desea crear: ");
        int cols = scanner.nextInt();

        if (validarDimensiones(filas, cols)) {
            int[][] matriz = crearMatriz(filas, cols);
            System.out.println("Matriz creada correctamente:");
            llenarMatriz(matriz);
            imprimirMatriz(matriz);
        } else {
            System.out.println("Dimensiones no válidas. Deben ser números enteros positivos.");
        }

        scanner.close();
    }

    static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}

