package ex04;

public class Numero {

    private Integer valor;
    private Integer apareceu;

    public Numero() {
    }

    public Numero(Integer valor, Integer apareceu) {
        this.valor = valor;
        this.apareceu = apareceu;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Integer getApareceu() {
        return apareceu;
    }

    public void setApareceu(Integer apareceu) {
        this.apareceu = apareceu;
    }
}
