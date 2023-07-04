
/**
 * Write a description of class Hombres here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hombres extends Cliente
{
    private double prendauno;
    private double prendados;
    private double prendatres;
    
    Hombres(String identificacion, String nombre, String talla, String temporada, double prendauno, double prendados, double prendatres)throws Exception{
        super(identificacion, nombre, talla, temporada);
        setPrendauno(prendauno);
        setPrendados(prendados);
        setPrendatres(prendatres);
    }

    public double calcularPromedio(){
        return (prendauno + prendados + prendatres) / 3;
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
    
    public double getPrendatres(){
        return prendatres;
    }
    public void setPrendatres(double prendatres){
        if(prendatres >= 0) this.prendatres = prendatres;
        else this.prendatres = 0;
    }
}
