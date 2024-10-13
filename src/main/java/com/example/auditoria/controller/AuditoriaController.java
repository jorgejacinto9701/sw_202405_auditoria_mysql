package com.example.auditoria.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.auditoria.entity.Auditoria;
import com.example.auditoria.service.AuditoriaService;

@RestController
@RequestMapping("/url/auditoria")
public class AuditoriaController {


    @Autowired
    private AuditoriaService auditoriaService;

    @GetMapping("/listar")
    public String listarAuditorias() {
        return auditoriaService.listaAuditorias().toString();
    }

    @PostMapping("/registrar/{tipoBD}-{bd}-{tabla}")
    public String registrarAuditoria(@PathVariable String tipoBD, @PathVariable String bd, @PathVariable String tabla) {
        Auditoria auditoria = new Auditoria();
        auditoria.setTipoBaseDatos(tipoBD);
        auditoria.setNombreBaseDatos(bd);
        auditoria.setNombreTabla(tabla);
        auditoria.setFechaRegistro(new Date());
        Auditoria objRegistrada =  auditoriaService.registraAuditoria(auditoria);
        if (objRegistrada.getIdAuditoria() >0)
            return "Auditoria registrada";
        else
            return "Error al registrar auditoria";
    }
}
