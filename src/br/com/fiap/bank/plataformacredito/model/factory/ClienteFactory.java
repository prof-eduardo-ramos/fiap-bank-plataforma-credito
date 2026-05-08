package br.com.fiap.bank.plataformacredito.model.factory;

import java.time.LocalDate;

import br.com.fiap.bank.plataformacredito.model.entidades.Cliente;
import br.com.fiap.bank.plataformacredito.model.entidades.ClientePessoaFisica;
import br.com.fiap.bank.plataformacredito.model.entidades.ClientePessoaJuridica;
import br.com.fiap.bank.plataformacredito.model.entidades.Conta;
import br.com.fiap.bank.plataformacredito.model.valueobjects.CNPJ;
import br.com.fiap.bank.plataformacredito.model.valueobjects.CPF;

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

}
