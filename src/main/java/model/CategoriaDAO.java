package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {
    private Conexion conexion;

    public CategoriaDAO() {
        conexion = new Conexion();
    }

    public void crearCategoria(Categoria categoria) {
        String sql = "INSERT INTO categorias (nombre) VALUES (?)";
        try (Connection connection = conexion.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, categoria.getNombre());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public List<Categoria> leerCategorias() {
        List<Categoria> categorias = new ArrayList<>();
        String sql = "SELECT * FROM categorias";
        try (Connection connection = conexion.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                Categoria categoria = new Categoria(id, nombre);
                categorias.add(categoria);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar los datos: " + e.getMessage());
        }
        return categorias;
    }

    public void actualizarCategoria(Categoria categoria) {
        String sql = "UPDATE categorias SET nombre = ? WHERE id = ?";
        try (Connection connection = conexion.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, categoria.getNombre());
            statement.setInt(2, categoria.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar los datos: " + e.getMessage());
        }
    }

    public void eliminarCategoria(int id) {
        String sql = "DELETE FROM categorias WHERE id = ?";
        try (Connection connection = conexion.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar los datos: " + e.getMessage());
        }
    }

    public void cerrarConexion() {
        conexion.closeConnection(conexion);
    }
}
