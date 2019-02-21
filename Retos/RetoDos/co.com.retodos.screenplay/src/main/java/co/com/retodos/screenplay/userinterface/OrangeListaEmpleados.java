package co.com.retodos.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class OrangeListaEmpleados extends PageObject{
		
	public static final Target CAMPO_BUSCAR = Target.the("El campor permite ingresar el nombre que se va a buscar")
			.located(By.xpath("//input[@placeholder='Employee Name']"));
	
	public static final Target BOTON_BUSCAR = Target.the("El botón permite buscar el empleado")
			.located(By.xpath("//ul[@class='right']//li[2]//a[1]"));
	
	public static final Target TABLA_INFORMACION_EMPLEADOS = Target.the("El botón permite buscar el empleado")
			.located(By.id("employeeListTable"));//("//table[@class='list-with-image highlight bordered']"));
	
	public static final Target ETIQUETA_NOMBRE = Target.the("La etiqueta muestra el nombre del empleado")
			.located(By.xpath("//*[@id=\"employeeListTable\"]/tbody/tr/td[3]"));
	
}
