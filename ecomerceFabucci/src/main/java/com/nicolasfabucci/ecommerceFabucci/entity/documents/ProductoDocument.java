package com.nicolasfabucci.ecommerceFabucci.entity.documents;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="producto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductoDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProducto;
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "precio")
    private Double precio;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "categoria")
    private String categoria;
}