package com.felipesilva.konoha.service;

import com.felipesilva.konoha.exceptions.BannedNinjaException;
import com.felipesilva.konoha.exceptions.InvalidCredentialsException;
import com.felipesilva.konoha.model.Ninja;
import java.util.Map;

public class KonohaAuthenticator implements Authenticator {
    private Map<String, Ninja> database;


    public KonohaAuthenticator(Map<String, Ninja> database) {
        this.database = database;
    }

    @Override
    public void login(String user, String pass) throws InvalidCredentialsException {
        Ninja ninja = database.get(user);


        if (ninja == null || !ninja.getPassword().equals(pass)) {
            throw new InvalidCredentialsException("Erro: Credenciais inválidas. Acesso negado!");
        }


        if (ninja.isBanned()) {
            throw new BannedNinjaException("Alerta ANBU: Este ninja foi banido da vila!");
        }

        System.out.println("Acesso liberado. Bem-vindo aos arquivos secretos, " + user + "!");
    }
}
