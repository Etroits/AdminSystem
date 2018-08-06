import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;


public class Pantalla extends JFrame {
	//Esto antes del private son vainas basicas de la conexion de la base de datos, no lo entiendo lo puse por si acaso
	Connection mycon = null;
	Statement mystate=null;
	ResultSet myresults=null;
	private JTextField textprice;
	//Este metodo vas a incluir lo de la base de datos, o eso dice el video que vi sobre base de datos
	public void selectionall(){
		
		
		
		
	}
	


	/**
	 * Create the frame.
	 */
	public Pantalla() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblCompra = new JLabel("Compra:");
		lblCompra.setBounds(239, 11, 89, 25);
		getContentPane().add(lblCompra);
		
		JComboBox productos = new JComboBox();
		productos.setModel(new DefaultComboBoxModel(new String[] {"Jacks tortillitas", "Doritos", "Relative", "Esencia doble manzana", "Carbones x96", "Cacique 500", "Cacique Leyenda", "Old Par", "Solera negra"}));
		productos.setBounds(210, 43, 118, 25);
		getContentPane().add(productos);
				
	
		
		textprice = new JTextField();
		textprice.setBounds(337, 73, 69, 20);
		getContentPane().add(textprice);
		textprice.setColumns(10);
		
		JButton factura = new JButton("Factura");
		factura.setBounds(43, 44, 89, 23);
		getContentPane().add(factura);
		factura.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				Factura factura = new Factura();
				factura.setVisible(true);
				
			}
			
			
		});
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(338, 44, 68, 23);
		getContentPane().add(btnOk);
		
		JButton inventario = new JButton("Inventario");
		inventario.setBounds(0, 193, 103, 23);
		getContentPane().add(inventario);
		inventario.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				Inventario inv = new Inventario();
				inv.setVisible(true);
			
				
			}
			
		});
		
		JButton proveedores = new JButton("Proveedores");
		proveedores.setBounds(0, 227, 103, 23);
		getContentPane().add(proveedores);
		//Este Action Listener, al hacer click en proveedores te abrirá una nueva ventana con la lista
		// de los proveedores que no se cuales son pero ahi te los pongo pues esos los conectas con la db
		proveedores.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent g) {
				Proveedores prov = new Proveedores();
				prov.setVisible(true);
				
			}
			
		});
		
		JButton listado = new JButton("Listado de todo");
		listado.setBounds(103, 193, 112, 23);
		getContentPane().add(listado);
		listado.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				Listadototal all = new Listadototal();
				all.setVisible(true);
				
			}
			
			
		});
		
		btnOk.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent g){
				
				
	}
		}
		);
		}
	
	}
