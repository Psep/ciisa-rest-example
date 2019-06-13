package cl.ciisa.arquitectura.evaluacion2.exceptions;

/**
 * Excepción custom para identificar un producto no encontrado.
 * 
 * @author psep
 *
 */
public class ProductoNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor de la clase.
	 * 
	 * @param codigo
	 */
	public ProductoNotFoundException(Integer codigo) {
		super(String.format("El codigo de producto %s no fue encontrado.", codigo));
	}

}
