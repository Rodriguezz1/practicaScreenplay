#language: es

Característica: Comprar productos

@CompraExitosa
Esquema del escenario:
  Dado que el usuario ingrese a la pagina <url>
  Cuando el ingrese las credenciales <usuario> <clave>
  Y seleccione los productos que desea comprar <accion>
  Entonces validara un mensaje de compra exitosa

  Ejemplos:
    | url                        | usuario       | clave        | accion          |
    | https://www.saucedemo.com/ | standard_user | secret_sauce | Compra completa |