package steps;

import net.thucydides.core.annotations.Step;
import pageobject.ColorLibFormPageObject;
import pageobject.ColorLibHomePageObject;
import pageobject.ColorLibLoginPageObject;

public class ColorLibSteps {
	
	ColorLibLoginPageObject colorlib;
	ColorLibFormPageObject colorlibForm;
	ColorLibHomePageObject colorlibHome;

	@Step
	public void abrirPagina() {
		colorlib.open();
		
	}

	@Step
	public void ingresarCredenciales(String usuario, String clave) {
		colorlib.ingresarCredenciales(usuario, clave);
		
	}
	
	@Step
	public void seleccionarMenu() {
		colorlibHome.seleccionarOpcionMenu();
		
	}
	
	@Step
	public void confirmarIngreso() {
		colorlibForm.ingresoExitoso();
	}

}
