package semana21;

// implements - implementacao de interface

public class Quadrado implements FiguraGeometrica{
    private double lado;

    public Quadrado(double lado){
        this.lado=lado;
    }

    // @Override - usado para sobrescrever metodo da interface implementada 
    @Override
    public double calcularArea(){
        return lado*lado;
    }

    @Override
    public double calcularPerimetro(){
        return 4*lado;
    }
}