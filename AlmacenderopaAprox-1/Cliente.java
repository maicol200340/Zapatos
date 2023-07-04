
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    String identificacion;
    String nombre;
    String temporada;
    String talla;
    double prendauno;
    double prendados;
    double prendatres;
    
    Cliente( String nombre, String identificacion, String temporada, String talla, double prendauno, double prendados, double prendatres){
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.talla = talla;
        this.prendauno = prendauno;
        this.prendados = prendados;
        this.prendatres = prendatres;
    }
    
    double calcularpromedio(){
        return (prendauno + prendados + prendatres) / 3;
    }

}
