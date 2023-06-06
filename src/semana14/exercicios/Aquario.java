package semana14.exercicios;

public class Aquario {
    private double comprimentocm;
    private double alturacm;
    private double larguracm;

    public Aquario(double comprimento, double altura, double largura){
        setComprimentocm(comprimento);
        setAlturacm(altura);
        setLarguracm(largura);
    }

    public Aquario(double medida){
        setComprimentocm(medida);
        setAlturacm(medida);
        setLarguracm(medida); 
    }

    public double getComprimentocm(){
        return comprimentocm;
    }

    public double getAlturacm(){
        return alturacm;
    }

    public double getLarguracm(){
        return larguracm;
    }

    public void setComprimentocm(double comprimentocm){
        if (comprimentocm <= 0) {
            throw new RuntimeException("medida invalida");
        }
        this.comprimentocm=comprimentocm;
    }

    public void setAlturacm(double alturacm){
        if (alturacm <= 0) {
            throw new RuntimeException("medida invalida");
        }
        this.alturacm=alturacm;
    }

    public void setLarguracm(double larguracm){
        if (larguracm <= 0) {
            throw new RuntimeException("medida invalida");
        }
        this.larguracm=larguracm;
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
