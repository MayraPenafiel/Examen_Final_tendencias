/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.exmen.practico.m5b.repository;

import com.exmen.practico.m5b.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Usuario
 */
public interface ProductoRepository extends MongoRepository<Producto,Long> {
    
}
