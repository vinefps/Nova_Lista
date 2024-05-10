import java.util.Random;

public class Exercicio_6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[10];


        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(50);
        }


        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] % 2 == 0 && vetor[j] % 2 == 0 && vetor[i] > vetor[j]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }


        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] % 2 != 0 && vetor[j] % 2 != 0 && vetor[i] < vetor[j]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }

        // Imprimindo os números pares
        System.out.println("Números pares em ordem não decrescente:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);
            }
        }

        // Imprimindo os números ímpares
        System.out.println("Números ímpares em ordem não crescente:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.println(vetor[i]);
            }
        }
    }
}
