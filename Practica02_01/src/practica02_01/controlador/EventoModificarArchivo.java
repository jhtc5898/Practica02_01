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
import practica02_01.vista.VentanaModificarArchivo;

/**
 *
 * @author Daniel
 */
public class EventoModificarArchivo implements ActionListener{
    
    private VentanaModificarArchivo modificarArchivo;
    private Archivo archivo;

    public EventoModificarArchivo(VentanaModificarArchivo modificarArchivo) {
        this.modificarArchivo = modificarArchivo;
    }

    public VentanaModificarArchivo getModificarArchivo() {
        return modificarArchivo;
    }
    public void setModificarArchivo(VentanaModificarArchivo modificarArchivo) {
        this.modificarArchivo = modificarArchivo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
        try
        {
            int numA = this.modificarArchivo.getComboArchivo().getSelectedIndex();
            this.archivo = this.modificarArchivo.getGestionDato().getArchivoList().get(numA);
            String nuevoNombre = this.modificarArchivo.getTxtList().get(0).getText();
        
            this.archivo.setNombre(nuevoNombre);
        
            this.modificarArchivo.getTxtList().get(0).setText("");
        
            if (e.getSource().equals(this.modificarArchivo.getBotonList().get(0)))
            {
                File nFichero = new File("C:\\"+this.archivo.getDirectorio()+"\\"+nuevoNombre);
            
                if(nFichero.exists()==false)
                {
                    nFichero.mkdir();
                    this.archivo.getFichero().renameTo(nFichero);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"El archivo ya existe");
                }
            }
        
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
            JOptionPane.showMessageDialog(null,"Campos vacios"); 
        }
    }
 
}
