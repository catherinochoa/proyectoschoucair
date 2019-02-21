package co.com.retotres.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automatizacion.herokuapp.com/pperez/")
public class AdministracionDeHospitalesPaginaPrincipal extends PageObject {
	
	public static final Target OPCION_AGREGAR_DOCTOR = Target.the("La opción permite ingresar a registrar el doctor")
			.located(By.xpath("//a[contains(text(),'Agregar Doctor')]"));
	
	public static final Target OPCION_AGREGAR_PACIENTE = Target.the("La opción permite ingresar a registrar el paciente")
			.located(By.xpath("//a[contains(text(),'Agregar Paciente')]"));
	
	public static final Target OPCION_AGREGAR_CITA = Target.the("La opción permite ingresar a agendar la cita médica")
			.located(By.xpath("//a[contains(text(),'Agendar Cita')]"));
}
