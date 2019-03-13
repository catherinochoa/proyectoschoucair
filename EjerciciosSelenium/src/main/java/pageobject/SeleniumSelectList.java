package pageobject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SeleniumSelectList extends PageObject {

	
	@FindBy(id="select-demo")
	public WebElementFacade listaDesplegable;

	@FindBy(xpath="//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[2]")
	public WebElementFacade labelMensaje;

	
	public void click_lista_desplegable(String dia) {
		listaDesplegable.click();
		listaDesplegable.selectByVisibleText(dia);
	}
	
	public void verificarMensaje(String mensaje) {
		String textoMensaje = labelMensaje.getText();
		assertThat(textoMensaje, containsString(mensaje));
	}

}
