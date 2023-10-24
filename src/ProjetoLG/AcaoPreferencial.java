package ProjetoLG;

public class AcaoPreferencial extends Ativo {
    private double dividendoFixo;

    public AcaoPreferencial(String nome, double precoAtual, double dividendoFixo) {
        super(nome, precoAtual);
        setDividendoFixo(dividendoFixo);
    }

    public double getDividendoFixo() {
        return dividendoFixo;
    }

    public void setDividendoFixo(double dividendoFixo) {
        if (dividendoFixo <= 0) {
            throw new RuntimeException("apenas valores positivos");
        }
        this.dividendoFixo = dividendoFixo;
    }
}
