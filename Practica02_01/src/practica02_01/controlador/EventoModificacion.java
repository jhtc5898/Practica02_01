
package practica02_01.controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.UIManager;
import practica02_01.modelo.Carpeta_SubCarpeta;
import practica02_01.vista.VentanaModificacion;

/**
 *
 * @author pedro
 */
public class EventoModificacion implements ActionListener {
    
    private VentanaModificacion ventanaModificacion;
    private Carpeta_SubCarpeta carpeta;

    public EventoModificacion(VentanaModificacion ventanaModificacion) {
        this.ventanaModificacion = ventanaModificacion;
    }

    public VentanaModificacion getVentanaModificacion() {
        return ventanaModificacion;
    }

    public void setVentanaModificacion(VentanaModificacion ventanaModificacion) {
        this.ventanaModificacion = ventanaModificacion;
    } 
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        try {
            
            int numCarp = this.ventanaModificacion.getComboCarpeta().getSelectedIndex();
            this.carpeta = this.ventanaModificacion.getGestionDato().getCarpList().get(numCarp);
        
            String nuevoNombre = this.ventanaModificacion.getTxtList().get(0).getText();
        
            this.carpeta.setNombreCarp(nuevoNombre);
        
            this.ventanaModificacion.getTxtList().get(0).setText("");
        
            File nFichero = new File ("C:\\"+ this.carpeta.getDirector()+"\\"+nuevoNombre);
            
            this.carpeta.getFichero().renameTo(nFichero);
            
        } catch(NumberFormatException e) {
            JDialog d = new JDialog();
            d.setTitle("Error");
            d.getContentPane().add(new JLabel("   Los casilleros NO se han llenado correctamente."));
            d.setSize(320, 100);
            d.setLocation(830, 400);
            d.setBackground(Color.RED);
            d.setVisible(true);
        } catch(ArrayIndexOutOfBoundsException e2) {
            JDialog d = new JDialog();           
            d.setTitle("Error");
            d.getContentPane().add(new JLabel("             No se han encontrado Carpetas."));
            d.setSize(320, 100);
            d.setLocation(830, 400);
            d.setBackground(Color.RED);
            d.setVisible(true);
        }
        
        
        
    }
    
    
    
}
