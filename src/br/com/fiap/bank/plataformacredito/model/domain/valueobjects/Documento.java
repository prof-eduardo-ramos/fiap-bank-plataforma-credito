package br.com.fiap.bank.plataformacredito.model.domain.valueobjects;

import br.com.fiap.bank.plataformacredito.model.domain.exception.DocumentoInvalidoException;

public abstract class Documento implements Validavel {

    protected final String numero;
    protected final Integer digitoVerificador;

    public Documento(String numero, Integer digitoVerificador) {
        if (!validar()) {
            throw new DocumentoInvalidoException("Documento inválido");
        }
        this.numero = numero;
        this.digitoVerificador = digitoVerificador;
    }

    public String getNumero() {
        return numero;
    }

    public Integer getDigitoVerificador() {
        return digitoVerificador;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        result = prime * result + ((digitoVerificador == null) ? 0 : digitoVerificador.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Documento other = (Documento) obj;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        if (digitoVerificador == null) {
            if (other.digitoVerificador != null)
                return false;
        } else if (!digitoVerificador.equals(other.digitoVerificador))
            return false;
        return true;
    }

    @Override
    public abstract Boolean validar();

}
