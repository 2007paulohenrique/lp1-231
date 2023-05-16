package semana12;

public class Quadrado {
    public double lado;

    public double calcularPerimetro() {
        return lado*4;
    }

    public double calcularArea() {
        return lado*lado;
    }

    //metodo construtor
    public Quadrado(double lado){
        this.lado=lado;
    }
}
