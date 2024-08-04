package semana17;

public class ContaSalario extends Conta{

    public ContaSalario(double tarifa, Correntista correntista) {
        super(tarifa, correntista);
        saldo=0;
    }
}
