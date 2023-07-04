
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Prendas
{
        public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int numeroClientes;
        Cliente[] losClientes = new Cliente[50];
        String identificacion, nombre, talla, temporada;
        double prenda1, prenda2, prenda3;
        double promedio = 0;
        
        System.out.println("Digite el numero de clientes: ");
        numeroClientes= sc.nextInt();
        
        for(int i = 0; i < numeroClientes; i++){
            System.out.println("Digite la identificacion del cliente: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del cliente: ");
            nombre = sc.next(); 
            System.out.println("Digite la talla del cliente: ");
            talla = sc.next();
            System.out.println("Digite la temporada de ropa comprada por el cliente: ");
            temporada = sc.next();
            System.out.println("Digite la primera cantidad del producto vendido al cliente: ");
            prenda1 = sc.nextDouble();
            System.out.println("Digite  la segunda cantidad del producto vendido al cliente: ");
            prenda2 = sc.nextDouble();            
            System.out.println("Digite  la tercera cantidad del producto vendido al cliente: ");
            prenda3 = sc.nextDouble();
            Cliente unCliente = new Cliente(nombre, identificacion, talla, temporada, prenda1, prenda2, prenda3);
            losClientes[i] = unCliente;
        }
        for(int i = 0; i < numeroClientes; i++)
            promedio = promedio + losClientes[i].calcularpromedio() / numeroClientes;
        
        System.out.println("\n El promedio de prendas vendida es: " + promedio); 
    }

}
