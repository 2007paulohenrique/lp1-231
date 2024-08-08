package semana17;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    
    public static void main(String[] args) {
        // lista - List<Classe> nomeDaLista; - colecao de objetos de uma mesma classe
        // uma das interfaces de Collection - mais informacoes no repositorio do link:
        // https://github.com/2007paulohenrique/lp2-331

        List<String> strings = new ArrayList<>();
        List<String> strings2 = new ArrayList<>();
        
        // adicionar objetos/elementos

        strings.add("primeiro"); // adiciona na primeira posicao disponivel
        strings.add("paap");
        strings.add(2, "segunda"); // adiciona numa posicao - pode ser uma posicao ja ocupada ou a primeira podicao disponivel
        strings2.add("terceira");
        strings2.add("quarta");

        strings.addAll(strings2); // adiciona todos os elementos de uma lista(parametro) ao final de outra
        strings2.addAll(1, strings); // adicioa todos os elementos de uma lista a outra, comecando pela posicao especificada

        // add e addall - nao substitui nenhum elemento da lista, somente adiciona novos elementos e caso necessario, 
        // muda os elemento originais de posicao

        System.out.println(strings + "\n" + strings2);

        // remover objetos/elementos

        strings.remove(2); // Remove o elemento em uma posição específica
        strings.remove("primeiro"); // Remove a primeira ocorrência de um elemento
        strings2.removeAll(strings); // Remove todos os elementos que estão na coleção especificada

        System.out.println(strings + "\n" + strings2);

        strings2.clear(); // Remove todos os elementos da lista

        System.out.println(strings + "\n" + strings2);

        // substituir elementos

        strings.set(0, "primeirassa"); // substitui o elemento na posicao especificada por outro

        System.out.println(strings + "\n" + strings2);

        // criar sublista de uma lista

        List<String> strings3;

        strings3 = strings.subList(1, 3); // cria uma lista com os elementos de uma posicao ate outra de outra lista

        System.out.println(strings3);

        // posicao de uma lista

        strings3.add("terceira");

        strings3.get(1); // elemento na posicao especificada
        strings3.indexOf("terceira"); // posicao que ocorre a primeira ocorrencia de um elemento
        strings3.lastIndexOf("terceira"); // posicao que ocorre a ultima ocorrencia de um elemento

        // consulta a lista - boolean

        strings3.contains("quarta"); // verififca se a lista contem um elemento
        System.out.println(strings.containsAll(strings3)); // verifica se uma lista contem o todos os elementos de outra
        strings3.size(); // numero de elementos da lista
        strings3.isEmpty(); // verifica se a lista esta vazia
    }
}