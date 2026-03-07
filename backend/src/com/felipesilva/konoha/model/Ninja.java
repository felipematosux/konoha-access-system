package com.felipesilva.konoha.model;

public class Ninja {
    private String nome;
    private String password;
    private boolean isBanned;

    public Ninja(String nome, String password, boolean isBanned) {
        this.nome = nome;
        this.password = password;
        this.isBanned = isBanned;
    }

    public String getNome() {
        return nome;
    }

    public String getPassword() {
        return password;
    }

    public boolean isBanned() {
        return isBanned;
    }

}
