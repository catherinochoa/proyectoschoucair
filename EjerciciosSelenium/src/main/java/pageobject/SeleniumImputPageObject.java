package pageobject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SeleniumImputPageObject extends PageObject {

	//Ingresar palabra 
	@FindBy(id="user-message")
	public WebElementFacade campoPalabra;
		
	@FindBy(xpath="//*[@id=\"get-input\"]/button")
	public WebElementFacade botonMostrarMensaje;
	
	@FindBy(id="display")
	public WebElementFacade labelMensaje;
	
	@FindBy(id="sum1")
	public WebElementFacade campoNum1;
		
	@FindBy(id="sum2")
	public WebElementFacade campoNum2;
	
	@FindBy(xpath="//*[@id=\"gettotal\"]/button")
	public WebElementFacade botonMostrarSuma;
		
	@FindBy(id="displayvalue")
	public WebElementFacade labelSuma;
	

	public void ingresarMensaje(String mensaje) {
		campoPalabra.click();
		campoPalabra.sendKeys(mensaje);
		botonMostrarMensaje.click();
		
	}

	public void verificarMensaje(String mensaje) {
			String label = mensaje;
			String textoMensaje = labelMensaje.getText();
			assertThat(textoMensaje, containsString(label));
	}
	
	public void ingresarValorA(String num1) {
		campoNum1.click();
		campoNum1.sendKeys(num1);
	}
	
	public void ingresarValorB(String num2) {
		campoNum2.click();
		campoNum2.sendKeys(num2);
		botonMostrarSuma.click();
	}
	
	public void verificarSuma(String mensaje) {
		String label = mensaje;
		String textoMensaje = labelSuma.getText();
		assertThat(textoMensaje, containsString(label));
	}

}
	

