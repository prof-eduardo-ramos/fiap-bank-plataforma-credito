package br.com.fiap.bank.plataformacredito.util;

import java.time.LocalDate;

import br.com.fiap.bank.plataformacredito.domain.entidades.Cliente;
import br.com.fiap.bank.plataformacredito.domain.entidades.ClientePessoaFisica;
import br.com.fiap.bank.plataformacredito.domain.entidades.ClientePessoaJuridica;
import br.com.fiap.bank.plataformacredito.domain.entidades.Conta;
import br.com.fiap.bank.plataformacredito.domain.valueobjects.CPF;
import br.com.fiap.bank.plataformacredito.domain.valueobjects.CNPJ;

public final class ClienteFactory {

    public static CPF novoCpf(String numero, Integer digitoVerificador) {
        return new CPF(numero, digitoVerificador);
    }

    public static CNPJ novoCnpj(String numero, Integer digitoVerificador) {
        return new CNPJ(numero, digitoVerificador);
    }

    public static Cliente novoClientePessoaFisica(String nome, LocalDate dataNascimento, CPF cpf, Conta conta) {
        return new ClientePessoaFisica(nome, dataNascimento, cpf, conta);
    }

    public static Cliente novoClientePessoaJuridica(String nomeFantasia, String razaoSocial,
            LocalDate dataConstituicao, CNPJ cnpj, Conta conta) {
        return new ClientePessoaJuridica(nomeFantasia, razaoSocial, dataConstituicao, cnpj, conta);
    }

    public static Conta novaConta(String agencia, String numero, String digitoVerificador, LocalDate dataAbertura) {
        return new Conta(agencia, numero, digitoVerificador, dataAbertura);
    }

}
