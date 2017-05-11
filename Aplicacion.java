
/**
 * Write a description of class Aplicacion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto
{
    // instance variables - replace the example below with your own
    private Categoria categoria;
    private double tamanno;

    /**
     * Constructor for objects of class Aplicacion
     */
    public Aplicacion(String nombreAplicacion, double tamanno, Categoria categoria)
    {
        super(nombreAplicacion);
        this.tamanno = tamanno;
        this.categoria = categoria;
    }

    public String getNombre()
    {
        return getNombreProducto();
    }
    
    public double getTamanoEnMB()
    {
        return tamanno;
    }
    
    public String getCategoria()
    {
        String tipoCategoria = "";
        
        if (categoria.toString().equals("MULTIMEDIA"))
        {
            tipoCategoria = "Multimedia";
        }
 
        else if (categoria.toString().equals("JUEGOS"))
        {
            tipoCategoria = "Juegos";
        }
        
        else if (categoria.toString().equals("PRODUCTIVIDAD"))
        {
            tipoCategoria = "Productividad";
        }        
        
        else if (categoria.toString().equals("COMUNICACIONES"))
        {
            tipoCategoria = "Comunicaciones";
        }        
        
        return tipoCategoria;
    }
}
