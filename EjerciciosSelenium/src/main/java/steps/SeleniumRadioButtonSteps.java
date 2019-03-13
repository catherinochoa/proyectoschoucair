package steps;

import net.thucydides.core.annotations.Step;
import pageobject.SeleniumOpcionesPageObject;
import pageobject.SeleniumRadioButtonPageObject;

public class SeleniumRadioButtonSteps {
	
	SeleniumRadioButtonPageObject radioButton;
	SeleniumOpcionesPageObject opcion;
	
	@Step
	public void seleccionarOpcion() {
		opcion.click_opcion_basico();
		opcion.click_opcion_radio_button();
	}
	
	@Step
	public void seleccionar_radio_button() {
		radioButton.click_radio_button_femenino();
	}

	@Step
	public void verificarMensaje(String mensaje) {
		radioButton.verificarMensaje(mensaje);
	}
	
}
