#language:es
#Author: cochoar@choucairtesting.com


@ColorLib
Característica: Autenticación en el sitio web Colorlib

@autenticación
Escenario: Abrir el navegador e ingresar a Colorlib
	
	Dado que ingreso al sitio web Colorlib 
	Y digito usuario demo y la clave demo
	Cuando ingreso al menú Fomrs y submenú Form Validation
	Y lleno el formulario de la funcionalidad Block Validation
	|required	| email		| password	|	date			 | url								|	digitsOnly	| range |	
	|123			| ca@ro.com	|	12345678	|	12/12/2000 | http://www.url.com	|	123					| 8		  |	
	Entonces muestra un mensaje de registro exitoso  
	
	



