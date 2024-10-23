import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaObj<Jogador> listaJogadores = new ListaObj<>(5);
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha a opção desejada: (digite 1, 2 ou 3)");
            System.out.println("1 - Adicionar um Jogador");
            System.out.println("2 - Exibir Relatório");
            System.out.println("3 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    if (listaJogadores.getTamanho() < 5) {
                        System.out.print("Digite o ID do jogador: ");
                        int id = sc.nextInt();
                        sc.nextLine();  // Limpa o buffer
                        System.out.print("Digite o nome do jogador: ");
                        String nome = sc.nextLine();
                        System.out.print("Digite a posição do jogador: ");
                        String posicao = sc.nextLine();
                        System.out.print("Digite o número da camisa: ");
                        int numeroCamisa = sc.nextInt();
                        System.out.print("Digite o salário do jogador: ");
                        double salario = sc.nextDouble();
                        System.out.print("Digite o número de gols marcados: ");
                        int golsMarcados = sc.nextInt();
                        System.out.print("Digite o número de partidas jogadas: ");
                        int partidasJogadas = sc.nextInt();

                        Jogador jogador = new Jogador(id, numeroCamisa, nome, posicao, salario, golsMarcados, partidasJogadas);
                        listaJogadores.adiciona(jogador);
                        System.out.println("Jogador adicionado!");
                    } else {
                        System.out.println("Lista de jogadores está cheia!");
                    }
                    break;

                case 2:
                    if (listaJogadores.getTamanho() > 0) {
                        System.out.printf("%-5s %-20s %-10s %-6s %-10s %-10s %-10s\n", "ID", "Nome", "Posição", "Camisa", "Salário", "Gols", "Partidas");
                        for (int i = 0; i < listaJogadores.getTamanho(); i++) {
                            System.out.println(listaJogadores.getElemento(i));
                        }
                    } else {
                        System.out.println("Nenhum jogador cadastrado.");
                    }
                    break;

                case 3:
                    System.out.println("Obrigado por utilizar!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);

        sc.close();
    }
}
