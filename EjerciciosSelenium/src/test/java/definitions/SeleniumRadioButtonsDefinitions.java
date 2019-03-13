package definitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import steps.SeleniumRadioButtonSteps;

public class SeleniumRadioButtonsDefinitions {

	@Steps
	SeleniumRadioButtonSteps radioButton;
	
	@Dado("^selecciono la opción Radio Buttons Demo$")
	public void seleccionoLaOpciónRadioButtonsDemo()  {
	   radioButton.seleccionarOpcion();
	}


	@Cuando("^doy click en el radio button femenino$")
	public void doyClickEnElRadioButtonFemenino()  {
	  radioButton.seleccionar_radio_button();
	}

	@Entonces("^muestra un mensaje indicando que (.*) ha sido seleccionado$")
	public void muestraUnMensajeIndicandoQueFemaleHaSidoSeleccionado(String mensaje)  {
	 radioButton.verificarMensaje(mensaje);
	}

	
}
