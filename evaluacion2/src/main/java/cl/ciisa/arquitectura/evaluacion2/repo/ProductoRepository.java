package cl.ciisa.arquitectura.evaluacion2.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.ciisa.arquitectura.evaluacion2.model.Producto;

/**
 * Interfaz de patrón de diseño repository y que extiende de
 * CrudRepository para obtener métodos básicos abstractos de CRUD
 * y facilitar su operación con JPA.
 * 
 * @author psep
 *
 */
@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer>{
	

}
