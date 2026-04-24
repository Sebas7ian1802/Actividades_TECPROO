package semana_5_ejer_1;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class VistaCirculo extends JDialog {

    private static final long serialVersionUID = 1L;
    
    // Declaramos las cajas de texto a nivel de clase para poder usarlas en los botones
    private JTextField txtRadio;
    private JTextField txtArea;
    private JTextField txtLongitud;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            VistaCirculo dialog = new VistaCirculo();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Create the dialog.
     */
    public VistaCirculo() {
        setTitle("Circulo");
        setBounds(100, 100, 400, 300);
        
        // 1. IMPORTANTE: Cambiamos el Layout a "null" para poder posicionar libremente
        getContentPane().setLayout(null);
        
        // --- ETIQUETAS (JLabels) ---
        JLabel lblRadio = new JLabel("RADIO");
        lblRadio.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblRadio.setBounds(40, 40, 80, 20);
        getContentPane().add(lblRadio);
        
        JLabel lblArea = new JLabel("AREA");
        lblArea.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblArea.setBounds(40, 80, 80, 20);
        getContentPane().add(lblArea);
        
        JLabel lblLongitud = new JLabel("LONGITUD");
        lblLongitud.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblLongitud.setBounds(40, 120, 80, 20);
        getContentPane().add(lblLongitud);
        
        // --- CAJAS DE TEXTO (JTextFields) ---
        txtRadio = new JTextField();
        txtRadio.setBounds(130, 40, 120, 20);
        getContentPane().add(txtRadio);
        txtRadio.setColumns(10);
        
        txtArea = new JTextField();
        txtArea.setEditable(false); // El área solo muestra resultados, no se edita
        txtArea.setBounds(130, 80, 120, 20);
        getContentPane().add(txtArea);
        txtArea.setColumns(10);
        
        txtLongitud = new JTextField();
        txtLongitud.setEditable(false); // La longitud tampoco se edita
        txtLongitud.setBounds(130, 120, 120, 20);
        getContentPane().add(txtLongitud);
        txtLongitud.setColumns(10);
        
        // --- BOTONES (JButtons) ---
        
        // BOTÓN CALCULAR
        JButton btnCalcular = new JButton("CALCULAR");
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // 1. Leer el radio ingresado
                    double radio = Double.parseDouble(txtRadio.getText());
                    
                    // 2. Instanciar nuestra clase de negocio
                    Circulo miCirculo = new Circulo(radio);
                    
                    // 3. Mostrar resultados (String.format recorta a 2 decimales)
                    txtArea.setText(String.format("%.2f", miCirculo.calcularArea()));
                    txtLongitud.setText(String.format("%.2f", miCirculo.calcularLongitud()));
                    
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.", "Error de formato", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnCalcular.setBounds(30, 200, 100, 30);
        getContentPane().add(btnCalcular);
        
        // BOTÓN LIMPIAR
        JButton btnLimpiar = new JButton("LIMPIAR");
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtRadio.setText("");
                txtArea.setText("");
                txtLongitud.setText("");
                txtRadio.requestFocus(); // Pone el cursor de nuevo en el radio
            }
        });
        btnLimpiar.setBounds(140, 200, 100, 30);
        getContentPane().add(btnLimpiar);
        
        // BOTÓN SALIR
        JButton btnSalir = new JButton("SALIR");
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cierra esta ventana específica
            }
        });
        btnSalir.setBounds(250, 200, 100, 30);
        getContentPane().add(btnSalir);
    }
}