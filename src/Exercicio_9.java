import java.util.Random;

public class Exercicio_9 {
    public static void main(String[] args) {
        char operacao = 'S'; // Operação padrão é soma
        int[][] M = new int[12][12];

        preencherMatriz(M);

        // Calcular a soma ou média conforme a operação indicada
        double resultado = calcularResultado(M, operacao);

        // Imprimir o resultado
        System.out.println("Resultado da operação " + operacao + ": " + resultado);
    }

    // Método para preencher a matriz com valores aleatórios
    public static void preencherMatriz(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100); // Valores aleatórios até 99
            }
        }
    }

    // Método para calcular a soma ou média dos elementos na área verde da matriz
    public static double calcularResultado(int[][] matriz, char operacao) {
        int soma = 0;
        int count = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i < j && i + j < matriz.length - 1) { // Elementos na área verde
                    soma += matriz[i][j];
                    count++;
                }
            }
        }

        if (operacao == 'M') { // Se a operação for média, calcular a média
            return (double) soma / count;
        } else { // Se a operação for soma, retornar a soma
            return soma;
        }
    }
}
