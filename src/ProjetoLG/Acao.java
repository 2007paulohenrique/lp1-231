package ProjetoLG;

public abstract class Acao extends Ativo {

    public Acao(String codigo, String nome, double precoAtual, Empresa empresa) {
        super(codigo, nome, precoAtual, empresa);
    }
}
