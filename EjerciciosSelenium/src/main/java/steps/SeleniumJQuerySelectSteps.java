package steps;

import net.thucydides.core.annotations.Step;
import pageobject.SeleniumJQuerySelectPageObject;
import pageobject.SeleniumOpcionesPageObject;

public class SeleniumJQuerySelectSteps {

	SeleniumJQuerySelectPageObject jquery;
	SeleniumOpcionesPageObject opcion;
	
	@Step
	public void seleccionarOpcion() {
		opcion.click_opcion_intermedio();
		opcion.click_opcion_jquery_dropdown();		
	}
	
	@Step
	public void buscarPais(String pais) {
		jquery.click_lista_desplegable_jquery();
		jquery.buscarPais(pais);
	}
	
	@Step 
	public void verificarPais(String pais) {
		jquery.verificarMensaje(pais);
	}

}
