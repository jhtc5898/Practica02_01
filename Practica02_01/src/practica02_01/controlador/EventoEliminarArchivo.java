/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02_01.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JOptionPane;
import practica02_01.modelo.Archivo;
import practica02_01.vista.VentanaEliminarArchivo;

/**
 *
 * @author Daniel
 */
public class EventoEliminarArchivo implements ActionListener {
    
    private VentanaEliminarArchivo eliminarArchivo;
    private Archivo archivo;

    public EventoEliminarArchivo(VentanaEliminarArchivo eliminarArchivo) {
        this.eliminarArchivo = eliminarArchivo;
    }

    public VentanaEliminarArchivo getEliminarArchivo() {
        return eliminarArchivo;
    }
    public void setEliminarArchivo(VentanaEliminarArchivo eliminarArchivo) {
        this.eliminarArchivo = eliminarArchivo;
    }
    public Archivo getArchivo() {
        return archivo;
    }
    public void setArchivo(Archivo archivo) {
        this.archivo = archivo;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        try
        {
            int numA = this.eliminarArchivo.getComboArchivo().getSelectedIndex();
            this.archivo = this.eliminarArchivo.getGestionDato().getArchivoList().get(numA);
            String nombre = this.eliminarArchivo.getTxtList().get(0).getText();
        
            this.archivo.setNombre(nombre);
        
            this.eliminarArchivo.getTxtList().get(0).setText("");
        /*
            if (e.getSource().equals(this.eliminarArchivo.getBotonList().get(0)))
            {
                File nFichero = new File("C:\\"+this.archivo.getDirectorio()+"\\"+nombre);
            
                if(nFichero.exists()==true)
                {
                    nFichero.mkdir();
                    this.archivo.getFichero().delete();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Archivo no existe");
                }      
            } 

*/
        }

        catch(ArrayIndexOutOfBoundsException ae)
        {
            JOptionPane.showMessageDialog(null,"Campos vacios");     
        }
    }
    
}
