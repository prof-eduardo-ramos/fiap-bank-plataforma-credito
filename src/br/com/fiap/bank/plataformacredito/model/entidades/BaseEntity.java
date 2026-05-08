package br.com.fiap.bank.plataformacredito.model.entidades;

import java.time.LocalDate;
import java.util.UUID;

public abstract class BaseEntity {
    protected final UUID id;
    protected LocalDate dataCriacao;
    protected LocalDate dataAtualizacao;

    public BaseEntity() {
        this.id = UUID.randomUUID();
        this.dataCriacao = LocalDate.now();
        this.dataAtualizacao = LocalDate.now();
    }

    public UUID getId() {
        return id;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDate dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

}
