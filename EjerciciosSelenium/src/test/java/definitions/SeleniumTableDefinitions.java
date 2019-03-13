package definitions;

import java.util.List;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import model.SeleniumDatosDemo;
import net.thucydides.core.annotations.Steps;
import steps.SeleniumTableStep;

public class SeleniumTableDefinitions {
	
	@Steps
	SeleniumTableStep table;
	
	@Dado("^selecciono la opción table data search$")
	public void seleccionoLaOpciónTableDataSearch()  {
	    table.seleccionarOpcion();
	}


	@Cuando("^ingreso el nombre$")
	public void ingresoElNombre(List<SeleniumDatosDemo> nombre) {
	    table.buscarNombre(nombre);
	}

	@Entonces("^muestra en la tabla un único registro con el nombre (.*)$")
	public void muestraEnLaTablaUnÚnicoRegistroConElNombreDaniel(String nombre) {
		table.verificarRegistro(nombre);
	}

	@Cuando("^ingreso el número$")
	public void ingresoElNúmero(List<SeleniumDatosDemo> numero) {
		table.buscarNumero(numero);
	}

	@Entonces("^muestra en pantalla (.*)$")
	public void muestraEnPantallaNoResultsFound(String mensaje) {
		table.verificarMensaje(mensaje);
	}

}
