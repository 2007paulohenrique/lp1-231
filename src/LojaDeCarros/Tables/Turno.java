package LojaDeCarros.Tables;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Turno {
    private int id;
    private LocalTime inicio;
    private LocalTime fim;
    private short duracaoMinutos;

    public Turno(int id, LocalTime inicio, LocalTime fim) {
        this.id = id;
        verificarInicioFim(inicio, fim);
        duracaoMinutos = calcularDuracaoMinutos(inicio, fim);
    }

    public Turno(LocalTime inicio, LocalTime fim) {
        verificarInicioFim(inicio, fim);
        duracaoMinutos = calcularDuracaoMinutos(inicio, fim);
    }

    public int getId() {
        return id;
    }

    public LocalTime getInicio() {
        return inicio;
    }

    public short getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public LocalTime getFim() {
        return fim;
    }

    private void verificarInicioFim(LocalTime inicio, LocalTime fim){
        if (calcularDuracaoMinutos(inicio, fim) > 10 || calcularDuracaoMinutos(inicio, fim) < 5) {
            throw new RuntimeException("A duração de um turno tem que estar entre 5 e 10 horas.");
        }
    }

    private short calcularDuracaoMinutos(LocalTime inicio, LocalTime fim){
        if (fim.isBefore(inicio)) 
            return (short) (24 - ChronoUnit.MINUTES.between(fim, inicio)); 
            
            return (short) (ChronoUnit.MINUTES.between(inicio, fim)); 
    }
}
