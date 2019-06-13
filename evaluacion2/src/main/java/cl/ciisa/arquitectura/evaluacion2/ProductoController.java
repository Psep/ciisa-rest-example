package cl.ciisa.arquitectura.evaluacion2;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.ciisa.arquitectura.evaluacion2.exceptions.ProductoNotFoundException;
import cl.ciisa.arquitectura.evaluacion2.model.Producto;
import cl.ciisa.arquitectura.evaluacion2.repo.ProductoRepository;

/**
 * Clase controlador de producto.
 * 
 * @author psep
 *
 */
@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	/**
	 * Atributo inyectado con CDI para acceder el repositorio
	 * de producto en base de datos.
	 */
	@Autowired
	private ProductoRepository repository;
	
	/**
	 * Método que busca producto por ID, retornando dicho objeto.
	 * En caso de no ser encontrado, lanza excepción ProductoNotFoundException.
	 * 
	 * @param codigo
	 * @return producto
	 */
	@GetMapping("/retrieve/id/{codigo}")
	public Producto getProductoById(@PathVariable Integer codigo) {
		Optional<Producto> result = this.repository.findById(codigo);
		
		if (!result.isPresent()) {
			throw new ProductoNotFoundException(codigo);
		} else {
			return result.get();
		}
	}

}
