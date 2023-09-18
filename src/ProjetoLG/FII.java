package ProjetoLG;

public class FII extends Ativo {
    private double rendimentoMensal;

    public FII(String codigo, String nome, double precoAtual, double rendimentoMensal, Empresa empresa) {
        super(codigo, nome, precoAtual, empresa);
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
