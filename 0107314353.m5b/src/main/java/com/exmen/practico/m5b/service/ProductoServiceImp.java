/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exmen.practico.m5b.service;

import com.exmen.practico.m5b.model.Producto;
import com.exmen.practico.m5b.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class ProductoServiceImp extends GenericServiceImpl<Producto,Long>implements ProductoService{

    @Autowired
    ProductoRepository productoRepository;
    
    @Override
    public CrudRepository<Producto, Long> getDao() {
        return productoRepository;
    }
    
}
