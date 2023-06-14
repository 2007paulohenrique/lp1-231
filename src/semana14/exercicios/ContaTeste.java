package semana14.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTeste {
     @Test

    public void sacar() {
        Conta conta = new Conta(1001, "paulo");

        double saque = conta.sacar(100);

        assertEquals(100, saque);
    }

    @Test

    public void depositar() {
        Conta conta = new Conta(1001, "paulo");

        double deposito = conta.depositar(100);

        assertEquals(100, deposito);
    }

    @Test
    
    public void transferir() {
        Conta conta = new Conta(100, "paulo");

        double transferencia = conta.transferir(100);

        assertEquals(100, transferencia);
    }
}
