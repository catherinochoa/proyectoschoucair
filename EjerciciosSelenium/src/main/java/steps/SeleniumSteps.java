package steps;

import java.util.List;

import model.SeleniumDatosDemo;
import net.thucydides.core.annotations.Step;
import pageobject.SeleniumImputPageObject;
import pageobject.SeleniumOpcionesPageObject;

public class SeleniumSteps {

	SeleniumOpcionesPageObject demo;
	SeleniumImputPageObject textoMensaje;
	
	@Step
	public void abrirPagina() {
		demo.open();
		
	}
	
	@Step 
	public void seleccionarOpcion() {
		demo.click_opcion_basico();
		demo.click_opcion_simple_form();
	}
		
	@Step
	public void ingresarMensaje(List<SeleniumDatosDemo> mensaje) {
		textoMensaje.ingresarMensaje(mensaje.get(0).getMensaje());
	}
	
	@Step
	public void verificarMensaje(String mensaje) {
		textoMensaje.verificarMensaje(mensaje);
	}

	@Step
	public void ingresarNumeros(List<SeleniumDatosDemo> dato) {
		textoMensaje.ingresarValorA(dato.get(0).getNumero1());
		textoMensaje.ingresarValorB(dato.get(0).getNumero2());
		
	}
	
	@Step
	public void verificarSuma(String mensaje) {
		textoMensaje.verificarSuma(mensaje);
	}
}