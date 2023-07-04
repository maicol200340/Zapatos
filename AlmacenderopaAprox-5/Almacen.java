
/**
 * Write a description of class Almacen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Almacen
{
    private final String nit;
    private String nombreAlmacen;
    private String direccion;
    private Niños[] niños;
    private Hombres[] hombres;
    private Mujeres[] mujeres;    
    private int numeroNiños;
    private int numeroHombres;
    private int numeroMujeres;    
    
    public Almacen(String nit,String nombreAlmacen,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreAlmacen(nombreAlmacen);
        setDireccion(direccion);        
        niños = new Niños[50];
        hombres = new Hombres[50];
        mujeres = new Mujeres[50];        
        numeroNiños = 0;
        numeroHombres = 0;
        numeroMujeres= 0;        
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombreAlmacen(){
        return nombreAlmacen;
    }
    public void setNombreAlmacen(String nombreAlmacen){
        if(nombreAlmacen != null){
            this.nombreAlmacen = nombreAlmacen;
        }else{
            this.nombreAlmacen = "";
        }        
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        if(direccion != null){
            this.direccion = direccion;
        }else{
            this.direccion = "";
        }        
    }
    
    public int getNumeroNiños(){
        return numeroNiños;
    }
    
    public int getNumeroHombres(){
        return numeroHombres;
    }
    
    public int getNumeroMujeres(){
        return numeroMujeres;
    }    
    
    public double calcularpromediogeneral(){
        double promedio = 0;
        for(int i = 0; i < numeroNiños; i++){
            promedio = promedio + niños[i].calcularpromedio() / numeroNiños;
        }
        for(int i = 0; i < numeroHombres; i++){
            promedio = promedio + hombres[i].calcularpromedio() / numeroHombres;
        }
        for(int i = 0; i < numeroMujeres; i++){
            promedio = promedio + mujeres[i].calcularpromedio() / numeroMujeres;
        }
        return promedio / 3;
    }
    public void adicionarNiños(String identificacion, String nombre, String talla, String temporada, double prendauno, double prendados){
        niños[numeroNiños] = new Niños(identificacion, nombre, talla, temporada, prendauno, prendados);
        numeroNiños++;
    }
    
    public void adicionarHombres(String identificacion, String nombre, String talla, String temporada, double prendauno, double prendados, double prendatres){
        hombres[numeroHombres] = new Hombres(identificacion, nombre, talla, temporada, prendauno, prendados, prendatres);
        numeroHombres++;
    }
    
    public void adicionarMujeres(String identificacion, String nombre, String talla, String temporada, double prendauno, double prendados, double prendatres, double prendacuatro){
        mujeres[numeroMujeres] = new Mujeres(identificacion, nombre, talla, temporada, prendauno, prendados, prendatres, prendacuatro);
        numeroMujeres++;
    }
}
