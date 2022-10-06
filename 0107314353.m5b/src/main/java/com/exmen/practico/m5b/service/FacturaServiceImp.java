/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exmen.practico.m5b.service;

import com.exmen.practico.m5b.model.Factura;
import com.exmen.practico.m5b.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class FacturaServiceImp extends GenericServiceImpl<Factura,Long>implements FacturaService{

    @Autowired
    FacturaRepository facturaRepository;
    
    @Override
    public CrudRepository<Factura, Long> getDao() {
        return facturaRepository;
    }
    
}
