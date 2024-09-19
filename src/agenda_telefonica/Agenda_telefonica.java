
package agenda_telefonica;

public class Agenda_telefonica {

    public static void main(String[] args) {
        ventana inicio = new ventana();
        inicio.setTitle("Agenda Telefonica");
        inicio.setBounds(500, 100, 600, 300);
        inicio.setResizable(false); // desactivar redimension
        inicio.insertPanel();
        inicio.Etiquetas();
        inicio.Textos();
    }
    
}
