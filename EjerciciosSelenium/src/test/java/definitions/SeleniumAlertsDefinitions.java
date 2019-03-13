package definitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import steps.SeleniumAlertsSteps;

public class SeleniumAlertsDefinitions {
	
	@Steps
	SeleniumAlertsSteps ventana;
	
	@Dado("^selecciono la opción Alerts & Modals$")
	public void seleccionoLaOpciónAlertsModals()  {
	    ventana.seleccionarOpcion();
	}


	@Cuando("^ingreso la palabra (.*)$")
	public void ingresoLaPalabraRefuerzoAutomatización(String mensaje)  {
		ventana.clickEnSolicitud(mensaje);
	}

	@Entonces("^muestra un mensaje con el texto (.*)$")
	public void muestraUnMensajeConElTextoRefuerzoAutomatización(String mensaje)  {
		ventana.verificarMensaje(mensaje);
	}
	

}
