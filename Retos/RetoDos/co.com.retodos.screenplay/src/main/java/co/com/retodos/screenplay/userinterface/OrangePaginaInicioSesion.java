package co.com.retodos.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://orangehrprueba-trials646.orangehrmlive.com/auth/login")
public class OrangePaginaInicioSesion extends PageObject {
	
	public static final Target CAMPO_USUARIO = Target.the("El campo permite ingresar el usuario")
			.located(By.id("txtUsername"));
	public static final Target CAMPO_CONTRASENA = Target.the("El campo permite ingresar la contraseña")
			.located(By.id("txtPassword"));
	
	public static final Target BOTON_LOGIN = Target.the("El botón que permite iniciar sesión en la página")
			.located(By.id("btnLogin"));
}
