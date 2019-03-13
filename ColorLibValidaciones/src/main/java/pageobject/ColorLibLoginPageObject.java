package pageobject;

import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class ColorLibLoginPageObject extends PageObject {
	
		//Campo usuario
		@FindBy(xpath="//*[@id=\"login\"]/form/input[1]")
		public WebElementFacade campoUsuario;
		
		//Campo contraseña
		@FindBy(xpath="//*[@id=\"login\"]/form/input[2]")
		public WebElementFacade campoClave;

		//Botón ingresar 
		@FindBy(xpath="//*[@id=\"login\"]/form/button")
		public WebElementFacade botonIngresar;
		
		//Ingresar datos de usuario 
		public void ingresarCredenciales(String usuario, String clave) {
			campoUsuario.click();
			campoUsuario.sendKeys(usuario);
			campoClave.click();
			campoClave.sendKeys(clave);
			botonIngresar.click();
		}
	
}
