package semana07.exercicios;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ExerciciosRevisao {

    public static double somarTresnumeros(double n1, double n2, double n3){
        return n1+n2+n3;

    }

    public static double calcularMediaAritmetica(double n1, double n2, double n3) {
        return (n1+n2+n3)/3;
        
    }

    public static int PegarMaiorvalor(int n1, int n2, int n3) {
        if(n1 > n2 && n1 > n3){
            return n1;
        }else if(n2 > n1 && n2 > n3) {
            return n2;
        } else if(n3 > n1 && n3 > n2){
            return n3;
        } else if (n1 == n2 && n1 > n3) {
            return n1;
        } else if (n2 == n3 && n2 > n1) {
            return n2;
        } else if (n1 == n3 && n1 > n2) {
            return n3;
        } else {
            return n1;
        }
    }

    public static int PegarMenorvalor(int n1, int n2, int n3) {
        if(n1 < n2 && n1 < n3){
            return n1;
        }else if(n2 < n1 && n2 < n3) {
            return n2;
        } else if(n3 < n1 && n3 < n2){
            return n3;
        } else if (n1 == n2 && n1 < n3) {
            return n1;
        } else if (n2 == n3 && n2 < n1) {
            return n2;
        } else if (n1 == n3 && n1 < n2) {
            return n3;
        } else {
            return n1;
        } 
    }

    public static double[] PegarArray(double n1, double n2, double n3) {
        double[] array ={n1, n2, n3};
        return array;
    }

    public static double somarValores(double[] numero) {
        return numero[0] + numero[1] + numero[2];
        
    }

    public static double calcularMediaValores(double[] numero) {
        return somarValores(numero)/numero.length;
        
    }

    public static double pegarMenorValorArray(double[] numero) {
        double menor = numero[0];
        for (int i = 1; i < numero.length; i++) {
            if (numero[1] > menor) {
                menor = numero[i];
            }
        }
        return menor;
    }

    public static double pegarMaiorValorArray(double[] numero) {
        double maior = numero[0];
        for (int i = 1; i < numero.length; i++) {
            if (numero[1] > maior) {
                maior = numero[i];
            }
        }
        return maior;
    }

    public static int[] retornarValoresDeDoisArrays(int[] array1, int[] array2) {
        int[] valores = new int[array1.length + array2.length];
        return valores;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1= 2.5;
        double n2= 5.5;
        double n3= 8.5;
        int nm1 = 3;
        int nm2 = 8;
        int nm3 = 12;
        double[] numeros = {4.5, 8.5, 6.5};
        int[] nms1 = {4, 8, 9};
        int[] nms2 = {2, 6, 10};

        System.out.println(somarTresnumeros(n1, n2, n3));
        System.out.println(calcularMediaAritmetica(n1, n2, n3));
        System.out.println(PegarMaiorvalor(nm1, nm2, nm3));
        System.out.println(PegarMenorvalor(nm1, nm2, nm3));
        System.out.println(PegarArray(n1, n2, n3));
        System.out.println(somarValores(numeros));
        System.out.println(calcularMediaValores(numeros));
        System.out.println(pegarMaiorValorArray(numeros));
        System.out.println(pegarMenorValorArray(numeros));
        System.out.println(retornarValoresDeDoisArrays(nms1, nms2));

    }
}