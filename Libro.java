
/**
 * Write a description of class Libro here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Libro extends ProductoMultimedia
{
    // instance variables - replace the example below with your own
    private int numeroPaginas;
    private boolean ficcion;
    private double precio;

    /**
     * Constructor for objects of class Libro
     */
    public Libro(String nombreLibro, int annoPublicacion, int numeroPaginas, boolean ficcion)
    {
        super(nombreLibro, annoPublicacion);
        this.numeroPaginas = numeroPaginas;
        this.ficcion = ficcion;
    }

    public int getNumeroPaginas()
    {
        return numeroPaginas;
    }
    
    public boolean getFiccion()
    {
        return ficcion;
    }
    
    public double getPrecioProducto()
    {
        precio = (getNumeroPaginas()/100)*(getAno()- 2010);
        return precio;
    }    
}
