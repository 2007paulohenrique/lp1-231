package semana20;

public class UnicaEscolha extends Questao {
    private Alternativa alternativaCerta;
    
    public UnicaEscolha(int numero, String enunciado, Prova prova, double pontos) {
        super(numero, enunciado, prova, pontos);
    }

    public void selecionarAlternativaCorreta(Alternativa alternativa) {
        alternativaCerta=alternativa;
        
    }

    public Alternativa getAlternativaCerta() {
        return alternativaCerta;
    }
}
