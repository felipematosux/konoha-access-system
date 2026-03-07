package com.felipesilva.konoha.service;

import com.felipesilva.konoha.exceptions.BannedNinjaException;
import com.felipesilva.konoha.exceptions.InvalidCredentialsException;

public interface Authenticator {

    void login(String username, String password) throws Exception;
}
