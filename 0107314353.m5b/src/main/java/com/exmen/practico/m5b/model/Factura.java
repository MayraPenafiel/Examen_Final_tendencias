/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exmen.practico.m5b.model;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Factura {
    
    private Long id;
    private String id_cliente;
    private String num_factura;
    private Date fecha;

    public Factura() {
    }

    public Factura(Long id, String id_cliente, String num_factura, Date fecha) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.num_factura = num_factura;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNum_factura() {
        return num_factura;
    }

    public void setNum_factura(String num_factura) {
        this.num_factura = num_factura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Factura{" + "id=" + id + ", id_cliente=" + id_cliente + ", num_factura=" + num_factura + ", fecha=" + fecha + '}';
    }
    
}
