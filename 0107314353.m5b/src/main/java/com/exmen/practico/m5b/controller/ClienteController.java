/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exmen.practico.m5b.controller;

import com.exmen.practico.m5b.model.Cliente;
import com.exmen.practico.m5b.service.ClienteService;
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
@RequestMapping("/api/cliente")
public class ClienteController {
    
     @Autowired
    ClienteService clienteService;

    @GetMapping("/listar")
    public ResponseEntity<List<Cliente>> listar() {
        return new ResponseEntity<>(clienteService.findByAll(), HttpStatus.OK);
    }
    
    @GetMapping("listar Codigo/{id}")
    public Cliente listarCodigo(@PathVariable Long id) {
        return clienteService.findById(id);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Cliente>crear(@RequestBody Cliente l){
        return new ResponseEntity<>(clienteService.save(l),HttpStatus.CREATED);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Cliente>eliminar(@PathVariable Long id){
        clienteService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
