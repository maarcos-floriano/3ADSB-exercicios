import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] diasDaSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado"};

        char resposta = 'S';

        while (resposta == 'S'){
            System.out.println("Que dia deseja ver:");
            int diaParaExibir = scanner.nextInt();

            if (diaParaExibir < 1 || diaParaExibir > 7){
                resposta = 'N';
            }

            System.out.println("O dia correspondente ao numero é: %s".formatted(diasDaSemana[diaParaExibir + 1]));
        }

    }

}
