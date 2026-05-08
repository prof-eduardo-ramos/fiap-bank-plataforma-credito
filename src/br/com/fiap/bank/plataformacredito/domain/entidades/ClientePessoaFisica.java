package br.com.fiap.bank.plataformacredito.domain.entidades;

import java.time.LocalDate;

import br.com.fiap.bank.plataformacredito.domain.valueobjects.AvaliacaoRisco;
import br.com.fiap.bank.plataformacredito.domain.valueobjects.CPF;

public final class ClientePessoaFisica extends Cliente {
    private final String nome;
    private final LocalDate dataNascimento;
    private final CPF cpf;

    public ClientePessoaFisica(String nome, LocalDate dataNascimento, CPF cpf, Conta conta) {
        super(conta);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    @Override
    public AvaliacaoRisco getAvaliacaoRisco() {
        return super.getAvaliacaoRisco();
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public CPF getCpf() {
        return cpf;
    }

}
