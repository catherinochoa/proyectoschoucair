#language:es
#Author: cochoar@choucairtesting.com


Característica: Comprar un TV en el sitio web Exito
	Como usuario
	Quiero comprar un TV por online
	Para que me lo envíen a mi casa
	
@comprarTV
Escenario: Realizar la compra de un TV por el sitio web de Exito
Dado que quiero comprar un televisor para ver el mundial de futbol
Cuando ingreso a la página virtual del éxito y selecciono el que más me gusta
| pulgadas	|	marca	|	resolucion	|
|	44-49			|	LG		|	UHD-4K			|
Entonces verfico que haya quedado en el carrito de compras 
