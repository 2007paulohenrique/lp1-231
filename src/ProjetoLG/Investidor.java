package ProjetoLG;

import java.util.List;

public class Investidor {
    private String nome;
    private String cpf;
    private List<Corretora> corretoras;
    private Carteira carteira;
    private List<Bolsa> bolsas;
    private List<Custodiante> custodiantes;
    private List<OrdemCompra> ordens_compras;
    private List<OrdemVenda> ordens_vendas;

    public Investidor(String nome, String cpf, Carteira carteira) {
        this.nome = nome;
        this.cpf = cpf;
        this.carteira = carteira;
    }

    public void addCorretora(Corretora corretora) {
        corretoras.add(corretora);
    }

    public void addCustodiante(Custodiante custodiante) {
        custodiantes.add(custodiante);
    }

    public void comprarAtivo(Ativo ativo, Corretora corretora, Custodiante custodiante){
        corretoras.add(corretora);
        carteira.adicionarAtivo(ativo);
        addCustodiante(custodiante);
        addCorretora(corretora);
        custodiante.adicionarAtivo(ativo); 
        custodiante.addCliente(this);
    }

    public void enviarOrdemDeCompra(OrdemCompra ordem, Corretora corretora, Bolsa bolsa) {
        ordens_compras.add(ordem);
        bolsas.add(bolsa);
        bolsa.addOrdensCompraa(ordem);
        corretora.enviarOrdemCompra(ordem, bolsa);
    }

    public void enviarOrdemDeVenda(OrdemVenda ordem, Corretora corretora, Bolsa bolsa) {
        ordens_vendas.add(ordem);
        bolsas.add(bolsa);
        bolsa.addOrdensVenda(ordem);
        corretora.enviarOrdemVenda(ordem, bolsa);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void addBolsa(Bolsa bolsa){
        bolsas.add(bolsa);
    }

}
