package LojaDeCarros.Tables;

import java.time.LocalDateTime;

public class TesteDrive {
    private int id;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private Cliente cliente;
    private Funcionario funcionario;
    private Unidade unidade;

    public TesteDrive(int id, Cliente cliente, Funcionario funcionario, Unidade unidade) {
        Verificacoes.verificarParametroNull(id, cliente, funcionario, unidade);
        this.id = id;
        inicio = LocalDateTime.now();
        this.cliente = cliente;
        verificarFuncionarioEUnidade();
        this.funcionario = funcionario;
        this.unidade = unidade;
    }

    public TesteDrive(Cliente cliente, Funcionario funcionario, Unidade unidade) {
        Verificacoes.verificarParametroNull(id, cliente, funcionario, unidade);
        inicio = LocalDateTime.now();
        this.cliente = cliente;
        verificarFuncionarioEUnidade();
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

    public void marcarFimTesteDrive(){
        fim = LocalDateTime.now();
    }

    private void verificarFuncionarioEUnidade(){
        if (funcionario.getDisponivel() == false || unidade.getDisponibilidade() == false) {
            throw new RuntimeException("O funcionário ou a unidade não estão disponíveis no momento, talvez tenha ocorrido um erro de digitação.");
        }
    }
}
