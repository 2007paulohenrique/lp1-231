package semana21;

import java.util.ArrayList;

//interface
//conjunto de metodos, somente assinaturas sem corpo
//classe concreta que implementa a interface
//usada quando classes n possuem atributos semelhantes, como no caso das figuras geometricas
//circulo possui raio, quadrado possui lado, retangulo possui base e altura

//exemplo
//classe quadrado e retangulo possuem lado/base e altura e metodos calcular base/perimetro,circulo...


public class Main {
    public static void main(String[] args) {
        Tela tela = new Tela();
        Quadrado q1 = new Quadrado(10);
        Quadrado q2 = new Quadrado(15);
        Retangulo r1 = new Retangulo(10, 5);

        tela.addFiguras(q1);
        tela.addFiguras(q2);
        tela.addFiguras(r1);

        System.out.println(tela.areaTotal());
        System.out.println(tela.perimetroTotal());

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("paulo");
        nomes.add("joao");
        nomes.add("maria");

        System.out.println(nomes.size());

        //remover um elemento do arraylist pelo indice do array, ou pelo conteudo
        nomes.remove(1);
        nomes.remove("joao");

        //ao remover um elemento, os outro que estao na frente irao voltar 1 posicao para tras(se reorganizam)

        //limpa os nomesdo arraylist
        nomes.clear();

        //pegar valor de um elemento, no caso o de indice 1, o segundo elemento
        System.out.println(nomes.get(1));

        for (int i = 0; i < nomes.size(); i++) {
            //String nome = nomes.get(i);
        }
    }
}