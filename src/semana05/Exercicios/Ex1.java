package semana05.Exercicios;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o comprimento, altura e largura do aquario em centimetros");

        System.out.println("comprimento: ");
        double comp = sc.nextDouble();

        System.out.println("altura: ");
        double alt = sc.nextDouble();

        System.out.println("largura: ");
        double larg = sc.nextDouble();

        double volume = (comp*alt*larg)/1000;

        System.out.println("coloque a temperatura ambiente em graus: ");
        short temp = sc.nextShort();

        System.out.println("coloque a temperatura desejada para o aquario:");
        short tempdesejada = sc.nextShort();

        double potencia = volume * 0.05 * (tempdesejada - temp);

        double filt1 = 2 * volume;
        double filt2 = 3 * volume;

        System.out.println("a potencia do termostato recomendada e de :" + potencia + "watts");
        System.out.println("a filtragem do aquario deve ser de " + filt1 + " a " + filt2 + " litros por hora");

        sc.close();
    }
    
} 


