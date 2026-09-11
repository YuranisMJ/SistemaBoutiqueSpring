package com.boutique.sistemaboutique.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

/**
 * Entidad que representa un producto del inventario de SistemaBoutique.
 * Esta clase se relaciona con la tabla producto de la base de datos.
 *
 * @author Yuranis M. J.
 */
@Entity
@Table(name = "producto")
public class Producto {

    /**
     * Identificador único del producto.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    /**
     * Nombre de la prenda o producto.
     */
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    /**
     * Descripción detallada del producto.
     */
    @Column(name = "descripcion", length = 255)
    private String descripcion;

    /**
     * Talla disponible para la prenda.
     */
    @Column(name = "talla", nullable = false, length = 10)
    private String talla;

    /**
     * Color del producto.
     */
    @Column(name = "color", nullable = false, length = 30)
    private String color;

    /**
     * Precio de venta del producto.
     */
    @Column(name = "precio", nullable = false)
    private BigDecimal precio;

    /**
     * Cantidad disponible en inventario.
     */
    @Column(name = "stock", nullable = false)
    private Integer stock;

    /**
     * Cantidad mínima permitida antes de generar alerta.
     */
    @Column(name = "stock_minimo", nullable = false)
    private Integer stockMinimo;

    /**
     * Categoría a la que pertenece el producto.
     */
    @Column(name = "id_categoria", nullable = false)
    private Integer idCategoria;

    public Producto() {
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(Integer stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
}