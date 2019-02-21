package co.com.retotres.screenplay.questions;

import co.com.retotres.screenplay.userinterface.AdministracionDeHospitalesAgregarDoctor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class DatosDoctorGuardados implements Question<String> {

	@Override
	public String answeredBy(Actor carlos) {
		return Text.of(AdministracionDeHospitalesAgregarDoctor.MENSAJE_EXITOSO).viewedBy(carlos).asString();
	}
	
	public static DatosDoctorGuardados Correctamente() {
		return new DatosDoctorGuardados();
	}

}
