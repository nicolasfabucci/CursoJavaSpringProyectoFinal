package com.nicolasfabucci.ecommerceFabucci.entity.schemas.requests;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductoRequest {
    private String codigo;
    private Double precio;
    private String descripcion;
    private String categoria;
}
