package definitions;

import java.util.List;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import model.SeleniumDatosDemo;
import net.thucydides.core.annotations.Steps;
import steps.SeleniumSteps;

public class SeleniumDefinitions {
	
	@Steps
	SeleniumSteps selenium;

	@Dado("^que ingreso al sitio web Seleniumeasy$")
	public void queIngresoAlSitioWebSeleniumeasy() {
	    selenium.abrirPagina();
	}


	@Dado("^selecciono la opción Simple Form Demo$")
	public void seleccionoLaOpciónSimpleFormDemo()  {
	   selenium.seleccionarOpcion();
	}

	@Cuando("^ingreso el mensaje$")
	public void ingresoElMensaje(List<SeleniumDatosDemo> dato)  {
	    selenium.ingresarMensaje(dato);
	}

	@Entonces("^muestra el mensaje correcto (.*)$")
	public void muestraElMensajeCorrecto(String mensaje)  {
	    selenium.verificarMensaje(mensaje);
	}

	@Cuando("^ingreso dos números enteros$")
	public void ingresoDosNúmerosEnteros(List<SeleniumDatosDemo> dato) {
	    selenium.ingresarNumeros(dato);
	}

	@Entonces("^muestra el resultado de la suma es (.*)$")
	public void muestraElResultadoDeLaSuma(String dato) {
	    selenium.verificarSuma(dato);
	}

	
}
