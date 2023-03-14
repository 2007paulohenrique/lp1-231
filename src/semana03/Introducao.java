package semana03;

import java.util.Scanner;

public class Introducao{

    public static void main(String[] args){

        //tipo primitivos

        //inteiro
        //byte, short, int, long

        byte n1 = 100; //-128 a 127 - 1 byte
        short n2 = 3000; //-32768 a 32767 - 2 bytes
        int n3 = 43453453; //2 bilhões - 4 bytes
        long n4 = 53453452; //8 bytes

        //ponto flutuante

        float nota1 = 1.232f;
        double nota2 = 2.534252;

        //char

        char letra = 'a';

        //boolean

        boolean ligado = true;
        boolean teste = false;

        //string

        String nome = "paulo henrique";

        System.out.println(nome);
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());


        //variaveis e constantes

        int idade = 10;
        int idade2;

        final double nmr = 10.1;

        //entrada e saida de dados
        //entrada= scanner

        Scanner sc = new Scanner(System.in);

        System.out.println("entre com seu nome");
        String nomeinformado = sc.nextLine();

        System.out.println("entre com sua idade");
        int idadeinformada = sc.nextInt();

        System.out.println(nomeinformado + " " + idadeinformada);

        sc.close();


    }
}
