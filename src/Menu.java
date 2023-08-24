import java.util.Scanner;
import java.util.Random;

public class Menu {

    static boolean validarDimensiones(int filas, int cols) {
        return filas > 0 && cols > 0;
    }

    static int[][] crearMatriz(int filas, int cols) {
        return new int[filas][cols];
    }

    static int generarRandom() {
        return new Random().nextInt(10);
    }

    static void llenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++)
                matriz[i][j] = generarRandom();
    }

    static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) System.out.print(elemento + " ");
            System.out.println();
        }
    }

    static void mostrarFila(int[][] matriz, int fila) {
        if (fila >= 0 && fila < matriz.length) {
            System.out.println("Fila " + fila + ":");
            for (int elemento : matriz[fila]) System.out.print(elemento + " ");
            System.out.println();
        } else System.out.println("Fila no válida.");
    }

    static boolean matrizCero(int[][] matriz) {
        int total = matriz.length * matriz[0].length, ceros = 0;
        for (int[] fila : matriz)
            for (int elemento : fila) if (elemento == 0) ceros++;
        return (ceros * 2) > total;
    }

    static void menu(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú:\n1. Mostrar una fila\n2. Verificar si la matriz es de tipo cero\n3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de fila que desea mostrar: ");
                    mostrarFila(matriz, scanner.nextInt());
                    break;
                case 2:
                    System.out.println("¿La matriz es de tipo cero? " + matrizCero(matriz));
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
        scanner.close();
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
            if (scanner.nextInt() == 1) llenarMatriz(matriz);
            else System.out.println("Su matriz quedará vacía");
            imprimirMatriz(matriz);
            menu(matriz);
        } else System.out.println("Dimensiones no válidas. Deben ser números enteros positivos.");
        scanner.close();
    }
}

