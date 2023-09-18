package ProjetoLG;

import java.util.List;

public class Bolsa {
    private String codigo;
    private String cnpj;
    private String nome;
    private List<Investidor> clientes;
    private List<Empresa> empresas;
    private List<Corretora> corretoras;
    private List<OrdemVenda> ordensVendas_em_andamento;
    private List<OrdemCompra> ordensCompra_em_andamento;
    private List<Ativo> ativosListados;

    public Bolsa(String codigo, String cnpj, String nome) {
        this.codigo = codigo;
        this.cnpj = cnpj;
        this.nome = nome;
    }
    public void addAtivosParaVenda(Ativo ativo){
        ativosListados.add(ativo);
    }

    public void removeAtivoParaVenda(Ativo ativo) {
        ativosListados.remove(ativo);
    }

    public void addCliente(Investidor investidor){
        clientes.add(investidor);
        investidor.addBolsa(this);
    }

    public void addEmpresa(Empresa empresa){
        empresas.add(empresa);
    }

    public void addCorretora(Corretora corretora){
        corretoras.add(corretora);
        corretora.addBolsa(this);
    }

    public void addOrdensVenda(OrdemVenda ordem){
        ordensVendas_em_andamento.add(ordem);
    }

    public void addOrdensCompraa(OrdemCompra ordem){
        ordensCompra_em_andamento.add(ordem);
    }
}
