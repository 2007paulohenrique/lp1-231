package semana11.exercicios;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AquarioTeste {
    @Test

    public void testarConstrutor1() {
        Aquario aquario = new Aquario();

        double volume = aquario.calcularVolumeEmMetros();

        assertEquals(1, volume);
    }

    public void testarConstrutor2() {
        Aquario aquario = new Aquario();
        aquario.alturacm = 100;
        aquario.comprimentocm = 100;
        aquario.larguracm = 100;

        double volume = aquario.calcularVolumeEmMetros();

        assertEquals(1, volume);
    }

    @Test

    public void calcularVolume() {
        Aquario aquario = new Aquario();
        aquario.alturacm = 100;
        aquario.comprimentocm = 100;
        aquario.larguracm = 100;

        double volume = aquario.calcularVolumeEmMetros();

        assertEquals(1, volume);
    }

    @Test

    public void calcularPotencia() {
        Aquario aquario = new Aquario();
        aquario.alturacm = 100;
        aquario.comprimentocm = 100;
        aquario.larguracm = 100;
        double tempambiente = 20;
        double tempdesejada = 30;

        double potencia = aquario.calcularPotenciaDoTermostato(tempambiente, tempdesejada);

        assertEquals(0.5, potencia);
    }

    @Test

    public void calcularFiltragem() {
        Aquario aquario = new Aquario();
        aquario.alturacm = 100;
        aquario.comprimentocm = 100;
        aquario.larguracm = 100;
        double[] teste = {2,3};

        double[] filtragem = aquario.calcularcalcularQuantidadeLitrosFiltro();

        assertArrayEquals(teste, filtragem);
    }
}
