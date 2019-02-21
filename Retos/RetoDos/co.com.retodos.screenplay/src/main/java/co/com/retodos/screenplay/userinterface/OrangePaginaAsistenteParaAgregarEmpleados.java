package co.com.retodos.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class OrangePaginaAsistenteParaAgregarEmpleados extends PageObject {
	
	
	public static final Target FORMULARIO_DATOS_PERSONALES = Target.the("Formulario que contiene los datos personales del empleado").located(By.id("pimPersonalDetailsForm_PimPersonalDetail"));
	public static final Target BOTON_SIGUIENTE_PASO1 = Target.the("Botón que permite seguir al paso 2").located(By.xpath("//*[@id=\"content\"]/div[2]/ui-view/div[2]/div/div[3]/button[2]"));
	
	public static final Target FORMULARIO_DATOS_EMPLEO = Target.the("Formulario que contiene los datos donde ha trabajado el empleado").located(By.id("pimPersonalDetailsForm_PimJob"));
	public static final Target BOTON_SIGUIENTE_PASO2 = Target.the("Botón que permite seguir al paso 3").located(By.xpath("//*[@id=\"content\"]/div[2]/ui-view/div[2]/div/div[3]/button[2]"));
	
	public static final Target SELECCIONAR_REGION = Target.the("Seleccionar la lista región").located(By.xpath("//div[@id='WizardFieldDefinition9_inputfileddiv']//div[@class='select-wrapper initialized']"));
	public static final Target SELECCIONAR_FTE = Target.the("Seleccionar la lista fte").located(By.xpath("//*[@id=\"WizardFieldDefinition10_inputfileddiv\"]/div"));
	public static final Target SELECCIONAR_DEPARTAMENTO_TEMPORAL = Target.the("Seleccionar la lista departamento temporal").located(By.xpath("//div[@id='WizardFieldDefinition11_inputfileddiv']//div[@class='select-wrapper initialized']"));
	
	public static final Target FORMULARIO_DETALLE_OTROS_EMPLEOS = Target.the("Formulario que contiene los datos de otros trabajos del empleado").located(By.id("pimPersonalDetailsForm_PimCustomFieldJob-Standard"));
	public static final Target BOTON_SIGUIENTE_PASO3 = Target.the("Botón que permite seguir al paso 4").located(By.xpath("//*[@id=\"content\"]/div[2]/ui-view/div[2]/div/div[3]/button[2]"));
	
	public static final Target FORMULARIO_DETALLES_DE_CONTACTO = Target.the("Formulario que contiene los datos de contacto del empleado").located(By.id("pimPersonalDetailsForm_PimContactDetails"));
	public static final Target BOTON_SIGUIENTE_PASO4 = Target.the("Botón que permite seguir al paso 5").located(By.xpath("//*[@id=\"content\"]/div[2]/ui-view/div[2]/div/div[3]/button[2]"));
	
	public static final Target FORMULARIO_SUPERVISORES = Target.the("Formulario para información de supervisores").located(By.xpath("//div[@class='form-div']//div[2]"));
	public static final Target BOTON_SIGUIENTE_PASO5 = Target.the("Botón que permite seguir al paso 6").located(By.xpath("//*[@id=\"content\"]/div[2]/ui-view/div[2]/div/div[3]/button[2]"));
	
	public static final Target FORMULARIO_SUBORDINADOS = Target.the("Formulario para información de subordinados").located(By.xpath("//div[@class='form-div']//div[2]"));
	public static final Target BOTON_GUARDAR = Target.the("Botón que permite guardar la información en el paso 6").located(By.xpath("//button[contains(text(),'Save')]"));
	
}
