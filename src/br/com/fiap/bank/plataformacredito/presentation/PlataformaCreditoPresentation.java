package br.com.fiap.bank.plataformacredito.presentation;

import java.time.LocalDate;
import java.util.Scanner;

import br.com.fiap.bank.plataformacredito.application.PlataformaCreditoApplication;

public class PlataformaCreditoPresentation {

    private static PlataformaCreditoPresentation instancia;

    private final PlataformaCreditoApplication plataformaCreditoApplication;

    private PlataformaCreditoPresentation(PlataformaCreditoApplication plataformaCreditoApplication) {
        this.plataformaCreditoApplication = plataformaCreditoApplication;
    }

    public static PlataformaCreditoPresentation novaInstancia() {
        if (instancia == null) {
            instancia = new PlataformaCreditoPresentation(PlataformaCreditoApplication.novaInstancia());
        }
        return instancia;
    }

    public void iniciar() {
        System.out.println("Bem-vindo ao sistema de plataforma de crédito!");
        System.out.println("1 - Criar proposta");
        System.out.println("2 - Sair");
        System.out.print("Digite sua opção: ");

        Scanner input = new Scanner(System.in);
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                criarProposta(input);
                break;
            case 2:
                System.out.println("Até logo!");
                break;
            default:
                System.out.println("Opção inválida!");
                iniciar();
        }
        input.close();
    }

    private void criarProposta(Scanner input) {
        System.out.print("Digite o nome do cliente: ");
        String nome = input.next();

        System.out.print("Digite a data de nascimento do cliente: ");
        String dataNascimento = input.next();

        System.out.print("Digite o CPF do cliente: ");
        String cpf = input.next();

        System.out.print("Digite o valor solicitado: ");
        String valorSolicitado = input.next();

        System.out.print("Digite a quantidade de parcelas: ");
        String quantidadeParcelas = input.next();

        String codigo = "PROPOSTA-" + LocalDate.now().getYear() + LocalDate.now().getMonthValue()
                + LocalDate.now().getDayOfMonth();

        plataformaCreditoApplication.criarProposta(codigo, nome, dataNascimento, cpf, valorSolicitado,
                quantidadeParcelas);
    }

}
