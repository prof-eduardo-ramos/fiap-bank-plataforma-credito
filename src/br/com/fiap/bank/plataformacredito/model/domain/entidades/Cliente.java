package br.com.fiap.bank.plataformacredito.model.domain.entidades;

import br.com.fiap.bank.plataformacredito.model.domain.exception.ContaInvalidaException;
import br.com.fiap.bank.plataformacredito.model.domain.exception.DocumentoInvalidoException;
import br.com.fiap.bank.plataformacredito.model.domain.valueobjects.Documento;

public abstract class Cliente extends BaseEntity {
    protected final Conta conta;
    protected final Documento documento;
    protected AvaliacaoRisco avaliacaoRisco;

    public Cliente(Documento documento, Conta conta) {
        super();
        if (documento == null) {
            throw new DocumentoInvalidoException("Documento não pode ser nulo");
        }

        if (conta == null) {
            throw new ContaInvalidaException("Conta não pode ser nula");
        }

        this.conta = conta;
        this.documento = documento;
    }

    // Getters
    public Conta getConta() {
        return conta;
    }

    public AvaliacaoRisco getAvaliacaoRisco() {
        return avaliacaoRisco;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void atribuirAvaliacaoRisco(Integer scoreCredito, String nivelEndividamentoSCR,
            Boolean possuiHistoricoInadimplencia) {
        this.avaliacaoRisco = new AvaliacaoRisco(scoreCredito, nivelEndividamentoSCR, possuiHistoricoInadimplencia);
    }

}
