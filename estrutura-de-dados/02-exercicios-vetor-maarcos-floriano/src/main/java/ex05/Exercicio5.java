package ex05;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] carros = new String[5];

        for (int i = 0; i < carros.length; i++) {

            System.out.println("Digite o %d carro: ".formatted(i+1));
            carros[i] = scanner.next();

        }

        int[] kmPorLitro = new int[carros.length];

        for (int i = 0; i < carros.length; i++){

            System.out.println("Quantos KM o %s percorre por litro: ".formatted(carros[i]));
            kmPorLitro[i] = scanner.nextInt();

        }

        for (int i = 0; i < carros.length; i++) {

            System.out.println("O Carro %s, percorre %d com um litro".formatted(carros[i], kmPorLitro[i]));

        }

        int maisEconomico = 0;

        for (int i = 0; i < carros.length; i++) {

            if (kmPorLitro[i] > kmPorLitro[maisEconomico]){
                maisEconomico = i;
            }

        }

        System.out.println("O carro mais econômico é o " + carros[maisEconomico] + " com rendimento de " + kmPorLitro[maisEconomico] + " km/l.");

    }

}
