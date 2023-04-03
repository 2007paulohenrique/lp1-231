package semana06.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Exercicio1Teste {

    @Test

    public void calcularVolumeEDividirPorMil() {
        
        double altura = 10;
        double largura = 10;
        double comprimento = 10;

        double volume = Exercicio1.calcularVolume(altura, largura, comprimento);

        assertEquals(1, volume);

    }

    @Test

    public void CalcularPotencia() {
        
        double volume = 20;
        double tempdesejada = 25;
        double temp = 20;

        double potencia = Exercicio1.CalcularPotencia(volume, tempdesejada, temp);

        assertEquals(5, potencia);

    }

    @Test

    public void CalcularFiltragem() {
        
        double volume = 50;

        String filtragem = Exercicio1.calcularFiltragem(volume);

        assertEquals(("a filtragem deve ser de " + 100.0 + " a " + 150.0 + " litros por hora"), filtragem);

    }
    
}
