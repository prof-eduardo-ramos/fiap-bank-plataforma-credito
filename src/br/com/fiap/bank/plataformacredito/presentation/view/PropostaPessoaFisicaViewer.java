package br.com.fiap.bank.plataformacredito.presentation.view;

import java.util.Map;
import java.util.Scanner;

public class PropostaPessoaFisicaViewer {

    private static PropostaPessoaFisicaViewer instancia;

    private PropostaPessoaFisicaViewer() {

    }

    public static PropostaPessoaFisicaViewer novaInstancia() {
        if (instancia == null) {
            instancia = new PropostaPessoaFisicaViewer();
        }
        return instancia;
    }

    public void executar(Scanner input, Map<String, Object> dadosProposta) {
        System.out.print("Digite o nome do cliente: ");
        dadosProposta.put("nome", input.next());

        System.out.print("Digite a data de nascimento do cliente (dd/mm/yyyy): ");
        dadosProposta.put("dataNascimento", input.next());

        System.out.print("Digite o CPF do cliente: ");
        dadosProposta.put("cpf", input.next());
    }

}
