package ex06;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("Digite o dia (1 a 31): ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês (1 a 12): ");
        int mes = scanner.nextInt();

        int diaDoAno = dia;
        for (int i = 0; i < mes - 1; i++) {

            diaDoAno += diasPorMes[i];

        }

        System.out.println("O dia " + dia + "/" + mes + " corresponde ao dia " + diaDoAno + " do ano.");

    }

}
