package LojaDeCarros.Tables;

public class Direcao {
    private int id;
    private String tipo;
    
    public Direcao(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
