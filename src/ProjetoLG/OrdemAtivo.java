package ProjetoLG;

public abstract class OrdemAtivo {
    private Investidor investidor;
    private Corretora corretora;
    private Ativo ativo;
    private int quantidade;
    private double preco;

    public OrdemAtivo(Investidor investidor, Corretora corretora, Ativo ativo, int quantidade, double preco) {
        this.investidor = investidor;
        this.corretora = corretora;
        this.ativo = ativo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

}
