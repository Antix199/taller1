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
    static void mostrarFila(int matriz[][], int fila) {
        if (fila >= 0 && fila < matriz.length) {
            System.out.println("Fila " + fila + ":");
            for (int elemento : matriz[fila]) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        } else {
            System.out.println("Fila no válida.");
        }
    }

    static boolean matrizCero(int matriz[][]) {
        int totalElementos = matriz.length * matriz[0].length;
        int ceros = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    ceros++;
                }
            }
        }
        return (ceros * 2) > totalElementos;
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
            imprimirMatriz(matriz);

            System.out.print("Ingrese 1 para llenar la matriz: ");
            int llenar = scanner.nextInt();
            if (llenar == 1){
                llenarMatriz(matriz);}
            else {
                System.out.println("Su matriz quedará vacía");
            }

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

