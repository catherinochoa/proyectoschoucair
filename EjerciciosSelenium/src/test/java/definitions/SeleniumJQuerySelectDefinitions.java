package definitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import steps.SeleniumJQuerySelectSteps;

public class SeleniumJQuerySelectDefinitions {
	
	@Steps
	SeleniumJQuerySelectSteps jquery;

	@Dado("^selecciono la opción JQuery Select Dropdown$")
	public void seleccionoLaOpciónJQuerySelectDropdown() {
		jquery.seleccionarOpcion();
	}


	@Cuando("^busco el pais (.*) en la lista y lo selecciono$")
	public void buscoElPaiEnLaListaYLoSelecciono(String pais)  {
	   jquery.buscarPais(pais);
	}


	@Entonces("^muestra que la lista ha seleccionado (.*)$")
	public void muestraQueLaListaHaSeleccionadoPuertoRico(String pais){
		jquery.verificarPais(pais);
	}
	
}
