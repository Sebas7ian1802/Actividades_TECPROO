package semana_5_ejer_1;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class VistaCilindro extends JDialog {

    private static final long serialVersionUID = 1L;
    
    // Declaramos las 4 cajas de texto necesarias
    private JTextField txtRadio;
    private JTextField txtAltura;
    private JTextField txtArea;
    private JTextField txtVolumen;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            VistaCilindro dialog = new VistaCilindro();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Create the dialog.
     */
    public VistaCilindro() {
        setTitle("Cilindro");
        setBounds(100, 100, 400, 350); // Lo hacemos un poco más alto para que entren más campos
        getContentPane().setLayout(null); // Layout absoluto para controlar posiciones
        
        // --- ETIQUETAS (JLabels) ---
        JLabel lblRadio = new JLabel("RADIO");
        lblRadio.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblRadio.setBounds(40, 40, 80, 20);
        getContentPane().add(lblRadio);
        
        JLabel lblAltura = new JLabel("ALTURA");
        lblAltura.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblAltura.setBounds(40, 80, 80, 20);
        getContentPane().add(lblAltura);
        
        JLabel lblArea = new JLabel("AREA");
        lblArea.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblArea.setBounds(40, 120, 80, 20);
        getContentPane().add(lblArea);
        
        JLabel lblVolumen = new JLabel("VOLUMEN");
        lblVolumen.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblVolumen.setBounds(40, 160, 80, 20);
        getContentPane().add(lblVolumen);
        
        // --- CAJAS DE TEXTO (JTextFields) ---
        txtRadio = new JTextField();
        txtRadio.setBounds(130, 40, 120, 20);
        getContentPane().add(txtRadio);
        txtRadio.setColumns(10);
        
        txtAltura = new JTextField();
        txtAltura.setBounds(130, 80, 120, 20);
        getContentPane().add(txtAltura);
        txtAltura.setColumns(10);
        
        txtArea = new JTextField();
        txtArea.setEditable(false); 
        txtArea.setBounds(130, 120, 120, 20);
        getContentPane().add(txtArea);
        txtArea.setColumns(10);
        
        txtVolumen = new JTextField();
        txtVolumen.setEditable(false); 
        txtVolumen.setBounds(130, 160, 120, 20);
        getContentPane().add(txtVolumen);
        txtVolumen.setColumns(10);
        
        // --- BOTONES (JButtons) ---
        
        // BOTÓN CALCULAR
        JButton btnCalcular = new JButton("CALCULAR");
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // 1. Leer los datos ingresados
                    double radio = Double.parseDouble(txtRadio.getText());
                    double altura = Double.parseDouble(txtAltura.getText());
                    
                    // 2. Instanciar la clase Cilindro que tú creaste
                    Cilindro miCilindro = new Cilindro(radio, altura);
                    
                    // 3. Mostrar resultados formateados a 2 decimales
                    txtArea.setText(String.format("%.2f", miCilindro.calcularArea()));
                    txtVolumen.setText(String.format("%.2f", miCilindro.calcularVolumen()));
                    
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese números válidos en Radio y Altura.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnCalcular.setBounds(30, 230, 100, 30);
        getContentPane().add(btnCalcular);
        
        // BOTÓN LIMPIAR
        JButton btnLimpiar = new JButton("LIMPIAR");
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtRadio.setText("");
                txtAltura.setText("");
                txtArea.setText("");
                txtVolumen.setText("");
                txtRadio.requestFocus(); 
            }
        });
        btnLimpiar.setBounds(140, 230, 100, 30);
        getContentPane().add(btnLimpiar);
        
        // BOTÓN SALIR
        JButton btnSalir = new JButton("SALIR");
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); 
            }
        });
        btnSalir.setBounds(250, 230, 100, 30);
        getContentPane().add(btnSalir);
    }
}