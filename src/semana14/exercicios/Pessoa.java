package semana14.exercicios;

public class Pessoa {
    private double peso, altura;

    public double getPeso(){
        return peso;
    }

    public double getAltura(){
        return altura;
    }

     public Pessoa(double peso, double altura){
        this.peso=peso;
        this.altura=altura;
    }

    public void setPeso(double peso){
        if (peso <= 1.5 || peso >= 400) {
            throw new RuntimeException("o peso deve estar em quilogramas e entre 1.5 e 400kg");
        }

        this.peso = peso;
    }

    public void setAltura(double altura){
        if (altura < 0.25 || altura > 2.5) {
            throw new RuntimeException("a altura deve estar em metros e entre 0.24 e 2.51m");
        }
    }

    public double calcularIMC(){
        return peso / (altura * altura);
    }

    public String faixa(){
        if(calcularIMC() > 0 && calcularIMC() < 18.5){
            return "baixo peso";

        } else if (calcularIMC() >= 18.5 && calcularIMC() < 25){
            return "peso normal";

        } else if (calcularIMC() >= 25 && calcularIMC() < 30){
            return "excesso de peso";

        } else if (calcularIMC() >= 30 && calcularIMC() < 35){
            return "obesidade de classe 1";

        } else if (calcularIMC() >= 35 && calcularIMC() < 40){
            return "obesidade de classe 2";

        } else if (calcularIMC() >= 40){
            return "obesidade de classe 3";

        } else {
            return "ocorreu um erro. comece de novo";

        }

    } 
  
    public String situacao() {
        if(calcularIMC() > 24.9){
            return "perder peso";

        } else if(calcularIMC() < 18.5){
            return "ganhar peso";

        } else {
            return "peso ok";

        }
    }
}
