package com.boutique.sistemaboutique.repository;

import com.boutique.sistemaboutique.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio para gestionar las operaciones de acceso a datos
 * de los productos del inventario de SistemaBoutique.
 *
 * @author Yuranis M. J.
 */
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}