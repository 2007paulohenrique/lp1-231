package semana06.exercicios;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Exercicio1 {
    
    public static double calcularVolume(double altura, double largura, double comprimento) {
        return (altura*largura*comprimento)/1000;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("digite a altura, largura e comprimento do aquario em centimetros");
        double volume = calcularVolume(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        double tempdesejada, temp;
        System.out.println("digite a temperatura ambiente e a temperatura desejada para o aquario em graus");
        temp = sc.nextDouble();
        tempdesejada = sc.nextDouble();
        double potencia = volume*0.05*(tempdesejada-temp);
        System.out.println("a potencia do termostato recomendada e de :" + potencia + "watts");
        System.out.println("a filtragem do aquario deve ser de " + volume*2 + " a " + volume *3 + " litros por hora");


        }
    }
