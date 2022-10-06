/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exmen.practico.m5b.model;

/**
 *
 * @author Usuario
 */
public class Producto {
    
    private Long id;
    private String id_factura;
    private String cod_producto;
    private String producto_nombre;
    private String cantidad;
    private Double precio;

    public Producto() {
    }

    public Producto(Long id, String id_factura, String cod_producto, String producto_nombre, String cantidad, Double precio) {
        this.id = id;
        this.id_factura = id_factura;
        this.cod_producto = cod_producto;
        this.producto_nombre = producto_nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_factura() {
        return id_factura;
    }

    public void setId_factura(String id_factura) {
        this.id_factura = id_factura;
    }

    public String getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(String cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getProducto_nombre() {
        return producto_nombre;
    }

    public void setProducto_nombre(String producto_nombre) {
        this.producto_nombre = producto_nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", id_factura=" + id_factura + ", cod_producto=" + cod_producto + ", producto_nombre=" + producto_nombre + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    
}
