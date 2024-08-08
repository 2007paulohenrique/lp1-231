package semana04;

import java.util.Arrays;

public class ArraysC {
    public static void main(String[] args) {
        // arrays - colecao de varios dados

        double n1 = 10.0;
        double n2 = 7.5;
        double n3 = 3.4;

        // array de double com capacidade de armazenar 3 valores
        
        double[] notas = new double[3]; // tipoDasVariaveisDoArray[] nome = new tipoDasVariaveisDoArray[tamanho do array]

        // indice inicial do array e 0

        // nome[posicao do array] - para acessar um elemento numa posicao especifica do array

        notas[0] = n1;
        notas[1] = n2;
        notas[2] = n3;

        // metodos de Array:

        // obter quantidade de elementos no Array
        System.out.println(notas.length);

        // retorna uma String que representa o Array - torna o Array legivel
        System.out.println(Arrays.toString(notas));

        // ordena um array de forma crescente lista
        Arrays.sort(notas);
        System.out.println(Arrays.toString(notas));

        // procura por um valor numa lista ordenada de forma crescente e retorna sua posicao
        // caso a lista esteja ordenada de outra forma, a posicao retornada sera incorreta
        System.out.println(Arrays.binarySearch(notas, 7.5));

        // substitui todos os elementos por um valor
        Arrays.fill(notas, 10.0);
        System.out.println(Arrays.toString(notas));
    }
}
