package semana06.exercicios;

import java.util.Scanner;

public class Exercicio1 {
    
    public static double calcularVolume(double altura, double largura, double comprimento) {
        return (altura*largura*comprimento)/1000;
    }

    public static double CalcularPotencia(double volume, double tempdesejada, double temp) {
        return volume*0.05*(tempdesejada-temp);
    }

    public static String calcularFiltragem(double volume) {
        double filt1 = volume*2;
        double filt2 = volume*3;
        return ("a filtragem deve ser de " + filt1 + " a " + filt2 + " litros por hora");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a altura, largura e comprimento do aquario em centimetros");
        double volume = calcularVolume(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("digite a temperatura desejada para o aquario e a temperatura ambiente em graus");
        double potencia = CalcularPotencia(volume, sc.nextDouble(), sc.nextDouble());
        System.out.println("a potencia do termostato recomendada e de :" + potencia + "watts");
        System.out.println(calcularFiltragem(volume));
        sc.close();
        }
    }
