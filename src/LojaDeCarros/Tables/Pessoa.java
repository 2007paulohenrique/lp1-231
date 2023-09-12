package LojaDeCarros.Tables;

public abstract class Pessoa {
    protected int id;
    protected String nome;
    protected String email;
    protected int contato;
    protected int cpf;
    
    public Pessoa(int id, String nome, String email, int contato, int cpf) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.contato = contato;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getContato() {
        return contato;
    }

    public int getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }
}
