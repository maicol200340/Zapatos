
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Cliente
{
    protected final String identificacion;
    private String nombre;
    private String talla;
    private String temporada;
    
    public Cliente(String identificacion, String nombre, String talla, String temporada)throws Exception{
        if(identificacion.trim().equals(""))
            throw new Exception("valor invalido en la identificacion");
        
        if(identificacion.matches(".*[a-zA-Z].*"))
            throw new Exception("La identificacion no puede tener caracteres");
        
        this.identificacion = identificacion;
        setNombre(nombre);
        setTalla(talla);
        
    }
    
    public abstract double calcularPromedio();
    
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
        if(temporada != null)this.temporada = temporada;
        else this.temporada = "";
    }
}

