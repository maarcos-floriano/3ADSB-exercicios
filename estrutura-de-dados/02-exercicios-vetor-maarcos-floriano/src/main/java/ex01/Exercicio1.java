package ex01;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[7];

        for (int i = 0; i < 7; i++){

            System.out.println("Digite um numero inteiro: ");
            vetor[i] = scanner.nextInt();

        }

        for(int i : vetor){
            System.out.println(i);
        }

        for(int i = vetor.length; i != 0; i--){

            System.out.println(vetor[i - 1]);

        }

    }
}
