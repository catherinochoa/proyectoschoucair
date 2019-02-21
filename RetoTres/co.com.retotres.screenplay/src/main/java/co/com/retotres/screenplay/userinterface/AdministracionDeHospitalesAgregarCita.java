package co.com.retotres.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AdministracionDeHospitalesAgregarCita extends PageObject {
	
	public static final Target FECHA_CITA = Target.the("El campo permite ingresar la fecha de la cita")
			.located(By.id("datepicker"));
	
	public static final Target DOCUMENTO_PACIENTE = Target.the("El campo permite ingresar el documento del paciente")
			.located(By.xpath("//input[@placeholder='Ingrese el documento de identidad del paciente']"));
	
	public static final Target DOCUMENTO_DOCTOR = Target.the("El campo permite ingresar el documento del doctor")
			.located(By.xpath("//input[@placeholder='Ingrese el documento de identidad del doctor']"));
	
	public static final Target CAMPO_OBSERVACIONES = Target.the("El campo permite ingresar las observaciones")
			.located(By.xpath("//textarea[@class='form-control']"));
	
	public static final Target BOTON_GUARDAR = Target.the("El botón permite guardar los datos del doctor")
			.located(By.xpath("//a[@class='btn btn-primary pull-right']"));
	
	public static final Target MENSAJE_EXITOSO = Target.the("El mensaje de datos guardados correctamente")
			.located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/p"));
	
}
