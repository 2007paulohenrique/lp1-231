package ProjetoLG;

public abstract class OrdemAtivo {
    private Investidor investidor;
    private Ativo ativo;
    private int quantidade;
    private double valorTotal;

    public OrdemAtivo(Investidor investidor, Ativo ativo, int quantidade) {
        this.investidor = investidor;
        this.ativo = ativo;
        this.quantidade = quantidade;
        valorTotal = ativo.getPrecoAtual()*quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Ativo getAtivo() {
        return ativo;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
