package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrearProductoView extends JFrame {

    private static final long serialVersionUID = 1L;
    public JPanel contentPane;
    public JTextField textNombreProducto;
    public JTextField textIdCategoria;
    public JTextField textCodigoBarras;
    public JTextField textPrecioProducto;
    public JTextField textCantidadProducto;
    public JButton btnRegistrarProducto;
    public JButton btnVolver;
    private JLabel lblNewLabel;

    public CrearProductoView() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblCrearProducto = new JLabel("CREAR PRODUCTO");
        lblCrearProducto.setForeground(new Color(255, 255, 255));
        lblCrearProducto.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblCrearProducto.setBounds(142, 11, 154, 17);
        contentPane.add(lblCrearProducto);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setForeground(new Color(255, 255, 255));
        lblNombre.setBounds(41, 53, 63, 14);
        contentPane.add(lblNombre);

        textNombreProducto = new JTextField();
        textNombreProducto.setBounds(166, 50, 216, 20);
        contentPane.add(textNombreProducto);
        textNombreProducto.setColumns(10);

        JLabel lblIdCategoria = new JLabel("ID Categoría:");
        lblIdCategoria.setForeground(new Color(255, 255, 255));
        lblIdCategoria.setBounds(41, 84, 77, 14);
        contentPane.add(lblIdCategoria);

        textIdCategoria = new JTextField();
        textIdCategoria.setBounds(166, 81, 216, 20);
        contentPane.add(textIdCategoria);
        textIdCategoria.setColumns(10);

        JLabel lblCodigoBarras = new JLabel("Código de Barras:");
        lblCodigoBarras.setForeground(new Color(255, 255, 255));
        lblCodigoBarras.setBounds(41, 109, 101, 14);
        contentPane.add(lblCodigoBarras);

        textCodigoBarras = new JTextField();
        textCodigoBarras.setBounds(166, 112, 216, 20);
        contentPane.add(textCodigoBarras);
        textCodigoBarras.setColumns(10);

        JLabel lblPrecio = new JLabel("Precio de Venta:");
        lblPrecio.setForeground(new Color(255, 255, 255));
        lblPrecio.setBounds(41, 146, 92, 14);
        contentPane.add(lblPrecio);

        textPrecioProducto = new JTextField();
        textPrecioProducto.setBounds(166, 143, 216, 20);
        contentPane.add(textPrecioProducto);
        textPrecioProducto.setColumns(10);

        JLabel lblCantidad = new JLabel("Cantidad en Stock:");
        lblCantidad.setForeground(new Color(255, 255, 255));
        lblCantidad.setBounds(41, 177, 111, 14);
        contentPane.add(lblCantidad);

        textCantidadProducto = new JTextField();
        textCantidadProducto.setBounds(166, 174, 216, 20);
        contentPane.add(textCantidadProducto);
        textCantidadProducto.setColumns(10);

        btnRegistrarProducto = new JButton("Registrar Producto");
        btnRegistrarProducto.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnRegistrarProducto.setBounds(41, 215, 154, 23);
        contentPane.add(btnRegistrarProducto);

        btnVolver = new JButton("Volver");
        btnVolver.setBounds(228, 215, 154, 23);
        contentPane.add(btnVolver);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Pc\\Downloads\\Abstracto Azul.jpg"));
        lblNewLabel.setBounds(0, 0, 434, 261);
        contentPane.add(lblNewLabel);
    }
}