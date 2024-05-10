import java.util.Arrays;
import java.util.Random;
public class Exercicio_4 {
    //Faça um programa que leia um vetor inteiro N[100].
    // Imprima todas as posições que contém números entre
    // 10 e 30 e os respectivos valores.

    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[100];


        for(int i = 0; i < vetor.length;i++){
            int valor = random.nextInt(100);
            vetor[i] = valor;
        }
        for(int k = 0; k < vetor.length;k++){
            if (vetor[k] >= 10 && vetor[k] <= 30) {
                System.out.println("Posição " + k + ": " + vetor[k]);
            }
        }
    }

}
