package br.com.fiap.bank.plataformacredito.model.domain.valueobjects;

public final class CNPJ extends Documento {

    public CNPJ(String numero, Integer digitoVerificador) {
        super(numero, digitoVerificador);
    }

    @Override
    public String toString() {
        return String.format("%d.%d.%d/%d-%d",
                numero.substring(0, 2),
                numero.substring(2, 5),
                numero.substring(5, 8),
                numero.substring(8, 12),
                digitoVerificador);
    }

    @Override
    public Boolean validar() {
        if (numero == null || digitoVerificador == null) {
            return false;
        }

        String cnpj = numero + digitoVerificador;
        if (cnpj.length() != 14) {
            return false;
        }

        // Cálculo do primeiro dígito verificador
        int soma = 0;
        int peso = 5;
        for (int i = 0; i < 12; i++) {
            soma += (cnpj.charAt(i) - '0') * peso;
            peso = (peso == 2) ? 9 : peso - 1;
        }
        int resto = soma % 11;
        char digito13 = (resto < 2) ? '0' : (char) ((11 - resto) + '0');

        // Cálculo do segundo dígito verificador
        soma = 0;
        peso = 6;
        for (int i = 0; i < 13; i++) {
            soma += (cnpj.charAt(i) - '0') * peso;
            peso = (peso == 2) ? 9 : peso - 1;
        }
        resto = soma % 11;
        char digito14 = (resto < 2) ? '0' : (char) ((11 - resto) + '0');

        return digito13 == cnpj.charAt(12) && digito14 == cnpj.charAt(13);
    }

}
