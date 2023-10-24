package ProjetoLG;

public class OrdemVenda extends OrdemAtivo{
    public OrdemVenda(Investidor investidor, Ativo ativo, int quantidade) {
        super(investidor, ativo, quantidade);
        investidor.addOrdenVenda(this);
    }
}
