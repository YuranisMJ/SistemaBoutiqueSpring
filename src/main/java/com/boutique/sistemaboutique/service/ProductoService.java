package com.boutique.sistemaboutique.service;

import com.boutique.sistemaboutique.model.Producto;
import com.boutique.sistemaboutique.repository.ProductoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * Contiene la lógica de negocio relacionada con los productos
 * del inventario de SistemaBoutique.
 *
 * @author Yuranis M. J.
 */
@Service
public class ProductoService {

  private final ProductoRepository productoRepository;

  /**
   * Inicializa el servicio con el repositorio de productos.
   *
   * @param productoRepository repositorio para acceder a los productos
   */
  public ProductoService(ProductoRepository productoRepository) {
    this.productoRepository = productoRepository;
  }

  /**
   * Consulta todos los productos registrados en el inventario.
   *
   * @return lista de productos
   */
  public List<Producto> listarProductos() {
    return productoRepository.findAll();
  }

  /**
   * Guarda un producto nuevo o actualiza uno existente.
   *
   * @param producto producto que se desea guardar
   * @return producto guardado
   */
  public Producto guardarProducto(Producto producto) {
    return productoRepository.save(producto);
  }

  /**
   * Busca un producto por su identificador.
   *
   * @param idProducto identificador del producto
   * @return producto encontrado
   */
  public Producto buscarPorId(Integer idProducto) {
    return productoRepository.findById(idProducto).orElse(null);
  }

  /**
   * Elimina un producto utilizando su identificador.
   *
   * @param idProducto identificador del producto que se desea eliminar
   */
  public void eliminarProducto(Integer idProducto) {
    productoRepository.deleteById(idProducto);
  }
}