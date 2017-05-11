import java.util.ArrayList;

/**
 * Write a description of class GooglePlay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GooglePlay
{
    // instance variables - replace the example below with your own
    private ArrayList<Usuario> usuarios;
    private ArrayList<Producto> productos;

    /**
     * Constructor for objects of class GooglePlay
     */
    public GooglePlay()
    {
        usuarios  = new ArrayList<>();
        productos = new ArrayList<>();        
    }

    public int getNumeroUsuarios()
    {
        return usuarios.size();
    }
    
    public void addUsuario(Usuario usuario)
    {
        usuarios.add(usuario);
    }
    
    public int getNumeroProductos()
    {
        return productos.size();
    }
    
    public void addProducto(Producto producto)
    {
        productos.add(producto);
    }
}
