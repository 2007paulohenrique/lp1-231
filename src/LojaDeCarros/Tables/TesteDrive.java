package LojaDeCarros.Tables;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TesteDrive {
    private int id;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private Cliente cliente;
    private Funcionario funcionario;
    private Unidade unidade;

    public TesteDrive(int id, LocalDateTime inicio, LocalDateTime fim, Cliente cliente, Funcionario funcionario, Unidade unidade) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
        verificarInicioFim();
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.unidade = unidade;
    }

    public TesteDrive(LocalDateTime inicio, LocalDateTime fim, Cliente cliente, Funcionario funcionario, Unidade unidade) {
        this.inicio = inicio;
        this.fim = fim;
        verificarInicioFim();
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.unidade = unidade;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    private void verificarInicioFim(){
        if (inicio.isAfter(fim)) {
            throw new RuntimeException("O teste drive não pode ter começado depois de seu fim.");
        }
    }

    private void verificarFuncionario(){
        if (funcionario.) {
            
        }
    }
}
