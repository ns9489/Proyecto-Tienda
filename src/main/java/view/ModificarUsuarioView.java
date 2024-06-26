package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class ModificarUsuarioView extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textModificarNombreUsuario;
	public JTextField textModificarEmailUsuario;
	public JTextField textModificarTelefonoUsuario;
	public JButton btnGuardarModificacionUsuario;
	public JTextField textIDBuscarUsuario;
	public JButton btnBuscarIDUsuario;
	public JButton btnVolverModificarUsuarios;
	private JLabel lblNewLabel;

	/**
	 * Create the frame.
	 */
	public ModificarUsuarioView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 313);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblParaCrearEl = new JLabel("MODIFICAR USUARIOS");
		lblParaCrearEl.setForeground(new Color(255, 255, 255));
		lblParaCrearEl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblParaCrearEl.setBounds(135, 11, 166, 47);
		contentPane.add(lblParaCrearEl);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre del usuario:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 141, 125, 14);
		contentPane.add(lblNewLabel_1);
		
		textModificarNombreUsuario = new JTextField();
		textModificarNombreUsuario.setColumns(10);
		textModificarNombreUsuario.setBounds(187, 135, 152, 20);
		contentPane.add(textModificarNombreUsuario);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email del usuario:");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setBounds(10, 172, 125, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textModificarEmailUsuario = new JTextField();
		textModificarEmailUsuario.setColumns(10);
		textModificarEmailUsuario.setBounds(187, 169, 152, 20);
		contentPane.add(textModificarEmailUsuario);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Telefono del usuario: ");
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setBounds(10, 200, 139, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		textModificarTelefonoUsuario = new JTextField();
		textModificarTelefonoUsuario.setColumns(10);
		textModificarTelefonoUsuario.setBounds(187, 200, 152, 20);
		contentPane.add(textModificarTelefonoUsuario);
		
		btnGuardarModificacionUsuario = new JButton("MODIFICAR");
		btnGuardarModificacionUsuario.setBounds(92, 240, 100, 23);
		contentPane.add(btnGuardarModificacionUsuario);
		
		JLabel lblNewLabel_1_3 = new JLabel("Ingrese el id del ususario :");
		lblNewLabel_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_3.setBackground(new Color(255, 255, 255));
		lblNewLabel_1_3.setBounds(10, 102, 271, 14);
		contentPane.add(lblNewLabel_1_3);
		
		textIDBuscarUsuario = new JTextField();
		textIDBuscarUsuario.setColumns(10);
		textIDBuscarUsuario.setBounds(187, 99, 152, 20);
		contentPane.add(textIDBuscarUsuario);
		
		btnBuscarIDUsuario = new JButton("BUSCAR");
		btnBuscarIDUsuario.setBounds(323, 67, 100, 23);
		contentPane.add(btnBuscarIDUsuario);
		
		btnVolverModificarUsuarios = new JButton("ATRAS");
		btnVolverModificarUsuarios.setBackground(new Color(255, 255, 255));
		btnVolverModificarUsuarios.setBounds(238, 240, 105, 23);
		contentPane.add(btnVolverModificarUsuarios);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Pc\\Downloads\\Abstracto Azul.jpg"));
		lblNewLabel.setBounds(0, 0, 433, 284);
		contentPane.add(lblNewLabel);
	}

}
