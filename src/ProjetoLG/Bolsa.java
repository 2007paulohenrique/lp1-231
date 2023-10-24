package ProjetoLG;

import java.util.List;

public class Bolsa {
    private String cnpj;
    private String nome;
    private List<OrdemVenda> ordensVenda_em_andamento;
    private List<OrdemCompra> ordensCompra_em_andamento;

    public Bolsa(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }

    public void addOrdensVenda(OrdemVenda ordem){
        ordensVenda_em_andamento.add(ordem);
    }

    public void addOrdensCompra(OrdemCompra ordem){
        ordensCompra_em_andamento.add(ordem);
    }

    public void removeOrdemCompra(OrdemCompra ordem){
        ordensCompra_em_andamento.remove(ordem);
    }

    public void removeOrdemVenda(OrdemVenda ordem){
        ordensVenda_em_andamento.remove(ordem);
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }
}
