package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class CrearCategoriaView extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textNombreCategoria;
	public JButton btnGuardarNombreCategoria;
	public JButton btnVolverCrearCategoria;
	private JLabel lblNewLabel_2;

	/**
	 * Create the frame.
	 */
	public CrearCategoriaView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 373, 258);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("   CREAR CATEGORIA");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(105, 22, 142, 24);
		contentPane.add(lblNewLabel);
		
		textNombreCategoria = new JTextField();
		textNombreCategoria.setBounds(178, 101, 149, 20);
		contentPane.add(textNombreCategoria);
		textNombreCategoria.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese el nombre :");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(31, 98, 132, 24);
		contentPane.add(lblNewLabel_1);
		
		btnGuardarNombreCategoria = new JButton("GUARDAR");
		btnGuardarNombreCategoria.setForeground(new Color(0, 0, 0));
		btnGuardarNombreCategoria.setBounds(57, 161, 106, 23);
		contentPane.add(btnGuardarNombreCategoria);
		
		btnVolverCrearCategoria = new JButton("VOLVER");
		btnVolverCrearCategoria.setBackground(new Color(255, 255, 255));
		btnVolverCrearCategoria.setBounds(209, 161, 99, 23);
		contentPane.add(btnVolverCrearCategoria);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Pc\\Downloads\\Abstracto Azul.jpg"));
		lblNewLabel_2.setBounds(0, 0, 357, 219);
		contentPane.add(lblNewLabel_2);
	}
}
