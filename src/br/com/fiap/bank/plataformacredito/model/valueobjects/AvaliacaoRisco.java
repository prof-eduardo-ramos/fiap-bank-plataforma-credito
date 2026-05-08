package br.com.fiap.bank.plataformacredito.model.valueobjects;

import java.util.Objects;

public class AvaliacaoRisco {
    private final Integer scoreCredito;
    private final String nivelEndividamentoSCR;
    private final Boolean possuiHistoricoInadimplencia;

    public AvaliacaoRisco(Integer scoreCredito, String nivelEndividamentoSCR, Boolean possuiHistoricoInadimplencia) {
        this.scoreCredito = scoreCredito;
        this.nivelEndividamentoSCR = nivelEndividamentoSCR;
        this.possuiHistoricoInadimplencia = possuiHistoricoInadimplencia;
    }

    public String getNivelEndividamentoSCR() {
        return nivelEndividamentoSCR;
    }

    public Integer getScoreCredito() {
        return scoreCredito;
    }

    public Boolean getPossuiHistoricoInadimplencia() {
        return possuiHistoricoInadimplencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || !(getClass().equals(o.getClass())))
            return false;
        AvaliacaoRisco that = (AvaliacaoRisco) o;
        return Objects.equals(scoreCredito, that.scoreCredito) &&
                Objects.equals(nivelEndividamentoSCR, that.nivelEndividamentoSCR) &&
                Objects.equals(possuiHistoricoInadimplencia, that.possuiHistoricoInadimplencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scoreCredito, nivelEndividamentoSCR, possuiHistoricoInadimplencia);
    }

}
