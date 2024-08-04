package semana06;

public class Metodos{

    public static void main(String[] args) {
        
        imprimirpalavra("ola mundo");

        // para usar metodos de uma classe em um arquivo dentro do mesmo pacote - Classe.metodo(parametros)

        double soma = Calculadora.somar(10.0, 15.0);
        System.out.println(soma);
    }

        
    // criacao de metodo

    // modificadores de acesso

    // public - qualquer classe em qualquer pacote pode acessar o metodo
    // private - somente a classe do metodo pode acessa-lo
    // protected - somente as classes do mesmo pacote ou subclasses pode acessa-lo

    // static - o metodo fica associado a classe e nao a objetos dela, assim eu posso usa-lo sem criar uma instancia da classe

    // tipo de retornos

    // void - sem retorno
    // outros tipos - o metodo tem que possuir um return que retona um valor do mesmo tipo

    // parametros - referencias aos valores que sao passadas na chamada do metodo

    public static void imprimirpalavra(String palavra) {
        System.out.println(palavra.toUpperCase());
        
    }
}