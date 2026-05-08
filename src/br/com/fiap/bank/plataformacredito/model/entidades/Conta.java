package br.com.fiap.bank.plataformacredito.model.entidades;

import java.time.LocalDate;
import java.util.Currency;
import java.util.UUID;

public class Conta {
    private final UUID id;
    private final String agencia;
    private final String numero;
    private final String digito;
    private final LocalDate dataAbertura;

    private Currency saldo;

    public Conta(String agencia, String numero, String digito, LocalDate dataAbertura) {
        this.id = UUID.randomUUID();
        this.agencia = agencia;
        this.numero = numero;
        this.digito = digito;
        this.dataAbertura = dataAbertura;
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
}
