package br.com.fiap.mensagem.model;

import java.time.LocalDate;

public class Mensagem {
    private long id;
    private String assunto;
    private String destinatario;
    private String remetente;
    private LocalDate data;
    private String conteudo;
    private int status;

    // Construtor padrão
    public Mensagem() {}

    // Construtor completo
    public Mensagem(long id, String assunto, String destinatario, String remetente, LocalDate data, String conteudo, int status) {
        this.id = id;
        this.assunto = assunto;
        this.destinatario = destinatario;
        this.remetente = remetente;
        this.data = data;
        this.conteudo = conteudo;
        this.status = status;
    }

    // Getters e Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

// CRIAÇÃO DA TABELA NA BANCO DE DADOS
/*
CREATE TABLE tbl_mensagem (
    id NUMBER PRIMARY KEY,
    assunto VARCHAR2(255),
    destinatario VARCHAR2(255),
    remetente VARCHAR2(255),
    data DATE,
    conteudo CLOB,
    status NUMBER
);
*/