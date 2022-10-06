/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exmen.practico.m5b.controller;

import com.exmen.practico.m5b.model.Producto;
import com.exmen.practico.m5b.service.ProductoService;
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
@RequestMapping("/api/producto")
public class ProductoController {
    @Autowired
    ProductoService productoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Producto>> listar() {
        return new ResponseEntity<>(productoService.findByAll(), HttpStatus.OK);
    }
    
    @GetMapping("listar Codigo/{id}")
    public Producto listarCodigo(@PathVariable Long id) {
        return productoService.findById(id);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Producto>crear(@RequestBody Producto l){
        return new ResponseEntity<>(productoService.save(l),HttpStatus.CREATED);
    }
    
    @DeleteMapping("/elimar/{id}")
    public ResponseEntity<Producto>eliminar(@PathVariable Long id){
        productoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
