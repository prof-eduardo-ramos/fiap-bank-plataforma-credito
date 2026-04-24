package br.com.fiap.bank.plataformacredito.domain.valueobjects;

import java.util.Objects;

public class CPF {
    private final String numero;
    private final Integer digitoVerificador;

    public CPF(String numero, Integer digitoVerificador) {
        if (!isCpfValido(numero, digitoVerificador)) {
            throw new IllegalArgumentException("CPF inválido");
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
        CPF other = (CPF) obj;
        return Objects.equals(numero, other.numero)
                && Objects.equals(digitoVerificador, other.digitoVerificador);
    }

    @Override
    public String toString() {
        return String.format("%s.%s.%s-%s",
                numero.substring(0, 3),
                numero.substring(3, 6),
                numero.substring(6, 9),
                digitoVerificador);
    }

    private static boolean isCpfValido(String numero, Integer digitoVerificador) {
        // Verifica se o CPF informado é válido
        if (numero == null || digitoVerificador == null) {
            return false;
        }

        String cpf = numero + digitoVerificador;

        if (cpf.length() != 11) {
            return false;
        }

        // Cálculo do primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }
        int resto = 11 - (soma % 11);
        char digito1 = (resto == 10 || resto == 11) ? '0' : (char) (resto + '0');

        // Cálculo do segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }
        resto = 11 - (soma % 11);
        char digito2 = (resto == 10 || resto == 11) ? '0' : (char) (resto + '0');

        // Verifica se os dígitos calculados conferem
        return digito1 == cpf.charAt(9) && digito2 == cpf.charAt(10);

    }

}
