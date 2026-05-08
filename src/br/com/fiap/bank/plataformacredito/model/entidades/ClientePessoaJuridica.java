package br.com.fiap.bank.plataformacredito.model.entidades;

import java.time.LocalDate;

import br.com.fiap.bank.plataformacredito.model.valueobjects.CNPJ;

public class ClientePessoaJuridica extends Cliente {
    private final String nomeFantasia;
    private final String razaoSocial;
    private final LocalDate dataConstituicao;
    private final CNPJ cnpj;

    public ClientePessoaJuridica(String nomeFantasia, String razaoSocial, LocalDate dataConstituicao, CNPJ cnpj,
            Conta conta) {
        super(conta);
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.dataConstituicao = dataConstituicao;
        this.cnpj = cnpj;
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

    public CNPJ getCnpj() {
        return cnpj;
    }
}
