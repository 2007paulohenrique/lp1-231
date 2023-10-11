package LojaDeCarros.Tables;

import java.util.List;

public class CategoriaModelo {
    private int id;
    private int nome;

    public CategoriaModelo(int id, int nome) {
        this.id = id;
        this.nome = nome;
    }

    public CategoriaModelo(int nome) {
        this.nome = nome;
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
}
