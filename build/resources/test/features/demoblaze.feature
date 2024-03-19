#language: es

Característica: Realizar el registro de un nuevo usuario y realizar una compra en Product Store
  Como usuario.
  Quiero crear una cienta de usuario en la aplicacion demoblazer.
  Para realizar una compra seleccionando un producto segun su categoria al carrito

  Antecedentes: Abrir navegador
    Dado que estoy en la página de inicio de Product Store

  @Regresion
  Esquema del escenario: Registro de un nuevo usuario

    Cuando lleno el formulario de registro con mis datos
      | usuario   | clave   |
      | <usuario> | <clave> |
    Entonces debería estar registrado exitosamente en Product Store "<mensaje>"

    Ejemplos:
      | usuario      | clave  | mensaje             |
      | CamiloJose01 | 112345 | Sign up successful. |

  @Regresion
  Esquema del escenario: Realizar una compra agregando productos al carrito
    Dado que estoy en la página de inicio de Product Store inicio sesión con mis credenciales
      | usuario   | clave   |
      | <usuario> | <clave> |
    Cuando selecciono la categoría "<categoria>" y selecciono el producto "<producto>"
    Y agrego los datos del pago del producto
      | nombre   | pais   | ciudad   | tarjeta   | mes   | ano   |
      | <nombre> | <pais> | <ciudad> | <tarjeta> | <mes> | <ano> |

    Entonces el producto "<producto>" debería estar en mi carrito de compras

    Ejemplos:
      | usuario      | clave  | categoria | producto | nombre     | pais     | ciudad   | tarjeta             | mes | ano  |
      | CamiloJose01 | 112345 | Phones    | Samsung  | Juan Perez | Colombia | Medellin | 1234 5678 9012 3456 | 12  | 2023 |