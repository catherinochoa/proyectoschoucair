package co.com.retoexito.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.exito.com/")
public class ExitoPaginaPrincipal extends PageObject {

	public static final Target CAMPO_BUSQUEDA = Target.the("campo para buscar").located(By.id("tbxSearch"));
	
}
