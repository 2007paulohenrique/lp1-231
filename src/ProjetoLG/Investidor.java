package ProjetoLG;

import java.util.List;

public class Investidor {
    private String nome;
    private String cpf;
    private List<Corretora> corretoras;
    private Carteira carteira;
    private Custodiante custodiante;
    private List<OrdemCompra> ordens_compras;
    private List<OrdemVenda> ordens_vendas;

    public Investidor (String nome, String cpf, Carteira carteira, Custodiante custodiante, Corretora corretora){
        this.nome = nome;
        this.cpf = cpf;
        this.custodiante = custodiante;
        corretoras.add(corretora);
    }

    public void addCorretora(Corretora corretora) {
        corretoras.add(corretora);
    }

    public void enviarOrdemACorretora(Ativo ativo, int quantidade, Corretora corretora, String tipoOrdem){
        if (tipoOrdem == "compra") {
            OrdemCompra ordemCompra = new OrdemCompra(this, ativo, quantidade);
            corretora.addOrdensCompra(ordemCompra);
        } else if (tipoOrdem == "venda") {
            OrdemVenda ordemVenda = new OrdemVenda(this, ativo, quantidade);
            corretora.addOrdensVenda(ordemVenda);
        } else {
            throw new RuntimeException("O tipo da ordem deve ser \"compra\" ou \"venda\"");
        }
    }

    public double comprarAtivo(OrdemVenda vendaAtivo, Bolsa bolsa){
        bolsa.removeOrdemVenda(vendaAtivo);
        carteira.adicionarAtivo(vendaAtivo.getAtivo());
        return vendaAtivo.getValorTotal();
    }

    public void addOrdenCompra(OrdemCompra ordem){
        ordens_compras.add(ordem);
    }

    public void addOrdenVenda(OrdemVenda ordem){
        ordens_vendas.add(ordem);
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

}
