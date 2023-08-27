package semana17;

public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(double tarifa, Correntista correntista, double limite) {
        super(tarifa, correntista);
        this.limite=limite;
    }

    public void sacar(double valordosaque) {
        saldo=saldo-valordosaque;
    }

    public double calcularTarifa(){
        return (saldo*tarifa)/limite;
    }

    public double getLimite(){
        return limite;
    }
}
