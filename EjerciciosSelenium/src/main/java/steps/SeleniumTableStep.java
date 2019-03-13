package steps;

import java.util.List;

import model.SeleniumDatosDemo;
import net.thucydides.core.annotations.Step;
import pageobject.SeleniumOpcionesPageObject;
import pageobject.SeleniumTablePageObject;

public class SeleniumTableStep {
	
	SeleniumTablePageObject table;
	SeleniumOpcionesPageObject opcion;
	
	@Step
	public void seleccionarOpcion() {
		opcion.click_opcion_avanzado();
		opcion.click_opcion_table_data_search();		
	}
	
	@Step
	public void buscarNombre(List<SeleniumDatosDemo> nombre) {
		table.click_en_boton_filtrar();
		table.click_en_campo_nombre(nombre.get(0).getNombre());
	}
	
	@Step
	public void verificarRegistro(String registro) {
		table.verificar_registro_nombre(registro);
	}

	@Step
	public void buscarNumero(List<SeleniumDatosDemo> numero) {
		table.click_campo_bucar(numero.get(0).getNumero1());
	}

	@Step
	public void verificarMensaje(String mensaje) {
		table.verificar_mensaje(mensaje);
	}
	

}
