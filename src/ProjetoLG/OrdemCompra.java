package ProjetoLG;

public class OrdemCompra extends OrdemAtivo {

    public OrdemCompra(Investidor investidor, Corretora corretora, Ativo ativo, int quantidade, double preco) {
        super(investidor, corretora, ativo, quantidade, preco);
    }
}
