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

    public void addConta(Conta conta){
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
