package co.com.colorlib.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MenuColorlib extends PageObject{

	public static final Target MENU_FORMS = Target.the("menú principal opción FORMS").located(By.xpath("//*[@id='menu']/li[6]/a"));
	public static final Target OPCION_FORMS_VALIDATION = Target.the("opción forms validations").located(By.xpath("//*[@id=\"menu\"]/li[6]/ul/li[2]/a"));
	
	
	
}
