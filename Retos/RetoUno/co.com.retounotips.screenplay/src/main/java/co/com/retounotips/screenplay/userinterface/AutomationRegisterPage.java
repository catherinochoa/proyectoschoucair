package co.com.retounotips.screenplay.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AutomationRegisterPage extends PageObject	{
	
	public static final Target CAMPO_NOMBRE = Target.the("Campo para ingresar el nombre")
			.located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
	
	public static final Target CAMPO_APELLIDO = Target.the("Campo para ingresar el apellido")
			.located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
	
	public static final Target CAMPO_DIRECCION = Target.the("Campo para ingresar la dirección")
			.located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
	
	public static final Target CAMPO_CORREO = Target.the("Campo para ingresar el correo electrónico")
			.located(By.xpath("//*[@id=\"eid\"]/input"));
	
	public static final Target CAMPO_TELEFONO = Target.the("Campo para ingresar el teléfono")
			.located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
	
	public static final Target OPCION_GENERO_MASCULINO = Target.the("Opciones para seleccionar el género")
			.located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
	
	public static final Target OPCION_GENERO_FEMENINO = Target.the("Opciones para seleccionar el género")
			.located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
		
	public static final Target CHECKBOX_HOBBIES_CRICKET = Target.the("Listado para seleccionar las actividades")
			.located(By.id("checkbox1"));
	public static final Target CHECKBOX_HOBBIES_MOVIES = Target.the("Listado para seleccionar las actividades")
			.located(By.id("checkbox2"));
	public static final Target CHECKBOX_HOBBIES_HOCKEY = Target.the("Listado para seleccionar las actividades")
			.located(By.id("checkbox3"));
	
	public static final Target CAMPO_IDIOMAS = Target.the("Campo que muestra los idiomas seleccionados")
			.located(By.id("msdd"));
	
	public static final Target LISTA_DE_IDIOMAS = Target.the("Lista para seleccionar el idioma")
			.located(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']"));
	
	public static final Target LISTA_DE_HABILIDADES = Target.the("Lista para seleccionar habilidades")
			.located(By.id("Skills"));
	
	public static final Target LISTA_DE_PAISES = Target.the("Lista para seleccionar el país")
			.located(By.xpath("//select[@id='countries']"));
	
	public static final Target SELECCIONAR_PAIS = Target.the("Seleccionar el pais")
			.located(By.xpath("//select[@id='country']"));
	
	public static final Target LISTA_DE_ANOS = Target.the("Lista para seleccionar el año")
			.located(By.id("yearbox"));
	
	public static final Target LISTA_DE_MESES = Target.the("Lista para seleccionar el mes")
			.located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
	
	public static final Target LISTA_DE_DIAS = Target.the("Lista para seleccionar el día")
			.located(By.id("daybox"));
	
	public static final Target CAMPO_CONTRASENA = Target.the("Campo para ingresar la contraseña")
			.located(By.id("firstpassword"));
	
	public static final Target CAMPO_CONFIRMAR_CONTRASENA = Target.the("Campo para confirmar la contraseña")
			.located(By.id("secondpassword"));
	
	public static final Target AREA_DE_TRABAJO = Target.the("Área de trabajo (espacio en blanco")
			.located(By.xpath("//div[@class='container center']//div[contains(@class,'row')]"));
	
	public static final Target BOTON_REGISTRO = Target.the("El botón permite regsitrar el usuario e ingresar a la página")
			.located(By.id("submitbtn"));
	
}
