package LojaDeCarros.Tables;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public abstract class Pessoa {
    protected int id;
    protected String nome;
    protected String email;
    protected String contato;
    protected String cpf;
    protected LocalDate data_nascimento;
    protected String endereco;
    protected String complemento;
    protected LocalDate data_registro;

    public Pessoa(int id, String nome, String email, String contato, String cpf, LocalDate data_nascimento, String endereco) {
        this.id = id;
        setNome(nome);
        setEmail(email);
        setContato(contato);
        setCPF(cpf);
        setdata_nascimento(data_nascimento);
        this.endereco = endereco;
        data_registro = LocalDate.now();
    }

    public Pessoa(String nome, String email, String contato, String cpf, LocalDate data_nascimento, String endereco) {
        setNome(nome);
        setEmail(email);
        setContato(contato);
        setCPF(cpf);
        setdata_nascimento(data_nascimento);
        this.endereco = endereco;
        data_registro = LocalDate.now();
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

    public String getContato() {
        return contato;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        String[] palavras = nome.split(" ");

        if (palavras.length < 2) {
            throw new RuntimeException("Um nome completo deve possuir nome e no mínimo um sobrenome");
        }

        StringBuilder nomeFormatado = new StringBuilder();

        for (String palavra : palavras) {
            if (!palavra.matches("[a-zA-Z]+")) {
                throw new RuntimeException("Um nome deve possuir apenas letras.");
            }

            if (!palavra.isEmpty()) {
                palavra = palavra.substring(0, 1).toUpperCase() + palavra.substring(1).toLowerCase();
                nomeFormatado.append(palavra).append(" ");
            }
        }
        nome = nomeFormatado.toString().replaceAll("\\s+", " ").trim();
        this.nome = nome;
    }

    public void setEmail(String email) {
        if (!email.matches("^[a-zA-Z0-9_+&*-]+(?:\\\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,7}$")) {
            throw new RuntimeException("O email não está num formato adequado.");
        }
        this.email = email;
    }

    public void setContato(String contato) {
        if (!contato.matches("^\\d{2}9\\d{7}$")) {
            throw new RuntimeException("O número de contato deve possuir o DDD e em seguida o número de contato, sem espaços.");
        }
        contato = contato.substring(0, 2) + " " + contato.substring(2, 7) + "-" + contato.substring(7);
        this.contato = contato;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    private void setCPF(String cpf){
        if (!cpf.matches("^\\d{11}$")) {
            throw new RuntimeException("O cpf não deve ser inserido com \".\" ou \"-\". ");
        }
        cpf = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9);
    }

    private void setdata_nascimento(LocalDate data_nascimento){
        if (Period.between(data_nascimento, LocalDate.now()).getYears() < 18) {
            throw new RuntimeException("Somente maiores de 18 anos podem se registrar.");
        }
        this.data_nascimento = data_nascimento;
    }
}
