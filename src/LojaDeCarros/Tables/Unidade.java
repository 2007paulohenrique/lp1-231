package LojaDeCarros.Tables;

import java.util.List;

public class Unidade {
    private int id;
    private Versao versao;
    private Direcao direcao;
    private Cor cor;
    private List<Compra> compras;
    private List<Venda> vendas;

    public Unidade(int id, Versao versao, Direcao direcao, Cor cor) {
        this.id = id;
        this.versao = versao;
        this.direcao = direcao;
        this.cor = cor;
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
    
}
