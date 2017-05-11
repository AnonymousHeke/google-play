import java.util.ArrayList;

/**
 * Write a description of class Usuario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Usuario 
{
    // instance variables - replace the example below with your own
    private String user;
    private ArrayList<Producto> productosComprados;

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String user)
    {
        this.user = user;
        productosComprados = new ArrayList<>();         
    }

    public String getNombreCuenta()
    {
        return user;
    }
    
    public void addProductoComprado(Producto producto)
    {
        productosComprados.add(producto);
    }
}
