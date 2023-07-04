
/**
 * Write a description of class Productos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Prendas
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numeroClientes;
        Almacen miAlmacen  = new Almacen ("10837739","Almacen Punto Moda","Teusaquillo");
        String identificacion, nombre, talla, temporada;
        double prenda1, prenda2, prenda3;
        double promedio = 0;
        
        System.out.println("Digite la cantidad de clientes: ");
        numeroClientes = sc.nextInt();
        
        for(int i = 0; i < numeroClientes; i++){
            System.out.println("Digite la identificacion del cliente: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del cliente: ");
            nombre = sc.next();
            System.out.println("Digite la talla del cliente: ");
            talla = sc.next();
            System.out.println("Digite la temporada de ropa comprada por el cliente: ");
            temporada = sc.next();
            System.out.println("Digite la primera cantidad de prendas vendidas al cliente: ");
            prenda1 = sc.nextDouble();
            System.out.println("Digite la segunda cantidad de prendas vendidas al cliente: ");
            prenda2 = sc.nextDouble();            
            System.out.println("Digite la tercera cantidad de prendas vendidas al cliente: ");
            prenda3 = sc.nextDouble();
            miAlmacen .adicionarCliente(identificacion, nombre, talla, temporada, prenda1, prenda2, prenda3);
        }
        
        promedio = miAlmacen .calcularpromediogeneral();        
        System.out.println("\n El promedio de ropa vendida es: " + promedio); 
    }
}
