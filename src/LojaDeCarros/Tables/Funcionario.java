package LojaDeCarros.Tables;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Funcionario extends Pessoa{
    private double salario_fixo;
    private double pagamentoDoMes;
    private double comissao;
    private double horas_extras;
    private double horas_atrasadas;
    private short dia_pagamentoOriginal;
    private short dia_pagamento = dia_pagamentoOriginal;
    private Cargo cargo;
    private Turno turno;
    private Escala escala;
    private boolean disponivel;
    private List<Advertencia> advertencias;
    private List<Compra> compras;
    private List<Venda> vendas;

    public Funcionario(int id, String nome, String email, String contato, String cpf, LocalDate data_nascimento, String endereco, double salario_fixo, short dia_pagamento, Cargo cargo, Turno turno, Escala escala){
        super(id, nome, email, contato, cpf, data_nascimento, endereco);
        setSalario_fixo(salario_fixo);
        setDia_pagamentoOriginal(dia_pagamento);
        setCargo(cargo);
        setTurno(turno);
        setEscala(escala);
        setComissao(0);
        adicionarsetHoras_extras(0);
        adicionarHoras_atrasadas(0);
        
        cargo.addFuncionario(this);

        /*
        executa um metodo todo dia automaticamente, no caso o ajustarDia_pagamento para caso houver
        a necessidade de ajuste do dia do pagamento em e caso alguem mude o dia do pagamento original.
        */
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(this::ajustarDia_pagamento, 0, 1, TimeUnit.DAYS);

        ScheduledExecutorService scheduler2 = Executors.newScheduledThreadPool(1);
        scheduler2.scheduleAtFixedRate(this::terminarPeriodoDePagamento, 0, 1, TimeUnit.DAYS);
    }

    public Funcionario(String nome, String email, String contato, String cpf, LocalDate data_nascimento, String endereco, double salario_fixo, short dia_pagamento, Cargo cargo, Turno turno, Escala escala){
        super(nome, email, contato, cpf, data_nascimento, endereco);
        setSalario_fixo(salario_fixo);
        setDia_pagamentoOriginal(dia_pagamento);
        setCargo(cargo);
        setTurno(turno);
        setEscala(escala);
        setComissao(0);
        adicionarsetHoras_extras(0);
        adicionarHoras_atrasadas(0);
        cargo.addFuncionario(this);

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(this::ajustarDia_pagamento, 0, 1, TimeUnit.DAYS);

        ScheduledExecutorService scheduler2 = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(this::terminarPeriodoDePagamento, 0, 1, TimeUnit.DAYS);
    }

    public double calcularPagamento(){
        return salario_fixo + (20*(horas_extras-horas_atrasadas)) + comissao;
    }

    public void addAdvertencia(Advertencia Advertencia){
        advertencias.add(Advertencia);
    }

    public void addCompra(Compra compra){
        compras.add(compra);
    }

    public void addVenda(Venda venda){
        vendas.add(venda);
    }

    public double getSalario_fixo() {
        return salario_fixo;
    }

    public double getComissao() {
        return comissao;
    }

    public double getHoras_extras() {
        return horas_extras;
    }

    public double getHoras_atrasadas() {
        return horas_atrasadas;
    }

    public void setSalario_fixo(double salario_fixo) {
        if (salario_fixo < 1320) {
            throw new RuntimeException("Salário insuficiente.");
        }
        this.salario_fixo = salario_fixo;
    }

    public void setComissao(double comissao) {
        if (comissao < 0) {
            throw new RuntimeException("Somente valores positivos");
        }
        this.comissao = comissao;
    }

    public void adicionarsetHoras_extras(double horas_extras) {
        if (horas_extras < 0) {
            throw new RuntimeException("Somente valores positivos");
        }
        this.horas_extras += horas_extras;
    }

    public void adicionarHoras_atrasadas(double horas_atrasadas) {
        if (horas_atrasadas < 0) {
            throw new RuntimeException("Somente valores positivos");
        }
        this.horas_atrasadas += horas_atrasadas;
    }

    public void terminarPeriodoDePagamento(){
        if (LocalDate.now().getDayOfMonth() == dia_pagamento) {
        pagamentoDoMes = calcularPagamento();
        horas_atrasadas = 0;
        horas_extras = 0;
        comissao = 0;
        }
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public short getDia_pagamentoOriginal() {
        return dia_pagamentoOriginal;
    }

    public void setDia_pagamentoOriginal(short dia_pagamento) {
        if (dia_pagamento < 1 || dia_pagamento > 31) {
            throw new RuntimeException("Esse dia não existe no calendário.");
        }

        this.dia_pagamentoOriginal = dia_pagamento;
    }

    public void ajustarDia_pagamento(){
        if (dia_pagamentoOriginal == 31) {
            // ajusta o dia do pagamento para o ultimo dia do mes
            dia_pagamento = (short) LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();

        } else if (dia_pagamentoOriginal == 30 || dia_pagamentoOriginal == 29 && LocalDate.now().getMonthValue() == 2) {
            dia_pagamento = 28;

        } else {
            dia_pagamento = dia_pagamentoOriginal;
        
        }
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel() {
        if 
        disponivel = !disponivel;
    }

    public void setEscala(Escala escala) {
        this.escala = escala;
    }
}
