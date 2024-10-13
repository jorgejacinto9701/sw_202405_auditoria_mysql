package com.example.auditoria.service;

import java.util.List;

import com.example.auditoria.entity.Auditoria;

public interface AuditoriaService {

    public abstract List<Auditoria> listaAuditorias();
    public abstract Auditoria registraAuditoria(Auditoria auditoria);
    
}
