
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
    private double precio;

    /**
     * Constructor for objects of class Aplicacion
     */
    public Aplicacion(String nombreAplicacion, double tamanno, Categoria categoria)
    {
        super(nombreAplicacion);
        this.tamanno = tamanno;
        this.categoria = categoria;
        precio = 0.99;
    }

    public String getNombre()
    {
        return getId();
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
    
    public double getPrecioProducto()
    {       
        if (getNumeroCompras() >= 2)
        {
            switch (categoria) 
            {
                case JUEGOS: 
                precio = 5;
                break;
                case MULTIMEDIA:
                precio = 2;
                break;
                case PRODUCTIVIDAD:
                precio = 10;
                break;
                case COMUNICACIONES:
                precio = 2;
                break;
            }
        }
                                     
        return precio;
    }    
}
