#language:es 
#Author: cochoar@choucairtesting.com


Característica: Registrar un usuario en Automation Demo Site
	Como usuario 
	Quiero realizar el registro en Automation Demo Site
	A través del diligenciamiento de un formulario
	
@reto1
Escenario: Realizar el registro en la página Automation Demo Site
		Dado que Carlos quiere acceder a Automation Demo Site 
		Cuando él realiza el registro en la página de sus datos 
		|	nombre				|	apellido	|	direccion				|	correo					|	celular			|	genero |	actividades	| idiomas	|	habilidades	|	pais		|	seleccionar_pais	|	ano_cumpleanos	|	mes_cumpleanos	|	dia_cumpleanos	|	contrasena	|	confirmar_contrasena	|
		|	Santiago			|	Rios			|		Cra 8 N 8 80	|	santi@yahoo.es	|	3117798068	|	Male	 |	Movies			|	Spanish	|	C++					|	Colombia	|	Japan						|	2000						|	July							|	15						|	Abc123@			|	Abc123@				|
		Entonces él verifica que se carga la pantalla con texto - Double Click on Edit Icon to EDIT the Table Row.
	