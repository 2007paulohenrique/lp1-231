package ProjetoLG;

import java.util.List;

public abstract class Ativo {
    private String codigo;
    private String nome;
    private double precoAtual;
    private Empresa empresa;
    private List<Bolsa> bolsas;

    public Ativo(String codigo, String nome, double precoAtual, Empresa empresa) {
        this.codigo = codigo;
        this.nome = nome;
        setPrecoAtual(precoAtual);
        empresa.addAtivo(this);
    }

    public void addBolsa(Bolsa bolsa){
        bolsas.add(bolsa);
        
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoAtual() {
        return precoAtual;
    }

    public void setPrecoAtual(double precoAtual) {
        if (precoAtual <= 0) {
            throw new RuntimeException("apenas valores positivos");
        }
        this.precoAtual = precoAtual;
    }
}
