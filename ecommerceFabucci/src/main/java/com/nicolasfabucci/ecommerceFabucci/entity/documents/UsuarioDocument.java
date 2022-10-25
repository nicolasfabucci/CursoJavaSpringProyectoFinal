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
@Table(name="usuario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUsuario;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "celular")
    private String celular;
    @Column(name = "edad")
    private Integer edad;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
}
