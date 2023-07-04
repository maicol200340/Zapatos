
/**
 * Write a description of class AlmacenPuntoModa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Almacen
{
    private final String nit;
    private String nombreAlmacen;
    private String direccion;
    private Cliente[] cliente;
    private int numeroClientes;
    
    public Almacen(String nit,String nombreAlmacen,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreAlmacen(nombreAlmacen);
        setDireccion(direccion);        
        cliente = new Cliente[50];
        numeroClientes = 0;
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
    
    public int getNumeroClientes(){
        return numeroClientes;
    }
    
    public double calcularpromediogeneral(){ 
        double promedio = 0;
        for(int i = 0; i < numeroClientes; i++){
            promedio = promedio + cliente[i].calcularpromedio() / numeroClientes;
        }
        return promedio;
    }
    
    public void adicionarCliente(String identificacion, String nombre, String talla,String temporada, double prendauno, double prendados, double prendatres){
        Cliente cl = new Cliente(identificacion, nombre, talla, temporada, prendauno, prendados, prendatres);
        cliente[numeroClientes] = cl;
        numeroClientes++;
    }
}
