package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaReserva extends PageObject {
	
	//Listas
	public static final Target LISTA = Target.the("Listas").located(By.id("select2-drop")),
					  		   TARIFA_MAS_BAJA_DIA = Target.the("Tarifa mas baja dia").located(By.xpath("//tbody[@id='CalendarBody']/tr/td[@class='DateBox Today' or @class='DateBox']/div/div[2]/div[2]/span[1]")),
					  		   BOTON_CONTINUAR_1 = Target.the("Boton continuar").located(By.id("monthContinue")),
					  		   TARIFA_MAS_BAJA_HORA = Target.the("Tarifa mas baja hora").located(By.xpath("//div[@class='flightPriceContainer notranslate']/div/span[@data-bind='html: Price']")),
					  		   BOTON_ACEPTAR = Target.the("Boton aceptar").located(By.xpath("//a[@class='red right confirm'][@title='Acepto']")),
					  		   NOMBRE_ADULTO_1 = Target.the("Nombre adulto 1").located(By.id("Adults[0].FirstName")),
					  		   APELLIDO_ADULTO_1 = Target.the("Apellido adulto 1").located(By.id("Adults[0].LastName")),
					  		   GENERO_ADULTO_1 = Target.the("Genero adulto 1").located(By.id("s2id_Adults[0].gender")),
					  		   DOCUMENTO_ADULTO_1 = Target.the("Documento adulto 1").located(By.id("Adults[0].IdentificationNumber")),
					  		   CORREO = Target.the("Correo").located(By.id("Passengers[0].email")),
					  		   CONFIRMAR_CORREO = Target.the("Confirmar correo").located(By.id("Passengers[0].repeatemail")),
					  		   CELULAR = Target.the("Celular").located(By.id("Passengers0_mobile")),
					  		   NOMBRE_ADULTO_2 = Target.the("Nombre adulto 2").located(By.id("Adults[1].FirstName")),
					  		   APELLIDO_ADULTO_2 = Target.the("Apellido adulto 2").located(By.id("Adults[1].LastName")),
					  		   GENERO_ADULTO_2 = Target.the("Genero adulto 2").located(By.id("s2id_Adults[1].gender")),
					  		   DOCUMENTO_ADULTO_2 = Target.the("Documento adulto 2").located(By.id("Adults[1].IdentificationNumber")),
					  		   NOMBRE_NINO = Target.the("Nombre niño").located(By.id("Children[2].FirstName")),
					  		   APELLIDO_NINO = Target.the("Apellido niño").located(By.id("Children[2].LastName")),
					  		   FECHA_NINO = Target.the("Fecha nacimiento niño").located(By.id("Passengers_2__NativeDateOfBirth")),
					  		   GENERO_NINO = Target.the("Genero niño").located(By.id("s2id_Children[2].gender")),
					  		   DOCUMENTO_NINO = Target.the("Documento niño").located(By.id("Children[2].IdentificationNumber")),	
					  		   NOMBRE_INFANTE = Target.the("Nombre infante").located(By.id("Infants[3].FirstName")),
					  		   APELLIDO_INFANTE = Target.the("Apellido infante").located(By.id("Infants[3].LastName")),
					  		   FECHA_INFANTE = Target.the("Fecha nacimiento infante").located(By.id("Passengers_3__NativeDateOfBirth")),
					  		   VIAJANDO_CON = Target.the("Viajando con").located(By.id("s2id_Passengers[3].travelWith")),	
					  		   BOTON_CONTINUAR_2 = Target.the("Boton continuar").located(By.id("btnContinuePassengerDetails")),
	
	//Cabina
							   CABINA = Target.the("Equipaje cabina").located(By.xpath("//h3[contains (text(),'Equipaje en cabina')]")), 
							   CABINA_ADULTO_1 = Target.the("Equipaje cabina adulto 1").located(By.xpath("//div[@id='divFCExtrasHandLuggage']/div[1]/div[1]/div/div[2]/div/div[1]/div[1]/div[1]")), //s2id_autogen81
					  		   CABINA_ADULTO_2 = Target.the("Equipaje cabina adulto 2").located(By.xpath("//div[@id='divFCExtrasHandLuggage']/div[1]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]")), //s2id_autogen85
					  		   CABINA_NINO = Target.the("Equipaje cabina niño").located(By.xpath("//div[@id='divFCExtrasHandLuggage']/div[1]/div[3]/div/div[2]/div[1]/div[3]/div[1]/div[1]")), //s2id_autogen89

	//Bodega 
					  		   EQUIPAJE_ADICIONAL1_ADULTO_1 = Target.the("Equipaje adicional 1 adulto 1").located(By.xpath("//div[@id='divCheckInBaggage']/div[1]/div/div[1]/div/div[2]/div/div[1]/div[3]/div[1]")), //s2id_autogen93
					  		   EQUIPAJE_ADICIONAL1_ADULTO_2 = Target.the("Equipaje adicional 1 adulto 2").located(By.xpath("//div[@id='divCheckInBaggage']/div[1]/div/div[2]/div/div[2]/div/div[4]/div[3]/div[1]")), //s2id_autogen97
					  		   EQUIPAJE_ADICIONAL1_NINO = Target.the("Equipaje adicional 1 nino").located(By.xpath("//div[@id='divCheckInBaggage']/div[1]/div/div[3]/div/div[2]/div/div[7]/div[3]/div[1]")), //s2id_autogen101
	
	//Check-in aeropuerto
					  		   CHECKIN_ADULTO_1 = Target.the("Check-in adulto 1").located(By.xpath("//div[@id='divExtrasExpress']/div[1]/div[1]/div/div[2]/div/div[1]/div[1]/div[1]")), //s2id_autogen105
					  		   CHECKIN_ADULTO_2 = Target.the("Check-in adulto 2").located(By.xpath("//div[@id='divExtrasExpress']/div[1]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]")), //s2id_autogen109
					  		   CHECKIN_NINO = Target.the("Check-in niño").located(By.xpath("//div[@id='divExtrasExpress']/div[1]/div[3]/div/div[2]/div/div[3]/div[1]/div[1]")), //s2id_autogen113

	//Fila rapida
					  		   FILA_RAPIDA = Target.the("Fila rapida").located(By.xpath("//div[@id='divExtrasExpressBaggage']/div[1]/div/div[2]/div[1]/div[1]/div[1]")), //s2id_autogen117
	
	//Cancela tranquilo
					  		   CANCELA = Target.the("Cancela tranquilo").located(By.xpath("//div[@id='divFCExtrasCancelProtection']/div[1]/div/div[2]/div[1]/div[1]")), //s2id_autogen121
	
	//Equipaje especial
					  		   EQUIPAJE_ESPECIAL_ADULTO_1 = Target.the("Equipaje especial adulto 1").located(By.xpath("//div[@id='divExtrasSpecialLuggage']/div/div[1]/div/div[2]/div/div[1]/div[1]/div[1]")), //s2id_autogen123
					  		   EQUIPAJE_ESPECIAL_ADULTO_2 = Target.the("Equipaje especial adulto 2").located(By.xpath("//div[@id='divExtrasSpecialLuggage']/div/div[2]/div/div[2]/div/div[2]/div[1]/div[1]")), //s2id_autogen129
					  		   EQUIPAJE_ESPECIAL_NINO = Target.the("Equipaje especial niño").located(By.xpath("//div[@id='divExtrasSpecialLuggage']/div/div[3]/div/div[2]/div/div[3]/div[1]/div[1]")), //s2id_autogen135
					  		   SEGURO_VIAJE = Target.the("Checkbox seguro de viaje").located(By.id("travel-insurance-checkbox-5961")),
					  		   BOTON_CONTINUAR_3 = Target.the("Boton continuar").located(By.id("extrasContinue")),
					  		   BOTON_NO_SELECCIONAR_ASIENTO = Target.the("Boton no seleccionar asiento").located(By.xpath("//a[@title='No, dejaré que el sistema me asigne un asiento sin costo.']")),
							   BOTON_YA_ESCOGI = Target.the("Boton ya escogi lo que necesito").located(By.xpath("//a[@title='No, gracias'][contains (text(),'Ya escogí lo que necesito')]")),
					  		   SERVICIOS_ADICIONALES = Target.the("Valor servicios adicionales").located(By.xpath("//span[@class='totalAmount']"));
}
