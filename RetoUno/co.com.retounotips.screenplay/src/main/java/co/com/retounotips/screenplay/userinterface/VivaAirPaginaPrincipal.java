package co.com.retounotips.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.vivaair.com/co")
public class VivaAirPaginaPrincipal extends PageObject {

	public static final Target SELECCIONAR_ORIGEN = Target.the("Lista desplegable de ciudades de origen del vuelo").located(By.id("s2id_departureCityDrop"));
	public static final Target LISTA_CIUDAD_ORIGEN = Target.the("Lista de ciudades de origen").located(By.id("select2-results-20"));
	public static final Target FECHA_IDA = Target.the("Seleccionar fecha de salida").located(By.id("DepartureDateForDisplay"));
	public static final Target SELECCIONAR_DESTINO = Target.the("Lista desplegable de ciudades de destino del vuelo").located(By.id("s2id_arrivalCityDrop"));
	public static final Target LISTA_CIUDAD_DESTINO = Target.the("Lista de ciudades de destino").located(By.id("select2-results-21"));
	public static final Target FECHA_REGRESO = Target.the("Seleccionar fecha de regreso").located(By.id("ReturnDateForDisplay"));
	public static final Target SELECCIONAR_ADULTOS = Target.the("Seleccionar la lista de adultos").located(By.id("s2id_Adults"));
	public static final Target CANTIDAD_ADULTOS = Target.the("Seleccionar el # de adultos").located(By.id("select2-results-22"));
	public static final Target SELECCIONAR_NINOS = Target.the("Seleccionar la lista de niños").located(By.id("s2id_Children"));
	public static final Target CANTIDAD_NINOS = Target.the("Seleccionar la cantidad de niños").located(By.id("select2-results-23"));
	public static final Target SELECCIONAR_INFANTES = Target.the("Seleccionar la lista de infantes").located(By.xpath("//div[@class='infantsWrapper hidden-xs']//a[@class='select2-choice']"));
	public static final Target CANTIDAD_INFANTES = Target.the("Seleccionar la cantidad de niños").located(By.id("select2-results-25"));
	public static final Target PRECIOS_MES = Target.the("Opción precios del mes").located(By.id("CalenderSearchWrapper"));
	public static final Target SELECCIONAR_MONEDA = Target.the("Lista desplegable tipo de moneda").located(By.id("s2id_Currency"));
	public static final Target TIPO_MONEDA = Target.the("Seleccionar el tipo de moneda").located(By.id("select2-results-15"));
	public static final Target BOTON_RESERVAR = Target.the("El botón para reservar el vuelo").located(By.id("continueLink"));
	
}
