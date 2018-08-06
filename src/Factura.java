import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Factura extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblCliente;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textp1;
	private JTextField textp2;
	private JTextField IVA;
	private JLabel lblCantidad;
	private JTextField textField_8;
	private JLabel lblP;
	private JLabel lblNewLabel;
	private JTextField textv1;
	private JTextField textv2;
	private JTextField stotal;
	private JTextField text1;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_4;
	private JTextField textField_15;
	private JToggleButton toggleb;
	private JTextField textField_16;
	private JLabel lblSubtotal;
	private JLabel lblIva;
	private JTextField Total1;

	
	/**
	 * Create the frame.
	 */
	public Factura() {
		
		textField_16 = new JTextField();
		getContentPane().add(textField_16, BorderLayout.CENTER);
		textField_16.setColumns(10);
		getContentPane().setLayout(null);
		
		JLabel lbl1 = new JLabel("Producto");
		lbl1.setBounds(191, 24, 46, 14);
		getContentPane().add(lbl1);
		
		text1 = new JTextField();
		text1.setBounds(57, 49, 86, 20);
		getContentPane().add(text1);
		text1.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(57, 92, 86, 20);
		getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(175, 49, 86, 20);
		getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(175, 92, 86, 20);
		getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblCantidad_1 = new JLabel("Cantidad");
		lblCantidad_1.setBounds(68, 24, 46, 14);
		getContentPane().add(lblCantidad_1);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(294, 24, 46, 14);
		getContentPane().add(lblPrecio);
		
		textField_4 = new JTextField();
		textField_4.setBounds(283, 49, 86, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		setTitle("Factura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setBounds(151, 233, 46, 14);
		contentPane.add(lblTotal);
		
		textField = new JTextField();
		textField.setBounds(207, 230, 109, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblCliente = new JLabel("Cliente:");
		lblCliente.setBounds(10, 21, 46, 14);
		contentPane.add(lblCliente);
		
		textField1 = new JTextField();
		textField1.setBounds(99, 44, 86, 20);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(99, 75, 86, 20);
		contentPane.add(textField2);
		textField2.setColumns(10);
		
		textp1 = new JTextField();
		textp1.setBounds(195, 44, 86, 20);
		contentPane.add(textp1);
		textp1.setColumns(10);
		
		textp2 = new JTextField();
		textp2.setBounds(195, 75, 86, 20);
		contentPane.add(textp2);
		textp2.setColumns(10);
		
		IVA = new JTextField();
		IVA.setBounds(230, 199, 86, 20);
		contentPane.add(IVA);
		IVA.setColumns(10);
		
		lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(116, 21, 69, 14);
		contentPane.add(lblCantidad);
		
		textField_8 = new JTextField();
		textField_8.setBounds(0, 46, 89, 30);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		lblP = new JLabel("Productos");
		lblP.setBounds(210, 21, 57, 14);
		contentPane.add(lblP);
		
		lblNewLabel = new JLabel("Precio");
		lblNewLabel.setBounds(302, 21, 46, 14);
		contentPane.add(lblNewLabel);
		
		textv1 = new JTextField();
		textv1.setBounds(290, 44, 86, 20);
		contentPane.add(textv1);
		textv1.setColumns(10);
		
		textv2 = new JTextField();
		textv2.setBounds(290, 75, 86, 20);
		contentPane.add(textv2);
		textv2.setColumns(10);
		
		stotal = new JTextField();
		stotal.setBounds(230, 162, 86, 20);
		contentPane.add(stotal);
		stotal.setColumns(10);
		
		toggleb = new JToggleButton("Emitir");
		toggleb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent g) {
				/*Aquí vas a poner lo que debas poner para emitir la factura, si no te gusta el diseño
				 * mañana lo cambiamos
				 * pero aja cualquier cosa me avisas
				 * 
				 */
				
			}
		});
		toggleb.setBounds(33, 161, 121, 23);
		contentPane.add(toggleb);
		
		lblSubtotal = new JLabel("Subtotal:");
		lblSubtotal.setBounds(174, 168, 46, 14);
		contentPane.add(lblSubtotal);
		
		lblIva = new JLabel("IVA:");
		lblIva.setBounds(174, 202, 46, 14);
		contentPane.add(lblIva);
		
		Total1 = new JTextField();
		Total1.setBounds(290, 106, 86, 20);
		contentPane.add(Total1);
		Total1.setColumns(10);
	}
}
