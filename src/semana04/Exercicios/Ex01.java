package semana04.Exercicios;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args){

        
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero");
        int n = sc.nextInt();

        int suc = n+1;
        int ant = n-1;

        System.out.println("antecessor: " + ant);
        System.out.println("sucessor: " + suc);
        
    }
}