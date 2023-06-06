package semana14;

public class Circulo {
    private double raio;

    public Circulo(double raio){
        setRaio(raio);
    }

    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio){
        if (raio <= 0) {
            throw new RuntimeException("raio invalido");
        }
        this.raio=raio;
    }

    public double calcularPerimetro(){
        return 2*raio*Math.PI;
    }

    public double calcularArea(){
        return Math.PI*(raio*raio);
    }
}
