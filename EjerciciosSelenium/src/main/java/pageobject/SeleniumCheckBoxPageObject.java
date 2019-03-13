package pageobject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SeleniumCheckBoxPageObject extends PageObject {
	
	@FindBy(id="isAgeSelected")
	public WebElementFacade checkBox;

	@FindBy(id="txtAge")
	public WebElementFacade labelMensaje;

	
	public void clickCheckBox() {
		checkBox.click();
	}

	public void verificarMensaje(String mensaje) {
		String textoMensaje = labelMensaje.getText();
		assertThat(textoMensaje, containsString(mensaje));
	}
}
