package co.com.retounotips.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AutomationWebTable extends PageObject {
	
	public static final Target LABEL_TEXTO = Target.the("El label muestra el texto esperado para confirmar el registro exitoso")
			.located(By.xpath("/html/body/section/div[1]/div/div[2]/h4[1]"));
	

}
