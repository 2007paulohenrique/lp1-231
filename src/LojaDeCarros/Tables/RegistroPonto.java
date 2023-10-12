package LojaDeCarros.Tables;

import java.time.LocalDateTime;

public class RegistroPonto {
    private int id;
    private Funcionario funcionario;
    private LocalDateTime entrada;
    private LocalDateTime saida;

    public RegistroPonto(int id, Funcionario funcionario) {
        this.id = id;
        this.funcionario = funcionario;
        entrada = LocalDateTime.now();
    }

    public RegistroPonto(Funcionario funcionario) {
        this.funcionario = funcionario;
        entrada = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public void baterPontoSaida(){
        if (saida != null) {
            throw new RuntimeException("O funcionário já bateu ponto");
        }
        saida = LocalDateTime.now();
    }

    //TODO - calcular as horas extras e atrasadas para enviar aos atributos na classe funcionario
    public double calcularHorasExtras(){

    }

    public double calcularHorasAtrasadass(){
        
    }
}
