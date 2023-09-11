package semana04.Exercicios;

import java.util.Scanner;

public class Ex03 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("valor da compra:");
        double compra = sc.nextFloat();

        short desconto;

        if (compra > 0 && compra < 10){
            desconto = 0;

        } else if (compra >=10 && compra < 100){
            desconto = 5;

        } else if (compra >=100 && compra < 500){
            desconto = 10;

        } else if (compra >= 500){
            desconto = 15;

        } else {
            desconto = 0;
            System.out.println("houve um erro");
        }

        double valor = compra - (compra * desconto/100);

        System.out.println("valor final: " + valor);
        System.out.println("desconto: " + desconto + "%");
        sc.close();
    }
}
