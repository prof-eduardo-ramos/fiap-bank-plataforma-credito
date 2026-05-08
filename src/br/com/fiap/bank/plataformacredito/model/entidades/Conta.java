package br.com.fiap.bank.plataformacredito.model.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Conta extends BaseEntity {
    private final String agencia;
    private final String numero;
    private final String digito;
    private final LocalDate dataAbertura;

    private BigDecimal saldo;

    public Conta(String agencia, String numero, String digito, LocalDate dataAbertura) {
        super();
        this.agencia = agencia;
        this.numero = numero;
        this.digito = digito;
        this.dataAbertura = dataAbertura;
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

    public BigDecimal getSaldo() {
        return saldo;
    }
}
