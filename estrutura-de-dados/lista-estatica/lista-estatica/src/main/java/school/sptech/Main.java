package school.sptech;

public class Main {
    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica(3);

        lista.adiciona(10);
        lista.adiciona(20);
        lista.adiciona(30);

        System.out.println("lista:");
        lista.exibe();

        int indice = lista.busca(20);
        System.out.println("\nindice do elemento 20: " + indice);

        lista.removePeloIndice(1);
        System.out.println("\nlista após remover o elemento no índice 1:");
        lista.exibe();
    }
}
