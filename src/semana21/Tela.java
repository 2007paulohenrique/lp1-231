package semana21;

import java.util.ArrayList;

public class Tela{
    private ArrayList<FiguraGeometrica> figuras;

    public Tela(){
        figuras=new ArrayList<>();
    }

    public void addFiguras(FiguraGeometrica figura){
        figuras.add(figura);
    }

    public int nFiguras(){
        return figuras.size();
    }

    public double areaTotal(){
        double total=0;

        for (FiguraGeometrica figura : figuras) {
            total+=figura.calcularArea();
        }

        return total;
    }

    public double perimetroTotal(){
        double total=0;

        for (FiguraGeometrica figura : figuras) {
            total+=figura.calcularPerimetro();
        }

        return total;
    }
}