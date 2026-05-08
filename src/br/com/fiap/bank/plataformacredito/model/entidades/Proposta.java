package br.com.fiap.bank.plataformacredito.model.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Proposta {

    public static final String STATUS_PENDENTE = "PENDENTE";
    public static final String STATUS_APROVADA = "APROVADA";
    public static final String STATUS_REJEITADA = "REJEITADA";
    public static final String STATUS_CANCELADA = "CANCELADA";

    private final static Integer DIAS_VALIDADE_PADRAO_PROPOSTA = 7;

    private final UUID id;
    private final Cliente cliente;

    private String codigo;
    private String status;
    private BigDecimal valorSolicitado;
    private Integer quantidadeParcelas;
    private LocalDate dataCriacao;
    private LocalDate dataValidade;
    private String motivoRejeicao;

    public Proposta(String codigo, BigDecimal valorSolicitado, Integer quantidadeParcelas, Cliente cliente) {
        this.id = UUID.randomUUID();
        this.codigo = codigo;
        this.valorSolicitado = valorSolicitado;
        this.quantidadeParcelas = quantidadeParcelas;
        this.cliente = cliente;
        this.dataCriacao = LocalDate.now();
        this.dataValidade = this.dataCriacao.plusDays(DIAS_VALIDADE_PADRAO_PROPOSTA);
        this.status = "PENDENTE";
    }

    public UUID getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getStatus() {
        return status;
    }

    public BigDecimal getValorSolicitado() {
        return valorSolicitado;
    }

    public Integer getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public String getMotivoRejeicao() {
        return motivoRejeicao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void aprovar() {
        this.status = STATUS_APROVADA;
    }

    public void rejeitar(String motivo) {
        this.status = STATUS_REJEITADA;
        this.motivoRejeicao = motivo;
    }

    public void cancelar() {
        this.status = STATUS_CANCELADA;
    }

}
