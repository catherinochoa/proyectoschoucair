package pageobject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SeleniumJQuerySelectPageObject extends PageObject {
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[3]/div/div[2]/span/span[1]/span/span[2]")
	public WebElementFacade listaDesplegable;
	
	
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	public WebElementFacade campoBusqueda;

	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[3]/div/div[2]/span/span[1]/span")
	public WebElementFacade paisSeleccionado;

	public void click_lista_desplegable_jquery() {
		listaDesplegable.click();
	}

	public void buscarPais(String pais) {
		campoBusqueda.click();
		campoBusqueda.sendKeys(pais);
		campoBusqueda.sendKeys(Keys.ENTER);
	}
	
	public void verificarMensaje(String mensaje) {
		String textoMensaje = paisSeleccionado.getText();
		assertThat(textoMensaje, containsString(mensaje));
	}
	

}
