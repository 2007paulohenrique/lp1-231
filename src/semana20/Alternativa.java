package semana20;

public class Alternativa {
    private int numero;
    private String afirmacao;
    private Questao questao;

    public Alternativa(int numero, String afirmacao, Questao questao){
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

    public String getAfirmacao() {
        return afirmacao;
    }

    public void setAfirmacao(String afirmacao) {
        this.afirmacao = afirmacao;
    }
}
