/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exmen.practico.m5b.service;

import com.exmen.practico.m5b.model.Cliente;
import com.exmen.practico.m5b.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class ClienteServiceImp extends GenericServiceImpl<Cliente,Long>implements ClienteService{

    @Autowired
    ClienteRepository clienteRepository;
    
    @Override
    public CrudRepository<Cliente, Long> getDao() {
        return clienteRepository;
    }
    
}
