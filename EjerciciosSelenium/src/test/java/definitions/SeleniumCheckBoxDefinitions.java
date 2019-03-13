package definitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import steps.SeleniumCheckBoxSteps;

public class SeleniumCheckBoxDefinitions {
	
	@Steps
	SeleniumCheckBoxSteps selenium;
	
	@Dado("^selecciono la opción Check box demo$")
	public void seleccionoLaOpciónCheckBoxDemo() {
		selenium.seleccionarOpcion();
	}


	@Cuando("^doy click en el checkbox$")
	public void doyClickEnElCheckbox()  {
	   selenium.seleccionar_el_check_box();
	}

	@Entonces("^muestra el mensaje (.*) en pantalla$")
	public void muestraElMensajeSuccessCheckBoxIsCheckedEnPantalla(String mensaje) {
	    selenium.verificarMensaje(mensaje);
	}
	

}
