package steps;

import net.thucydides.core.annotations.Step;
import pageobject.SeleniumCheckBoxPageObject;
import pageobject.SeleniumOpcionesPageObject;

public class SeleniumCheckBoxSteps {
	
	SeleniumCheckBoxPageObject checkbox;
	SeleniumOpcionesPageObject opcion;
	
	@Step 
	public void seleccionarOpcion() {
		opcion.click_opcion_basico();
		opcion.click_opcion_check_box();
	}
	
	@Step
	public void seleccionar_el_check_box() {
		checkbox.clickCheckBox();
	}
	@Step
	public void verificarMensaje(String mensaje) {
		checkbox.verificarMensaje(mensaje);
	}

}
