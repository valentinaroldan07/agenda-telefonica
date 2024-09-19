
package agenda_telefonica;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ventana extends JFrame {
    JPanel panelInicio = new JPanel();
    JTextField txt1 = new JTextField();
    JTextField txt2 = new JTextField();
    JTextField txt3 = new JTextField();
    
    public ventana() {
        this.setVisible(true);  
        this.setLocationRelativeTo(null);   
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);   
    }

    public void insertPanel() {
        this.getContentPane().add(panelInicio);
        panelInicio.setLayout(null);
       
    }
    
    public void Etiquetas(){
        JLabel lbltlf = new JLabel ("Telefono ");
        lbltlf.setBounds(90, 25, 90, 30);
        panelInicio.add(lbltlf);
        
        JLabel lblname = new JLabel ("Nombre ");
        lblname.setBounds(90, 80, 90, 30);
        panelInicio.add(lblname);
        
        JLabel lblcorreo = new JLabel ("Correo ");
        lblcorreo.setBounds(90, 135, 90, 30);
        panelInicio.add(lblcorreo);
    }
    
    public void Textos(){
        txt1.setBounds(180, 25, 150, 30);
        panelInicio.add(txt1);
        txt1.repaint();
        
        txt2.setBounds(180, 80, 150, 30);
        panelInicio.add(txt2);
        txt2.repaint();
        
         txt3.setBounds(180, 135, 150, 30);
        panelInicio.add(txt3);
        txt3.repaint();
    }
    
    public void Botones (){
        JButton btnGuardar = new JButton("Guardar");
        
    }
}
