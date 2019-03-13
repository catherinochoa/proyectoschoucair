package definitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import steps.SeleniumSelectListSteps;

public class SeleniumSelectListDefinitions {
	
	@Steps
	SeleniumSelectListSteps lista;
	
	@Dado("^selecciono la opción select dropddown list$")
	public void seleccionoLaOpciónSelectDropddownList()  {
	  lista.seleccionarOpcion();
	}


	@Cuando("^selecciono el día (.*)$")
	public void seleccionoElDíaMonday(String dia)  {
	    lista.click_en_la_lista(dia);
	}

	@Entonces("^aparece un mensaje indicando que (.*) ha sido seleccionado$")
	public void apareceUnMensajeIndicandoQueMondayHaSidoSeleccionado(String mensaje) {
	    lista.verificar_mensaje(mensaje);
	}


}
