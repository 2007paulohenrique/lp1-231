package semana20;

public class Alternativa {
    private int numero;
    private int afirmacao;
    private Questao questao;

    public Alternativa(int numero, int afirmacao, Questao questao){
        setNumero(numero);
        this.afirmacao=afirmacao;
        questao.addAlternativa(this);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero < 1) {
            throw new RuntimeException("somente numeros positivos");
        }
        this.numero = numero;
    }

    public int getAfirmacao() {
        return afirmacao;
    }

    public void setAfirmacao(int afirmacao) {
        this.afirmacao = afirmacao;
    }
}
