
/**
 * Write a description of class ProductoMultimedia here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class ProductoMultimedia extends Producto
{
    // instance variables - replace the example below with your own
    private int anno;

    /**
     * Constructor for objects of class ProductoMultimedia
     */
    public ProductoMultimedia(String titulo, int anno)
    {
        super(titulo);
        this.anno = anno;
    }

    public String getTitulo()
    {
        return getId();
    }
    
    public int getAno()
    {
        return anno;
    }
    
    public abstract double getPrecioProducto();    
}
