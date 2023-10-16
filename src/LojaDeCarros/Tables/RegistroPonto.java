package LojaDeCarros.Tables;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.temporal.ChronoUnit;
    
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
    public double calcularHorasExtrasOuAtrasadasDia(){
        short minutosTrabalhadosDia = (short) ChronoUnit.MINUTES.between(entrada, saida);
        LocalTime inicioTurno = funcionario.getTurno().getInicio();
        LocalTime fimTurno = funcionario.getTurno().getFim();
        short duracaoTurno = funcionario.getTurno().getDuracaoMinutos();
        LocalTime entradaHM = LocalTime.of(entrada.getHour(), entrada.getMinute());

        if (minutosTrabalhadosDia+20 < duracaoTurno) {
            Advertencia advertencia = new Advertencia((byte) 1, funcionario, "trabalhou mais de 20 minutos a menos do que deveria.");
        }

        if (!inicioTurno.isBefore(LocalTime.of(2, 0))) {
            if (entradaHM.isBefore(inicioTurno.plusHours(22))) {
                Advertencia advertencia = new Advertencia((byte) 2, funcionario, "Chegou num horário de mais de 2 horas antes do inicio do seu turno.");
            
            }
        } else {
            if (entradaHM.isBefore(inicioTurno.plusMinutes(2)) || entradaHM.isAfter(inicioTurno)) {
                Advertencia advertencia = new Advertencia((byte) 2, funcionario, "Chegou num horário de mais de 2 horas antes do inicio do seu turno.");
            
            }
        }
        

        if (minutosTrabalhadosDia > duracaoTurno+120) {

            Advertencia advertencia = new Advertencia((byte) 1, funcionario, "Trabalhou mais que 2 horas além do que devia.");
        }
        

        if (ChronoUnit.HOURS.between(entrada, saida) > 12) {

        }

        long minutosDiferenca;

        if (inicioTurno.isAfter(LocalTime.of(2, 0))) {
            if (entrada) {
                
            }
            minutosDiferenca = ChronoUnit.MINUTES.between(entrada, funcionario.getTurno().getInicio());
        }
    }

    public double adicionarHoras_atrasadasrHorasAtrasadass(){
        
    }

    public void confirmarHorasExtras(boolean confirmacao)
} 
