#language:es
#Author: cochoar@choucairtesting.com+

@Regresion
Característica: Formulario de validación Popup
  El usuario debe poder ingresar al formulario los datos requeridos.
  Cada campo del formulario realiza validaciones de obligatoriedad,
  longitud y formato, el sistema debe presentar las validaciones respectivas 
  para cada campo a través de un globo informtativo. 

  @CasoExitoso
  Escenario: Diligenciamiento exitoso del formulario de validación Popup.
  					 no se presenta ningún mensaje de validación. 
    Dado que Carlos ingresa al sitio web de colorlib
    Y ingresa sus datos de acceso 
    | usuario | clave |
    | demo		|	demo	|
    Cuando ingresa a la opción Forms Validation
    Entonces Verifica ingreso exitoso

