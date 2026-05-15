package br.com.fiap.bank.plataformacredito.application;

import br.com.fiap.bank.plataformacredito.model.domain.entidades.Cliente;
import br.com.fiap.bank.plataformacredito.model.factory.ClienteFactory;

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
        Cliente clientePessoaFisica = ClienteFactory.criarClientePessoaFisica(nome, dataNascimento, numeroCpf, null);
        // Cliente clientePessoaJuridica =
        // ClienteFactory.criarClientePessoaJuridica(nome, dataNascimento, numeroCpf,
        // null);
    }

}
