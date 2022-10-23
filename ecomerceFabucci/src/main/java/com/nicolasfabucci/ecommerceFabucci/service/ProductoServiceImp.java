package com.nicolasfabucci.ecommerceFabucci.service;

import com.nicolasfabucci.ecommerceFabucci.entity.documents.ProductoDocument;
import com.nicolasfabucci.ecommerceFabucci.entity.schemas.requests.ProductoRequest;
import com.nicolasfabucci.ecommerceFabucci.repositories.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductoServiceImp implements ProductoService{

    private final ProductoRepository productoRepository;

    public Optional<ProductoDocument> getProductoById(final Long id){
        return productoRepository.findById(id);
    }

    public ProductoDocument postNewProducto(final ProductoRequest productoRequest){
        final ProductoDocument productoDoc = new ProductoDocument();
        productoDoc.setCodigo(productoRequest.getCodigo());
        productoDoc.setPrecio(productoRequest.getPrecio());
        productoDoc.setDescripcion(productoRequest.getDescripcion());
        productoDoc.setCategoria(productoRequest.getCategoria());
        return productoRepository.save(productoDoc);
    }
}
