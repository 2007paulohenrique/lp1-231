package semana20;

import java.util.List;

public class Prova {
    private List<Questao> questoes;
    private double pontuacao;
    private double pontuacaoMaxima;

    public void addQuestao(Questao questao){
        questoes.add(questao);
    }

    public double calcularPontuacao() {
        pontuacao=0;
        for (Questao questao : questoes) {
            if (questao.correcao = true) {
                pontuacao+=questao.pontos;
            }
        }
        return pontuacao;
    }    

    public double calcularPontuacaoMaxima() {
        pontuacaoMaxima=0;
        for (Questao questao : questoes) {
                pontuacaoMaxima+=questao.pontos;
        }
        return pontuacaoMaxima;
    }    
}
