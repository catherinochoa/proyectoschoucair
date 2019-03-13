package pageobject;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ColorLibHomePageObject extends PageObject {
	
	
	//Opción de menú Forms
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/a")
	public WebElementFacade opcionForm;
	
	//Opción de menú Form Validation
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/ul/li[2]/a")
	public WebElementFacade opcionFormValidation;
	
	public void seleccionarOpcionMenu() {
		opcionForm.click();
		opcionFormValidation.click();		
	}
	

}
