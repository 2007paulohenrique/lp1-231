package LojaDeCarros.Tables;

import java.util.Date;
import java.util.List;

public class Venda {
    private int id;
    private Funcionario funcionario;
    private Cliente cliente;
    private List<Unidade> unidades;
    private Date dia_horario;
    private double desconto;
    private int parcelas;
    private int juros;
    
    public Venda(int id, Funcionario funcionario, Cliente cliente, Date dia_horario) {
        this.id = id;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.dia_horario = dia_horario;
        funcionario.addVenda(this);
        cliente.addCompra(this);
        for (Unidade unidade : unidades) {
            unidade.addVenda(this);
        }
    }

    public int getId() {
        return id;
    }

    public Date getDia_horario() {
        return dia_horario;
    }

    public double getDesconto() {
        return desconto;
    }

    public int getParcelas() {
        return parcelas;
    }

    public int getJuros() {
        return juros;
    }

    
}
