/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02_01.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
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
        
        int numCarp = this.ventanaModificacion.getComboCarpeta().getSelectedIndex();
        this.carpeta = this.ventanaModificacion.getGestionDato().getCarpList().get(numCarp);
        
        String nuevoNombre = this.ventanaModificacion.getTxtList().get(0).getText();
        
        this.carpeta.setNombreCarp(nuevoNombre);
        
        this.ventanaModificacion.getTxtList().get(0).setText("");
        
        File nFichero = new File ("C:\\"+this.carpeta.getDirector()+"\\"+nuevoNombre);
        
        this.carpeta.getFichero().renameTo(nFichero);
        
    }
    
    
    
}
