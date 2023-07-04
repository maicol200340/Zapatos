
/**
 * Write a description of class Niños here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Niños extends Cliente
{
    private double prendauno;
    private double prendados;
    
    public Niños(String identificacion, String nombre, String talla, String temporada, double prendauno, double prendados){
      super (identificacion, nombre, talla, temporada);
      setNombre(nombre);
      setTalla(talla);
      setTemporada(temporada);
    }
    
    double calcularpromedio () {
        return  (prendauno + prendados)/ 2;
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
    double calcularPromedio(){
        return (prendauno + prendados ) / 2;
    }
}
