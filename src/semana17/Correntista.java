package semana17;

import java.util.List;

public class Correntista {
    private int codigo;
    private String nome;
    private List<Conta> contas;

    public Correntista(int codigo, String nome){
        this.codigo=codigo;
        this.nome=nome;
    }

    // metodo add - adiciona um objeto a uma lista - objeto como parametro

    public void addConta(Conta conta){
        // adiciona o objeto passado como parametro a lista

        this.contas.add(conta);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
