package semana04;

public class EstruturaControle {
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


        //  if - a condicao dentro do if tem que retornar um boolean - caso seja true, e executado o if, caso false, ignorado

        int idade = 17;
        final int maioridade = 18;

        if (idade >= maioridade) {
            System.out.println("maior de idade");
        }

        int numero = 10;

        // || - usado para verificar se alguma condicao e verdadeira, caso alguma das codicoes for true, o if e executado

        if (numero == 10 || numero == 20) {
            System.out.println("10 ou 20");
        }

        // && - usado para verificar se condicoes sao verdadeiras, caso todas forem, o if e executado

        if (numero > 5 && numero < 15) {
            System.out.println("entre 5 e 15");
        }

        // != - diferente
        // !boolean - troca o valor do boolean

        if (numero != 10 && !(numero < 15)) {
            System.out.println("diferente de 10 e nao menor que 15");
        }


        // else - executado caso a condicao dentro do if seja false

        boolean ligado = true;

        if (ligado) {
            System.out.println("sensor ligado");
            
        } else {
            System.out.println("sensor desligado");
        }

        
        // switch - usado quando e necessario comparar o valor de uma variavel com varios possiveis valores
        // caso a variavel seja igual a um valor (case), o codigo dentro do bloco case e executado
        // break - interrompe o switch

        int x = 3;

        switch (x) {
            case 1:
                System.out.println("numero 1");
                break;
            case 2:
                System.out.println("numero 2");                
                break;
            case 3:
                System.out.println("numero 3");
                break;
            case 4:
                System.out.println("numero 4");
                break;
            default:
                System.out.println("numero nao encontrado");
                break;
        }



        // while - usa uma condicao com um contador que vai incrementando um valor
        // enquanto o contador obedecer uma condicao o while e executado

        int contador = 0;

        while (contador < 3) {
            System.out.println("ligado");
            contador++;
        }


        // do while - semelhante ao while, porem primeiro e executado o codigo dentro do "do" e incrementado um valor ao contador 
        // e depois o while confere se o contador obedece a condicao, se obedecer, o "do" se repete, caso nao, o do while nao e mais executado 

        contador = 0;

        do {
            System.out.println("ligado");
            contador++;
        } while (contador < 3);


        // for - (valor inicial de uma variavel ; condicao ; incremento)
        // enquanto uma variavel com valor inicial obedecer uma condicao, um valor e incrementado a ela
        // o codigo dentro do for e executado ate a condicao for false

        for (int i = 0; i < 3; i++) {
            System.out.println("ligado");
        }


        // foreach - recomendado para ler array - le todos os valores da posicao 0 ate a ulltima do array nessa ordem
        // for (tipoDasVariaveisDoArray nomeVariavel : array)
        // foreach e executado x vezes - x = tamanho do array

        for (Double nota : notas) {
            System.out.println(nota);
        }
    }
}

