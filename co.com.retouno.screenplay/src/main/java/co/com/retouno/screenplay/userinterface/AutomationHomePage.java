package co.com.retouno.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.automationtesting.in/Index.html")
public class AutomationHomePage extends PageObject {

	public static final Target BOTON_REGISTRO = Target.the("El botón lleva al formulario de registro")
			.located(By.id("btn2"));
	
}
