package br.com.fiap.bank.plataformacredito.model.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Proposta extends BaseEntity {

    private final static Integer DIAS_VALIDADE_PADRAO_PROPOSTA = 7;

    private final Cliente cliente;

    private String codigo;
    private StatusProposta status;
    private BigDecimal valorSolicitado;
    private Integer quantidadeParcelas;
    private LocalDate dataValidade;
    private String motivoRejeicao;

    public Proposta(String codigo, BigDecimal valorSolicitado, Integer quantidadeParcelas, Cliente cliente) {
        super();
        this.codigo = codigo;
        this.valorSolicitado = valorSolicitado;
        this.quantidadeParcelas = quantidadeParcelas;
        this.cliente = cliente;
        this.dataValidade = this.dataCriacao.plusDays(DIAS_VALIDADE_PADRAO_PROPOSTA);
        this.status = StatusProposta.PENDENTE;
    }

    public String getCodigo() {
        return codigo;
    }

    public StatusProposta getStatus() {
        return status;
    }

    public BigDecimal getValorSolicitado() {
        return valorSolicitado;
    }

    public Integer getQuantidadeParcelas() {
        return quantidadeParcelas;
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
        this.status = StatusProposta.APROVADA;
    }

    public void rejeitar(String motivo) {
        this.status = StatusProposta.REJEITADA;
        this.motivoRejeicao = motivo;
    }

    public void cancelar() {
        this.status = StatusProposta.CANCELADA;
    }

}
