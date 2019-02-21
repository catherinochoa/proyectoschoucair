package co.com.retounotips.screenplay.interactions;

import java.util.List;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarMenor implements Interaction{

	private Target filas;
	private String moneda;
	private double menor = 1000.00;
	private double moneda_aux;
	private int contador = 0;
	
	public SeleccionarMenor(Target filas) {
		super();
		this.filas = filas;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
				
		List<WebElement> calendario = filas.resolveFor(actor).findElements(By.xpath("//div[@id='jMonthCalendarOut']//tbody[@id='CalendarBody']/tr/td[@class='DateBox']/div/div[2]/div[2]/span[1]"));
		
		//System.out.println(calendario);
		int cantidad_dias = calendario.size();
		//System.out.println(cantidad_dias);
		
		
		for(int i=0; i<cantidad_dias; i++)
		{
			String precio = calendario.get(i).getText();
			//System.out.println(precio);
			moneda = precio.replaceAll("USD ", "");
			//System.out.println(moneda);
			moneda_aux = Double.parseDouble(moneda);
			
			if(moneda_aux < menor) {
				menor = moneda_aux; 
				//System.out.println(menor);
				contador = i;
				//System.out.println(contador);
			}
		}
		
		calendario.get(contador).click();
	
	}
		
	public static SeleccionarMenor tarifa(Target filas) {
		return Tasks.instrumented(SeleccionarMenor.class, filas);
	}
}
