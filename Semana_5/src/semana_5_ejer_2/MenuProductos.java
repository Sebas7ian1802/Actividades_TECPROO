package semana_5_ejer_2;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuProductos extends JFrame {
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MenuProductos frame = new MenuProductos();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MenuProductos() {
        setTitle("Gestión de Productos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenu mnProductos = new JMenu("Productos");
        menuBar.add(mnProductos);
        
        JMenuItem mntmCongelado = new JMenuItem("Producto Congelado");
        mntmCongelado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VistaProductoCongelado dialog = new VistaProductoCongelado();
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
            }
        });
        mnProductos.add(mntmCongelado);
        
        JMenuItem mntmFresco = new JMenuItem("Producto Fresco");
        mntmFresco.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VistaProductoFresco dialog = new VistaProductoFresco();
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
            }
        });
        mnProductos.add(mntmFresco);
        
        JMenuItem mntmRefrigerado = new JMenuItem("Producto Refrigerado");
        mntmRefrigerado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VistaProductoRefrigerado dialog = new VistaProductoRefrigerado();
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
            }
        });
        mnProductos.add(mntmRefrigerado);
    }
}