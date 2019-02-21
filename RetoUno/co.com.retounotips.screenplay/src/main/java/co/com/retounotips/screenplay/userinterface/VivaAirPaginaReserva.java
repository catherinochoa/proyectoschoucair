package co.com.retounotips.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class VivaAirPaginaReserva extends PageObject {
	
	public static final Target TABLA_CALENDARIO_TARIFAS = Target.the("La tabla muestra el calendario con las tarifas")
			.located(By.xpath("//div[@id='jMonthCalendarOut']//table[@class='MonthlyCalendar']"));
	
	public static final Target CALENDARIO_IDA = Target.the("calendario con precios de ida").located(By.id("jMonthCalendarOut"));
	public static final Target CALENDARIO_REGRESO = Target.the("calendario con precios de regreso").located(By.id("jMonthCalendarIn"));
	public static final Target BOTON_CONTINUAR = Target.the("Botón continuar").located(By.id("monthContinue"));
	
	public static final Target SELECCIONAR_BASIC_IDA = Target.the("Seleccionar tarifa basica").located(By.xpath("//body[@data-language='co']/div[@class='container contentWrapper']/div[@class='inner row']/div[@id='main-content']/div[@id='availabilityNormal']/div[@id='availabilityFirst']/div[@class='col-lg-10 col-md-9 availabilityContainer']/div/div[@class='availabilityOut box']/div/fieldset[@class='radiogroup']/div[@id='divAvailabilityOut']/div[1]/div[1]/div[2]/label[1]/div[1]"));
	public static final Target SELECCIONAR_BASIC_REGRESO = Target.the("Botón tarifa basica").located(By.xpath("//body[@data-language='co']/div[@class='container contentWrapper']/div[@class='inner row']/div[@id='main-content']/div[@id='availabilityNormal']/div/div[@id='pnlReturn']/div/div[@class='availabilityIn box']/div/fieldset[@class='radiogroup']/div[@id='divAvailabilityIn']/div[1]/div[1]/div[2]/label[1]/div[1]"));
	
	public static final Target VENTANA_INFO_IMPORTANTE = Target.the("Ventana de información importante").located(By.xpath("//div[@class='fancybox-wrap fancybox-desktop fancybox-type-inline fancy-confirm-wrapper fancybox-opened']"));
	public static final Target BOTON_ACEPTO = Target.the("Botón para aceptar la info importante").located(By.xpath("//a[@title='Acepto']"));
	
}
