package semana17;

// classe que extende outra - herda os atributos e metodos da classe que extendeu
// pode ter outros metodos e atributos

public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(double tarifa, Correntista correntista, double limite) {
        // super - contrutor da classe que foi extendida
        
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
