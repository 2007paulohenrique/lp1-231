package LojaDeCarros.Tables;

public class Escala {
    private int id;
    private byte dias_trabalho;
    private byte dias_folga;
    private String tipo = dias_trabalho + "x" + dias_folga;

    public Escala(int id, byte dias_trabalho, byte dias_folga) {
        setDias_trabalho(dias_trabalho);
        setDias_folga(dias_folga);
        this.id = id;
    }

    public Escala(byte dias_trabalho, byte dias_folga) {
        setDias_trabalho(dias_trabalho);
        setDias_folga(dias_folga);
    }

    public int getId() {
        return id;
    }

    public byte getDias_trabalho() {
        return dias_trabalho;
    }

    public byte getDias_folga() {
        return dias_folga;
    }

    public String getTipo() {
        return tipo;
    }

    private void setDias_trabalho(byte dias_trabalho) {
        if (dias_trabalho < 1 || dias_trabalho > 6) {
            throw new RuntimeException("Um funcionário pode trabalhar no máximo 6 dias seguidos");
        }
        this.dias_trabalho = dias_trabalho;
    }

    private void setDias_folga(byte dias_folga) {
        if (dias_folga < 1 || dias_folga > 3) {
            throw new RuntimeException("Um funcionario pode folgar no mínimo 1 e no máximo 3 dias seguidos.");
        }
        this.dias_folga = dias_folga;
    }
}
