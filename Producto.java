
public abstract class Producto extends GooglePlay
{
    // instance variables - replace the example below with your own
    private String nombre;

    /**
     * Constructor for objects of class Producto
     */
    public Producto(String nombre)
    {
        this.nombre = nombre;
    }
    
    protected String getNombreProducto()
    {
        return nombre;
    }
    
}
