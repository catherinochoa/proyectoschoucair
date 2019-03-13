package pageobject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SeleniumTablePageObject extends PageObject {
	
	//Listed Users
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/div/div/button")
	public WebElementFacade botonFiltrar;

	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/thead/tr/th[3]/input")
	public WebElementFacade campoNombre;

	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[3]")
	public WebElementFacade labelNombre;

	//Tasks
	@FindBy(id="task-table-filter")
	public WebElementFacade campoBuscar;

	@FindBy(xpath="//*[@id=\"task-table\"]/tbody/tr[8]/td")
	public WebElementFacade labelMensaje;
	
	public void click_en_boton_filtrar() {
		botonFiltrar.click();
	}
	
	public void click_en_campo_nombre(String nombre) {
		campoNombre.click();
		campoNombre.sendKeys(nombre);
	}
	
	public void verificar_registro_nombre(String nombre) {
			String textoMensaje = labelNombre.getText();
			assertThat(textoMensaje, containsString(nombre));
	}

	public void click_campo_bucar(String numero) {
		campoBuscar.click();
		campoBuscar.sendKeys(numero);
	}

	public void verificar_mensaje(String mensaje) {
		String textoMensaje = labelMensaje.getText();
		assertThat(textoMensaje, containsString(mensaje));
	}
}
