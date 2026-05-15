package br.com.fiap.bank.plataformacredito.presentation.view;

import java.util.Map;
import java.util.Scanner;

public class PropostaPessoaJuridicaViewer {
    private static PropostaPessoaJuridicaViewer instancia;

    private PropostaPessoaJuridicaViewer() {

    }

    public static PropostaPessoaJuridicaViewer novaInstancia() {
        if (instancia == null) {
            instancia = new PropostaPessoaJuridicaViewer();
        }
        return instancia;
    }

    public void executar(Scanner input, Map<String, Object> dadosProposta) {
        System.out.print("Digite a razão social da empresa: ");
        dadosProposta.put("razaoSocial", input.next());

        System.out.print("Digite o nome fantasia da empresa: ");
        dadosProposta.put("nomeFantasia", input.next());

        System.out.print("Digite a data de constituicao da empresa: ");
        dadosProposta.put("dataConstituicao", input.next());

        System.out.print("Digite o CNPJ da empresa: ");
        dadosProposta.put("cnpj", input.next());
    }

}
