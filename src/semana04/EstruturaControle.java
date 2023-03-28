package semana04;

public class EstruturaControle {
    public static void main(String[] args) {
        
        int idade = 17;
        final int maioridade = 18; //final diz que é uma constante
        if (idade >= maioridade) {
            System.out.println("maior de idade");
        }

        //se o objeto for boolean, no if n precisa de comparacao

        boolean ligado = true;
        if (ligado) {
            System.out.println("sensor ligado");
            
        } else {
            System.out.println("sensor desligado");
        }

        int x= 3;
        
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

        //while, do while, for, foreach

        int contador = 0;
        while (contador < 3) {
            System.out.println("ligado");
            contador++;
        }

        contador = 0;
        do {
            System.out.println("ligado");
            contador++;
        } while (contador < 3);

        for (int i = 0; i < 3; i++) {
            System.out.println("ligado");
        }

        //arrays, varios dados numa mesma variavel

        double n1 = 10.0;
        double n2 = 7.5;
        double n3 = 3.4;

        double[] notas = new double[3];
        notas[0] = n1;
        notas[1] = n2;
        notas[2] = n3;
        
        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[2]);

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        //foreach, recomendado, le todos os valores da posicao 0 ate a ulltima nessa ordem

        for (Double nota : notas) {
            System.out.println(nota);
        }

        

                }
            }

