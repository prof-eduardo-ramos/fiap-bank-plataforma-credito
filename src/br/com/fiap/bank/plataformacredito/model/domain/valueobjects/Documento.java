package br.com.fiap.bank.plataformacredito.model.domain.valueobjects;

import java.util.Objects;

import br.com.fiap.bank.plataformacredito.model.domain.exception.DocumentoInvalidoException;

public abstract class Documento implements Validavel {
    protected final String numero;
    protected final Integer digitoVerificador;

    public Documento(String numero, Integer digitoVerificador) {
        if (numero == null || numero.isEmpty()) {
            throw new DocumentoInvalidoException("Número do documento inválido");
        }

        if (digitoVerificador == null) {
            throw new DocumentoInvalidoException("Dígito verificador inválido");
        }

        this.numero = numero;
        this.digitoVerificador = digitoVerificador;

        if (!validar()) {
            throw new DocumentoInvalidoException("Documento inválido");
        }
    }

    public String getNumero() {
        return numero;
    }

    public Integer getDigitoVerificador() {
        return digitoVerificador;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!getClass().equals(obj.getClass()))
            return false;
        Documento other = (Documento) obj;
        return Objects.equals(numero, other.numero)
                && Objects.equals(digitoVerificador, other.digitoVerificador);
    }

    @Override
    public abstract Boolean validar();

}
