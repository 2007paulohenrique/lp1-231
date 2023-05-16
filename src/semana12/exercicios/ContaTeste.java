package semana12.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTeste {
    @Test

    public void sacar() {
        Conta conta = new Conta(1001, "paulo");

        double saque = conta.sacar(100, 1000);

        assertEquals(900, saque);
    }

    @Test

    public void depositar() {
        Conta conta = new Conta(1001, "paulo");

        double deposito = conta.depositar(100, 1000);

        assertEquals(1100, deposito);
    }

    @Test
    
    public void transferir() {
        Conta conta = new Conta(1001, "paulo");

        double transferencia = conta.transferir(100, 1000);

        assertEquals(900, transferencia);
    }
}
