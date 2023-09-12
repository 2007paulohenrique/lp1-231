package LojaDeCarros.Tables;

import java.util.List;

public class Cliente extends Pessoa{
    private String endereco;
    private String complemento;
    private List<Venda> compras;
    private List<Compra> vendas;
    
    public Cliente(int id, String nome, String email, int contato, int cpf, String endereco) {
        super(id, nome, email, contato, cpf);
        this.endereco = endereco;
    }

    public void addVenda(Compra compra){
        vendas.add(compra);
    }
    
    public void addCompra(Venda venda){
        compras.add(venda);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return complemento;
    }
}
