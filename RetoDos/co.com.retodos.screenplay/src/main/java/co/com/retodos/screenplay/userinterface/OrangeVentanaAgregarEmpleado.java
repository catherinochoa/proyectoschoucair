package co.com.retodos.screenplay.userinterface;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class OrangeVentanaAgregarEmpleado extends PageObject {

	public static final Target CAMPO_PRIMER_NOMBRE = Target.the("Campo para ingresar el nombre").located(By.id("firstName"));
	public static final Target CAMPO_SEGUNDO_NOMBRE = Target.the("Campo para ingresar el segundo nombre").located(By.id("middleName"));
	public static final Target CAMPO_APELLIDO = Target.the("Campo para ingresar el apellido").located(By.id("lastName"));
	public static final Target SELECCIONAR_LOCALIDAD = Target.the("Seleccionar la lista de localidades").located(By.id("location_inputfileddiv"));
	public static final Target LISTAR_LOCALIDAD = Target.the("Lista de localidades").located(By.id("select-options-e57037c7-32a3-b07e-9450-66216880281e"));
	public static final Target BOTON_SIGUIENTE_AGREGAR_EMPLEADO = Target.the("Botón que permite avanzar en el formulario del nuevo empleado").located(By.id("systemUserSaveBtn"));
	
}
 