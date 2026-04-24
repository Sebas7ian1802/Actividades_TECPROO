package semana_5_ejer_2;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaProductoRefrigerado extends JDialog {
    private static final long serialVersionUID = 1L;
    private JTextField txtNombre, txtFechaCad, txtLote, txtCodigoDigesa;
    private JTextArea txtResultado;

    public VistaProductoRefrigerado() {
        setTitle("Producto Refrigerado");
        setBounds(100, 100, 550, 300);
        getContentPane().setLayout(null);
        
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(30, 30, 120, 20);
        getContentPane().add(lblNombre);
        
        JLabel lblFechaCad = new JLabel("Fecha de Caducidad:");
        lblFechaCad.setBounds(30, 70, 120, 20);
        getContentPane().add(lblFechaCad);
        
        JLabel lblLote = new JLabel("N° de Lote:");
        lblLote.setBounds(30, 110, 120, 20);
        getContentPane().add(lblLote);
        
        JLabel lblCodigoDigesa = new JLabel("Codigo DIGESA:");
        lblCodigoDigesa.setBounds(30, 150, 120, 20);
        getContentPane().add(lblCodigoDigesa);
        
        txtNombre = new JTextField();
        txtNombre.setBounds(160, 30, 120, 20);
        getContentPane().add(txtNombre);
        
        txtFechaCad = new JTextField();
        txtFechaCad.setBounds(160, 70, 120, 20);
        getContentPane().add(txtFechaCad);
        
        txtLote = new JTextField();
        txtLote.setBounds(160, 110, 120, 20);
        getContentPane().add(txtLote);
        
        txtCodigoDigesa = new JTextField();
        txtCodigoDigesa.setBounds(160, 150, 120, 20);
        getContentPane().add(txtCodigoDigesa);
        
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
                    String codigoDigesa = txtCodigoDigesa.getText();
                    
                    ProductoRefrigerado miRefrigerado = new ProductoRefrigerado(nombre, fechaCad, lote, codigoDigesa);
                    txtResultado.setText(miRefrigerado.toString());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: El N° de Lote debe ser un número entero.");
                }
            }
        });
        btnCalcular.setBounds(50, 200, 100, 30);
        getContentPane().add(btnCalcular);
        
        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtNombre.setText(""); txtFechaCad.setText("");
                txtLote.setText(""); txtCodigoDigesa.setText("");
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