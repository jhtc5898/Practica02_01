/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02_01.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import practica02_01.vista.VentanaEliminarCarpeta;

/**
 *
 * @author Jose
 */
public class EventoEliminarCarpeta implements ActionListener {

    private VentanaEliminarCarpeta ventanaEliminar;
    private String nC;
    private File fichero;

    public EventoEliminarCarpeta(VentanaEliminarCarpeta ventanaEliminar) {
        this.ventanaEliminar = ventanaEliminar;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int nDir = this.ventanaEliminar.getComboDirectorio().getSelectedIndex();
        this.fichero = this.ventanaEliminar.getGestionDato().getCarpList().get(nDir).getFichero();
        
        this.fichero.delete();
        
    }
}
