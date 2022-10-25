package com.nicolasfabucci.ecommerceFabucci.repositories;

import com.nicolasfabucci.ecommerceFabucci.entity.documents.UsuarioDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioDocument,Long> {

}
