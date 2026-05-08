package br.com.fiap.bank.plataformacredito.model.valueobjects;

import java.util.Objects;

public class CNPJ {
    private final String numero;
    private final Integer digitoVerificador;

    public CNPJ(String numero, Integer digitoVerificador) {
        if (!isCnpjValido(numero, digitoVerificador)) {
            throw new IllegalArgumentException("CNPJ inválido");
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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!getClass().equals(obj.getClass()))
            return false;
        CNPJ other = (CNPJ) obj;
        return Objects.equals(numero, other.numero)
                && Objects.equals(digitoVerificador, other.digitoVerificador);
    }

    @Override
    public String toString() {
        return String.format("%d-%d", numero, digitoVerificador);
    }

    private static boolean isCnpjValido(String numero, Integer digitoVerificador) {
        // Verifica se o CPF informado é válido
        return true;
        // if (numero == null || digitoVerificador == null) {
        // return false;
        // }

        // // Verifica se o CPF é composto por números iguais
        // if (numero.chars().allMatch(c -> c == numero.charAt(0))) {
        // return false;
        // }

        // // calculo de digito verificador de CPF
        // int soma = 0;
        // for (int i = 0; i < 9; i++) {
        // soma += numero.charAt(i) * (10 - i);
        // }

        // int resto = soma % 11;
        // int digitoVerificadorCalculado = resto < 2 ? 0 : 11 - resto;
        // return digitoVerificadorCalculado == digitoVerificador.intValue();
    }

}
