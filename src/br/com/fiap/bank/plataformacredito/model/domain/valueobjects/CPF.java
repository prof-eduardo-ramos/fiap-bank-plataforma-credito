package br.com.fiap.bank.plataformacredito.model.domain.valueobjects;

public final class CPF extends Documento {

    public CPF(String numero, Integer digitoVerificador) {
        super(numero, digitoVerificador);
    }

    @Override
    public Boolean validar() {
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

    @Override
    public String toString() {
        return String.format("%s.%s.%s-%s",
                numero.substring(0, 3),
                numero.substring(3, 6),
                numero.substring(6, 9),
                digitoVerificador);
    }

}
