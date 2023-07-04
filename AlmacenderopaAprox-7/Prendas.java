
/**
 * Write a description of class Prendas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Prendas
{
    public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        Almacen miAlmacen = new Almacen("123456","Almacen Punto Moda","Teusaquillo");
        String identificacion, nombre, talla, temporada;
        double prenda1, prenda2, prenda3, prenda4;
        double promedio = 0;
        int opcionMenu = 0;
        
        do{
            System.out.println("\nMenu de Opciones");
            System.out.println("[1]- Adicionar Niño/a ");
            System.out.println("[2]- Adicionar Hombre ");
            System.out.println("[3]- Adicionar Mujer ");
            System.out.println("[4]- Calcular Promedio ");
            System.out.println("[5]- Salir \n");
            System.out.println("Escoja una Opcion: ");
            opcionMenu = sc.nextInt();
            switch(opcionMenu){
                case 1:
                        sc.nextLine();
                        System.out.println("Digite la Identificacion del Niño o la Niña: ");
                        identificacion = sc.next();
                        System.out.println("Digite el nombre del Niño o la Niña: ");
                        nombre = sc.next();
                        System.out.println("Digite la talla del Niño o la Niña: ");
                        talla = sc.next();
                        System.out.println("Digite la temporada de ropa comprada para el Niño o la Niña:: ");
                        temporada = sc.next();
                        System.out.println("Digite la primera cantidad de prendas compradas para el Niño o la Niña: ");
                        prenda1 = sc.nextDouble();
                        System.out.println("Digite segunda cantidad de prendas compradas para el Niño o la Niña: ");
                        prenda2 = sc.nextDouble();
                        try{
                            miAlmacen.adicionarCliente(identificacion, nombre, talla, temporada, prenda1, prenda2);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 2:
                        sc.nextLine();
                        System.out.println("Digite la Identificacion del Hombre: ");
                        identificacion = sc.next();
                        System.out.println("Digite el nombre del Hombre: ");
                        nombre = sc.next();
                        System.out.println("Digite la talla del Hombre: ");
                        talla = sc.next();
                        System.out.println("Digite la temporada de ropa comprada por el Hombre: ");
                        temporada = sc.next();
                        System.out.println("Digite la primera cantidad de ropa comprada por el hombre: ");
                        prenda1 = sc.nextDouble();
                        System.out.println("Digite la segunda cantidad de ropa comprada por el hombre: ");
                        prenda2 = sc.nextDouble();            
                        System.out.println("Digite la tercera cantidad de ropa comprada por el hombre: ");
                        prenda3 = sc.nextDouble();
                        try{                        
                        miAlmacen.adicionarCliente(identificacion, nombre, talla, temporada, prenda1, prenda2, prenda3);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 3:
                        sc.nextLine();                        
                        System.out.println("Digite la Identificacion de la mujer: ");
                        identificacion = sc.next();
                        System.out.println("Digite el nombre de la mujer: ");
                        nombre = sc.next();
                        System.out.println("Digite la talla de la mujer: ");
                        talla = sc.next();
                        System.out.println("Digite la temporada de la ropa comprada por la mujer");
                        temporada = sc.next();
                        System.out.println("Digite la primera cantidad de ropa comprada por la mujer: ");
                        prenda1 = sc.nextDouble();
                        System.out.println("Digite la segunda cantidad de ropa comprada por la mujer: ");
                        prenda2 = sc.nextDouble();            
                        System.out.println("Digite la tercera cantidad de ropa comprada por la mujer: ");
                        prenda3 = sc.nextDouble();
                        System.out.println("Digite la cuarta cantidad de ropa comprada por la mujer: ");
                        prenda4 = sc.nextDouble();
                        try{                         
                        miAlmacen.adicionarCliente(identificacion, nombre, talla, temporada, prenda1, prenda2, prenda3, prenda4);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 4:
                        sc.nextLine();
                        promedio = miAlmacen.calcularPromedioGeneral();
                        System.out.println("\n El promedio de prendas vedidas es: " + promedio); 
                        break;
                default:
                        System.out.println("Ha Seleccionado Salir");
                        
            }
        }while(opcionMenu != 5);
    }
}