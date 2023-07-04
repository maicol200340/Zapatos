
/**
 * Write a description of class Almacen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList; 
public class Almacen
{
    private final String nit;
    private String nombreAlmacen;
    private String direccion;
    private ArrayList cliente;
    
    public Almacen(String nit,String nombreAlmacen,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreAlmacen(nombreAlmacen);
        setDireccion(direccion);        
        cliente = cliente = new ArrayList();
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
        
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < cliente.size(); i++){
            promedio += ((Cliente)cliente.get(i)).calcularPromedio();
        }

        return promedio / 3;
    }
    
    public void adicionarCliente(String identificacion, String nombre, String talla, String temporada, double prendauno, double prendados)throws Exception{
        cliente.add(new Niños(identificacion, nombre, talla,temporada, prendauno, prendados));
    }
    
    public void adicionarCliente(String identificacion, String nombre, String talla,String temporada, double prendauno, double prendados, double prendatres)throws Exception{
        cliente.add(new Hombres(identificacion, nombre, talla, temporada, prendauno, prendados, prendatres));
    }
    
    public void adicionarCliente(String identificacion, String nombre, String talla, String temporada, double prendauno, double prendados, double prendatres, double prendacuatro)throws Exception{
        cliente.add(new Mujeres(identificacion, nombre, talla, temporada, prendauno, prendados, prendatres, prendacuatro));
    }
}   