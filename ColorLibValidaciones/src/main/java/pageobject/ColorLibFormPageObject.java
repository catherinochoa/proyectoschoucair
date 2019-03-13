package pageobject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ColorLibFormPageObject extends PageObject {
	
	//Label formulario
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div[1]/div/div/header/h5")
	public WebElementFacade labelForm;

	@FindBy(id="required2")
	public WebElementFacade campoRequerido;
	
	@FindBy(id="email2")
	public WebElementFacade campoEmail;

	@FindBy(id="password2")
	public WebElementFacade campoPassword;

	@FindBy(id="confirm_password2")
	public WebElementFacade campoConfirmarPassword;
	
	@FindBy(id="date2")
	public WebElementFacade campoDate;

	@FindBy(id="url2")
	public WebElementFacade campoUrl;
	
	@FindBy(id="digits")
	public WebElementFacade campoDigitsOnly;
	
	@FindBy(id="range")
	public WebElementFacade campoRange;
	
	@FindBy(id="agree2")
	public WebElementFacade checkPolitica;
	
	//Confirmar ingreso exitoso
	public void ingresoExitoso() {
		String label = "Popup Validation";
		String labelMensaje = labelForm.getText();
		assertThat(labelMensaje, containsString(label));
	}

	//Ingresar campos requeridos en el formulario 
	
	public void ingresarRequerido(String requerido) {
		
		campoRequerido.click();
		campoRequerido.clear();
		campoRequerido.sendKeys(requerido);
	}

	public void ingresarEmail(String email) {
		campoEmail.click();
		campoEmail.clear();
		campoEmail.sendKeys(email);
	}
	
	public void ingresarClave(String clave) {
		campoPassword.click();
		campoPassword.clear();
		campoPassword.sendKeys(clave);
	}
	
	public void confirmarClave(String clave) {
		campoConfirmarPassword.click();
		campoConfirmarPassword.clear();
		campoConfirmarPassword.sendKeys(clave);
	}
	
	public void ingresarFecha(String fecha) {
		campoDate.click();
		campoDate.clear();
		campoDate.sendKeys(fecha);
	}

	public void ingresarUrl(String url) {
		campoUrl.click();
		campoUrl.clear();
		campoUrl.sendKeys(url);
	}
	
	public void ingresarDigitos(String digitos) {
		campoDigitsOnly.click();
		campoDigitsOnly.clear();
		campoDigitsOnly.sendKeys(digitos);
	}
	
	public void ingresarRango(String rango) {
		campoRange.click();
		campoRange.clear();
		campoRange.sendKeys(rango);
	}
	
	public void click_checkbox_politica() {
		checkPolitica.click();
    }
}
