
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

    /**
     * Constructor for objects of class Pelicula
     */
    public Pelicula(String nombrePelicula, int annoCreacion, int duracion, int calidad)
    {
        super(nombrePelicula, annoCreacion);
        this.duracion = duracion;
        this.calidad = calidad;
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
}
