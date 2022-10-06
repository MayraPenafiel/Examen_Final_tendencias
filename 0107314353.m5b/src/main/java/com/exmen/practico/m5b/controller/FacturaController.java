/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exmen.practico.m5b.controller;

import com.exmen.practico.m5b.model.Factura;
import com.exmen.practico.m5b.service.FacturaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */
@RestController
@RequestMapping("/api/factura")
public class FacturaController {
     @Autowired
    FacturaService facturaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Factura>> listar() {
        return new ResponseEntity<>(facturaService.findByAll(), HttpStatus.OK);
    }
    
    @GetMapping("listar Codigo/{id}")
    public Factura listarCodigo(@PathVariable Long id) {
        return facturaService.findById(id);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Factura>crear(@RequestBody Factura l){
        return new ResponseEntity<>(facturaService.save(l),HttpStatus.CREATED);
    }
    
    @DeleteMapping("/elimar/{id}")
    public ResponseEntity<Factura>eliminar(@PathVariable Long id){
        facturaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
