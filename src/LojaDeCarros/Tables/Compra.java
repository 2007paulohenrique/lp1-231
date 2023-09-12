package LojaDeCarros.Tables;

import java.util.Date;
import java.util.List;

public class Compra {
    private int id;
    private Funcionario funcionario;
    private Cliente cliente;
    private List<Unidade> unidades;
    private Date dia_horario;

    public Compra(int id, Funcionario funcionario, Cliente cliente, Date dia_horario) {
        this.id = id;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.dia_horario = dia_horario;
        funcionario.addCompra(this);
        cliente.addVenda(this);
        for (Unidade unidade : unidades) {
            unidade.addCompra(this);
        }
    }

    public void addUnidade(Unidade unidade){
        unidades.add(unidade);
    }

    public int getId() {
        return id;
    }

    public Date getDia_horario() {
        return dia_horario;
    }
}
