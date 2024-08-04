package semana03;

import java.util.Scanner;

public class Introducao{
    @SuppressWarnings("unused")
    public static void main(String[] args){
        //tipos primitivos

        //inteiros
        byte numeroByte = 100;
        short numeroShort = 20000;
        int numeroInt = 10000000;
        long numeroLong = 100000000L;

        //byte // -128 a 127 - 1 byte
        //short // -32.768 a 32.767 - 2 bytes
        //int // -2.147.483.648 a 2.147.483.647 - 4 bytes
        //long // -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 - 8 bytes - necessario colocar "L" ao final do valor na declaracao


        //ponto flutuante - numeros com casas decimais

        float numeroFloat = 1.232f;
        double numeroDouble = 2.534252;

        //float // aproximadamente 7 casas decimais - 4 bytes - necessario colocar "f" ao final do valor na declaracao
        //double // aproximadamente 15 casas decimais - 8 bytes


        //char - valor entre ''

        char letra = 'a';


        //boolean

        boolean booleanTrue = true;
        boolean booleanFalse = false;


        //string - valor entre ""

        String nome = "paulo henrique";

        System.out.println(nome);
        System.out.println(nome.toLowerCase()); // converte todas as letras da string para minusculo
        System.out.println(nome.toUpperCase()); // converte todas as letras da string para maiusculo


        // declaracao de variaveis e constantes

        final float PI = 3.14f; // final - valor constante
        int numeroVariavel; // variavel

        //entrada e saida de dados
        //entrada = scanner

        Scanner sc = new Scanner(System.in);

        System.out.println("entre com seu nome");
        String nomeinformado = sc.nextLine();

        System.out.println("entre com sua idade");
        int idadeinformada = sc.nextInt();

        System.out.println(nomeinformado + " " + idadeinformada);

        sc.close();
    }
}
