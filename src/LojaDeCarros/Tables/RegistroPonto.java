package LojaDeCarros.Tables;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
    
public class RegistroPonto {
    private int id;
    private Funcionario funcionario;
    private LocalDateTime entrada;
    private LocalDateTime saida;

    LocalTime inicioTurno = funcionario.getTurno().getInicio();
    LocalTime fimTurno = funcionario.getTurno().getFim();
    LocalTime entradaHM = LocalTime.of(entrada.getHour(), entrada.getMinute());


    public RegistroPonto(int id, Funcionario funcionario) {
        Verificacoes.verificarParametroNull(id, funcionario);
        this.id = id;
        this.funcionario = funcionario;
        entrada = LocalDateTime.now();
        verificarEntrada();
        funcionario.setDisponivel();
    }

    public RegistroPonto(Funcionario funcionario) {
        Verificacoes.verificarParametroNull(id, funcionario);
        this.funcionario = funcionario;
        entrada = LocalDateTime.now();
        verificarEntrada();
        funcionario.setDisponivel();
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
        calcularHorasDeTrabalhoDeDiferenca();
        funcionario.setDisponivel();
    }

    private void calcularHorasDeTrabalhoDeDiferenca(){
        short minutosTrabalhadosDia = (short) ChronoUnit.MINUTES.between(entrada, saida);
        short duracaoTurno = funcionario.getTurno().getDuracaoMinutos();

        if (minutosTrabalhadosDia + 20 < duracaoTurno) {
            funcionario.ModificarHorasDeTrabalhoDeDiferenca((minutosTrabalhadosDia - duracaoTurno)/60);
            Advertencia advertencia = new Advertencia((byte) 2, funcionario, "trabalhou mais de 20 minutos a menos do que deveria.");
            funcionario.addAdvertencia(advertencia);
        }

        if (minutosTrabalhadosDia > duracaoTurno + 120) {
            funcionario.ModificarHorasDeTrabalhoDeDiferenca(2);
        } else if (minutosTrabalhadosDia > duracaoTurno + 20) {
            funcionario.ModificarHorasDeTrabalhoDeDiferenca((minutosTrabalhadosDia - duracaoTurno)/60);
        } else {
            funcionario.ModificarHorasDeTrabalhoDeDiferenca(0);
        }
    }

    private void verificarEntrada(){
        if (inicioTurno.isBefore(LocalTime.of(23, 50)) && !inicioTurno.isBefore(LocalTime.of(0, 10))) {
            if (!entradaHM.isAfter(inicioTurno.plusMinutes((60*23) + 50)) && !entradaHM.isBefore(inicioTurno.plusMinutes(10))) {
                Advertencia advertencia = new Advertencia((byte) 2, funcionario, "Chegou com mais de 10 minutos de diferença em relação ao inicio do turno.");
                funcionario.addAdvertencia(advertencia);
            }

        } else if (inicioTurno.isBefore(LocalTime.of(0, 10))) {
            if (!entradaHM.isBefore(inicioTurno.plusMinutes(10)) || !entradaHM.isAfter(inicioTurno.plusMinutes((60*23) + 50))) {
                Advertencia advertencia = new Advertencia((byte) 2, funcionario, "Chegou com mais de 10 minutos de diferença em relação ao inicio do turno.");
                funcionario.addAdvertencia(advertencia);
            }

        } else {
            if (!entradaHM.isAfter(inicioTurno.plusMinutes((60*23) + 50)) || !entradaHM.isBefore(inicioTurno.plusMinutes(10))) {
                Advertencia advertencia = new Advertencia((byte) 2, funcionario, "Chegou com mais de 10 minutos de diferença em relação ao inicio do turno.");
                funcionario.addAdvertencia(advertencia);
            }
        }
    }
}
