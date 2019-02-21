package co.com.retotres.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AdministracionDeHospitalesAgregarDoctor extends PageObject {
	
	public static final Target CAMPO_NOMBRE = Target.the("El campo permite ingresar el nombre del doctor")
			.located(By.id("name"));
	
	public static final Target CAMPO_APELLIDO = Target.the("El campo permite ingresar el apellido del doctor")
			.located(By.id("last_name"));
	
	public static final Target CAMPO_TELEFONO = Target.the("El campo permite ingresar el telefono del doctor")
			.located(By.id("telephone"));
	
	public static final Target SELECCIONAR_TIPO_DOCUMENTO = Target.the("Seleccionar el tipo de documento")
			.located(By.id("identification_type"));
	
	public static final Target SELECCIONAR_OPCION_CEDULA = Target.the("Seleccionar cédula de ciudadanía")
			.located(By.xpath("//option[@value='Cédula de ciudadanía']"));
	
	public static final Target CAMPO_DOCUMENTO = Target.the("El campo permite ingresar el número de documento")
			.located(By.id("identification"));
	
	public static final Target BOTON_GUARDAR = Target.the("El botón permite guardar los datos del doctor")
			.located(By.xpath("//a[@class='btn btn-primary pull-right']"));
	
	public static final Target MENSAJE_EXITOSO = Target.the("El mensaje de datos guardados correctamente")
			.located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/p"));
	

}
