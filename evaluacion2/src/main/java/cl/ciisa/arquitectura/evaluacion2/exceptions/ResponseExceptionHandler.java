package cl.ciisa.arquitectura.evaluacion2.exceptions;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Clase Exception Handle que permite identificar las excepciones
 * definidas en un controller para luego realizar su par con un estado HTTP.
 * 
 * @author psep
 *
 */
@ControllerAdvice
public class ResponseExceptionHandler extends ResponseEntityExceptionHandler {
	
	/**
	 * Método que realiza pareo entre una excepción lanzada desde el controller
	 * de tipo ProductoNotFoundException y parear hacía un error 404.
	 * 
	 * @param response
	 * @throws IOException
	 */
	@ExceptionHandler(ProductoNotFoundException.class)
	public void springHandleNotFound(HttpServletResponse response) throws IOException {
        response.sendError(HttpStatus.NOT_FOUND.value());
    }

}
