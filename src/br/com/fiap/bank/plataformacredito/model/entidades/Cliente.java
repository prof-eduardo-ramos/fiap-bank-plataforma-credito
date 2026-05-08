package br.com.fiap.bank.plataformacredito.model.entidades;

import java.util.UUID;

import br.com.fiap.bank.plataformacredito.model.valueobjects.AvaliacaoRisco;

public class Cliente {
    private final UUID id;
    private final Conta conta;
    private AvaliacaoRisco avaliacaoRisco;

    public Cliente(Conta conta) {
        this.id = UUID.randomUUID();
        this.conta = conta;
    }

    // Getters
    public UUID getId() {
        return id;
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
