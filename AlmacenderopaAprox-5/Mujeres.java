
/**
 * Write a description of class RopaFemenina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mujeres
{
   private final String identificacion; 
   private String nombre;
   private String talla;
   private String temporada;
   private double prendauno;
   private double prendados;
   private double prendatres;
   private double prendacuatro;
    
    public String getIdentificacion(){
        return identificacion;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if(nombre != null) this.nombre = nombre;
        else this.nombre = "";
    }
    
    public String getTalla(){
        return talla;
    }
    public void setTalla(String talla){
        if(talla != null) this.talla = talla;
        else this.talla = "";
    }
    public String getTemporada(){
        return temporada;
    }
    public void setTemporada(String temporada){
        if(temporada != null) this.temporada = temporada;
        else this.temporada = "";
    }
    public double getPrendauno(){
        return prendauno;
    }
    public void setPrendauno(double prendauno){
        if(prendauno >= 0) this.prendauno = prendauno;
        else this.prendauno = 0;
    }
    
    public double getPrendados(){
        return prendados;
    }
    public void setPrendados(double prendados){
        if(prendados >= 0) this.prendados = prendados;
        else this.prendados = 0;
    }
    public double getPrendatres (){
        return prendatres;
    }
    public void setPrendatres(double prendatres){
        if(prendatres >= 0) this.prendatres = prendatres;
        else this.prendatres = 0;
    }
    public double getPrendacuatro(){
        return prendacuatro;
    }
    public void setPrendacuatro(double prendacuatro){
        if(prendacuatro >= 0)this.prendacuatro = prendacuatro;
        else this.prendacuatro = 0;
    }
    
    Mujeres(String identificacion, String nombre, String talla, String temporada, double prendauno, double prendados, double prendatres, double prendacuatro){
        if(identificacion != null) this.identificacion = identificacion;
        else this.identificacion = "";
        setNombre(nombre);
        setTalla(talla);
        setTemporada(temporada);
        setPrendauno(prendauno);
        setPrendados(prendados);
        setPrendatres(prendatres);
        setPrendacuatro(prendacuatro);
    }
    
    double calcularpromedio(){
        return (prendauno + prendados + prendatres + prendacuatro) / 4;
    }
}
