package LojaDeCarros.Tables;

import java.util.List;

public class Unidade {
    private int id;
    private int ano;
    private String placa;
    private int quilometragem;
    private double valor_unitario;
    private boolean disponibilidade;
    private Versao versao;
    private Direcao direcao;
    private Cor cor;
    private List<Compra> compras;
    private List<Venda> vendas;

    public Unidade(int id, int ano, String placa, int quilometragem, double valor_unitario, Versao versao, Direcao direcao, Cor cor) {
        this.id = id;
        this.ano = ano;
        this.placa = placa;
        this.quilometragem = quilometragem;
        this.valor_unitario = valor_unitario;
        this.versao = versao;
        this.direcao = direcao;
        this.cor = cor;
        disponibilidade = true;
    }

    public Unidade(int ano, String placa, int quilometragem, double valor_unitario, Versao versao, Direcao direcao, Cor cor) {
        this.ano = ano;
        this.placa = placa;
        this.quilometragem = quilometragem;
        this.valor_unitario = valor_unitario;
        this.versao = versao;
        this.direcao = direcao;
        this.cor = cor;
        disponibilidade = true;
    }

    public void addVenda(Venda venda){
        vendas.add(venda);
    }

    public void addCompra(Compra compra){
        compras.add(compra);
    }

    public int getId() {
        return id;
    }

    public int getAno() {
        return ano;
    }

    public String getPlaca() {
        return placa;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public double getValor_unitario() {
        return valor_unitario;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public void setValor_unitario(double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
}
