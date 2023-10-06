package LojaDeCarros.Tables;

import java.util.Date;
import java.util.List;

public class Versao {
    private int id;
    private int nome;
    private Date lancamento;
    private Modelo modelo;
    private List<Unidade> unidades;
  
    public Versao(int id, int nome, Date lancamento, Modelo modelo) {
        this.id = id;
        this.nome = nome;
        this.lancamento = lancamento;
        this.modelo = modelo;
        modelo.addVersao(this);
    }

    public Versao(int nome, Date lancamento, Modelo modelo) {
        this.nome = nome;
        this.lancamento = lancamento;
        this.modelo = modelo;
        modelo.addVersao(this);
    }

    public void addUnidade(Unidade unidade){
        unidades.add(unidade);
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
