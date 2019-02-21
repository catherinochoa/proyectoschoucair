package co.com.retodos.screenplay.interactions;

import net.serenitybdd.screenplay.Interaction;
import static co.com.retodos.screenplay.util.TiempoUtilidad.successfulCondition;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import java.util.concurrent.TimeUnit; 
import org.awaitility.Awaitility; 
import net.serenitybdd.screenplay.Actor; 
 

public class Esperar_5 implements Interaction {

	@Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Awaitility.await().forever().pollInterval(5000, TimeUnit.MILLISECONDS).until(successfulCondition());
                
        } catch (Exception e) {
                    e.getMessage();
                    
                }
                
	}
               
	public static Esperar_5 aMoment() {
		return instrumented(Esperar_5.class);
               
	}
}
