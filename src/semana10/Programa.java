package semana10;


public class Programa {

    public static double calcularArea(double base, double altura) {
        return base*altura;
    }

    public static double calcularPerimetro(double base, double altura) {
        return 2*(base+altura);
    }
    public static void main(String[] args) {
        //calcular area e perimetro de retangulo

        double base1 = 10;
        double altura1 = 5;

        double area1 = base1*altura1;
        double perimetro1 = 2 * (base1 + altura1);

        System.out.println(area1);
        System.out.println(perimetro1);

        double base2 = 20;
        double altura2 = 5;

        System.out.println(calcularArea(base2, altura2));
        System.out.println(calcularPerimetro(base2, altura2));

        //tipo, nome , valor
        String nome = "abc";

        //objeto ou instancia da classe Retangulo
        Retangulo ret1 = new Retangulo();
        ret1.base = 10;
        ret1.altura = 5;

        Retangulo ret2 = new Retangulo();
        ret2.base = 20;
        ret2.altura = 10;

        System.out.println(ret1.calcularArea());
        System.out.println(ret1.calcularPerimetro());

        System.out.println(ret2.calcularArea());
        System.out.println(ret2.calcularPerimetro());

        Quadrado qua1 = new Quadrado();
        qua1.lado = 10;

        System.out.println(qua1.calcularArea());
        System.out.println(qua1.calcularPerimetro());

        Circulo cir1 = new Circulo();
        cir1.raio = 5;

        System.out.println(cir1.calcularArea());
        System.out.println(cir1.calcularPerimetro());
    }
}
