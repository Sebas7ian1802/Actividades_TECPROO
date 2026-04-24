package semana_5_ejer_2;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaProductoCongelado extends JDialog {
    private static final long serialVersionUID = 1L;
    private JTextField txtNombre, txtFechaCad, txtLote, txtTemperatura;
    private JTextArea txtResultado;

    public VistaProductoCongelado() {
        setTitle("Producto Congelado");
        setBounds(100, 100, 550, 300);
        getContentPane().setLayout(null);
        
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(30, 30, 130, 20);
        getContentPane().add(lblNombre);
        
        JLabel lblFechaCad = new JLabel("Fecha de Caducidad:");
        lblFechaCad.setBounds(30, 70, 130, 20);
        getContentPane().add(lblFechaCad);
        
        JLabel lblLote = new JLabel("N° de Lote:");
        lblLote.setBounds(30, 110, 130, 20);
        getContentPane().add(lblLote);
        
        JLabel lblTemp = new JLabel("Temp. de Congelacion:");
        lblTemp.setBounds(30, 150, 130, 20);
        getContentPane().add(lblTemp);
        
        txtNombre = new JTextField();
        txtNombre.setBounds(170, 30, 110, 20);
        getContentPane().add(txtNombre);
        
        txtFechaCad = new JTextField();
        txtFechaCad.setBounds(170, 70, 110, 20);
        getContentPane().add(txtFechaCad);
        
        txtLote = new JTextField();
        txtLote.setBounds(170, 110, 110, 20);
        getContentPane().add(txtLote);
        
        txtTemperatura = new JTextField();
        txtTemperatura.setBounds(170, 150, 110, 20);
        getContentPane().add(txtTemperatura);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(310, 30, 200, 140);
        getContentPane().add(scrollPane);
        
        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        scrollPane.setViewportView(txtResultado);
        
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = txtNombre.getText();
                    String fechaCad = txtFechaCad.getText();
                    int lote = Integer.parseInt(txtLote.getText());
                    double temp = Double.parseDouble(txtTemperatura.getText()); 
                    
                    ProductoCongelado miCongelado = new ProductoCongelado(nombre, fechaCad, lote, temp);
                    txtResultado.setText(miCongelado.toString());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese valores numéricos en Lote o Temperatura.");
                }
            }
        });
        btnCalcular.setBounds(50, 200, 100, 30);
        getContentPane().add(btnCalcular);
        
        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtNombre.setText(""); txtFechaCad.setText("");
                txtLote.setText(""); txtTemperatura.setText("");
                txtResultado.setText(""); txtNombre.requestFocus();
            }
        });
        btnLimpiar.setBounds(160, 200, 100, 30);
        getContentPane().add(btnLimpiar);
        
        JButton btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        btnSalir.setBounds(270, 200, 100, 30);
        getContentPane().add(btnSalir);
    }
}