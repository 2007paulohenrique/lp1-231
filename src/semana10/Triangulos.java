package semana10;

public class Triangulos {
    public double[] lado = new double[3];
    public double radiangulo_entre_ladomaiorebase_escaleno;

    public String classificarTriangulo(){
        if (lado[0] == lado[1] && lado[1] == lado[2]) {
            return "equilatero";

        } else if (lado[0] == lado[1] && lado[0] != lado[2] || lado[0] == lado[2] && lado[0] != lado[1] || lado[1] == lado[2] && lado[1] != lado[0]) {
            return "isosceles";

        } else {
            return "escaleno";

        }
    }

    public double definirBase(){
        double base;

        if (classificarTriangulo() == "equilatero") {
            base = lado[0];
            
        } else if (classificarTriangulo() == "isosceles") {
            if (lado[0] == lado[1]) {
                base = lado[2];

            } else if (lado[0] == lado[2]) {
                base = lado[1];

            } else {
                base = lado[0];

            }

        } else {
            base = lado[0];

            for (int i = 1; i < lado.length; i++) {
                if (lado[i] > base) {
                    base = lado[i];

                }
            }
        }

        return base;
    }

    public double calcularAltura(){
        if (classificarTriangulo() == "equilatero") {
            return (Math.sqrt(3)*definirBase())/2;

        } else if (classificarTriangulo() == "isosceles") {
            if (lado[0] == definirBase()) {
                return Math.sqrt((lado[1]*lado[1]) - ((lado[0]*lado[0])/4));

            } else if (lado[1] == definirBase()) {
                return Math.sqrt((lado[0]*lado[0]) - ((lado[1]*lado[1])/4));

            } else {
                return Math.sqrt((lado[0]*lado[0]) - ((lado[2]*lado[2])/4));

            }

        } else {
            if (lado[0] == definirBase()) {
                if (lado[1] > lado[2]) {
                    return Math.sin(radiangulo_entre_ladomaiorebase_escaleno)*lado[1];

                } else {
                    return Math.sin(radiangulo_entre_ladomaiorebase_escaleno)*lado[2];

                }
                
            } else if (lado[1] == definirBase()) {
                if (lado[0] > lado[2]) {
                    return Math.sin(radiangulo_entre_ladomaiorebase_escaleno)*lado[0];

                } else {
                    return Math.sin(radiangulo_entre_ladomaiorebase_escaleno)*lado[2];

                }
                
            } else {
                if (lado[0] > lado[1]) {
                    return Math.sin(radiangulo_entre_ladomaiorebase_escaleno)*lado[0];

                } else {
                    return Math.sin(radiangulo_entre_ladomaiorebase_escaleno)*lado[1];

                }
                
            }
        }
    }

    public double calcularArea(){
        return (calcularAltura()*definirBase())/2;

    }

    public double calcularPerimetro(){
        return lado[0]+lado[1]+lado[2];

    }

}
