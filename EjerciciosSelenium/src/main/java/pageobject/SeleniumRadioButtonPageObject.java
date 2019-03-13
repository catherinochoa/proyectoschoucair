package pageobject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SeleniumRadioButtonPageObject extends PageObject {
	
	@FindBy(xpath="//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]/input")
	public WebElementFacade radioButtonFemenino;

	@FindBy(id="buttoncheck")
	public WebElementFacade botonValorSeleccionado;

	@FindBy(xpath="//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]")
	public WebElementFacade labelMensaje;

	
	public void click_radio_button_femenino() {
		radioButtonFemenino.click();
		botonValorSeleccionado.click();
	}

	public void verificarMensaje(String mensaje) {
		String textoMensaje = labelMensaje.getText();
		assertThat(textoMensaje, containsString(mensaje));
	}
}
