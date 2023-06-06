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

    //private o valor do atributo não pode ser visualizado nem modificado
    //serve para testar o valor de um atributo, logo ele vai ser private
    /*metodos setter e getter 
    get devolve um valor de um atributo privado 
    get = public tipo atributo getNome do atributo(){ return atributo privado }
    *//*
    set altera o valor de um atributo privado de um objeto ja criado 
    se um requisito dizer que n se pode modificar esse atributo, n sera necessario set 
    set = public void setNome do atributo(tipo do atributo nome do atributo){this.atributo = atributo}
    *//*
    set privado se usa quando há dois construtores iguais e há uma validação igual neles e
    nao se pode alterar o valor de um atributo privado de um objeto ja criado
    */

    public double getLado(){
        return lado;

    }

    public void setLado(double lado){
        if (lado <= 0) {
            throw new RuntimeException("lado invalido");
        }

        this.lado = lado;
    }
}
