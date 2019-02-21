package co.com.retounotips.screenplay.questions;

import co.com.retounotips.screenplay.userinterface.AutomationWebTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElRegistro implements Question<String> {

	public static ElRegistro FueExitoso() {
		
		return new ElRegistro();
	}
	
	@Override
	public String answeredBy(Actor carlos) {
		return Text.of(AutomationWebTable.LABEL_TEXTO).viewedBy(carlos).asString();
		
	}

}
