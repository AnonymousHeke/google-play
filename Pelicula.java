
/**
 * Write a description of class Pelicula here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pelicula extends ProductoMultimedia
{
    // instance variables - replace the example below with your own
    private int duracion;
    private int calidad;
    private double precio;

    /**
     * Constructor for objects of class Pelicula
     */
    public Pelicula(String nombrePelicula, int annoCreacion, int duracion, int calidad)
    {
        super(nombrePelicula, annoCreacion);
        this.duracion = duracion;
        this.calidad = calidad;
        precio = 0;
    }

    public int getDuracion()
    {
        return duracion;
    }
    
    public String getCalidad()
    {
        String tipoCalidad = "";
        
        if(calidad == 1080)
        {
            tipoCalidad = "FullHD";
        }
        else
        {
            tipoCalidad = "HD";
        }
        
        return tipoCalidad;
    }
    
    public double getPrecioProducto()
    {
        if(getCalidad().equals("FullHD"))
        {
            precio=10;
        }
        else
        {
            precio=5;
        }
        
        if(getAno()<=2000)
        {
            precio=precio/2;
        }
        
        return precio;
    }
}
