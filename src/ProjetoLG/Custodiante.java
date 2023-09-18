package ProjetoLG;

import java.util.List;

public class Custodiante {
    private String nome;
    private String cnpj;
    private List<Investidor> clientes;
    private List<Ativo> ativosCustodiados;

    public Custodiante(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void adicionarAtivo(Ativo ativo) {
        ativosCustodiados.add(ativo);
    }

    public void removerAtivo(Ativo ativo) {
        ativosCustodiados.remove(ativo);
    }

    public void addCliente(Investidor investidor){
        clientes.add(investidor);
    }
}
