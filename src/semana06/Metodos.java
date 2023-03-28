package semana06;

public class Metodos{

    public static void main(String[] args) {
        
        System.out.println(Math.sqrt(25.0)); //raiz quadrada de 25

        imprimirpalavra("ola mundo");

        double soma = Calculadora.somar(10.0, 15.0);
        System.out.println(soma);

        //ou

        System.out.println(Calculadora.somar(10, 15));
    }

        
    //criacao de metodo
    //public - qualquer classe em qualquer pacote pode acessar o metodo
    //static - o metodo fica associado a classe e nao a objetos dela
    //void - tipo de retorno do metodo , sem retorno pois e void
    //imprimir palavra - nome do metodo
    //parametros - referencias aos valores que sao passadas na chamada do metodo

    public static void imprimirpalavra(String palavra) {
        System.out.println(palavra.toUpperCase());


    }


}