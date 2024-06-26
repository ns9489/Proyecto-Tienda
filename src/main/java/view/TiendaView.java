package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TiendaView extends JFrame {

	private static final long serialVersionUID = 1L;
	public static final String btnEliminarUsuario = null;
	public JPanel contentPane;
	public JButton btnUsuarios;
	public JButton btnCategorias;
	public JButton btnProductos;
	private JLabel lblNewLabel_1;
	public JButton btnModificarUsuario;
	public JButton btnCrearUsuario;
	public JButton btnMostrarUsuarios;
	public DefaultTableModel modelo;


	/**
	 * Create the frame.
	 */
	public TiendaView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 418, 320);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TIENDA");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 15));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(164, 33, 68, 30);
		contentPane.add(lblNewLabel);
		
		btnProductos = new JButton("PRODUCTOS");
		btnProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnProductos.setFont(new Font("Rockwell", Font.PLAIN, 12));
		btnProductos.setBounds(120, 90, 163, 30);
		contentPane.add(btnProductos);
		
		btnCategorias = new JButton("CATEGORIAS");
		btnCategorias.setFont(new Font("Rockwell", Font.PLAIN, 12));
		btnCategorias.setBounds(120, 143, 163, 30);
		contentPane.add(btnCategorias);
		
		btnUsuarios = new JButton("USUARIOS");
		btnUsuarios.setFont(new Font("Rockwell", Font.PLAIN, 12));
		btnUsuarios.setBounds(120, 195, 163, 30);
		contentPane.add(btnUsuarios);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Pc\\Downloads\\Abstracto Azul.jpg"));
		lblNewLabel_1.setBounds(0, 0, 402, 281);
		contentPane.add(lblNewLabel_1);
	}


	public static void btnEliminarUsuario(String string) {
		// TODO Auto-generated method stub
		
	}
}