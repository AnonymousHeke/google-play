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
    
    public double comprar(String usuarioABuscar, String productoAComprar)
    {
        double precioProducto = -1;
        Usuario usuario;
        Producto producto;
        boolean usuarioEncontrado = false;
        boolean productoEncontrado = false;
        int i = 0;
        
        while (i < usuarios.size() && usuarioEncontrado == false)
        {
            if(usuarios.get(i).getNombreCuenta().equals(usuarioABuscar))
            {
                usuarioEncontrado = true;
                usuario = usuarios.get(i);
            }
        }
        
        i = 0;
        
        while (i < productos.size() && productoEncontrado == false)
        {
            if(productos.get(i).getId().equals(productoAComprar) && usuarioEncontrado)
            {
                producto = productos.get(i);
                precioProducto = productogetPrecioProducto();
                producto.addNumeroCompras();
                usuario.addProductoComprado(producto);
            }
        }
        
        return precioProducto;
    }
}
