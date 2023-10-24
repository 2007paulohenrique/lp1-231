package ProjetoLG;

public class FII extends Ativo {
    private double rendimentoMensal;

    public FII(String nome, double precoAtual, double rendimentoMensal) {
        super(nome, precoAtual);
        setRendimentoMensal(rendimentoMensal);
    }

    public double getRendimentoMensal() {
        return rendimentoMensal;
    }

    public void setRendimentoMensal(double rendimentoMensal) {
        if (rendimentoMensal <= 0) {
            throw new RuntimeException("apenas valores positivos");
        }
        this.rendimentoMensal = rendimentoMensal;
    }
}
