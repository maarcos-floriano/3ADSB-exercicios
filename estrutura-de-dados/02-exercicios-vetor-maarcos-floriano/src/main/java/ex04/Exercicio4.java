package ex04;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {

            System.out.println("Digite um numero: ");
            vetor[i] = scanner.nextInt();

        }

        System.out.println("Digite um numero para descobrir quantos dele tem na lista: ");
        int numeroEscolhido = scanner.nextInt();

        int contador = 0;
        for (int numeroDaVez : vetor){
            if (numeroEscolhido == numeroDaVez){
                contador++;
            }
        }

        System.out.println("O numero " + numeroEscolhido + ", apareceu " + contador + "vezes");

    }

}
