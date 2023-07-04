
/**
 * Write a description of class producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Prendas
{
   public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        Almacen miAlmacen = new Almacen("83438503459","Almacen punto Moda","Teusaquillo");
        String identificacion, nombre, talla, temporada;
        
        double promedio = 0;
        
        System.out.println("Digite el numero de niños: ");
        int numeroNiños = sc.nextInt();
        for(int i = 0; i < numeroNiños; i++){
            double prenda1, prenda2;
            System.out.println("Digite la Identificacion del Niño/a: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del Niño/a: ");
            nombre = sc.next();
            System.out.println("Digite la talla del Niño/a: ");
            talla = sc.next();
            System.out.println("Digite la temporada de ropa comprada del niño/a:");
            temporada = sc.next();
            System.out.println("Digite primera cantidad de prendas compradas del niño/a: ");
            prenda1 = sc.nextDouble();
            System.out.println("Digite segunda cantidad de prendas compradas del niño/a: ");
            prenda2 = sc.nextDouble();            
            miAlmacen.adicionarNiños(identificacion, nombre, talla, temporada, prenda1, prenda2);
        }
                
        System.out.println("Digite el numero de Hombres: ");
        int numeroHombres = sc.nextInt();
        for(int i = 0; i < numeroHombres; i++){
            double prenda1, prenda2, prenda3;
            System.out.println("Digite la Identificacion del Hombre: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del Hombre: ");
            nombre = sc.next();
            System.out.println("Digite la talla del Hombre: ");
            talla = sc.next();
            System.out.println("Digite la temporada de ropa comprada por el Hombre: ");
            temporada = sc.next();
            System.out.println("Digite  la primera cantidad de prendas compradas por el Hombre: ");
            prenda1 = sc.nextDouble();
            System.out.println("Digite la segunda cantidad de prendas compradas por el Hombre: ");
            prenda2 = sc.nextDouble();            
            System.out.println("Digite la tercera cantidad de prendas compradas por el Hombre: ");
            prenda3 = sc.nextDouble();
            miAlmacen.adicionarHombres(identificacion, nombre, talla, temporada, prenda1, prenda2, prenda3);
        }
        
        System.out.println("Digite el numero de Mujeres: ");
        int numeroMujeres = sc.nextInt();
        for(int i = 0; i < numeroMujeres; i++){
            double prenda1, prenda2, prenda3, prenda4;            
            System.out.println("Digite la Identificacion de la Mujer: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre de la Mujere: ");
            nombre = sc.next();
            System.out.println("Digite la talla de la Mujer: ");
            talla = sc.next();
            System.out.println("Digite la temporada de ropa comprada por la Mujer: ");
            temporada = sc.next();
            System.out.println("Digite  la primera cantidad de prendas compradas por la mujer: ");
            prenda1 = sc.nextDouble();            
            System.out.println("Digite la segunda cantidad de prendas compradas por la mujer: ");
            prenda2 = sc.nextDouble();
            System.out.println("Digite la tercera cantidad de prendas compradas por la mujer: ");
            prenda3 = sc.nextDouble();
            System.out.println("Digite la cuarta cantidad de prendas compradas por la mujer");
            prenda4 = sc.nextDouble();
            miAlmacen.adicionarMujeres(identificacion, nombre, talla, temporada, prenda1, prenda2, prenda3, prenda4);
        }
        
        promedio = miAlmacen.calcularPromedioGeneral();
        System.out.println("\n El promedio de prendas vendidas es: " + promedio); 
    }
}
