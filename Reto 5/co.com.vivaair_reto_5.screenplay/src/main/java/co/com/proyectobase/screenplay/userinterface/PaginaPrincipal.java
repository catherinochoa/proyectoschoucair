package co.com.proyectobase.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.vivaair.com/co/")

public class PaginaPrincipal extends PageObject {
	
	public static final Target LISTA = Target.the("Ciudad origen lista").located(By.id("select2-drop")),
							   IDA = Target.the("RadioButton ida").located(By.id("rbOneWayWrapper")),
							   IDA_REGRESO = Target.the("RadioButton ida y regreso").located(By.id("rbRoundtripWrapper")),
							   CIUDAD_ORIGEN = Target.the("Ciudad origen").located(By.id("s2id_departureCityDrop")),
							   FECHA_IDA = Target.the("Fecha ida").located(By.id("DepartureDateForDisplay")),
							   CIUDAD_DESTINO = Target.the("Ciudad destino").located(By.id("s2id_arrivalCityDrop")),
							   FECHA_REGRESO = Target.the("Fecha regreso").located(By.id("ReturnDateForDisplay")),
							   PRECIOS_MES = Target.the("Radiobutton precios del mes").located(By.id("CalenderSearchWrapper")),
							   FECHAS_EXACTAS = Target.the("Radiobutton fechas exactas").located(By.id("NormalSearchWrapper")),
							   MONEDA = Target.the("Moneda").located(By.id("s2id_Currency")),
							   ADULTOS = Target.the("Adultos").located(By.id("s2id_Adults")),
							   NIÑOS = Target.the("Niños").located(By.id("s2id_Children")),
							   INFANTES = Target.the("Infantes").located(By.xpath("//div[@class='select2-container criteriaSelect selectInfants'][@id='s2id_Infants2']")),
							   BOTON_RESERVAR = Target.the("Boton reservar mi vuelo").located(By.id("continueLink"));
}
