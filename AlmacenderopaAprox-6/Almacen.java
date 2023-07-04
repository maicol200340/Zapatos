
/**
 * Write a description of class Alamacen here.
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
    
    public Almacen(String nit, String nombre, String direccion){
      if(nit != null) this.nit = nit;
      else this.nit ="";
      setNombreAlmacen(nombreAlmacen);
      setDireccion(direccion);
      cliente = new Cliente[50];
      numeroClientes = 0; 
    }
    public String getNit(){
        return nit;
    }
    public String getNombreAlmacen (){
        return nombreAlmacen;
    }
    public void setNombreAlmacen (String nombreAlmacen){
        if(nombreAlmacen != null) {
           this.nombreAlmacen = nombreAlmacen; 
        }else{
            this.nombreAlmacen= "";
        }    
    }
    public String getDireccion (){
    return direccion;
    }
    public void setDireccion (String direccion){
        if(direccion != null) {
           this.direccion = direccion; 
        }else{
            this.direccion = "";
        }
    }
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for (int i = 0; i < numeroClientes; i++){
            promedio = promedio + cliente[i].calcularPromedio ();
        }
        return promedio /3;
    }
    public void adicionarNiños(String identificacion, String nombre, String talla, String temporada, double prendauno, double prendados){
        cliente[numeroClientes] = new Niños(identificacion, nombre, talla, temporada, prendauno, prendados);
        numeroClientes++;
    }
    
    public void adicionarHombres(String identificacion, String nombre, String talla, String temporada, double prendauno, double prendados, double prendatres){
        cliente[numeroClientes] = new Hombres(identificacion, nombre, talla, temporada, prendauno, prendados, prendatres);
        numeroClientes++;
    }
    
    public void adicionarMujeres(String identificacion, String nombre, String talla, String temporada, double prendauno, double prendados, double prendatres, double prendacuatro){
        cliente[numeroClientes] = new Mujeres(identificacion, nombre, talla, temporada, prendauno, prendados, prendatres, prendacuatro);
        numeroClientes++;
    }
}
