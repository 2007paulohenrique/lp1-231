package semana14;

public class Quadrado {
    private double lado;

    public double calcularPerimetro() {
        return lado*4;
    }

    public double calcularArea() {
        return lado*lado;
    }

    public Quadrado(double lado){
        setLado(lado);
    
    }

    // private atributo - o valor do atributo não pode ser visualizado nem modificado

    // métodos get e set

    // get - devolve um valor de um atributo privado 
    // get - public tipoAtributo getAtributo(){ return atributo privado }

    public double getLado(){
        return lado;

    }
    
    // set - altera o valor de um atributo privado de um objeto ja criado 
    // set - necessario somente se o atributo tiver que ser modificado em algum possivel momento
    // set = public void setAtributo(Tipo atributo){this.atributo = atributo}
    // set privado - se usa quando há um atributo que tenha que ser imutavel apos criar um objeto
    // ou quando ha uma logica de validacao que seja usada somente dentro da classe
    // nao se pode alterar o valor de um atributo privado de um objeto ja criado sem o metodo set

    public void setLado(double lado){
        if (lado <= 0) {
            throw new RuntimeException("lado invalido");
        }

        this.lado = lado;
    }
}
