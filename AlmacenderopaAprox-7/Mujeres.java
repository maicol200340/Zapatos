
/**
 * Write a description of class Mujeres here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mujeres extends Cliente
{
    private double prendauno;
    private double prendados;
    private double prendatres;
    private double prendacuatro;
    
    Mujeres(String identificacion, String nombre, String talla, String temporada, double prendauno, double prendados, double prendatres, double prendacuatro)throws Exception{
        super(identificacion, nombre, talla, temporada);
        setPrendauno(prendauno);
        setPrendados(prendados);
        setPrendatres(prendatres);
        setPrendacuatro(prendacuatro);
    }

    public double calcularPromedio(){
        return (prendauno + prendados + prendatres + prendacuatro) / 4;
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
    
        public double getPrendacuatro(){
        return prendacuatro;
    }
    public void setPrendacuatro(double prendacuatro){
        if(prendacuatro >= 0) this.prendacuatro = prendacuatro;
        else this.prendacuatro= 0;
    }
}