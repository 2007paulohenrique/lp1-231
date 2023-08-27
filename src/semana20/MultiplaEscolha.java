package semana20;

import java.util.List;

public class MultiplaEscolha extends Questao{
    private List<Alternativa> alternativasCertas;

    public MultiplaEscolha(int numero, String enunciado, Prova prova, double pontos) {
        super(numero, enunciado, prova, pontos);
    }

    public void selecionarAlternativasCorretas(Alternativa alternativa){
        alternativasCertas.add(alternativa);
    }
    
}
