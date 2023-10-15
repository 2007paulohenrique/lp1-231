package LojaDeCarros.Tables;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class RegistroPonto {
    private int id;
    private Funcionario funcionario;
    private LocalDate dia;
    private LocalTime entrada;
    private LocalTime saida;

    public RegistroPonto(int id, Funcionario funcionario) {
        this.id = id;
        this.funcionario = funcionario;
        dia = LocalDate.now();
        entrada = LocalTime.now();
    }

    public RegistroPonto(Funcionario funcionario) {
        this.funcionario = funcionario;
        dia = LocalDate.now();
        entrada = LocalTime.now();
    }

    public int getId() {
        return id;
    }

    public LocalTime getEntrada() {
        return entrada;
    }

    public LocalTime getSaida() {
        return saida;
    }

    public void baterPontoSaida(){
        if (saida != null) {
            throw new RuntimeException("O funcionário já bateu ponto");
        }
        saida = LocalTime.now();
    }

    //TODO - calcular as horas extras e atrasadas para enviar aos atributos na classe funcionario
    public double calcularHorasExtrasOuAtrasadas(){
        LocalTime entradaTurno = funcionario.getTurno().getInicio();
        LocalTime saidaTurno = funcionario.getTurno().getFim();
        short horasDeDiferenca;

        if (Math.abs(ChronoUnit.MINUTES.between(entrada, entradaTurno)) > 10 ) {
            if (ChronoUnit.MINUTES.between(entradaTurno, entrada) > 10) {
                
            }

            if (ChronoUnit.MINUTES.between(entrada, entradaTurno) > 10) {
                funcionario.adicionarHoras_extras();
                
            }
        }


    }

    public double adicionarHoras_atrasadasrHorasAtrasadass(){
        
    }
}
