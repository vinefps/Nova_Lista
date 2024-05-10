import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        //3. Faça um programa que leia um número x.
        // Insira x na primeira posição do vetor real N[10].
        // Em cada posição subsequente (1 a 9) insira o próximo
        // número par maior que o número na posição anterior.
        Scanner sc = new Scanner(System.in);
        int[] N = new int[10];
        System.out.println("Digite um número real: ");

        int valor = sc.nextInt();

        if(valor % 2 == 0){
            N[0] = valor;
        }else{
            N[0] = valor + 1;
        }

        for(int i = 1;i < N.length;i++){
          N[i] = N[i - 1] + 2;
        }

        System.out.println(Arrays.toString(N));
    }
}
