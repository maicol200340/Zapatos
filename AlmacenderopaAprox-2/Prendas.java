
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Prendas
{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int numeroClientes;
            Cliente[] losClientes = new Cliente[50];
            String  nombre, identificacion, talla, temporada;
            double prenda1, prenda2, prenda3;
            double promedio = 0;
            System.out.println("Digite la cantidad de clientes: ");
            numeroClientes = sc.nextInt();
            
            for(int i = 0; i < numeroClientes; i++){
                System.out.println("Digite la identificacion del cliente: ");
                identificacion = sc.next();
                System.out.println("Digite el nombre del cliente:  ");
                nombre = sc.next();
                System.out.println("Digite la talla del cliente: ");
                talla= sc.next();
                System.out.println("Digite la temporada de ropa comprada por el cliente");
                temporada = sc.next();
                System.out.println("Digite la cantidad 1 de prendas vendidas al cliente: ");
                prenda1 = sc.nextDouble();
                System.out.println("Digite la cantidad 2 de prendas vendidas al cliente: ");
                prenda2 = sc.nextDouble();
                System.out.println("Digite la cantidad 3 de prendas vendidas al cliente: ");
                prenda3 = sc.nextDouble();
                Cliente unCliente = new Cliente();
                unCliente.identificacion = identificacion;
                unCliente.nombre = nombre;
                unCliente.talla= talla;
                unCliente.temporada = temporada;
                unCliente.prendauno = prenda1;
                unCliente.prendados = prenda2;
                unCliente.prendatres = prenda3;
                losClientes[i] = unCliente;
            }
            for(int i = 0; i < numeroClientes; i++){
                double suma =(losClientes[i].prendauno +losClientes[i].prendados +losClientes[i].prendatres)/3;
                promedio = promedio + suma / numeroClientes;
            }
            System.out.println("El promedio de prendas vendida es "+ promedio);
    }

}
