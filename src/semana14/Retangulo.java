package semana14;

public class Retangulo {
    private double lado1, lado2;

    public Retangulo(double lado1, double lado2){
        setLado1(lado1);
        setLado2(lado2);
    }

    public double getLado1(){
        return lado1;
    }

    public double getLado2(){
        return lado2;
    }

    public void setLado1(double lado1){
        if(lado1 <= 0){
            throw new RuntimeException("lado invalido");
        }

        this.lado1=lado1;
    }

    public void setLado2(double lado2){
        if(lado2 <= 0){
            throw new RuntimeException("lado invalido");
        }
        
        this.lado2=lado2;
    }

    public double calcularPerimetro(){
        return (lado1*2) + (lado2*2);
    }

    public double calcularArea(){
        return lado1*lado2;
    }

}
