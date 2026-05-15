package br.com.fiap.bank.plataformacredito.model.domain.entidades;

public interface Analisavel {

    void aprovar();

    void rejeitar(String motivo);

    void cancelar();

}
