package semana20;

import java.util.List;

public class Prova {
    protected List<Questao> questoes;
    protected int pontuacao;
    protected int valorMaximo;

    public Prova(int valorMaximo){
        setValorMaximo(valorMaximo);
    }

    public void addQuestao(Questao questao){
        this.questoes.add(questao);
    }

    public double calcularPontuacao() {
        for (Questao questao : questoes) {
            if (questao.correcao = true) {
                pontuacao+=questao.pontos;
            }
        }
        return pontuacao;
    }    

    public double calcularMaximoDaPontuacao() {
        for (Questao questao : questoes) {
                pontuacao+=questao.pontos;
        }
        return pontuacao;
    }    

    public int getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(int valorMaximo) {
        if (valorMaximo < 1 && calcularMaximoDaPontuacao() > valorMaximo) {
            throw new RuntimeException("coloque somente valores positivos e que sejam maiores do que a soma da pontuacao das questoes");
        }
    }

}
