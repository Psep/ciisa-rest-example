package cl.ciisa.arquitectura.evaluacion2.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidad correspondiente a la tabla tblProducto.
 * 
 * @author psep
 *
 */
@Entity
@Table(name = "tblProducto")
public class Producto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codigoProd;

	private String nombreProd;

	private Integer precioProd;

	public Integer getCodigoProd() {
		return codigoProd;
	}

	public void setCodigoProd(Integer codigoProd) {
		this.codigoProd = codigoProd;
	}

	public String getNombreProd() {
		return nombreProd;
	}

	public void setNombreProd(String nombreProd) {
		this.nombreProd = nombreProd;
	}

	public Integer getPrecioProd() {
		return precioProd;
	}

	public void setPrecioProd(Integer precioProd) {
		this.precioProd = precioProd;
	}

}
