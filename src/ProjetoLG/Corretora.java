package ProjetoLG;

import java.util.List;

public class Corretora {
    private String nome;
    private List<Investidor> clientes;
    private List<Empresa> empresas;
    private List<Bolsa> bolsas;
    private List<OrdemCompra> ordens_de_compras_pendentes;
    private List<OrdemVenda> ordens_de_vendas_pendentes;

    public Corretora(String nome) {
        this.nome = nome;
    }

    public void enviarOrdemCompra(OrdemCompra ordem, Bolsa bolsa) {
        ordens_de_compras_pendentes.add(ordem);
        bolsas.add(bolsa);
        bolsa.addOrdensCompraa(ordem);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void enviarOrdemVenda(OrdemVenda ordem, Bolsa bolsa) {
        ordens_de_vendas_pendentes.add(ordem);
        bolsas.add(bolsa);
        bolsa.addOrdensVenda(ordem);
    }

    public void addEmpresa(Empresa empresa){
        empresas.add(empresa);
        empresa.addCorretora(this);
    }

    public void addCliente(Investidor investidor){
        clientes.add(investidor);
        investidor.addCorretora(this);
    }

    public void addBolsa(Bolsa bolsa){
        bolsas.add(bolsa);
        bolsa.addCorretora(this);
    }
}
