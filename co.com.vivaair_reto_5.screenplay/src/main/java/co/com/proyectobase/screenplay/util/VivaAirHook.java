package co.com.proyectobase.screenplay.util;

import cucumber.api.java.Before;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class VivaAirHook {
		
	@Before 
	public void setUp() {
		setTheStage(new OnlineCast());
	}
}