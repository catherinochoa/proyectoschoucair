package steps;

import net.thucydides.core.annotations.Step;
import pageobject.SeleniumAlertsPageObject;
import pageobject.SeleniumOpcionesPageObject;

public class SeleniumAlertsSteps {

	SeleniumAlertsPageObject ventana; 
	SeleniumOpcionesPageObject opcion;
	
	@Step
	public void seleccionarOpcion() {
		opcion.click_opcion_basico();
		opcion.click_opcion_javascript_alerts();
	}

	@Step
	public void clickEnSolicitud(String mensaje) {
		ventana.clickBotonSolicitud(mensaje);
	}
	
	@Step
	public void verificarMensaje(String mensaje) {
		ventana.verificarMensaje(mensaje);
	}
}
