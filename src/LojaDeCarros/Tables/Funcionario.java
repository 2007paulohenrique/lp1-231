package LojaDeCarros.Tables;

import java.util.List;

public class Funcionario extends Pessoa{
    private String endereco;
    private String complemento;
    private String periodo_trabalho;
    private double salario_fixo;
    private int comissao; 
    private Cargo cargo;
    private List<Compra> compras;
    private List<Venda> vendas;

    public Funcionario(int id, String nome, String email, int contato, int cpf, String endereco, double salario_fixo, Cargo cargo) {
        super(id, nome, email, contato, cpf);
        this.endereco = endereco;
        this.salario_fixo = salario_fixo;
        this.cargo = cargo;
        cargo.addFuncionario(this);
    }

    public void addCompra(Compra compra){
        compras.add(compra);
    }

    public void addVenda(Venda venda){
        vendas.add(venda);
    }

    public String getPeriodo_trabalho() {
        return periodo_trabalho;
    }

    public void setPeriodo_trabalho(String periodo_trabalho) {
        this.periodo_trabalho = periodo_trabalho;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public double getSalario_fixo() {
        return salario_fixo;
    }

    public int getComissao() {
        return comissao;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setSalario_fixo(double salario_fixo) {
        this.salario_fixo = salario_fixo;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
