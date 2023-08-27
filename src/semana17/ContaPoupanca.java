package semana17;

import java.time.LocalDate;

public class ContaPoupanca extends Conta {
    private LocalDate aniversario;

    public ContaPoupanca(double tarifa, Correntista correntista, LocalDate aniversario) {
        super(tarifa, correntista);
        this.aniversario=aniversario;
        saldo=0;
    }

    public double calcularTarifa(){
        return saldo*tarifa;
    }

    public LocalDate getAniversario(){
        return aniversario;
    }
}
