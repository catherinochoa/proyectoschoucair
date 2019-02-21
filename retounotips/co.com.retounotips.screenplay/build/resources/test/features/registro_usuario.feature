#language:es 
#Author: cochoar@choucairtesting.com


Característica: 
	Como usuario 
	Quiero realizar el registro en Automation Demo Site
	A través del diligenciamiento de un formulario
	
@reto1
Escenario: Realizar el registro en la página Automation Demo Site
		Dado que Carlos quiere acceder a Automation Demo Site 
		Cuando él realiza el registro en la página de sus datos 
		|	first_name	|	last_name	|	address					|	mail							|	phone		|	gender |	hobbies	| languages	|	skills	|	country		|	select_country	|	date_birth_year	|	date_birth_mounth	|	date_birth_day	|	password	|	confirm_password	|
		|	Carlos			|	Rios			|		Cra 8 N 8 80	|	carlos@gmail.com	|	3333333	|	Male	 |	Movies	|	Spanish		|	C++			|	Colombia	|	Japan						|	2000						|	July							|	15							|	abc123		|	abc123						|
		Entonces él verifica que se carga la pantalla con texto Double Click on Edit Icon to EDIT the Table Row 
	