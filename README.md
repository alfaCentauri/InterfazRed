# InterfazRed
Programa en Java para enumera todas las interfaces de red y sus direcciones en una máquina.

Una de las piezas más útiles de información que puede obtener de una interfaz de red es la lista de direcciones IP que se
asignan a la misma. Usted puede obtener esta información de una instancia NetworkInterface mediante uno de dos métodos. El 
primer método, getInetAddresses(), devuelve una enumeración de InetAddress. El otro método, getInterfaceAddresses(), devuelve
una lista de instancias java.net.InterfaceAddress. Este método se utiliza cuando se necesita más información acerca de una 
dirección de interfaz más allá de su dirección IP. Por ejemplo, es posible que necesite información adicional acerca de la 
máscara de subred y dirección de difusión cuando la dirección es una dirección IPv4 y una longitud de prefijo de red en el 
caso de una dirección IPv6.
