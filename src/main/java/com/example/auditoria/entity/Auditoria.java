package com.example.auditoria.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "auditoria")
public class Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAuditoria;

    @Column(name = "tipoBaseDatos", length = 50, nullable = false)
    private String tipoBaseDatos;
    @Column(name = "nombreBaseDatos", length = 200, nullable = false)
    private String nombreBaseDatos;
    @Column(name = "nombreTabla", length = 200, nullable = false)
    private String nombreTabla;
    @Column(name = "metodo", length = 200, nullable = false)
    private String metodo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    
}