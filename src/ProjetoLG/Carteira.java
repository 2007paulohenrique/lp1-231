package ProjetoLG;

import java.util.List;

public class Carteira {
    private Investidor investidor;
    private List<Ativo> ativos;

    public Carteira(Investidor investidor) {
        this.investidor = investidor;
    }

    public void adicionarAtivo(Ativo ativo) {
        ativos.add(ativo);
    }

    public void removerAtivo(Ativo ativo) {
        ativos.remove(ativo);
    }

    public List<Ativo> listarAtivos() {
        return ativos;
    }

    public Investidor getInvestidor() {
        return investidor;
    }
}

