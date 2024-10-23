public class Main {

    public static void main(String[] args) {
        // Exemplos de execução para cada função
        System.out.println("Soma de 0 a 5: " + somaIterativa(5));
        System.out.println("Soma recursiva de 0 a 5: " + somaRecursiva(5));

        int[] vetor = {7, 0, 3, 5, 1, 2, 2, 3};
        System.out.println("Soma do vetor: " + somaVetorIterativa(vetor));
        System.out.println("Soma recursiva do vetor: " + somaVetorRecursiva(vetor, vetor.length));

        System.out.println("Soma dos pares do vetor: " + somaParesIterativa(vetor));
        System.out.println("Soma recursiva dos pares do vetor: " + somaParesRecursiva(vetor, vetor.length));

        System.out.println("Quantidade de ímpares no vetor: " + contaImparesIterativa(vetor));
        System.out.println("Quantidade recursiva de ímpares no vetor: " + contaImparesRecursiva(vetor, vetor.length));

        int x = 3;
        System.out.println("Ocorrências de " + x + " no vetor: " + contaOcorrenciasIterativa(vetor, x));
        System.out.println("Ocorrências recursivas de " + x + " no vetor: " + contaOcorrenciasRecursiva(vetor, vetor.length, x));

        System.out.println("MDC entre 90 e 54 (Iterativa): " + mdcIterativa(90, 54));
        System.out.println("MDC entre 90 e 54 (Recursiva): " + mdcRecursiva(90, 54));

        System.out.println("Maior elemento no vetor (Iterativa): " + maiorElementoIterativa(vetor));
        System.out.println("Maior elemento no vetor (Recursiva): " + maiorElementoRecursiva(vetor, vetor.length));

        int numero = 132;
        System.out.println("Soma dos dígitos de " + numero + " (Iterativa): " + somaDigitosIterativa(numero));
        System.out.println("Soma dos dígitos de " + numero + " (Recursiva): " + somaDigitosRecursiva(numero));

        numero = 12;
        System.out.println("Representação binária de " + numero + " (Iterativa): " + binarioIterativa(numero));
        System.out.println("Representação binária de " + numero + " (Recursiva): " + binarioRecursiva(numero));
    }

    // 1. Soma de 0 a n
    public static int somaIterativa(int n) {
        int soma = 0;
        for (int i = 0; i <= n; i++) {
            soma += i;
        }
        return soma;
    }

    public static int somaRecursiva(int n) {
        if (n == 0) return 0;
        return n + somaRecursiva(n - 1);
    }

    // 2. Soma dos elementos de um vetor
    public static int somaVetorIterativa(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }

    public static int somaVetorRecursiva(int[] vetor, int n) {
        if (n == 0) return 0;
        return vetor[n - 1] + somaVetorRecursiva(vetor, n - 1);
    }

    // 3. Soma dos elementos pares de um vetor
    public static int somaParesIterativa(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
            }
        }
        return soma;
    }

    public static int somaParesRecursiva(int[] vetor, int n) {
        if (n == 0) return 0;
        int valor = (vetor[n - 1] % 2 == 0) ? vetor[n - 1] : 0;
        return valor + somaParesRecursiva(vetor, n - 1);
    }

    // 4. Quantidade de ímpares em um vetor
    public static int contaImparesIterativa(int[] vetor) {
        int count = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static int contaImparesRecursiva(int[] vetor, int n) {
        if (n == 0) return 0;
        int valor = (vetor[n - 1] % 2 != 0) ? 1 : 0;
        return valor + contaImparesRecursiva(vetor, n - 1);
    }

    // 5. Contar ocorrências de x em um vetor
    public static int contaOcorrenciasIterativa(int[] vetor, int x) {
        int count = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                count++;
            }
        }
        return count;
    }

    public static int contaOcorrenciasRecursiva(int[] vetor, int n, int x) {
        if (n == 0) return 0;
        int valor = (vetor[n - 1] == x) ? 1 : 0;
        return valor + contaOcorrenciasRecursiva(vetor, n - 1, x);
    }

    // 6. Algoritmo de Euclides para o MDC
    public static int mdcIterativa(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int mdcRecursiva(int a, int b) {
        if (b == 0) return a;
        return mdcRecursiva(b, a % b);
    }

    // 7. Maior elemento de um vetor
    public static int maiorElementoIterativa(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static int maiorElementoRecursiva(int[] vetor, int n) {
        if (n == 1) return vetor[0];
        return Math.max(vetor[n - 1], maiorElementoRecursiva(vetor, n - 1));
    }

    // 8. Soma dos dígitos de um número
    public static int somaDigitosIterativa(int numero) {
        int soma = 0;
        while (numero != 0) {
            soma += numero % 10;
            numero /= 10;
        }
        return soma;
    }

    public static int somaDigitosRecursiva(int numero) {
        if (numero == 0) return 0;
        return (numero % 10) + somaDigitosRecursiva(numero / 10);
    }

    // 9. Representação binária de um número
    public static String binarioIterativa(int numero) {
        StringBuilder binario = new StringBuilder();
        while (numero > 0) {
            binario.insert(0, numero % 2);
            numero /= 2;
        }
        return binario.toString();
    }

    public static String binarioRecursiva(int numero) {
        if (numero == 0) return "";
        return binarioRecursiva(numero / 2) + (numero % 2);
    }
}
