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

public class ModificarCategoriaView extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textIDModificarCategoria;
	public JTextField textModificarNombreCategoria;
	public JButton btnModificarNombreCategoria;
	public JButton btnBuscarIDCategoria;
	public JButton btnVolverModificarCategoria;
	private JLabel lblNewLabel;

	/**
	 * Create the frame.
	 */
	public ModificarCategoriaView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 267);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOprimeElBoton_1 = new JLabel("MODIFICAR CATEGORIA");
		lblOprimeElBoton_1.setForeground(new Color(255, 255, 255));
		lblOprimeElBoton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOprimeElBoton_1.setBounds(166, 11, 168, 24);
		contentPane.add(lblOprimeElBoton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese el id de la categoria:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(66, 80, 155, 14);
		contentPane.add(lblNewLabel_1);
		
		textIDModificarCategoria = new JTextField();
		textIDModificarCategoria.setColumns(10);
		textIDModificarCategoria.setBounds(260, 78, 149, 20);
		contentPane.add(textIDModificarCategoria);
		
		btnBuscarIDCategoria = new JButton("BUSCAR");
		btnBuscarIDCategoria.setBounds(260, 170, 149, 23);
		contentPane.add(btnBuscarIDCategoria);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre categoria:");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(66, 121, 119, 18);
		contentPane.add(lblNewLabel_1_1);
		
		textModificarNombreCategoria = new JTextField();
		textModificarNombreCategoria.setColumns(10);
		textModificarNombreCategoria.setBounds(260, 121, 149, 20);
		contentPane.add(textModificarNombreCategoria);
		
		btnModificarNombreCategoria = new JButton("MODIFICAR");
		btnModificarNombreCategoria.setBounds(66, 170, 149, 23);
		contentPane.add(btnModificarNombreCategoria);
		
		btnVolverModificarCategoria = new JButton("VOLVER");
		btnVolverModificarCategoria.setBackground(new Color(255, 255, 255));
		btnVolverModificarCategoria.setBounds(10, 14, 89, 23);
		contentPane.add(btnVolverModificarCategoria);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Pc\\Downloads\\Abstracto Azul.jpg"));
		lblNewLabel.setBounds(0, 2, 488, 226);
		contentPane.add(lblNewLabel);
	}

}
