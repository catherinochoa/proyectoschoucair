package co.com.retodos.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class OrangePaginaPrincipal extends PageObject{
	
	public static final Target MENU_PIM = Target.the("El menú despliega el módulo de información personal")
			.located(By.id("menu_pim_viewPimModule"));
	
	public static final Target OPCION_AGREGAR_EMPLEADO = Target.the("La opción permite abrir la ventana para agregar la información del empleado")
			.located(By.xpath("//*[@id=\"menu_pim_addEmployee\"]/span[2]"));
		
	public static final Target OPCION_LISTAR_EMPLEADOS = Target.the("La opción muestra una tabla con la lista de los empleados registrados")
			.located(By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]"));
	
}