package semana11.exercicios;

public class Pessoa {
    public double peso, altura;

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
