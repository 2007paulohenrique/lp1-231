package semana06.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Exercicio1Teste {

    @Test

    public void multiplicarTresNumerosEDividirPorMil() {
        
        double altura = 10;
        double largura = 10;
        double comprimento = 10;

        double multiplicacao = Exercicio1.calcularVolume(altura, largura, comprimento);

        assertEquals(1, multiplicacao);

    }

    @Test

    public void CalcularPotencia() {
        
        double volume = 20;
        double tempdesejada = 25;
        double temp = 20;

        double calpotencia = volume*0.05*(tempdesejada-temp);

        assertEquals(5, calpotencia);

    }

    @Test

    public void CalcularFiltragem() {
        
        double volume = 50;

        double filtragem1 = volume*2;

        assertEquals(100, filtragem1);

    }

    @Test

    public void CalcularFiltragem2() {
        
        double volume = 50;

        double filtragem2 = volume*3;

        assertEquals(150, filtragem2);

    }
    
}
