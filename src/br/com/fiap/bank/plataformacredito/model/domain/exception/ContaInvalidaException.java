package br.com.fiap.bank.plataformacredito.model.domain.exception;

public class ContaInvalidaException extends RuntimeException {
    public ContaInvalidaException(String message) {
        super(message);
    }
}
