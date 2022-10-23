package com.nicolasfabucci.ecommerceFabucci.service;

import com.nicolasfabucci.ecommerceFabucci.entity.documents.UsuarioDocument;
import com.nicolasfabucci.ecommerceFabucci.entity.schemas.requests.UsuarioRequest;

import java.util.Optional;

public interface UsuarioService {
    Optional<UsuarioDocument> getUsuarioById(final Long id);

    UsuarioDocument postNewUsuario(final UsuarioRequest usuarioRequest);

    void deleteUsuario(Long id);
}
