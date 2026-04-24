package br.com.fiap.bank.plataformacredito.application;

import java.time.LocalDate;

import br.com.fiap.bank.plataformacredito.domain.entidades.Cliente;
import br.com.fiap.bank.plataformacredito.domain.entidades.Conta;
import br.com.fiap.bank.plataformacredito.util.ClienteFactory;

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
        Conta conta = ClienteFactory.novaConta("0001", "123456", "0", LocalDate.now());
        Cliente cliente = ClienteFactory.novoClientePessoaFisica(nome, LocalDate.parse(dataNascimento),
                ClienteFactory.novoCpf(numeroCpf, digitoVerificador), conta);

    }

}
