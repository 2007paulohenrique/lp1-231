package semana11.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PessoaTeste {
    @Test

    public void IMC() {
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1;
        pessoa.peso = 40;

        double imc = pessoa.calcularIMC();

        assertEquals(40, imc);
    }

    @Test

    public void IMC2() {
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 2;
        pessoa.peso = 100;

        double imc = pessoa.calcularIMC();

        assertEquals(25, imc);
    }

    @Test

    public void verFaixa7() {
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1;
        pessoa.peso = 40;

        String faixa = pessoa.faixa();

        assertEquals("obesidade de classe 3", faixa);
    }

    @Test

    public void verFaixa6() {
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1;
        pessoa.peso = 38;

        String faixa = pessoa.faixa();

        assertEquals("obesidade de classe 2", faixa);
    }

    @Test

    public void verFaixa5() {
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1;
        pessoa.peso = 34;

        String faixa = pessoa.faixa();

        assertEquals("obesidade de classe 1", faixa);
    }

    @Test

    public void verFaixa4() {
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1;
        pessoa.peso = 28;

        String faixa = pessoa.faixa();

        assertEquals("excesso de peso", faixa);
    }

    @Test

    public void verFaixa3() {
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1;
        pessoa.peso = 23;

        String faixa = pessoa.faixa();

        assertEquals("peso normal", faixa);
    }

    @Test

    public void verFaixa2() {
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1;
        pessoa.peso = 15;

        String faixa = pessoa.faixa();

        assertEquals("baixo peso", faixa);
    }

    @Test

    public void verFaixa1Erro() {
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1;
        pessoa.peso = -10;

        String faixa = pessoa.faixa();

        assertEquals("ocorreu um erro. comece de novo", faixa);
    }

    @Test

    public void verSituacao() {
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1;
        pessoa.peso = 27;

        String situacao = pessoa.situacao();

        assertEquals("perder peso", situacao);
    }

    @Test

    public void verSituacao2() {
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1;
        pessoa.peso = 15;

        String situacao = pessoa.situacao();

        assertEquals("ganhar peso", situacao);
    }

    @Test

    public void verSituacao3() {
        Pessoa pessoa = new Pessoa();
        pessoa.altura = 1;
        pessoa.peso = 22;

        String situacao = pessoa.situacao();

        assertEquals("peso ok", situacao);
    }
}
