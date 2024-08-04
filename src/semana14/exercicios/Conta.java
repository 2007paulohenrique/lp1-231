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
        setCodigo(codigo);
        setCorrentista(correntista);
        setSaldo(0);
    }

    public double depositar(double valor) {
        if (valor > 0) {
            setSaldo(this.saldo + valor);
        }

        return valor;
    }

    public double sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            setSaldo(this.saldo - valor);
        }

        return valor;
    }

    public double transferir(double valor){
        if (valor > 0 && valor <= this.saldo) {
            setSaldo(this.saldo - valor);
        }

        return valor;
    }

    private void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new RuntimeException("o correntista deve ter entre 4 e 101 caracteres");

        }

        this.saldo = saldo;
    }

    public void setCorrentista(String correntista) {
        if (correntista.length() < 5 || correntista.length() > 100) {
            throw new RuntimeException("o correntista deve ter entre 4 e 101 caracteres");

        }

        this.correntista = correntista;
    }

    private void setCodigo(int codigo) {
        if (codigo <= 0) {
            throw new RuntimeException("codigo invalido");

        }

        this.codigo = codigo;
    }
}
