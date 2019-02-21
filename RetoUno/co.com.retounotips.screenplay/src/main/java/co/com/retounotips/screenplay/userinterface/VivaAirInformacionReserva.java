package co.com.retounotips.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class VivaAirInformacionReserva extends PageObject {
	
	public static final Target NOMBRES_ADULTO = Target.the("Campo para ingresar nombres del adulto").located(By.id("Adults[0].FirstName"));
	public static final Target APELLIDOS_ADULTO = Target.the("Campo para ingresar apellidos del adulto").located(By.id("Adults[0].LastName"));
	public static final Target SELECCIONAR_GENERO_ADULTO = Target.the("Lista para seleccionar el genero del adulto").located(By.id("s2id_Adults[0].gender"));
	public static final Target LISTA_GENERO_ADULTO = Target.the("Lista para seleccionar el genero del adulto").located(By.id("select2-drop"));
	public static final Target DOCUMENTO_ADULTO = Target.the("ingresar documento del adulto").located(By.id("Adults[0].IdentificationNumber"));
	public static final Target CORREO_ADULTO = Target.the("ingresar correo del adulto").located(By.id("Passengers[0].email"));
	public static final Target CONFIRMAR_CORREO_ADULTO = Target.the("confirmar correo del adulto").located(By.id("Passengers[0].repeatemail"));
	public static final Target CELULAR_ADULTO = Target.the("ingresar celular del adulto").located(By.id("Passengers0_mobile"));
	
	public static final Target NOMBRES_NINO1 = Target.the("Campo para ingresar nombres del niño 1").located(By.id("Children[1].FirstName"));
	public static final Target APELLIDOS_NINO1 = Target.the("Campo para ingresar apellidos del niño 1").located(By.id("Children[1].LastName"));
	public static final Target FECHA_NACIMIENTO_NINO1 = Target.the("Campo para ingresar fecha de nacimiento niño 1").located(By.id("Passengers_1__NativeDateOfBirth"));
	public static final Target SELECCIONAR_GENERO_NINO1 = Target.the("Lista para seleccionar el genero del niño 1").located(By.id("s2id_Children[1].gender"));
	public static final Target LISTA_GENERO_NINO1 = Target.the("Lista para seleccionar el genero del niño 1").located(By.id("select2-drop"));
	public static final Target DOCUMENTO_NINO1 = Target.the("ingresar documento del niño 1").located(By.id("Children[1].IdentificationNumber"));
	
	
	public static final Target NOMBRES_NINO2 = Target.the("campo para ingresar nombre del niño 2").located(By.id("Children[2].FirstName"));
	public static final Target APELLIDOS_NINO2 = Target.the("Campo para ingresar apellidos del niño 2").located(By.id("Children[2].LastName"));
	public static final Target FECHA_NACIMIENTO_NINO2 = Target.the("Campo para ingresar fecha de nacimiento niño 2").located(By.id("Passengers_2__NativeDateOfBirth"));
	public static final Target SELECCIONAR_GENERO_NINO2 = Target.the("Lista para seleccionar el genero del niño 2").located(By.id("s2id_Children[2].gender"));
	public static final Target LISTA_GENERO_NINO2 = Target.the("Lista para seleccionar el genero del niño 2").located(By.id("select2-drop"));
	public static final Target DOCUMENTO_NINO2 = Target.the("ingresar documento del niño 2").located(By.id("Children[2].IdentificationNumber"));
	
	public static final Target NOMBRES_INFANTE = Target.the("campo para ingresar nombre del infante").located(By.id("Infants[3].FirstName"));
	public static final Target APELLIDOS_INFANTE = Target.the("Campo para ingresar apellidos del infante").located(By.id("Infants[3].LastName"));
	public static final Target FECHA_NACIMIENTO_INFANTE = Target.the("Campo para ingresar fecha de nacimiento infante").located(By.id("Passengers_3__NativeDateOfBirth"));
	public static final Target VIAJA_CON = Target.the("Desplegable de viaja con").located(By.id("s2id_Passengers[3].travelWith"));
	public static final Target SELECCIONAR_VIAJA_CON = Target.the("Desplegable de viaja con").located(By.id("select2-drop"));
	
	public static final Target BOTON_CONTINUAR = Target.the("Botón continuar con la reserva").located(By.id("btnContinuePassengerDetails"));
	
}
