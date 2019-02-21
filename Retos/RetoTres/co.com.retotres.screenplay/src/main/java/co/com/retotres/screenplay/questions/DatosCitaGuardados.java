package co.com.retotres.screenplay.questions;

import co.com.retotres.screenplay.userinterface.AdministracionDeHospitalesAgregarCita;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class DatosCitaGuardados implements Question<String>{
	
	@Override
	public String answeredBy(Actor carlos) {
		return Text.of(AdministracionDeHospitalesAgregarCita.MENSAJE_EXITOSO).viewedBy(carlos).asString();
	}
	
	public static DatosCitaGuardados Correctamente() {
		return new DatosCitaGuardados();
	}
	

}
