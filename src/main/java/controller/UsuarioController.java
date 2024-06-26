package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Usuario;
import model.UsuarioDAO;
import view.CrearUsuarioView;
import view.ModificarUsuarioView;
import view.TiendaView;
import view.UsuarioView;

public class UsuarioController implements ActionListener {
    private UsuarioView vista;
    private UsuarioDAO dao;
    private ModificarUsuarioView modificar;
    private CrearUsuarioView crear;
    private Usuario usuario = new Usuario();

    public UsuarioController(UsuarioView vista, UsuarioDAO modelo, ModificarUsuarioView modificar, CrearUsuarioView crear, TiendaView tienda) {
        this.vista = vista;
        this.dao = modelo;
        this.crear = crear;
        this.modificar = modificar;

        tienda.setLocationRelativeTo(null);
        tienda.setResizable(false);
        crear.setLocationRelativeTo(null);
        crear.setResizable(false);
        modificar.setLocationRelativeTo(null);
        modificar.setResizable(false);

        this.vista.btnModificarUsuarios.addActionListener(this);
        this.vista.btnMostrarUsuarios.addActionListener(this);
        this.vista.btnEliminarUsuario.addActionListener(this);
        this.vista.btnEliminarUsuario.addActionListener(this);

        this.crear.btnCrearUsuario.addActionListener(this);
        this.crear.btnVolverCrearUsuario.addActionListener(this);

        this.modificar.btnBuscarIDUsuario.addActionListener(this);
        this.modificar.btnGuardarModificacionUsuario.addActionListener(this);
        this.modificar.btnVolverModificarUsuarios.addActionListener(this);
    }

    @Override // Método que permite que los botones sean escuchados
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnMostrarUsuarios) {
            dao.LeerUsuario(vista);
        }

        // volver a ventana principal
        if (e.getSource() == vista.btnMostrarUsuarios) {
            vista.setVisible(false);
        }

        // Abre la ventana vista crear
        if (e.getSource() == vista.btnCrearUsuarios) {
            crear.setVisible(true);
            vista.dispose();
        }

        // Abre la ventana vista modificar
        if (e.getSource() == vista.btnModificarUsuarios) {
            modificar.setVisible(true);
            vista.dispose();
        }

        // regresa a la ventana principal de categoria
        if (e.getSource() == modificar.btnVolverModificarUsuarios) {
            vista.setVisible(true);
            modificar.setVisible(false);
        }

        // regresa a la ventana principal de categoria
        if (e.getSource() == crear.btnVolverCrearUsuario) {
            vista.setVisible(true);
            crear.setVisible(false);
        }

        // Acción del texto eliminar y btn eliminar
        if (e.getSource() == TiendaView.btnEliminarUsuario) {
            int id = Integer.parseInt(TiendaView.btnEliminarUsuario.getText());
            usuario.setId(id);
            dao.EliminarUsuario(usuario);
            TiendaView.btnEliminarUsuario.setText("");
        }

        // Acción guardar campos al oprimir botón crearNuevoLibro
        if (e.getSource() == crear.btnCrearUsuario) {
            // obtener valores
            String nombre = crear.textCrearNombreUsuario.getText();
            String email = crear.textCrearEmailUsuario.getText();
            String telefono = crear.textCrearTelefonoUsuario.getText();
            // asignar valores al objeto libro
            usuario.setNombre(nombre);
            usuario.setEmail(email);
            usuario.setTelefono(telefono);

            // Crear la categoría en el modelo
            dao.CrearUsuario(usuario);

            crear.textCrearEmailUsuario.setText("");
            crear.textCrearNombreUsuario.setText("");
            crear.textCrearTelefonoUsuario.setText("");
        }

        // Acción para traer el contenido según el id de la categoría
        if (e.getSource() == modificar.btnBuscarIDUsuario) {
            int id = Integer.parseInt(modificar.textIDBuscarUsuario.getText());

            dao.TraerContenidoUsuario(usuario);

            // Asignar valores obtenidos al formulario de modificación
            modificar.textIDBuscarUsuario.setText(String.valueOf(usuario.getId()));
            modificar.textModificarNombreUsuario.setText(usuario.getNombre());
            modificar.textModificarEmailUsuario.setText(usuario.getEmail());
            modificar.textModificarTelefonoUsuario.setText(usuario.getTelefono());
        }

        // Acción para guardar las modificaciones en la base de datos
        if (e.getSource() == modificar.btnGuardarModificacionUsuario) {
            String nombre = modificar.textModificarNombreUsuario.getText();
            String email = modificar.textModificarEmailUsuario.getText();
            String telefono = modificar.textModificarTelefonoUsuario.getText();
            // Actualiza la base de datos en el campo del id
            usuario.setNombre(nombre);
            usuario.setEmail(email);
            usuario.setTelefono(telefono);
            // Guardar cambios en el modelo (tabla)
            dao.ModificarUsuario(usuario);

            modificar.textIDBuscarUsuario.setText("");
            modificar.textModificarEmailUsuario.setText("");
            modificar.textModificarNombreUsuario.setText("");
            modificar.textModificarTelefonoUsuario.setText("");
        }
    }
}
