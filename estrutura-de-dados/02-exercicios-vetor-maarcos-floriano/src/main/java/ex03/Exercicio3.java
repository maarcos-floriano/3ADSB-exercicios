package ex03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] listaNomes = new String[10];

        for (int i = 0; i < 10; i++){

            System.out.println("Digite um nome: ");
            listaNomes[i] = scanner.next();

        }
        System.out.println("Lista preenchida...");

        while (true){
            System.out.println("Digite um nome para pesquisar: ");
            String nome = scanner.next();

            for (int i = 0; i < 10; i++){
                if (nome.equalsIgnoreCase(listaNomes[i])){
                    System.out.println("Nome encontrado na posição %d".formatted(i));
                }else {
                    System.out.println("Nome não encontrado, tente mais uma vez...");
                }
                break;
            }
            break;
        }

    }

}
