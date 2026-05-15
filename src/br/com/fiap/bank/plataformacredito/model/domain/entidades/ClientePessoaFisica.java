package br.com.fiap.bank.plataformacredito.model.domain.entidades;

import java.time.LocalDate;

import br.com.fiap.bank.plataformacredito.model.domain.valueobjects.Documento;

public final class ClientePessoaFisica extends Cliente {
    private final String nome;
    private final LocalDate dataNascimento;

    public ClientePessoaFisica(String nome, LocalDate dataNascimento, Documento documento, Conta conta) {
        super(documento, conta);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
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

}
