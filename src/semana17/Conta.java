package semana17;

// classe abstrata  - nao pode ser instanciada - subclasses deve extender ela e usar seus atributos e metodos
public abstract class Conta {
    protected double saldo;
    protected double tarifa;

    public Conta(double tarifa, Correntista correntista){
        if (tarifa<0) {
            throw new RuntimeException("somente valores positivos");
        }
        this.tarifa=tarifa;
        correntista.addConta(this);
        saldo=0;
    }

    public void sacar(double valordosaque) {
        saldo=saldo-valordosaque;
    }

    public void depositar(double valordodeposito) {
        saldo=saldo+valordodeposito;
    }

    public double calcularTarifa(){
        return (saldo*tarifa)/1000;
    }

    public double getSaldo(){
        return saldo;
    }

    public double getTarifa(){
        return tarifa;
    }
}
