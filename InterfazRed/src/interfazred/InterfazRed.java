/*Una de las piezas más útiles de información que puede obtener de una interfaz 
 *de red es la lista de direcciones IP que se asignan a la misma. Usted puede 
 *obtener esta información de una instancia NetworkInterface mediante uno de dos
 *métodos. El primer método, getInetAddresses (), devuelve una enumeración de 
 *InetAddress. El otro método, getInterfaceAddresses (), devuelve una lista de 
 *instancias java.net.InterfaceAddress. Este método se utiliza cuando se 
 *necesita más información acerca de una dirección de interfaz más allá de su 
 *dirección IP. Por ejemplo, es posible que necesite información adicional 
 *acerca de la máscara de subred y dirección de difusión cuando la dirección es 
 *una dirección IPv4 y una longitud de prefijo de red en el caso de una 
 *dirección IPv6.
 *El siguiente programa de ejemplo se enumeran todas las interfaces de red y sus
 *direcciones en una máquina:
 */
package interfazred;
import static java.lang.System.out;
import java.net.*;
import java.util.*;
/**Este programa enumera todas las interfaces de red y sus direcciones en una 
 * máquina.
 * @author Ingeniero en Computación: Ricardo Presilla.
 * @version 1.0
 */
public class InterfazRed {

    /**
     * @param args the command line arguments
     * @throws java.net.SocketException
     */
    public static void main(String args[]) throws SocketException {
        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
        for (NetworkInterface netint : Collections.list(nets))
            displayInterfaceInformation(netint);
    }

    static void displayInterfaceInformation(NetworkInterface netint) throws SocketException {
        out.printf("Nombre de tarjeta de red: %s\n", netint.getDisplayName());
        out.printf("Nombre: %s\n", netint.getName());
        out.printf("MAC: %s\n",netint.getHardwareAddress());
        Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
        for(InetAddress inetAddress : Collections.list(inetAddresses)) {
            out.printf("Dirección física ipv6: %s\n", inetAddress);
        }
        out.printf("\n");
     }
    
}
