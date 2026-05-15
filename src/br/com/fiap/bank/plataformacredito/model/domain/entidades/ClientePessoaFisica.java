package br.com.fiap.bank.plataformacredito.model.domain.entidades;

import java.time.LocalDate;

import br.com.fiap.bank.plataformacredito.model.domain.valueobjects.CPF;

public class ClientePessoaFisica extends Cliente {
    private final String nome;
    private final LocalDate dataNascimento;

    public ClientePessoaFisica(String nome, LocalDate dataNascimento, CPF cpf, Conta conta) {
        super(cpf, conta);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

}
