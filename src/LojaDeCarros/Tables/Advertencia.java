package LojaDeCarros.Tables;

public class Advertencia {
    private int id;
    private byte gravidade;
    private Funcionario funcionario;
    private String motivo;

    public Advertencia(int id, byte gravidade, Funcionario funcionario, String motivo) {
        this.id = id;
        setGravidade(gravidade);
        this.funcionario = funcionario;
        this.motivo = motivo;
        funcionario.addAdvertencia(this);
    }

    public Advertencia(byte gravidade, Funcionario funcionario, String motivo) {
        setGravidade(gravidade);
        this.funcionario = funcionario;
        this.motivo = motivo;
        funcionario.addAdvertencia(this);
    }

    public int getId() {
        return id;
    }

    public byte getGravidade() {
        return gravidade;
    }

    public String getMotivo() {
        return motivo;
    }

    private void setGravidade(byte gravidade){
        if (gravidade < 1 || gravidade > 5) {
            throw new RuntimeException("A gravidade de uma adverência vai de 1 a 5.");
        }
        this.gravidade = gravidade;
    }
}
