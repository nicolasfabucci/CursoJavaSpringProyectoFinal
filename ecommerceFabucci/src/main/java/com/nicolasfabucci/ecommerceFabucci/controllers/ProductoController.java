package com.nicolasfabucci.ecommerceFabucci.controllers;


import com.nicolasfabucci.ecommerceFabucci.entity.documents.ProductoDocument;
import com.nicolasfabucci.ecommerceFabucci.entity.schemas.requests.ProductoRequest;
import com.nicolasfabucci.ecommerceFabucci.service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProductoController {
    @Autowired
    private final ProductoService productoService;

    @GetMapping(value = "producto/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getProductoById(@PathVariable(name = "id") final Long id) {
        final Optional<ProductoDocument> producto = productoService.getProductoById(id);
        if (producto.isPresent()) {
            return ResponseEntity.ok(producto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(value = "producto", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> guardarProducto(@RequestBody final ProductoRequest productoRequest) {
        try {
            final ProductoDocument productoDocumentGuardado = productoService.postNewProducto(productoRequest);
            return ResponseEntity.created(URI.create("")).body(productoDocumentGuardado);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().body(null);
        }
    }


}