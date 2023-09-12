package LojaDeCarros.Tables;

import java.util.Date;

public class Versao {
    private int id;
    private int nome;
    private Date lancamento;
    private Modelo modelo;
  
    public Versao(int id, int nome, Date lancamento, Modelo modelo) {
        this.id = id;
        this.nome = nome;
        this.lancamento = lancamento;
        this.modelo = modelo;
        modelo.addVersao(this);
    }

    public int getId() {
        return id;
    }

    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public Date getLancamento() {
        return lancamento;
    }
}
