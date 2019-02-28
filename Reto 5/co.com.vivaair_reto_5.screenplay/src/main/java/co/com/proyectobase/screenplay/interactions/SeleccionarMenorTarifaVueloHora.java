package co.com.proyectobase.screenplay.interactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static net.serenitybdd.core.Serenity.*;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import java.util.List;

public class SeleccionarMenorTarifaVueloHora  implements Interaction {
	
	private static WebDriver driver = getWebdriverManager().getCurrentDriver();
	 
	@Override
	public <T extends Actor> void performAs(T actor) {
		String xpath = "//div[@class='flightPriceContainer notranslate']/div/span[@data-bind='html: Price']";
		List<WebElement> dias = driver.findElements(By.xpath(xpath));
		int size = dias.size();
		float menor = 100000;
		int indice= 0;
		for (int i = 0; i < size; i++) {
			String valor = dias.get(i).getText();
			valor = valor.replaceAll("USD ", "");
			float aux = Float.parseFloat(valor);
			if (aux < menor) {
				menor = aux;
				indice = i;
			}
		}
        	 
		dias.get(indice).click();
	}         
	public static SeleccionarMenorTarifaVueloHora Desde(Target lista) {
		return new SeleccionarMenorTarifaVueloHora();
	}
}