package ProjetoLG;

public class AcaoPreferencial extends Ativo {
    private double dividendoFixo;

    public AcaoPreferencial(String codigo, String nome, double precoAtual, double dividendoFixo, Empresa empresa) {
        super(codigo, nome, precoAtual, empresa);
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
