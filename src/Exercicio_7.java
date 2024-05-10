import java.util.Random;

public class Exercicio_7 {
    public static void main(String[] args) {
        int[][] M = new int[10][20];

        preencherMatriz(M);
        ordenarMatriz(M);
        imprimirMatriz(M);
    }


    public static void preencherMatriz(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
    }


    public static void ordenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length - 1; j++) {
                int minIndex = j;
                for (int k = j + 1; k < matriz[i].length; k++) {
                    if (matriz[i][k] < matriz[i][minIndex]) {
                        minIndex = k;
                    }
                }

                int temp = matriz[i][j];
                matriz[i][j] = matriz[i][minIndex];
                matriz[i][minIndex] = temp;
            }
        }
    }


    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
