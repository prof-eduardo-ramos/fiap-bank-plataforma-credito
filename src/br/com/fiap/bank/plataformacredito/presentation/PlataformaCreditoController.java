package br.com.fiap.bank.plataformacredito.presentation;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import br.com.fiap.bank.plataformacredito.application.PlataformaCreditoApplication;
import br.com.fiap.bank.plataformacredito.presentation.view.PropostaPessoaFisicaViewer;
import br.com.fiap.bank.plataformacredito.presentation.view.PropostaPessoaJuridicaViewer;

public class PlataformaCreditoController {

    private final PlataformaCreditoApplication plataformaCreditoApplication;

    private static PlataformaCreditoController instancia;

    private PlataformaCreditoController(PlataformaCreditoApplication plataformaCreditoApplication) {
        this.plataformaCreditoApplication = plataformaCreditoApplication;
    }

    public static PlataformaCreditoController novaInstancia() {
        if (instancia == null) {
            instancia = new PlataformaCreditoController(PlataformaCreditoApplication.novaInstancia());
        }
        return instancia;
    }

    public void iniciar() {
        System.out.println("Bem-vindo ao sistema de plataforma de crédito!");
        System.out.println("1 - Criar proposta Pessoa Física");
        System.out.println("2 - Criar proposta Pessoa Física");
        System.out.println("3 - Sair");
        System.out.print("Digite sua opção: ");

        Scanner input = new Scanner(System.in);
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                criarPropostaPessoaFisica(input);
                break;
            case 2:
                criarPropostaPessoaJuridica(input);
                break;
            case 3:
                System.out.println("Até logo!");
                break;
            default:
                System.out.println("Opção inválida!");
                iniciar();
        }
        input.close();
    }

    private void criarPropostaPessoaJuridica(Scanner input) {
        Map<String, Object> dadosProposta = new HashMap<>();
        PropostaPessoaJuridicaViewer.novaInstancia().executar(input, dadosProposta);
        this.criarProposta(input, dadosProposta);
    }

    private void criarPropostaPessoaFisica(Scanner input) {
        Map<String, Object> dadosProposta = new HashMap<>();
        PropostaPessoaFisicaViewer.novaInstancia().executar(input, dadosProposta);
        this.criarProposta(input, dadosProposta);
    }

    private void criarProposta(Scanner input, Map<String, Object> dadosProposta) {
        System.out.print("Digite o valor solicitado: ");
        String valorSolicitado = input.next();

        System.out.print("Digite a quantidade de parcelas: ");
        String quantidadeParcelas = input.next();

        String codigo = "PROPOSTA-" + LocalDate.now().getYear() + LocalDate.now().getMonthValue()
                + LocalDate.now().getDayOfMonth();

        // plataformaCreditoApplication.criarProposta(codigo, nome, dataNascimento, cpf,
        // valorSolicitado,
        // quantidadeParcelas);
    }

}
