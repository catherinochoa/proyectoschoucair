package steps;

import net.thucydides.core.annotations.Step;
import pageobject.SeleniumOpcionesPageObject;
import pageobject.SeleniumSelectList;

public class SeleniumSelectListSteps {

	SeleniumOpcionesPageObject opcion;
	SeleniumSelectList lista;
	
	@Step
	public void seleccionarOpcion() {
			opcion.click_opcion_basico();
			opcion.click_opcion_seleccionar_lista();
	}
	
	@Step
	public void click_en_la_lista(String dia) {
		lista.click_lista_desplegable(dia);
	}
		
	@Step
	public void verificar_mensaje(String mensaje) {
		lista.verificarMensaje(mensaje);
	}
	

	
}
