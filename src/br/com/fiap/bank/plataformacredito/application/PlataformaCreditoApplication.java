package br.com.fiap.bank.plataformacredito.application;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.fiap.bank.plataformacredito.domain.entidades.Cliente;
import br.com.fiap.bank.plataformacredito.domain.entidades.Proposta;
import br.com.fiap.bank.plataformacredito.domain.valueobjects.CPF;

public class PlataformaCreditoApplication {

    public void criarProposta(String codigo, String nome, String dataNascimento, String cpf, String valorSolicitado,
            String quantidadeParcelas) {
        System.out.println("Criando proposta...");

        String[] splittedCpf = cpf.split("-");
        String numeroCpf = splittedCpf[0];
        Integer digitoVerificador = Integer.valueOf(splittedCpf[1]);
        // Cliente cliente = new Cliente(nome, LocalDate.parse(dataNascimento), new
        // CPF(numeroCpf, digitoVerificador));

        // Proposta proposta = new Proposta(codigo, new BigDecimal(valorSolicitado),
        // Integer.valueOf(quantidadeParcelas),
        // cliente);
    }

}
