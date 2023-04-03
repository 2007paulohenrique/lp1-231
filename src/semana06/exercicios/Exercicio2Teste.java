package semana06.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Exercicio2Teste {

    @Test

    public void calcularIMC() {
        
        double altura = 1.5;
        double peso = 90;

        double imc = Exercicio2.calcularIMC(peso, altura);

        assertEquals(40, imc);

    }

    @Test

    public void classificarBaixoPeso() {
        
        double imc = 15;

        String classe = Exercicio2.classificar(imc);

        assertEquals(("baixo peso"), classe);

    }

    @Test

    public void classificarPesoNormal() {
        
        double imc = 20;

        String classe = Exercicio2.classificar(imc);

        assertEquals(("peso normal"), classe);

    }

    @Test

    public void classificarExcessodePeso() {
        
        double imc = 28;

        String classe = Exercicio2.classificar(imc);

        assertEquals(("excesso de peso"), classe);

    }

    @Test

    public void classificarObesidade1() {
        
        double imc = 32;

        String classe = Exercicio2.classificar(imc);

        assertEquals(("obesidade de classe 1"), classe);

    }

    @Test

    public void classificarObesidade2() {
        
        double imc = 38;

        String classe = Exercicio2.classificar(imc);

        assertEquals(("obesidade de classe 2"), classe);

    }

    @Test

    public void classificarObesidade3() {
        
        double imc = 45;

        String classe = Exercicio2.classificar(imc);

        assertEquals(("obesidade de classe 3"), classe);

    }

    @Test

    public void classificarNulo() {
        
        double imc = -15;

        String classe = Exercicio2.classificar(imc);

        assertEquals(("ocorreu um erro. comece de novo"), classe);

    }

    @Test

    public void pesoNormal() {
        
        double peso = 50;
        double altura = 1.5;
        double imc = peso/(altura*altura);

        String difpeso = Exercicio2.calcularPesoAPerderOuGanhar(imc, peso, altura);

        assertEquals(("voce esta no peso normal"), difpeso);

    }

    @Test

    public void pesoAPerder() {
        
        double peso = 80;
        double altura = 1.5;
        double imc = peso/(altura*altura);

        String difpeso = Exercicio2.calcularPesoAPerderOuGanhar(imc, peso, altura);

        assertEquals(("voce precisa perder " + 23.975 + " para chegar ao peso normal"), difpeso);

    }

    @Test

    public void pesoAGanhar() {
        
        double peso = 40;
        double altura = 1.5;
        double imc = peso/(altura*altura);

        String difpeso = Exercicio2.calcularPesoAPerderOuGanhar(imc, peso, altura);

        assertEquals(("voce precisa ganhar " + 1.625 + " para chegar ao peso normal"), difpeso);

    }
}
