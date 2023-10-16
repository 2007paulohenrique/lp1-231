package LojaDeCarros.Tables;

import java.util.List;

public class Marca {
    private int id;
    private String nome;
    private List<Modelo> modelos;

    public Marca(int id, String nome, boolean sigla) {
        Verificacoes.verificarParametroNull(id, nome);
        this.id = id;
        setNome(nome, sigla);
    }

    public Marca(String nome, boolean sigla) {
        Verificacoes.verificarParametroNull(nome);
        setNome(nome, sigla);
    }

    public void addModelo(Modelo modelo){
        modelos.add(modelo);
    }

    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome, boolean sigla) {
        if (nome.length() > 50 || nome.length() < 2 || nome.matches("^[a-zA-Z]+$")) {
            throw new RuntimeException("O nome da marca deve ter somente uma palavra com no mínimo duas letras e que não exceda 50 letras.");
        }
        
        if (sigla == true) {
            nome = nome.toUpperCase();

        } else {
            nome = nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();

        }
        
        this.nome = nome;
    }

}
