package br.com.fiap.bank.plataformacredito.model.factory;

import java.time.LocalDate;

import br.com.fiap.bank.plataformacredito.model.entidades.Conta;
import br.com.fiap.bank.plataformacredito.model.valueobjects.TipoContaEnum;

public final class ContaFactory {

    public static Conta novaConta(String agencia, String numero, String digitoVerificador, LocalDate dataAbertura,
            TipoContaEnum tipoConta) {
        return new Conta(agencia, numero, digitoVerificador, dataAbertura, tipoConta);
    }

    public static Conta novaContaCorrente(String agencia, String numero, String digitoVerificador,
            LocalDate dataAbertura) {
        return new Conta(agencia, numero, digitoVerificador, dataAbertura, TipoContaEnum.CONTA_CORRENTE);
    }

    public static Conta novaContaPoupanca(String agencia, String numero, String digitoVerificador,
            LocalDate dataAbertura) {
        return new Conta(agencia, numero, digitoVerificador, dataAbertura, TipoContaEnum.CONTA_POUPANCA);
    }

    public static Conta novaContaInvestimento(String agencia, String numero, String digitoVerificador,
            LocalDate dataAbertura) {
        return new Conta(agencia, numero, digitoVerificador, dataAbertura, TipoContaEnum.CONTA_INVESTIMENTO);
    }

}
