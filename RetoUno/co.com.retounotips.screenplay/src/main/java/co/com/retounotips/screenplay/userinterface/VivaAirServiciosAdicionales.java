package co.com.retounotips.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class VivaAirServiciosAdicionales extends PageObject {
	
	//public static final Target LISTA_EQUIPAJE = Target.the("Lista para seleccionar opciones de equipaje").located(By.id("select2-drop"));
	
	public static final Target EQUIPAJE_EN_CABINA1 = Target.the("Lista desplegable de equipaje en cabina 1").located(By.xpath("//*[@id='divFCExtrasHandLuggage']/div[1]/div[1]/div/div[2]/div/div[1]/div[1]/div[1]/a/span")); //s2id_autogen85
	public static final Target SELECCIONAR_EQUIPAJE_EN_CABINA = Target.the("El campo para ").located(By.xpath("//div[@id='select2-drop']")); //select2-drop 
	/*public static final Target EQUIPAJE_EN_CABINA2 = Target.the("Lista desplegable de equipaje en cabina 2").located(By.xpath("//*[@id='divFCExtrasHandLuggage']/div[1]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]")); //s2id_autogen89
	public static final Target EQUIPAJE_EN_CABINA3 = Target.the("Lista desplegable de equipaje en cabina 3").located(By.xpath("//*[@id='divFCExtrasHandLuggage']/div[1]/div[3]/div/div[2]/div[1]/div[3]/div[1]/div[1]"));
	
	public static final Target EQUIPAJE_EN_BODEGA1 = Target.the("Lista desplegable de equipaje en bodega 1").located(By.xpath("//*[@id=\"divCheckInBaggage\"]/div[1]/div/div[1]/div/div[2]/div/div[1]/div[3]/div[1]"));
	public static final Target EQUIPAJE_EN_BODEGA2 = Target.the("Lista desplegable de equipaje en bodega 2").located(By.xpath("//*[@id=\"divCheckInBaggage\"]/div[1]/div/div[2]/div/div[2]/div/div[4]/div[3]/div[1]"));
	public static final Target EQUIPAJE_EN_BODEGA3 = Target.the("Lista desplegable de equipaje en bodega 3").located(By.xpath("//*[@id=\"divCheckInBaggage\"]/div[1]/div/div[3]/div/div[2]/div/div[7]/div[3]/div[1]"));
	
	public static final Target CHECKIN1 = Target.the("Lista desplegable de check-in 1").located(By.xpath("//*[@id=\"divExtrasExpress\"]/div[1]/div[1]/div/div[2]/div/div[1]/div[1]/div[1]"));
	public static final Target CHECKIN2 = Target.the("Lista desplegable de check-in 2").located(By.xpath("//*[@id=\"divExtrasExpress\"]/div[1]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]"));
	public static final Target CHECKIN3 = Target.the("Lista desplegable de check-in 3").located(By.xpath("//*[@id=\"divExtrasExpress\"]/div[1]/div[3]/div/div[2]/div/div[3]/div[1]/div[1]"));
	
	public static final Target FILA_RAPIDA = Target.the("Lista desplegable de fila rápida").located(By.xpath("//*[@id=\"divExtrasExpressBaggage\"]/div[1]/div/div[2]/div[1]/div[1]/div[1]"));
	
	public static final Target EQUIPAJE_ESPECIAL1 = Target.the("Equipaje especial adulto 1").located(By.xpath("//*[@id='divExtrasSpecialLuggage']/div/div[1]/div/div[2]/div/div[1]/div[1]/div[1]")); //s2id_autogen123
	public static final Target EQUIPAJE_ESPECIAL2 = Target.the("Equipaje especial adulto 2").located(By.xpath("//*[@id='divExtrasSpecialLuggage']/div/div[2]/div/div[2]/div/div[2]/div[1]/div[1]")); //s2id_autogen129
	public static final Target EQUIPAJE_ESPECIAL3 = Target.the("Equipaje especial niño").located(By.xpath("//*[@id='divExtrasSpecialLuggage']/div/div[3]/div/div[2]/div/div[3]/div[1]/div[1]")); //s2id_autogen135
	
	public static final Target SEGURO_VIAJE = Target.the("Checkbox seguro de viaje").located(By.id("travel-insurance-checkbox-5961"));
	public static final Target BOTON_CONTINUAR = Target.the("Boton continuar").located(By.id("extrasContinue"));
	public static final Target BOTON_NO_SELECCIONAR_ASIENTO = Target.the("Boton no seleccionar asiento").located(By.xpath("//a[@title='No, dejaré que el sistema me asigne un asiento sin costo.']"));
	public static final Target SERVICIOS_ADICIONALES = Target.the("Valor servicios adicionales").located(By.xpath("//span[@class='totalAmount']"));*/
	
}
