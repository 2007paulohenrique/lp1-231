package ProjetoLG;

public abstract class Ativo {
    private String nome;
    private double precoAtual;

    public Ativo(String nome, double precoAtual) {
        this.nome = nome;
        setPrecoAtual(precoAtual);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoAtual() {
        return precoAtual;
    }

    public void setPrecoAtual(double precoAtual) {
        if (precoAtual <= 0) {
            throw new RuntimeException("apenas valores positivos");
        }
        this.precoAtual = precoAtual;
    }
}
