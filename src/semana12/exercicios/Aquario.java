package semana12.exercicios;

public class Aquario {
    public double comprimentocm;
    public double alturacm;
    public double larguracm;

    public Aquario(double comprimento, double altura, double largura){
        this.comprimentocm=comprimento;
        this.alturacm=altura;
        this.larguracm=largura;
    }

    public Aquario(double medida){
        comprimentocm=medida;
        alturacm=medida;
        larguracm=medida;
    }
    
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
