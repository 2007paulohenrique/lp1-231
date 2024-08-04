package semana04.Exercicios;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String regex = "^BR\\d{4}X$";

        System.out.println("digite o codigo identificador:");
        String cdg = sc.nextLine();

        if(cdg.matches(regex)){
            System.out.println("codigo valido");

        } else {
            System.out.println("codigo invalido");

        }
        sc.close();
    }
}
