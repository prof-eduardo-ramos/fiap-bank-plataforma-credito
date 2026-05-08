package br.com.fiap.bank.plataformacredito.model.entidades;

import java.time.LocalDate;

import br.com.fiap.bank.plataformacredito.model.valueobjects.Documento;

public final class ClientePessoaJuridica extends Cliente {
    private final String nomeFantasia;
    private final String razaoSocial;
    private final LocalDate dataConstituicao;

    public ClientePessoaJuridica(String nomeFantasia, String razaoSocial, LocalDate dataConstituicao,
            Documento documento,
            Conta conta) {
        super(documento, conta);
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.dataConstituicao = dataConstituicao;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public LocalDate getDataConstituicao() {
        return dataConstituicao;
    }

}
