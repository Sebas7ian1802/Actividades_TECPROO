package semana_5_ejer_2;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaProductoFresco extends JDialog {
    private static final long serialVersionUID = 1L;
    private JTextField txtNombre, txtFechaCad, txtLote, txtFechaEnv, txtPais;
    private JTextArea txtResultado;

    public VistaProductoFresco() {
        setTitle("Producto Fresco");
        setBounds(100, 100, 550, 350);
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
        
        JLabel lblFechaEnv = new JLabel("Fecha de Envasado:");
        lblFechaEnv.setBounds(30, 150, 120, 20);
        getContentPane().add(lblFechaEnv);
        
        JLabel lblPais = new JLabel("País de Origen:");
        lblPais.setBounds(30, 190, 120, 20);
        getContentPane().add(lblPais);
        
        txtNombre = new JTextField();
        txtNombre.setBounds(160, 30, 120, 20);
        getContentPane().add(txtNombre);
        
        txtFechaCad = new JTextField();
        txtFechaCad.setBounds(160, 70, 120, 20);
        getContentPane().add(txtFechaCad);
        
        txtLote = new JTextField();
        txtLote.setBounds(160, 110, 120, 20);
        getContentPane().add(txtLote);
        
        txtFechaEnv = new JTextField();
        txtFechaEnv.setBounds(160, 150, 120, 20);
        getContentPane().add(txtFechaEnv);
        
        txtPais = new JTextField();
        txtPais.setBounds(160, 190, 120, 20);
        getContentPane().add(txtPais);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(310, 30, 200, 180);
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
                    String fechaEnv = txtFechaEnv.getText();
                    String pais = txtPais.getText();
                    
                    ProductoFresco miFresco = new ProductoFresco(nombre, fechaCad, lote, fechaEnv, pais);
                    txtResultado.setText(miFresco.toString());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: El N° de Lote debe ser un número entero.");
                }
            }
        });
        btnCalcular.setBounds(50, 250, 100, 30);
        getContentPane().add(btnCalcular);
        
        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtNombre.setText(""); txtFechaCad.setText(""); txtLote.setText("");
                txtFechaEnv.setText(""); txtPais.setText(""); txtResultado.setText("");
                txtNombre.requestFocus();
            }
        });
        btnLimpiar.setBounds(160, 250, 100, 30);
        getContentPane().add(btnLimpiar);
        
        JButton btnSalir = new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        btnSalir.setBounds(270, 250, 100, 30);
        getContentPane().add(btnSalir);
    }
}