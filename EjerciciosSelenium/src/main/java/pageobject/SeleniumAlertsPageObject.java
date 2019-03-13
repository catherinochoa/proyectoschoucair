package pageobject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SeleniumAlertsPageObject extends PageObject {
	
	
	@FindBy(xpath="//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")
	public WebElementFacade botonSolicitud;
	
	@FindBy(id="prompt-demo")
	public WebElementFacade labelMensaje;
	
	public void clickBotonSolicitud(String mensaje) {
		botonSolicitud.click();
		getDriver().switchTo().alert().sendKeys(mensaje);
		getDriver().switchTo().alert().accept();
	}

	public void verificarMensaje(String mensaje) {
		String textoMensaje = labelMensaje.getText();
		assertThat(textoMensaje, containsString(mensaje));
	}
	
}
