package semana06;

// classe para métodos de calculo

public class Calculadora {
    public static double somar(double numero1, double numero2) {
        return numero1 + numero2;
        
    }    
    
    public static double subtrair(double numero1, double numero2) {
        return numero1 - numero2;

    }

    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;

    }

    public static double dividir(double numero1, double numero2) {
        return numero1/numero2;
    }

    public static void main(String[] args) {
        System.out.println(somar(10, 15));
        System.out.println(subtrair(10, 5));
        System.out.println(multiplicar(10, 15));
        System.out.println(dividir(10, 5));

    }
}
