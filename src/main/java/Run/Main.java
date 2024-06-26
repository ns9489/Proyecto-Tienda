package Run;

import controller.CategoriaController;
import controller.ProductoController;
import controller.TiendaController;
import controller.UsuarioController;
import model.CategoriaDAO;
import model.ProductoDAO;
import model.UsuarioDAO;
import view.CategoriaView;
import view.CrearCategoriaView;
import view.CrearProductoView;
import view.CrearUsuarioView;
import view.ModificarCategoriaView;
import view.ModificarProductoView;
import view.ModificarUsuarioView;
import view.ProductoView;
import view.TiendaView;
import view.UsuarioView;

public class Main {
    public static void main(String[] args) {
    	
    	TiendaView tienda = new TiendaView();
    	
        ProductoView productoView = new ProductoView();
        ProductoDAO productoDAO = new ProductoDAO();
        CrearProductoView crearProductoView = new CrearProductoView();
        ModificarProductoView modificarProductoView = new ModificarProductoView();
        
        new ProductoController(productoView, crearProductoView, modificarProductoView, productoDAO, tienda);
        //
        CategoriaView categoriaView = new CategoriaView();
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        CrearCategoriaView crearCategoriaView = new CrearCategoriaView();
        ModificarCategoriaView modificarCategoriaView = new ModificarCategoriaView();
        
        new CategoriaController(categoriaView, crearCategoriaView, modificarCategoriaView, categoriaDAO, tienda);
        //
        UsuarioView usuarioView = new UsuarioView();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        CrearUsuarioView crearUsuarioView = new CrearUsuarioView();
        ModificarUsuarioView modificarUsuarioView = new ModificarUsuarioView();
        
        
        
        new UsuarioController(usuarioView, usuarioDAO, modificarUsuarioView, crearUsuarioView,tienda);
        new TiendaController(categoriaView, productoView, usuarioView,tienda);
        tienda.setVisible(true);
    }
}