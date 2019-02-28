package co.com.colorlib.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class PaginaPrincipal extends PageObject {

	public static final Target CAMPO_USUARIO = Target.the("ingresar usuario").located(By.xpath("//*[@id=\"login\"]/form/input[1]"));
	public static final Target CAMPO_CLAVE = Target.the("ingresar contraseña").located(By.xpath("//*[@id=\"login\"]/form/input[2]"));
	public static final Target BOTON_INGRESAR = Target.the("botón para ingresar").located(By.xpath("//*[@id=\"login\"]/form/button"));
	
	
}
