package br.com.fiap.bank.plataformacredito.model.entidades;

import br.com.fiap.bank.plataformacredito.model.valueobjects.AvaliacaoRisco;
import br.com.fiap.bank.plataformacredito.model.valueobjects.Documento;

public abstract class Cliente extends BaseEntity {

    protected final Conta conta;
    protected final Documento documento;

    protected AvaliacaoRisco avaliacaoRisco;

    public Cliente(Documento documento, Conta conta) {
        super();
        this.documento = documento;
        this.conta = conta;
    }

    public Conta getConta() {
        return conta;
    }

    public Documento getDocumento() {
        return documento;
    }

    public AvaliacaoRisco getAvaliacaoRisco() {
        return avaliacaoRisco;
    }

    public void atribuirAvaliacaoRisco(Integer scoreCredito, String nivelEndividamentoSCR,
            Boolean possuiHistoricoInadimplencia) {
        this.avaliacaoRisco = new AvaliacaoRisco(scoreCredito, nivelEndividamentoSCR, possuiHistoricoInadimplencia);
    }

}
