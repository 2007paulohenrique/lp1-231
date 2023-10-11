package LojaDeCarros.Tables;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Turno {
    private int id;
    private LocalTime inicio;
    private LocalTime fim;

    public Turno(int id, LocalTime inicio, LocalTime fim) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Turno(LocalTime inicio, LocalTime fim) {
        if (fim.isBefore(inicio)) {
            fim = fim.plus(1, ChronoUnit.DAYS);
        }
        if (ChronoUnit.HOURS.between(inicio, fim) > 10) {
            throw new RuntimeException("A duração de um turno não pode exceder 10 horas.");
        }
        this.inicio = inicio;
        this.fim = fim;
    }

    public int getId() {
        return id;
    }

    public LocalTime getInicio() {
        return inicio;
    }

    public LocalTime getFim() {
        return fim;
    }

    public void setInicio(LocalTime inicio) {
        this.inicio = inicio;
    }

    public void setFim(LocalTime fim) {
        this.fim = fim;
    }
}
