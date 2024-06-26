package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Producto;

import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ProductoView extends JFrame {

    private static final long serialVersionUID = 1L;
    public JPanel contentPane;
    public JTextField textCodigoEliminarProducto;
    public JTable table;
    public JButton btnMostrarProductos;
    public JButton btnCrearProducto;
    public JButton btnEliminarProducto;
    public JButton btnModificarProducto;
    public DefaultTableModel model;
    public JButton btnVolverProductos;
    private JLabel lblNewLabel;

    public ProductoView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 595, 340);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblModificarProductos = new JLabel("Gestion de Productos");
        lblModificarProductos.setBounds(199, 11, 180, 29);
        lblModificarProductos.setHorizontalAlignment(SwingConstants.LEFT);
        lblModificarProductos.setForeground(new Color(255, 255, 255));
        lblModificarProductos.setFont(new Font("Tahoma", Font.PLAIN, 15));
        contentPane.add(lblModificarProductos);

        btnMostrarProductos = new JButton("Mostrar productos ");
        btnMostrarProductos.setBounds(159, 85, 271, 23);
        contentPane.add(btnMostrarProductos);

        btnCrearProducto = new JButton("Crear producto");
        btnCrearProducto.setBounds(297, 51, 227, 23);
        contentPane.add(btnCrearProducto);

        JLabel lblEliminarProducto = new JLabel("Ingrese el ID del producto :");
        lblEliminarProducto.setBounds(10, 266, 179, 20);
        lblEliminarProducto.setForeground(new Color(255, 255, 255));
        lblEliminarProducto.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
        contentPane.add(lblEliminarProducto);

        textCodigoEliminarProducto = new JTextField();
        textCodigoEliminarProducto.setBounds(188, 266, 137, 23);
        textCodigoEliminarProducto.setColumns(10);
        contentPane.add(textCodigoEliminarProducto);

        btnEliminarProducto = new JButton("ELIMINAR");
        btnEliminarProducto.setBounds(339, 266, 112, 23);
        btnEliminarProducto.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnEliminarProducto.setBackground(new Color(255, 255, 255));
        contentPane.add(btnEliminarProducto);

        btnModificarProducto = new JButton("Modificar producto");
        btnModificarProducto.setBounds(43, 51, 227, 23);
        contentPane.add(btnModificarProducto);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 119, 559, 136);
        contentPane.add(scrollPane);

        table = new JTable();
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("ID Categoría");
        model.addColumn("Código de Barras");
        model.addColumn("Precio de Venta");
        model.addColumn("Cantidad en Stock");

        table.setModel(model);
        scrollPane.setViewportView(table);

        btnVolverProductos = new JButton("VOLVER");
        btnVolverProductos.setBounds(463, 266, 93, 23);
        btnVolverProductos.setBackground(new Color(255, 255, 255));
        contentPane.add(btnVolverProductos);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(0, 0, 579, 301);
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Pc\\Downloads\\Abstracto Azul.jpg"));
        contentPane.add(lblNewLabel);
    }

	public static void mostrarMensaje(String string) {
		// TODO Auto-generated method stub
		
	}

	public static void btnMostrarProducto(List<Producto> productos) {
		// TODO Auto-generated method stub
		
	}
}