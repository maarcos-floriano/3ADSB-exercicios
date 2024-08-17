package ex02;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[10];

        for (int i = 0; i < 10; i++){

            System.out.println("Informe uma nota: ");
            notas[i] = scanner.nextDouble();

        }

        double media = 0d;
        for (double i : notas){

            media += i;

        }
        media /= notas.length;

        System.out.println("A media de notas é %.2f".formatted(media));

        for (double i : notas){
            if (i >= media){
                System.out.println("O numero %.2f, esta acima da média".formatted(i));
            }
        }

    }
}
