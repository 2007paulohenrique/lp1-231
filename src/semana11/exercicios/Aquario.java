package semana11.exercicios;

public class Aquario {
    public double comprimentocm;
    public double alturacm;
    public double larguracm;

    public double calcularVolumeEmMetros() {
        return (comprimentocm*alturacm*larguracm)/1000000;
    }

    public double calcularPotenciaDoTermostato(double tempambiente, double tempdesejada) {
        return calcularVolumeEmMetros() * 0.05 * (tempdesejada - tempambiente);
    }

    public double[] calcularcalcularQuantidadeLitrosFiltro() {
        double[] filtragem = {calcularVolumeEmMetros()*2 , calcularVolumeEmMetros()*3};
        return filtragem;
    }
}
