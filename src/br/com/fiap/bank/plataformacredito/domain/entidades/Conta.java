package br.com.fiap.bank.plataformacredito.domain.entidades;

import java.time.LocalDate;
import java.util.Currency;
import java.util.UUID;

import br.com.fiap.bank.plataformacredito.domain.valueobjects.TipoContaEnum;

public class Conta {
    private final UUID id;
    private final String agencia;
    private final String numero;
    private final String digito;
    private final LocalDate dataAbertura;
    private final TipoContaEnum tipoConta;

    private Currency saldo;

    public Conta(String agencia, String numero, String digito, LocalDate dataAbertura, TipoContaEnum tipoConta) {
        this.id = UUID.randomUUID();
        this.agencia = agencia;
        this.numero = numero;
        this.digito = digito;
        this.dataAbertura = dataAbertura;
        this.tipoConta = tipoConta;
    }

    // Getters
    public UUID getId() {
        return id;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public String getDigito() {
        return digito;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public Currency getSaldo() {
        return saldo;
    }

    public TipoContaEnum getTipoConta() {
        return tipoConta;
    }
}
