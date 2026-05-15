package br.com.fiap.bank.plataformacredito.model.entidades;

public interface Analisavel {
    void aprovar();

    void rejeitar(String motivo);

    void cancelar();
}
