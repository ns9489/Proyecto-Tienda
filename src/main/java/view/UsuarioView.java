package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UsuarioView extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textCodigoEliminarUsuario;
	public JTable table;
	public JButton btnCrearUsuarios;
	public JButton btnEliminarUsuario;
	public JButton btnModificarUsuarios;
	public DefaultTableModel modelo;
	public JButton btnVolverTienda;
	public JButton btnMostrarUsuarios;

	/**
	 * Create the frame.
	 */
	public UsuarioView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 385);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModificarUsuario = new JLabel("Gestion de Usuarios");
		lblModificarUsuario.setBackground(new Color(255, 255, 255));
		lblModificarUsuario.setBounds(189, 34, 173, 21);
		lblModificarUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		lblModificarUsuario.setForeground(new Color(255, 255, 255));
		lblModificarUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblModificarUsuario);

		btnMostrarUsuarios = new JButton("Mostrar Usuarios");
		btnMostrarUsuarios.setBounds(147, 112, 271, 23);
		contentPane.add(btnMostrarUsuarios);
		
		btnCrearUsuarios = new JButton("Crear usuario");
		btnCrearUsuarios.setBounds(298, 66, 245, 23);
		contentPane.add(btnCrearUsuarios);
		
		JLabel lblEliminarUsuario = new JLabel("Ingrese el codigo del usuario:");
		lblEliminarUsuario.setForeground(new Color(255, 255, 255));
		lblEliminarUsuario.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblEliminarUsuario.setBounds(10, 309, 207, 14);
		contentPane.add(lblEliminarUsuario);
		
		textCodigoEliminarUsuario = new JTextField();
		textCodigoEliminarUsuario.setColumns(10);
		textCodigoEliminarUsuario.setBounds(208, 306, 116, 23);
		contentPane.add(textCodigoEliminarUsuario);
		
		btnEliminarUsuario = new JButton("Eliminar ");
		btnEliminarUsuario.setBackground(new Color(255, 255, 255));
		btnEliminarUsuario.setBounds(348, 306, 116, 23);
		contentPane.add(btnEliminarUsuario);
		
		btnModificarUsuarios = new JButton("Modificar usuario");
		btnModificarUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Acción de modificar usuario
			}
		});
		btnModificarUsuarios.setBounds(24, 66, 245, 23);
		contentPane.add(btnModificarUsuarios);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 144, 559, 141);
		contentPane.add(scrollPane);
		
		table = new JTable();
		modelo = new DefaultTableModel();
		
		modelo.addColumn("ID");
		modelo.addColumn("Nombre");
		modelo.addColumn("EMAIL");
		modelo.addColumn("Telefono");
		
		table.setModel(modelo);
		
		scrollPane.setViewportView(table);
		
		btnVolverTienda = new JButton("ATRAS");
		btnVolverTienda.setBackground(new Color(255, 255, 255));
		btnVolverTienda.setBounds(480, 306, 89, 23);
		contentPane.add(btnVolverTienda);
	}
}
