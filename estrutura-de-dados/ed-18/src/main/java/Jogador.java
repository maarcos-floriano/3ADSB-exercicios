public class Jogador {
    private int id;
    private int numeroCamisa;
    private String nome;
    private String posicao;
    private double salario;
    private int golsMarcados;
    private int partidasJogadas;

    public Jogador(int id, int numeroCamisa, String nome, String posicao, double salario, int golsMarcados, int partidasJogadas) {
        this.id = id;
        this.numeroCamisa = numeroCamisa;
        this.nome = nome;
        this.posicao = posicao;
        this.salario = salario;
        this.golsMarcados = golsMarcados;
        this.partidasJogadas = partidasJogadas;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    public int getPartidasJogadas() {
        return partidasJogadas;
    }

    public void setPartidasJogadas(int partidasJogadas) {
        this.partidasJogadas = partidasJogadas;
    }

    @Override
    public String toString() {
        return String.format("%-5d %-20s %-10s %-6d %10.2f %10d %10d", id, nome, posicao, numeroCamisa, salario, golsMarcados, partidasJogadas);
    }
}
