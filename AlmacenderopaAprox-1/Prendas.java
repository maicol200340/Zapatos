
/**
 * Write a description of class Productos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Prendas
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numeroClientes = 0, opcionMenu = 0;
        Cliente[] losClientes = new Cliente[50];
        String identificacion, nombre, talla, temporada;
        double prendauno, prendados, prendatres;
        double promedio = 0;
        while(opcionMenu != 3){
            System.out.println("\nMenu de Opciones: ");
            System.out.println("1. Adicionar un Cliente: ");
            System.out.println("2. calcular promedio de prendas vendidas: ");
            System.out.println("3. Salir ");
            System.out.println("Escoja una opcion.... ");
            opcionMenu = sc.nextInt();
            if(opcionMenu== 1){
                System.out.println("Digite la identificacion del Cliente: ");
                identificacion = sc.next();
                System.out.println("Digite el nombre del Cliente:  ");
                nombre = sc.next();
                System.out.println("Digite la talla del Cliente: ");
                talla = sc.next();
                System.out.println("Digite la temporada de ropa comprada por el Cliente: ");
                temporada = sc.next();
                System.out.println("Digite la cantidad de la primera prenda vendida al cliente: ");
                prendauno = sc.nextDouble();
                System.out.println("Digite la cantidad de la segunda prenda vendida al cliente: ");
                prendados = sc.nextDouble();
                System.out.println("Digite la cantidad de la tercera prenda vendida al cliente: ");
                prendatres = sc.nextDouble();
                Cliente unCliente = new Cliente(identificacion, nombre, talla, temporada, prendauno, prendados,prendatres);
                losClientes[numeroClientes] = unCliente;
                numeroClientes++;
            }
            else if(opcionMenu==2){
                for(int i = 0; i < numeroClientes; i++){
                    promedio = promedio + losClientes[i].calcularpromedio() / numeroClientes;       
                }
                System.out.println("\n El Promedio de prendas vendidas es: "+ promedio);
            }
        }
    
    }
}
