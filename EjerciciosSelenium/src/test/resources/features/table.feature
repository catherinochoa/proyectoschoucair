#language:es
#Author: cochoar@choucairtesting.com


@EjerciciosSelenium
Característica: Ejercicios de automatización en Seleniumeasy

@Table1
Escenario: Realizar filtro en la tabla
	
	Dado que ingreso al sitio web Seleniumeasy
	Y selecciono la opción table data search 
	Cuando ingreso el nombre 
	|	nombre	| 
	| Daniel	|	
	Entonces muestra en la tabla un único registro con el nombre Daniel
	
@Table2
Escenario: Realizar búsqueda en la tabla

	Dado que ingreso al sitio web Seleniumeasy
	Y selecciono la opción table data search 
	Cuando ingreso el número 
	| numero1	|
	|	8				|
	Entonces muestra en pantalla No results found



