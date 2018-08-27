package com.parquessp.Pojos;

public class Parques {

    private String nome;
    private String descricao;
    private String imagem;

    public Parques(String nome, String descricao, String imagem) {
        this.nome = nome;
        this.descricao = descricao;
        this.imagem = imagem;
    }


    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescrição(String descrição) {
        this.descricao = descricao;
    }


}
