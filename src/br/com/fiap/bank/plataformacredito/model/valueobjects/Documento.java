package br.com.fiap.bank.plataformacredito.model.valueobjects;

import java.util.Objects;

public abstract class Documento {
    protected final String numero;
    protected final Integer digitoVerificador;

    public Documento(String numero, Integer digitoVerificador) {
        if (numero == null || numero.isEmpty()) {
            throw new IllegalArgumentException("Número do documento inválido");
        }

        if (digitoVerificador == null) {
            throw new IllegalArgumentException("Dígito verificador inválido");
        }

        this.numero = numero;
        this.digitoVerificador = digitoVerificador;

        if (!validar()) {
            throw new IllegalArgumentException("Documento inválido");
        }
    }

    public String getNumero() {
        return numero;
    }

    public Integer getDigitoVerificador() {
        return digitoVerificador;
    }

    protected abstract Boolean validar();

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

}
