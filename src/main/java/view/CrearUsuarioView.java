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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrearUsuarioView extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textCrearEmailUsuario;
	public JButton btnCrearUsuario;
	public JTextField textCrearTelefonoUsuario;
	public JTextField textCrearNombreUsuario;
	public JTextField textIDUsuario;
	public JButton btnVolverCrearUsuario;
	private JLabel lblCrearUsuario;

	/**
	 * Create the frame.
	 */
	public CrearUsuarioView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 297);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblParaCrearEl = new JLabel("CREAR USUARIO");
		lblParaCrearEl.setForeground(new Color(255, 255, 255));
		lblParaCrearEl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblParaCrearEl.setBounds(176, 25, 131, 24);
		contentPane.add(lblParaCrearEl);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresa el telefono: ");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(69, 150, 131, 14);
		contentPane.add(lblNewLabel_1);
		
		textCrearEmailUsuario = new JTextField();
		textCrearEmailUsuario.setColumns(10);
		textCrearEmailUsuario.setBounds(227, 119, 191, 20);
		contentPane.add(textCrearEmailUsuario);
		
		btnCrearUsuario = new JButton("GUARDAR");
		btnCrearUsuario.setBounds(69, 207, 165, 28);
		contentPane.add(btnCrearUsuario);
		
		textCrearTelefonoUsuario = new JTextField();
		textCrearTelefonoUsuario.setColumns(10);
		textCrearTelefonoUsuario.setBounds(227, 149, 191, 20);
		contentPane.add(textCrearTelefonoUsuario);
		
		JLabel lblNewLabel_1_2 = new JLabel("Ingresa el nombre:");
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(69, 94, 131, 14);
		contentPane.add(lblNewLabel_1_2);
		
		textCrearNombreUsuario = new JTextField();
		textCrearNombreUsuario.setColumns(10);
		textCrearNombreUsuario.setBounds(227, 88, 191, 20);
		contentPane.add(textCrearNombreUsuario);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Ingresa email:");
		lblNewLabel_1_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(69, 125, 107, 14);
		contentPane.add(lblNewLabel_1_2_1);
		
		btnVolverCrearUsuario = new JButton("VOLVER");
		btnVolverCrearUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVolverCrearUsuario.setBackground(new Color(255, 255, 255));
		btnVolverCrearUsuario.setBounds(255, 208, 177, 26);
		contentPane.add(btnVolverCrearUsuario);
		
		lblCrearUsuario = new JLabel("");
		lblCrearUsuario.setIcon(new ImageIcon("C:\\Users\\Pc\\Downloads\\Abstracto Azul.jpg"));
		lblCrearUsuario.setBounds(0, 0, 501, 258);
		contentPane.add(lblCrearUsuario);
	}

}
