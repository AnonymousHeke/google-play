
/**
 * Write a description of class ProductoMultimedia here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProductoMultimedia extends Producto
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
        return getNombreProducto();
    }
    
    public int getAno()
    {
        return anno;
    }
}
