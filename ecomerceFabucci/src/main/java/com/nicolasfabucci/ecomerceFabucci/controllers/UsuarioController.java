package com.nicolasfabucci.ecomerceFabucci.controllers;

import com.nicolasfabucci.ecomerceFabucci.models.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @GetMapping("/usuario")
    public Usuario usuario() {
        System.out.println("Hola usuario!");
        return new Usuario("nicolas","Nicolas", "3416637372","123456","nicolasfabucci@gmail.com");
    }

    @GetMapping("/test")
    public String greeting(){
        return "TEST OK";
    }
}
