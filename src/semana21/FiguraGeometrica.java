package semana21;

// interface - contrato que define um conjunto de metodos que uma classe deve implementar
// so pode conter metodos abstratos (sem implementacao/corpo) e constantes (variaveis static final)
// pode ser implementada por qualquer classe. uma classe pode implementar varias interfaces

public interface FiguraGeometrica{
    // metodo sem corpo ({})

    public double calcularArea();
    public double calcularPerimetro();
}