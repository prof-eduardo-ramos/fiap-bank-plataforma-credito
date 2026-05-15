package br.com.fiap.bank.plataformacredito.model.domain.entidades;

import java.time.LocalDate;
import java.util.UUID;

public abstract class BaseEntity {
    protected final UUID id;
    protected final LocalDate dataCriacao;
    protected LocalDate dataAtualizacao;

    public BaseEntity() {
        this.id = UUID.randomUUID();
        this.dataCriacao = LocalDate.now();
    }

    // Getters
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
