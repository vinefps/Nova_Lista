import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        //2. Faça um programa que leia 10 números inteiros
        // e os armazene em um vetor. Ordene o vetor em
        // ordem não decrescente e imprima-o.

        Scanner sc = new Scanner(System.in);
        int [] vetor = new int[10];

        System.out.println("Digite 10 numeros inteiros: ");

        for(int i = 0;i < vetor.length;i++){
            vetor[i] = sc.nextInt();
        }
        for(int k = 0; k < vetor.length;k++){
            for(int j = 0;j < vetor.length - 1;j++){
                if(vetor[j] > vetor[j+1]){
                    int elemento = vetor[j+1];
                    vetor[j+1] = vetor[j];
                    vetor[j] = elemento;
                }
            }
        }
        System.out.println(Arrays.toString(vetor));
    }
}
