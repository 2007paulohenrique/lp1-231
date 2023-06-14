package semana14.exercicios;

public class Conta {
    private int codigo;
    private double saldo;
    private String correntista;

    public int getCodigo(){
        return codigo;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getCorrentista(){
        return correntista;
    }



    public Conta(int codigo, String correntista){
        if (codigo <= 0) {
            throw new RuntimeException("codigo invalido");
        }

        if (correntista.length() < 5 || correntista.length() > 100) {
            throw new RuntimeException("o correntista deve ter entre 4 e 101 caracteres");
        }

        this.codigo=codigo;
        this.correntista=correntista;
        saldo = 0;
    }

    public double sacar(double valordosaque) {
        saldo-=valordosaque;
        return valordosaque;
    }

    public double depositar(double valordodeposito) {
        saldo+=valordodeposito;
        return valordodeposito;
    }

    public double transferir(double valordatransferencia){
        saldo-=valordatransferencia;
        return valordatransferencia;
    }
}
