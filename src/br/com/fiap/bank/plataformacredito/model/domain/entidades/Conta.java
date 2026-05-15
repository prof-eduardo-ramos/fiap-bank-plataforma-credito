package br.com.fiap.bank.plataformacredito.model.domain.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.fiap.bank.plataformacredito.model.domain.exception.ContaInvalidaException;

public class Conta extends BaseEntity {

    private final String agencia;
    private final String numero;
    private final String digito;
    private final LocalDate dataAbertura;
    private final TipoContaEnum tipoConta;

    private BigDecimal saldo;

    public Conta(String agencia, String numero, String digito, LocalDate dataAbertura, TipoContaEnum tipoConta) {
        super();

        if (agencia == null || numero == null || digito == null || dataAbertura == null) {
            throw new ContaInvalidaException("Agência, número, dígito e data de abertura não podem ser nulos");
        }

        this.agencia = agencia;
        this.numero = numero;
        this.digito = digito;
        this.dataAbertura = dataAbertura;
        this.tipoConta = tipoConta;
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

    public TipoContaEnum getTipoConta() {
        return tipoConta;
    }
}
