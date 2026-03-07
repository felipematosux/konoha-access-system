package com.felipesilva.konoha;

import com.felipesilva.konoha.exceptions.BannedNinjaException;
import com.felipesilva.konoha.exceptions.InvalidCredentialsException;
import com.felipesilva.konoha.model.Ninja;
import com.felipesilva.konoha.service.KonohaAuthenticator;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class MainApplication {
    public static void main(String[] args) {
        Map<String, Ninja> dbNinjas = new HashMap<>();
        dbNinjas.put("naruto", new Ninja("Naruto", "nuvem123", false));
        dbNinjas.put("sasuke", new Ninja("Sasuke", "uchiha", true));

        KonohaAuthenticator auth = new KonohaAuthenticator(dbNinjas);

        String usuarioTentandoLogar = "sasuke";
        String senhaDigitada = "uchiha";

        String dataHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));


        try (FileWriter logWriter = new FileWriter("access_log.txt", true)) {

            logWriter.write("[" + dataHora + "] Tentativa de login do usuário: " + usuarioTentandoLogar + "\n");

            auth.login(usuarioTentandoLogar, senhaDigitada);

            logWriter.write("[" + dataHora + "] Resultado: SUCESSO\n\n");

        } catch (InvalidCredentialsException | IOException e) {
            System.out.println(e.getMessage());

        } catch (BannedNinjaException e) {
            System.out.println("🚨 " + e.getMessage() + " 🚨");
        }

    }
}
