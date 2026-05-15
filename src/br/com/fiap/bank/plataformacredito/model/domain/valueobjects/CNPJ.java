package br.com.fiap.bank.plataformacredito.model.domain.valueobjects;

public final class CNPJ extends Documento {

    public CNPJ(String numero, Integer digitoVerificador) {
        super(numero, digitoVerificador);
    }

    @Override
    public Boolean validar() {
        return true;
    }

    @Override
    public String toString() {
        return String.format("%d-%d", numero, digitoVerificador);
    }

}
