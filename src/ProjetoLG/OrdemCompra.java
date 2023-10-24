package ProjetoLG;

public class OrdemCompra extends OrdemAtivo {

    public OrdemCompra(Investidor investidor, Ativo ativo, int quantidade) {
        super(investidor, ativo, quantidade);
        investidor.addOrdenCompra(this);
    }
}
