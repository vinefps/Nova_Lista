//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Faça um programa que carregue dois vetores com 10 posições.
        // O primeiro vetor deverá conter o nome dos alunos de uma turma
        // e o segundo suas respectivas notas. Após a leitura, calcule a média geral da
        // turma e imprima o nome de todos os alunos com nota superior a média da turma.
        Scanner sc = new Scanner(System.in);
        int media = 0;


        String [] primeiroVetor = new String[10];
        int [] segundoVetor = new int[10];

        System.out.println("Digite 10 nomes: ");

        for(int i = 0;i < primeiroVetor.length;i++){
            System.out.printf("Digite o nome %d: ", i);
            primeiroVetor[i] = sc.next();

        }
        for(int j = 0;j < segundoVetor.length;j++){
            System.out.printf("Digite a nota e cada aluno. Aluno %d:  ", j);
            segundoVetor[j] = sc.nextInt();
            media += segundoVetor[j];
        }
        System.out.println("A média é: " + media / segundoVetor.length);

    }
}