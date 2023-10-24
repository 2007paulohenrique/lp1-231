package ProjetoLG;

public class AcaoOrdinaria extends Ativo {
    private int direitoVoto;

    public AcaoOrdinaria(String nome, double precoAtual, int direitoVoto) {
        super(nome, precoAtual);
        setDireitoVoto(direitoVoto);
    }

    public int getDireitoVoto() {
        return direitoVoto;
    }

    public void setDireitoVoto(int direitoVoto) {
        if (direitoVoto <= 0) {
            throw new RuntimeException("apenas valores positivos");
        }
        this.direitoVoto = direitoVoto;
    }
}
