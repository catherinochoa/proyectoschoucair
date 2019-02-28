package co.com.proyectobase.screenplay.interactions;

import static co.com.proyectobase.screenplay.util.UtilityTime.successfulCondition;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import java.util.concurrent.TimeUnit;
import org.awaitility.Awaitility;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Wait_3 implements Interaction{

	@Override
    public <T extends Actor> void performAs(T actor) {
		try {
			Awaitility.await().forever().pollInterval(3000, TimeUnit.MILLISECONDS).until(successfulCondition());
				} catch (Exception e) {
					e.getMessage();
                    }
                }
	
public static Wait_3 aMoment() {
	return instrumented(Wait_3.class);
	}
}