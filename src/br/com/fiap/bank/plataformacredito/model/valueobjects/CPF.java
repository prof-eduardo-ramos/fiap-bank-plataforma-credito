package br.com.fiap.bank.plataformacredito.model.valueobjects;

import java.util.InputMismatchException;

public final class CPF extends Documento {
    public CPF(String numero, Integer digitoVerificador) {
        super(numero, digitoVerificador);
    }

    @Override
    protected Boolean validar() {
        if (this.numero == null || this.digitoVerificador == null) {
            return false;
        }

        String cpf = this.numero.concat(this.digitoVerificador.toString());

        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("\\D", "");

        // Verifica se tem 11 dígitos
        if (cpf.length() != 11)
            return false;

        // Elimina CPFs com todos os dígitos iguais (ex: 00000000000)
        if (cpf.matches("(\\d)\\1{10}"))
            return false;

        try {
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

        } catch (InputMismatchException e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("%d-%d", numero, digitoVerificador);
    }

}
