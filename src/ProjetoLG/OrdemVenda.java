package ProjetoLG;

public class OrdemVenda extends OrdemAtivo{
    public OrdemVenda(Investidor investidor, Corretora corretora, Ativo ativo, int quantidade, double preco) {
        super(investidor, corretora, ativo, quantidade, preco);
    }
}
