import java.util.Random;

public class Exercicio_10 {
    public static void main(String[] args) {
        int[][] M = new int[4][4];

        preencherMatriz(M);
        imprimirMatriz(M);

        int[] posicaoMaior = encontrarMaiorNumero(M);
        int linha = posicaoMaior[0];
        int coluna = posicaoMaior[1];
        int maiorNumero = M[linha][coluna];

        System.out.println("\nMaior número: " + maiorNumero);
        System.out.println("Posição (linha, coluna): (" + linha + ", " + coluna + ")");
    }

    // Método para preencher a matriz com valores aleatórios entre 0 e 9
    public static void preencherMatriz(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10); // Valores aleatórios de 0 a 9
            }
        }
    }

    // Método para encontrar o maior número na matriz e retornar sua posição (linha, coluna)
    public static int[] encontrarMaiorNumero(int[][] matriz) {
        int maiorNumero = matriz[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maiorNumero) {
                    maiorNumero = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        return new int[]{linhaMaior, colunaMaior};
    }

    // Método para imprimir a matriz
    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz M[4][4]:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
