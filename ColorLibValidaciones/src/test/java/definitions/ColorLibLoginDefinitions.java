package definitions;

import java.util.List;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import model.ColorLibDatos;
import net.thucydides.core.annotations.Steps;
import steps.ColorLibSteps;
import steps.LlenarFormValidationSteps;

public class ColorLibLoginDefinitions {
	
	@Steps
	ColorLibSteps colorlib;
	@Steps
	LlenarFormValidationSteps llenarFormulario;
	
	@Dado("^que ingreso al sitio web Colorlib$")
	public void queIngresoAlSitioWebColorlib()  {
	    colorlib.abrirPagina();
	}

	@Dado("^digito usuario (.*) y la clave (.*)$")
	public void digitoUsuarioYLaClave(String usuario, String clave)  {
	    colorlib.ingresarCredenciales(usuario, clave);
	}

	@Cuando("^ingreso al menú Fomrs y submenú Form Validation$")
	public void ingresoAlMenúFomrsYSubmenúFormValidation()  {
	    colorlib.seleccionarMenu();
	}

	@Cuando("^lleno el formulario de la funcionalidad Block Validation$")
	public void llenarFormulario(List<ColorLibDatos> datos) {
		llenarFormulario.ingresarDatos(datos);
	}
	

	@Entonces("^muestra un mensaje de registro exitoso$")
	public void muestraUnMensajeDeRegistroExitoso()  {
		colorlib.confirmarIngreso();
	}





}
