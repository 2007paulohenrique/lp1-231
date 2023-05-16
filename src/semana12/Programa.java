package semana12;

import semana12.exercicios.Aquario;
import semana12.exercicios.Pessoa;

public class Programa {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10);

        System.out.println(quadrado.calcularArea());
        System.out.println(quadrado.calcularPerimetro());

        Aquario aquario1 = new Aquario(100, 200, 50);
        Aquario aquario2 = new Aquario(100);

        System.out.println(aquario1.calcularVolumeEmMetros());
        System.out.println(aquario2.calcularVolumeEmMetros());

        Pessoa pessoa1 = new Pessoa(100, 1.5);

        System.out.println(pessoa1.calcularIMC());

    }
}
