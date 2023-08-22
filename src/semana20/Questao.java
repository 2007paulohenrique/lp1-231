package semana20;

import java.util.List;

public abstract class Questao {
    protected int numero;
    protected String enunciado;
    protected double pontos;
    protected boolean correcao;
    protected Prova prova;
    protected List<Alternativa> alternativas; 
    protected int numeroAlternativas = alternativas.size();

    public Questao(int numero, String enunciado, Prova prova, double pontos){
        setNumero(numero);
        setEnunciado(enunciado);
        prova.addQuestao(this);
    }

    public void addAlternativa(Alternativa alternativa){
        this.alternativas.add(alternativa);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero < 1) {
            throw new RuntimeException("somente numeros positivos");
        }
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }


}
