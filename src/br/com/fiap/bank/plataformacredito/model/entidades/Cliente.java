package br.com.fiap.bank.plataformacredito.model.entidades;

import br.com.fiap.bank.plataformacredito.model.valueobjects.AvaliacaoRisco;

public abstract class Cliente extends BaseEntity {

    protected final Conta conta;
    protected AvaliacaoRisco avaliacaoRisco;

    public Cliente(Conta conta) {
        super();
        this.conta = conta;
    }

    public Conta getConta() {
        return conta;
    }

    public AvaliacaoRisco getAvaliacaoRisco() {
        return avaliacaoRisco;
    }

    public void atribuirAvaliacaoRisco(Integer scoreCredito, String nivelEndividamentoSCR,
            Boolean possuiHistoricoInadimplencia) {
        this.avaliacaoRisco = new AvaliacaoRisco(scoreCredito, nivelEndividamentoSCR, possuiHistoricoInadimplencia);
    }

}
