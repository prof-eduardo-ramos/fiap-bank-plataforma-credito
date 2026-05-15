package br.com.fiap.bank.plataformacredito.model.domain.entidades;

import static br.com.fiap.bank.plataformacredito.model.domain.entidades.StatusProposta.APROVADA;
import static br.com.fiap.bank.plataformacredito.model.domain.entidades.StatusProposta.CANCELADA;
import static br.com.fiap.bank.plataformacredito.model.domain.entidades.StatusProposta.PENDENTE;
import static br.com.fiap.bank.plataformacredito.model.domain.entidades.StatusProposta.REJEITADA;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.fiap.bank.plataformacredito.model.domain.exception.PropostaInvalidaException;

public class Proposta extends BaseEntity implements Analisavel {

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

        if (codigo == null || codigo.isEmpty()) {
            throw new PropostaInvalidaException("Código da proposta inválido");
        }

        if (valorSolicitado == null || valorSolicitado.compareTo(BigDecimal.ZERO) <= 0) {
            throw new PropostaInvalidaException("Valor solicitado inválido");
        }

        if (quantidadeParcelas == null || quantidadeParcelas <= 0) {
            throw new PropostaInvalidaException("Quantidade de parcelas inválida");
        }

        if (cliente == null) {
            throw new PropostaInvalidaException("Cliente inválido");
        }

        this.codigo = codigo;
        this.valorSolicitado = valorSolicitado;
        this.quantidadeParcelas = quantidadeParcelas;
        this.cliente = cliente;
        this.dataValidade = this.dataCriacao.plusDays(DIAS_VALIDADE_PADRAO_PROPOSTA);
        this.status = PENDENTE;
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

    @Override
    public void aprovar() {
        this.status = APROVADA;
    }

    @Override
    public void rejeitar(String motivo) {
        this.status = REJEITADA;
        this.motivoRejeicao = motivo;
    }

    @Override
    public void cancelar() {
        this.status = CANCELADA;
    }

}
