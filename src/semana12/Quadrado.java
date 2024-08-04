package semana12;

public class Quadrado {
    public double lado;

    public double calcularPerimetro() {
        return lado*4;
    }

    public double calcularArea() {
        return lado*lado;
    }

    // metodo construtor - public Classe(parametros)

    // parametros - ao criar um objeto da classe, o parametro tem que ser passado
    // sempre algo que e preciso ou fundamental para esse objeto
    // parametro - um atributo da classe
 
    public Quadrado(double lado){
        // this - indica um atributo da classe e objeto que sera criado
        this.lado = lado;
    }
}
