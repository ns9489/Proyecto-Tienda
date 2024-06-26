package model;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import view.TiendaView;
import view.UsuarioView;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO extends Conexion {

    public UsuarioDAO() {
    }

    // Crear
    public void CrearUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nombre, email, telefono) VALUES (?, ?, ?)";
        try (PreparedStatement sentencia = getConnection().prepareStatement(sql)) {
            sentencia.setString(1, usuario.getNombre());
            sentencia.setString(2, usuario.getEmail());
            sentencia.setString(3, usuario.getTelefono());
            sentencia.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario creado exitosamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo crear el usuario: " + e.getMessage());
        }
    }

    // Leer
    public void LeerUsuario(UsuarioView vista) {
        String sql = "SELECT * FROM usuarios";
        try (PreparedStatement sentencia = getConnection().prepareStatement(sql);
             ResultSet resultado = sentencia.executeQuery()) {

            // Limpia el modelo antes de cargar nuevos datos
            vista.setRowCount(0);

            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                String email = resultado.getString("email");
                String telefono = resultado.getString("telefono");
                vista.addRow(new Object[]{id, nombre, email, telefono});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar la tabla de usuarios: " + e.getMessage());
        }
    }

    // Actualizar
    public void ModificarUsuario(Usuario usuario) {
        String sql = "UPDATE usuarios SET nombre = ?, email = ?, telefono = ? WHERE id = ?";
        try (PreparedStatement sentencia = getConnection().prepareStatement(sql)) {
            sentencia.setString(1, usuario.getNombre());
            sentencia.setString(2, usuario.getEmail());
            sentencia.setString(3, usuario.getTelefono());
            sentencia.setInt(4, usuario.getId());
            sentencia.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario actualizado exitosamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la actualización: " + e.getMessage());
        }
    }

    // Eliminar
    public void EliminarUsuario(Usuario usuario) {
        String sql = "DELETE FROM usuarios WHERE id = ?";
        try (PreparedStatement sentencia = getConnection().prepareStatement(sql)) {
            sentencia.setInt(1, usuario.getId());
            sentencia.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se eliminó el usuario exitosamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el usuario: " + e.getMessage());
        }
    }

    // Método adicional para traer el contenido de un usuario
    public void TraerContenidoUsuario(Usuario usuario) {
        String sql = "SELECT * FROM usuarios WHERE id = ?";
        try (PreparedStatement sentencia = getConnection().prepareStatement(sql)) {
            sentencia.setInt(1, usuario.getId());
            ResultSet resultado = sentencia.executeQuery();

            if (resultado.next()) {
                usuario.setId(resultado.getInt("id"));
                usuario.setNombre(resultado.getString("nombre"));
                usuario.setEmail(resultado.getString("email"));
                usuario.setTelefono(resultado.getString("telefono"));
            } else {
                JOptionPane.showMessageDialog(null, "¡No existe un usuario con ese ID!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un problema al intentar mostrar los datos del usuario: " + e.getMessage());
        }
    }
}
