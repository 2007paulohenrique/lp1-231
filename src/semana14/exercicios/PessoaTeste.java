package semana14.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PessoaTeste {
    
    @Test

    public void IMC2() {
        Pessoa pessoa = new Pessoa(40, 1);

        double imc = pessoa.calcularIMC();

        assertEquals(40, imc);
    }

    @Test

    public void verFaixa7() {
        Pessoa pessoa = new Pessoa(40, 1);

        String faixa = pessoa.faixa();

        assertEquals("obesidade de classe 3", faixa);
    }

    @Test

    public void verFaixa6() {
        Pessoa pessoa = new Pessoa(38, 1);

        String faixa = pessoa.faixa();

        assertEquals("obesidade de classe 2", faixa);
    }

    @Test

    public void verFaixa5() {
        Pessoa pessoa = new Pessoa(34, 1);

        String faixa = pessoa.faixa();

        assertEquals("obesidade de classe 1", faixa);
    }

    @Test

    public void verFaixa4() {
        Pessoa pessoa = new Pessoa(28, 1);

        String faixa = pessoa.faixa();

        assertEquals("excesso de peso", faixa);
    }

    @Test

    public void verFaixa3() {
        Pessoa pessoa = new Pessoa(23, 1);

        String faixa = pessoa.faixa();

        assertEquals("peso normal", faixa);
    }

    @Test

    public void verFaixa2() {
        Pessoa pessoa = new Pessoa(15, 1);

        String faixa = pessoa.faixa();

        assertEquals("baixo peso", faixa);
    }

    @Test

    public void verFaixa1Erro() {
        Pessoa pessoa = new Pessoa(-10, 1);

        String faixa = pessoa.faixa();

        assertEquals("ocorreu um erro. comece de novo", faixa);
    }

    @Test

    public void verSituacao() {
        Pessoa pessoa = new Pessoa(27, 1);

        String situacao = pessoa.situacao();

        assertEquals("perder peso", situacao);
    }

    @Test

    public void verSituacao2() {
        Pessoa pessoa = new Pessoa(15, 1);

        String situacao = pessoa.situacao();

        assertEquals("ganhar peso", situacao);
    }

    @Test

    public void verSituacao3() {
        Pessoa pessoa = new Pessoa(22, 1);

        String situacao = pessoa.situacao();

        assertEquals("peso ok", situacao);
    }
}
