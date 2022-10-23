package com.nicolasfabucci.ecommerceFabucci.repositories;

import com.nicolasfabucci.ecommerceFabucci.entity.documents.ProductoDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoDocument,Long> {
}
