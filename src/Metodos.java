import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas que desea crear: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas que desea crar: ");
        int cols = scanner.nextInt();

        if (validarDimensiones(filas, cols)) {
            int[][] matriz = crearMatriz(filas, cols);
            System.out.println("Matriz creada correctamente:");
            imprimirMatriz(matriz);
        } else {
            System.out.println("Dimensiones no válidas. Deben ser números enteros positivos.");
        }

        scanner.close();
    }

    static boolean validarDimensiones(int filas, int cols) {
        return filas > 0 && cols > 0;
    }

    static int[][] crearMatriz(int filas, int cols) {
        return new int[filas][cols];
    }

    static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

