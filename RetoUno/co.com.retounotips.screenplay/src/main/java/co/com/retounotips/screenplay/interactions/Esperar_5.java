package co.com.retounotips.screenplay.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.concurrent.TimeUnit;

import static co.com.retounotips.screenplay.util.TiempoUtilidad.successfulCondition;
import org.awaitility.Awaitility;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction; 
 

public class Esperar_5 implements Interaction {

	@Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Awaitility.await().forever().pollInterval(3000, TimeUnit.MILLISECONDS).until(successfulCondition());
                
        } catch (Exception e) {
                    e.getMessage();
                    
                }
                
	}
               
	public static Esperar_5 aMoment() {
		return instrumented(Esperar_5.class);
               
	}
}
