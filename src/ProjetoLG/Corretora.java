package ProjetoLG;

import java.util.List;

public class Corretora {
    private String nome;
    private List<Investidor> clientes;
    private List<OrdemCompra> ordens_de_compras_pendentes;
    private List<OrdemVenda> ordens_de_vendas_pendentes;

    public Corretora(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void enviarOrdemVenda(OrdemVenda ordem, Bolsa bolsa) {
        bolsa.addOrdensVenda(ordem);
    }

    public void enviarOrdemCompra(OrdemCompra ordem, Bolsa bolsa) {
        bolsa.addOrdensCompra(ordem);
    }

    public void addCliente(Investidor investidor){
        clientes.add(investidor);
        investidor.addCorretora(this);
    }

    public void addOrdensCompra(OrdemCompra ordemCompra){
        ordens_de_compras_pendentes.add(ordemCompra);
    }

    public void addOrdensVenda(OrdemVenda ordemVenda){
        ordens_de_vendas_pendentes.add(ordemVenda);
    }
}
