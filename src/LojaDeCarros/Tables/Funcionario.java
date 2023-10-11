package LojaDeCarros.Tables;

import java.time.LocalDate;
import java.util.List;

public class Funcionario extends Pessoa{
    private double salario_fixo;
    private double comissao;
    private double horas_extras;
    private double horas_atrasadas;
    private Cargo cargo;
    private Turno turno;
    private Escala escala;
    private List<Advertencia> advertencias;
    private List<Compra> compras;
    private List<Venda> vendas;

    public Funcionario(int id, String nome, String email, String contato, String cpf, LocalDate data_nascimento, String endereco, double salario_fixo, Cargo cargo, Turno turno, Escala escala){
        super(id, nome, email, contato, cpf, data_nascimento, endereco);
        setSalario_fixo(salario_fixo);
        setCargo(cargo);
        setTurno(turno);
        setEscala(escala);
        setComissao(0);
        setHoras_extras(0);
        setHoras_atrasadas(0);
        cargo.addFuncionario(this);
    }

    public Funcionario(String nome, String email, String contato, String cpf, LocalDate data_nascimento, String endereco, double salario_fixo, Cargo cargo, Turno turno, Escala escala){
        super(nome, email, contato, cpf, data_nascimento, endereco);
        setSalario_fixo(salario_fixo);
        setCargo(cargo);
        setTurno(turno);
        setEscala(escala);
        setComissao(0);
        setHoras_extras(0);
        setHoras_atrasadas(0);
        cargo.addFuncionario(this);
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

    //TODO - horas extras e atrasdas resetadas a cada mes
    public void setHoras_extras(double horas_extras) {
        if (this.horas_extras > horas_extras) {
            throw new RuntimeException("As horas extras devem somente aumentar druante o mês.");
        }
        if (horas_extras < 0) {
            throw new RuntimeException("Somente valores positivos");
        }
        this.horas_extras = horas_extras;
    }

    public void setHoras_atrasadas(double horas_atrasadas) {
        if (this.horas_atrasadas > horas_atrasadas) {
            throw new RuntimeException("As horas atrasadas devem somente aumentar druante o mês.");
        }
        if (horas_atrasadas < 0) {
            throw new RuntimeException("Somente valores positivos");
        }
        this.horas_atrasadas = horas_atrasadas;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public void setEscala(Escala escala) {
        this.escala = escala;
    }
}
