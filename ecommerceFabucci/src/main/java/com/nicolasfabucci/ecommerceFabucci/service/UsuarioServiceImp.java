package com.nicolasfabucci.ecommerceFabucci.service;

import com.nicolasfabucci.ecommerceFabucci.entity.documents.UsuarioDocument;
import com.nicolasfabucci.ecommerceFabucci.entity.schemas.requests.UsuarioRequest;
import com.nicolasfabucci.ecommerceFabucci.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImp implements UsuarioService{
    private final UsuarioRepository usuarioRepository;

    public Optional<UsuarioDocument> getUsuarioById(final Long id){
        return usuarioRepository.findById(id);
    }
    public UsuarioDocument postNewUsuario(final UsuarioRequest usuarioRequest){
        final UsuarioDocument usuarioDoc = new UsuarioDocument();
        usuarioDoc.setCelular(usuarioRequest.getCelular());
        usuarioDoc.setEdad(usuarioRequest.getEdad());
        usuarioDoc.setNombre(usuarioRequest.getNombre());
        usuarioDoc.setPassword(usuarioRequest.getPassword());
        usuarioDoc.setEmail(usuarioRequest.getEmail());
        return usuarioRepository.save(usuarioDoc);
    }

    public void deleteUsuario(Long id){
        Optional<UsuarioDocument> usuarioDoc = usuarioRepository.findById(id);
        usuarioRepository.deleteById(id);
    }
}
