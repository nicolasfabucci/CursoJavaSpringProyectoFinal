package com.nicolasfabucci.ecommerceFabucci.controllers;


import com.nicolasfabucci.ecommerceFabucci.entity.documents.UsuarioDocument;
import com.nicolasfabucci.ecommerceFabucci.entity.schemas.requests.UsuarioRequest;
import com.nicolasfabucci.ecommerceFabucci.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UsuarioController {
    @Autowired
    private final UsuarioService usuarioService;

    @GetMapping(value = "usuario/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getUsuarioById(@PathVariable(name = "id") final Long id) {
        final Optional<UsuarioDocument> usuario = usuarioService.getUsuarioById(id);
        if (usuario.isPresent()) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(value = "usuario", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> guardarUsuario(@RequestBody final UsuarioRequest usuarioRequest) {
        try {
            final UsuarioDocument usuarioDocumentGuardado = usuarioService.postNewUsuario(usuarioRequest);
            return ResponseEntity.created(URI.create("")).body(usuarioDocumentGuardado);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().body(null);
        }
    }

    @DeleteMapping(value = "usuario/{id}", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> eliminarUsuario(@PathVariable Long id) {

        usuarioService.deleteUsuario(id);

        final Optional<UsuarioDocument> usuario = usuarioService.getUsuarioById(id);
        if (!usuario.isPresent()) {
            return new ResponseEntity<>(id, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}