package ProjetoLG;

import java.util.List;

public class Empresa {
    private String nome;
    private String codigo;
    private String cnpj;
    private List<Ativo> ativosParaVenda;
    private List<Corretora> corretoras;
    private List<Bolsa> bolsas;

    public Empresa(String nome, String codigo, String cnpj) {
        this.nome = nome;
        this.codigo = codigo;
        this.cnpj = cnpj;
    }

    public void addAtivo(Ativo ativo){
        ativosParaVenda.add(ativo);
    }

    public void addAtivoParaVendaNaBolsa(Ativo ativo, Bolsa bolsa){
        addAtivo(ativo);
        addBolsa(bolsa);
        bolsa.addAtivosParaVenda(ativo);
        bolsa.addEmpresa(this);
    }

    public void addCorretora(Corretora corretora) {
        corretoras.add(corretora);
    }

    public void addBolsa(Bolsa bolsa) {
        bolsas.add(bolsa);
    }

    public void removeAtivoParaVenda(Ativo ativo, Bolsa bolsa){
        ativosParaVenda.remove(ativo);
        bolsa.removeAtivoParaVenda(ativo);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCnpj() {
        return cnpj;
    }
}
