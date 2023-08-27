package semana20;

import java.util.List;

public class VerdadeiroFalso extends Questao {
    private List<Alternativa> alternativasVerdadeiras;
    
    public VerdadeiroFalso(int numero, String enunciado, Prova prova, double pontos) {
        super(numero, enunciado, prova, pontos);
    }
     
    public void selecionarAlternativasVerdadeiras(Alternativa alternativa){
        alternativasVerdadeiras.add(alternativa);
    }
}
