package semana05.Exercicios;

import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("coloque seu peso e sua alura abaixo");

        System.out.println("peso(Kg):");
        double peso = sc.nextDouble();

        System.out.println("altura(m):");
        double alt = sc.nextDouble();

        double imc = peso / (alt * alt);

        System.out.println("sua classificacao de acordo com seu imc e:");

        if(imc < 18.5){
            System.out.println("baixo peso");

        } else if (imc >= 18.5 && imc < 25){
            System.out.println("peso normal");

        } else if (imc >= 25 && imc < 30){
            System.out.println("excesso de peso");

        } else if (imc >= 30 && imc < 35){
            System.out.println("obesidade de classe 1");

        } else if (imc >= 35 && imc < 40){
            System.out.println("obesidade de classe 2");

        } else if (imc >= 40){
            System.out.println("obesidade de classe 3");

        } else {
            System.out.println("ocorreu um erro. comece de novo");
        } 
      
        double difpeso;

        if(imc > 24.9){
            difpeso = peso - (24.9*(alt*alt));
            System.out.println("voce precisa perder " + difpeso + " para chegar ao peso normal");

        } else if(imc < 18.5){
            difpeso = (18.5*(alt*alt) - peso);;
            System.out.println("voce precisa ganhar " + difpeso + " para chegar ao peso normal");

        } else {
            System.out.println("voce esta no peso normal");

        }

    }
}
