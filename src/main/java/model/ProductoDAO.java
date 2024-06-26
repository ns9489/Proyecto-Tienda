package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {
    private Conexion conexion;

    public ProductoDAO() {
        this.conexion = new Conexion(); // Inicialización de la conexión
    }

    public void crearProducto(Producto producto) {
        String sql = "INSERT INTO productos (nombre, precio, categoria_id) VALUES (?, ?, ?)";
        try (Connection connection = conexion.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, producto.getNombre());
            statement.setDouble(2, producto.getPrecio());
            statement.setInt(3, producto.getCategoriaId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public List<Producto> leerProductos() {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM productos";
        try (Connection connection = conexion.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                double precio = resultSet.getDouble("precio");
                int categoriaId = resultSet.getInt("categoria_id");
                Producto producto = new Producto(id, nombre, precio, nombre, categoriaId, categoriaId, false);
                productos.add(producto);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar los datos: " + e.getMessage());
        }
        return productos;
    }

    public void actualizarProducto(Producto producto) {
        String sql = "UPDATE productos SET nombre = ?, precio = ?, categoria_id = ? WHERE id = ?";
        try (Connection connection = conexion.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, producto.getNombre());
            statement.setDouble(2, producto.getPrecio());
            statement.setInt(3, producto.getCategoriaId());
            statement.setInt(4, producto.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar los datos: " + e.getMessage());
        }
    }

    public void eliminarProducto(int id) {
        String sql = "DELETE FROM productos WHERE id = ?";
        try (Connection connection = conexion.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar los datos: " + e.getMessage());
        }
    }

    public void cerrarConexion() {
        conexion.closeConnection(conexion); // Cierre de la conexión
    }
}
