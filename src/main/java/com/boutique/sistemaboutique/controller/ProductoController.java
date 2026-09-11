package com.boutique.sistemaboutique.controller;

import com.boutique.sistemaboutique.model.Producto;
import com.boutique.sistemaboutique.service.ProductoService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Controlador encargado de gestionar las solicitudes relacionadas
 * con los productos del inventario de SistemaBoutique.
 *
 * @author Yuranis M. J.
 */
@Controller
public class ProductoController {

  private final ProductoService productoService;

  /**
   * Inicializa el controlador con el servicio de productos.
   *
   * @param productoService servicio encargado de la lógica de productos
   */
  public ProductoController(ProductoService productoService) {
    this.productoService = productoService;
  }

  /**
   * Consulta los productos y los envía a la vista del inventario.
   *
   * @param modelo objeto utilizado para enviar información a la vista
   * @return nombre de la plantilla que muestra el inventario
   */
  @GetMapping("/productos")
  public String listarProductos(Model modelo) {
    List<Producto> productos = productoService.listarProductos();
    modelo.addAttribute("productos", productos);

    return "productos";
  }
  /**
 * Muestra el formulario para registrar un nuevo producto.
 *
 * @param modelo objeto utilizado para enviar información a la vista
 * @return formulario de registro de productos
 */
@GetMapping("/productos/nuevo")
public String mostrarFormulario(Model modelo) {

  modelo.addAttribute("producto", new Producto());

  return "producto-formulario";
}
/**
 * Guarda un nuevo producto en el inventario.
 *
 * @param producto producto recibido desde el formulario
 * @return redirección hacia el listado de productos
 */
@PostMapping("/productos/guardar")
public String guardarProducto(Producto producto) {
  productoService.guardarProducto(producto);

  return "redirect:/productos";
}

}