package com.parquessp.Pojos;

public class Parques {

    private String nome;
    private String descrição;

    public Parques(String nome, String descrição) {
        this.nome = nome;
        this.descrição = descrição;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }


}
