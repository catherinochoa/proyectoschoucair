package co.com.colorlib.screenplay.util;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ColorlibHook {
	
	@Before 
	    public void setUp() {
	        setTheStage(new OnlineCast());
	    }
	}


