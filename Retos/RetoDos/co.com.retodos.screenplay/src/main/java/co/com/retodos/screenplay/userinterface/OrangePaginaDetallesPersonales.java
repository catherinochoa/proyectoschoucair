package co.com.retodos.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class OrangePaginaDetallesPersonales extends PageObject {
	
	
	public static final Target FORMULARIO_DETALLES_PERSONALES = Target.the("Formulario muestra la información con los detalles personales ").located(By.xpath("//*[@id=\"1_inputfileddiv\"]/div/input"));
	public static final Target SELECCIONAR_GRUPO_SANGUINEO = Target.the("Seleccionar el tipo de sangre del empleado").located(By.xpath("//*[@id=\"1_inputfileddiv\"]/div/input"));
	public static final Target CAMPO_ACTIVIDADES = Target.the("Ingresar la actividad que le gusta hacer").located(By.xpath("//input[@id='5']"));
	public static final Target BOTON_GUARDAR = Target.the("Botón guardar información importante").located(By.xpath("//button[contains(text(),'save')]"));
	

}
