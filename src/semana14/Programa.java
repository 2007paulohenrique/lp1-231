package semana14;

public class Programa {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10);
        Retangulo retangulo = new Retangulo(5, 10);
        Circulo circulo = new Circulo(5);

        quadrado.setLado(20);

        retangulo.setLado1(10);
        retangulo.setLado2(20);

        circulo.setRaio(10);

        System.out.println(quadrado.getLado());
        System.out.println(quadrado.calcularArea());
        System.out.println(quadrado.calcularPerimetro());

        System.out.println(retangulo.getLado1());
        System.out.println(retangulo.getLado2());
        System.out.println(retangulo.calcularArea());
        System.out.println(retangulo.calcularPerimetro());

        System.out.println(circulo.getRaio());
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());

    }
}
