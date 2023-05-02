package semana10;

//classe representa um conceito que deve ser implementado no programa
public class Retangulo {
    
    //atributos = dados
    public double base;
    public double altura;

    //metodos, nao precisa de static e nem de parametros
    public double calcularArea(){
        return base*altura;
    }

    public double calcularPerimetro(){
        return 2*(base+altura);
    }
}

