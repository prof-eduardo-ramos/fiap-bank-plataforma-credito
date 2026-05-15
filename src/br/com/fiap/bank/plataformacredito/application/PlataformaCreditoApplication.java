package br.com.fiap.bank.plataformacredito.application;

import br.com.fiap.bank.plataformacredito.model.domain.entidades.Cliente;
import br.com.fiap.bank.plataformacredito.model.domain.entidades.Conta;
import static br.com.fiap.bank.plataformacredito.model.factory.ClienteFactory.novoClientePessoaFisica;
import static br.com.fiap.bank.plataformacredito.model.factory.ClienteFactory.novoCpf;
import static br.com.fiap.bank.plataformacredito.model.factory.ContaFactory.novaContaCorrente;

import java.time.LocalDate;

public class PlataformaCreditoApplication {

    private static PlataformaCreditoApplication instancia;

    private PlataformaCreditoApplication() {
    }

    public static PlataformaCreditoApplication novaInstancia() {
        if (instancia == null) {
            instancia = new PlataformaCreditoApplication();
        }
        return instancia;
    }

    public void criarProposta(String codigo, String nome, String dataNascimento, String cpf, String valorSolicitado,
            String quantidadeParcelas) {
        System.out.println("Criando proposta...");

        String[] splittedCpf = cpf.split("-");
        String numeroCpf = splittedCpf[0];
        Integer digitoVerificador = Integer.valueOf(splittedCpf[1]);

        Conta conta = novaContaCorrente("0001", "123456", "0", LocalDate.now());
        Cliente cliente = novoClientePessoaFisica(nome, LocalDate.parse(dataNascimento),
                novoCpf(numeroCpf, digitoVerificador), conta);

    }

}
