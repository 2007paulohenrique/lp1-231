package semana12.exercicios;

public class Conta {
    public int codigo;
    public double saldo;
    public String correntista;

    public Conta(int codigo, String correntista){
        this.codigo=codigo;
        this.correntista=correntista;
        saldo = 0;
    }

    public double sacar(double valordosaque, double saldo) {
        this.saldo=saldo;
        return this.saldo-valordosaque;
    }

    public double depositar(double valordodeposito, double saldo) {
        this.saldo=saldo;
        return this.saldo+valordodeposito;
    }

    public double transferir(double valordatransferencia, double saldo){
        this.saldo=saldo;
        return this.saldo-valordatransferencia;
    }
}
