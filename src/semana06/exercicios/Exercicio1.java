package semana06.exercicios;

public class Exercicio1 {
    
    public static double calcularVolumeAquario(double altura, double largura, double comprimento){
        return altura*largura*comprimento;

    }

    public static double calcularPotencia(short tempdesejada, short temp){
        double volume = calcularVolumeAquario(temp, tempdesejada, temp);
        return volume*0.05*(tempdesejada-temp);

    } 

    


}
