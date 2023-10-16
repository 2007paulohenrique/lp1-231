package LojaDeCarros.Tables;

public class CategoriaModelo {
    private int id;
    private String nome;

    public CategoriaModelo(int id, String nome, boolean sigla) {
        Verificacoes.verificarParametroNull(id, nome);
        this.id = id;
        setNome(nome, sigla);
    }

    public CategoriaModelo(String nome, boolean sigla) {
        Verificacoes.verificarParametroNull(nome);
        setNome(nome, sigla);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome, boolean sigla) {
        if (nome.length() > 20 || nome.length() < 2 || !nome.matches("[\\p{L}]+")) {
            throw new RuntimeException("Uma categoria de carros deve ter somente uma palavra com um tamanho entre 2 e 20.");
        }
        
        if (sigla == true) {
            nome = nome.toUpperCase();
            
        } else {
            nome = nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();

        }
        
        this.nome = nome;
    }
}
