package com.nicolasfabucci.ecommerceFabucci.service;

import com.nicolasfabucci.ecommerceFabucci.entity.documents.ProductoDocument;
import com.nicolasfabucci.ecommerceFabucci.entity.schemas.requests.ProductoRequest;

import java.util.Optional;

public interface ProductoService {
    Optional<ProductoDocument> getProductoById(final Long id);
    ProductoDocument postNewProducto(final ProductoRequest productoRequest);
}
