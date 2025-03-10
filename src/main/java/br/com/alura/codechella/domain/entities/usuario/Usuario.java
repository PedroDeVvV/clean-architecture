package br.com.alura.codechella.domain;

import java.time.LocalDate;

public class Usuario {
    private String cpf;
    private String nome;
    private LocalDate nascimento;
    private String email;

    // código omitido

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

// código omitido

}

