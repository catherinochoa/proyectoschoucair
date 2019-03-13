package steps;

import java.util.List;

import model.ColorLibDatos;
import pageobject.ColorLibFormPageObject;

public class LlenarFormValidationSteps {

	ColorLibFormPageObject datosFormulario;

	public void ingresarDatos(List<ColorLibDatos> datos) {

		datosFormulario.ingresarRequerido(datos.get(0).getRequired());
		datosFormulario.ingresarEmail(datos.get(0).getEmail());
		datosFormulario.ingresarClave(datos.get(0).getPassword());
		datosFormulario.confirmarClave(datos.get(0).getPassword());
		datosFormulario.ingresarFecha(datos.get(0).getDate());
		datosFormulario.ingresarUrl(datos.get(0).getUrl());
		datosFormulario.ingresarDigitos(datos.get(0).getDigitsOnly());
		datosFormulario.ingresarRango(datos.get(0).getRange());
		datosFormulario.click_checkbox_politica();
	}
	
	
}
