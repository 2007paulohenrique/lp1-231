package semana06.exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static double calcularIMC(double peso, double altura) {
        return peso*(altura*altura);
    
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double peso, altura;

        System.out.println("coloque seu peso em kg e altura em metros");
        peso = sc.nextDouble();
        altura = sc.nextDouble();

        System.out.println("sua classificacao de acordo com seu imc e:");

        if(calcularIMC(peso, altura) < 18.5){
            System.out.println("baixo peso");

        } else if (calcularIMC(peso, altura) >= 18.5 && calcularIMC(peso, altura) < 25){
            System.out.println("peso normal");

        } else if (calcularIMC(peso, altura) >= 25 && calcularIMC(peso, altura) < 30){
            System.out.println("excesso de peso");

        } else if (calcularIMC(peso, altura) >= 30 && calcularIMC(peso, altura) < 35){
            System.out.println("obesidade de classe 1");

        } else if (calcularIMC(peso, altura) >= 35 && calcularIMC(peso, altura) < 40){
            System.out.println("obesidade de classe 2");

        } else if (calcularIMC(peso, altura) >= 40){
            System.out.println("obesidade de classe 3");

        } else {
            System.out.println("ocorreu um erro. comece de novo");
        } 

        double difpeso;

        if(calcularIMC(peso, altura) > 24.9){
            difpeso = peso - (24.9*(altura*altura));
            System.out.println("voce precisa perder " + difpeso + " para chegar ao peso normal");

        } else if(calcularIMC(peso, altura) < 18.5){
            difpeso = (18.5*(altura*altura) - peso);;
            System.out.println("voce precisa ganhar " + difpeso + " para chegar ao peso normal");

        } else {
            System.out.println("voce esta no peso normal");

        }
    }
}
