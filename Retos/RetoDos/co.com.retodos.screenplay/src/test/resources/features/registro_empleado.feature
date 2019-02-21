#language:es
#Author: cochoar@choucairtesting.com

@reto2
Característica: Registrar un empleado en Orange 
	Como usuario
	Quiero ingresar a la aplicación Orange HR
	Para registrar un nuevo empleado
	
	
Escenario: Realizar el registro de un empleado en Orange HR
	Dado que Juan necesita crear un empleado en el OrageHR
	Cuando el realiza el ingreso del registro de la aplicación
	|	primer_nombre	| segundo_nombre	|apellido	| localidad				|	region	  | fte |	departamento_temporal	| tipo_sangre |	actividades	|
	|	Cristian			|	David						|	Lopez		|	 London Office	|	Region-2	| 0.5	|	Sub unit-3						|	AB					|		bicicleta	|
	Entonces el visualiza el nuevo empleado Cristian Lopez en el aplicativo 
	

