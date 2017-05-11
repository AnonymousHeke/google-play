
public abstract class Producto
{
    // instance variables - replace the example below with your own
    private String identificador;
    private int numeroCompras; 
    
    /**
     * Constructor for objects of class Producto
     */
    public Producto(String identificador)
    {
        this.identificador = identificador;
        numeroCompras = 0;
    }
    
    public String getId()
    {
        return identificador;
    }
    
    public void addNumeroCompras()
    {
        numeroCompras++;
    }
    
    public int numeroCompras()
    {
        return numeroCompras;
    }     
    
    public abstract double getPrecioProducto();
}
