package semana04.Exercicios;

import java.util.Scanner;

public class Ex02 {
    

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("digite 3 numeros");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
            
        double media = (n1+n2+n3)/3;

        System.out.println("media = " + media);
        sc.close();
    }
}
