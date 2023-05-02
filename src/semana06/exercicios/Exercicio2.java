package semana06.exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static double calcularIMC(double peso, double altura) {
        return peso/(altura*altura);
    
    }

    public static String classificar(double imc) {
        String classe;
        if(imc < 18.5 && imc > 0.0){
            classe = ("baixo peso");

        } else if (imc >= 18.5 && imc < 25){
            classe =  ("peso normal");

        } else if (imc >= 25 && imc < 30){
            classe = ("excesso de peso");

        } else if (imc >= 30 && imc < 35){
            classe = ("obesidade de classe 1");

        } else if (imc >= 35 && imc < 40){
            classe = ("obesidade de classe 2");

        } else if (imc >= 40){
            classe = ("obesidade de classe 3");

        } else {
            classe = ("ocorreu um erro. comece de novo");

        } 
        return classe;
    }

    public static String calcularPesoAPerderOuGanhar(double imc, double peso, double altura) {
        double difpeso;

        if(imc > 24.9){
            difpeso = peso - (24.9*(altura*altura));
            return ("voce precisa perder " + difpeso + " para chegar ao peso normal");

        } else if(calcularIMC(peso, altura) < 18.5){
            difpeso = (18.5*(altura*altura) - peso);;
            return ("voce precisa ganhar " + difpeso + " para chegar ao peso normal");

        } else {
            return ("voce esta no peso normal");

        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("coloque seu peso em kg e altura em metros");
        double peso = sc.nextDouble();
        double altura = sc.nextDouble();
        double imc = calcularIMC(peso, altura);
        System.out.println("sua classificacao de acordo com seu imc e:" + classificar(imc));

        System.out.println(calcularPesoAPerderOuGanhar(imc, peso, altura));
    }
}
