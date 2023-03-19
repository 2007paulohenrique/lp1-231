package semana04.Exercicios;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        

        System.out.println("digite o codigo identificador:");
        String cdg = sc.nextLine();

        if(cdg.length() != 7){
            System.out.println("codigo invalido");

        } else if (!cdg.substring(0, 2).matches("B"+"R")){
            System.out.println("codigo invalido");

        } else if (!cdg.substring(2, 6).matches("[0-9]*")){
            System.out.println("codigo invalido");

        } else if (!cdg.substring(6).matches("X")){
            System.out.println("codigo invalido");

        } else {
            System.out.println("codigo valido");

        }
    }
}
