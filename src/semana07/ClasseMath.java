package semana07;

public class ClasseMath {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        double n3 = 10.6;
        double n4 = -10.2;

        // Classe Math - operacoes matematicas

        // abs - valor absoluto

        Math.abs(n4);

        // max e min - maior valor e menor valor

        Math.max(n1, n2);
        Math.min(n1, n2);

        // arredondamento

        Math.ceil(n3); // arredonda para numero acima
        Math.floor(n3); // arredonda para numero abaixo
        Math.round(n3); // arredonda para numero mais proximo

        // potencia e raiz quadrada

        Math.sqrt(4); // raiz quadrada
        Math.pow(2, 8); // primeiro numero = base, segundo = potencia

        double pi = Math.PI; // valor de pi
        System.out.println(pi);

        // random - valor aleatorio entre 0 e 1

        Math.random();
    }   
}