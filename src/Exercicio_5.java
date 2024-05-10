import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
public class Exercicio_5 {
    public static void main(String[] args) {
        //5. Faça um programa que leia um vetor inteiro N[20].
        // Imprima o vetor na ordem inversa a digitada.

        Random random = new Random();
        int[] vetor = new int[20];

        for(int i = 0; i < vetor.length;i++){
            int valor = random.nextInt(100);
            vetor[i] = valor;
        }
        for(int j = 0;j < vetor.length;j++){
            System.out.println("Posicao: " + (20 - j) + ":" + vetor[19 - j]);
        }

    }
}
