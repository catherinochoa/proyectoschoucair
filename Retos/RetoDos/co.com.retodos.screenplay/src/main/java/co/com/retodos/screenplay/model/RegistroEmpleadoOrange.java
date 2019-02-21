package co.com.retodos.screenplay.model;

public class RegistroEmpleadoOrange {
	
	private String primer_nombre;
	private String segundo_nombre;
	private String apellido;
	private String localidad;
	private String region;
	private int fte;
	private String departamento_temporal;
	private String tipo_sangre;
	private String actividades;
	
	public String getPrimer_nombre() {
		return primer_nombre;
	}
	public void setPrimer_nombre(String primer_nombre) {
		this.primer_nombre = primer_nombre;
	}
	
	public String getSegundo_nombre() {
		return segundo_nombre;
	}
	public void setSegundo_nombre(String segundo_nombre) {
		this.segundo_nombre = segundo_nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getFte() {
		return fte;
	}
	public void setFte(int fte) {
		this.fte = fte;
	}
	public String getDepartamento_temporal() {
		return departamento_temporal;
	}
	public void setDepartamento_temporal(String departamento_temporal) {
		this.departamento_temporal = departamento_temporal;
	}
	public String getTipo_sangre() {
		return tipo_sangre;
	}
	public void setTipo_sangre(String tipo_sangre) {
		this.tipo_sangre = tipo_sangre;
	}
	
	public String getActividades() {
		return actividades;
	}
	public void setActividades(String actividades) {
		this.actividades = actividades;
	}
	
	public String getNombre_completo() {
		return primer_nombre+" "+apellido;
	}

}

