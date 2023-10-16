package LojaDeCarros.Tables;

import java.util.List;

public class CategoriaCor {
    private int id;
    private String nome;
    private List<Cor> cores;

    public CategoriaCor(int id, String nome) {
        Verificacoes.verificarParametroNull(id, nome);
        this.id = id;
        setNome(nome);
    }

    public CategoriaCor(String nome) {
        Verificacoes.verificarParametroNull(nome);
        setNome(nome);
    }

    public void addCor(Cor cor){
        cores.add(cor);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.matches("[\\p{L}]+") || nome.length() > 30 || nome.length() < 3) {
            throw new RuntimeException("Uma categoria de cores deve possuir apenas letras, sem espaços e deve ter entre 3 e 30 de tamanho.");
        }

        this.nome = nome;
    }
}
