/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02_01.controlador;

import practica02_01.vista.VentanaDirectorio;
import practica02_01.vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import practica02_01.vista.Arbol;
import practica02_01.vista.VentanaCarpeta_SubCarpeta;
import practica02_01.vista.VentanaCrearArchivo;
import practica02_01.vista.VentanaEliminarArchivo;
import practica02_01.vista.VentanaEliminarCarpeta;
import practica02_01.vista.VentanaModificacion;
import practica02_01.vista.VentanaModificarArchivo;

/**
 *
 * @author johne
 */
public class EventoVentanaPrincipal implements ActionListener
{
    private VentanaPrincipal VentPrincipal;

    public EventoVentanaPrincipal(VentanaPrincipal VentPrincipal) 
    {
        this.VentPrincipal = VentPrincipal;
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
      
        if (e.getSource().equals(this.VentPrincipal.getMenuItemList().get(0))) 
        {
            System.err.println("Agregar Ventana Directorio"); 
            VentanaDirectorio VentDirec = new VentanaDirectorio(this.VentPrincipal.getGestionDato());
            VentDirec.setVisible(true);
            this.VentPrincipal.getEscritorio().add(VentDirec);
        }
        
        if (e.getSource().equals(this.VentPrincipal.getMenuItemList().get(1))) 
        {
            System.err.println("Agregar Ventana Carpeta/SubCarpeta"); 
            VentanaCarpeta_SubCarpeta VentCarp = new VentanaCarpeta_SubCarpeta(this.VentPrincipal.getGestionDato());
            VentCarp.setVisible(true);
            this.VentPrincipal.getEscritorio().add(VentCarp);  
        }
        if (e.getSource().equals(this.VentPrincipal.getMenuItemList().get(2))) 
        {
            VentanaModificacion vM = new VentanaModificacion(this.VentPrincipal.getGestionDato());
            vM.setVisible(true);
            this.VentPrincipal.getEscritorio().add(vM);
            
        }
            if (e.getSource().equals(this.VentPrincipal.getMenuItemList().get(3))) 
        {
            System.err.println("Agregar Ventana  Eliminar Carpeta/SubCarpeta"); 
             VentanaEliminarCarpeta vA = new VentanaEliminarCarpeta(this.VentPrincipal.getGestionDato());
            vA.setVisible(true);
            this.VentPrincipal.getEscritorio().add(vA);
           
        }
            
        if (e.getSource().equals(this.VentPrincipal.getMenuItemList().get(4))) 
        {
            System.err.println("Crear Archivo"); 
            VentanaCrearArchivo vA = new VentanaCrearArchivo(this.VentPrincipal.getGestionDato());
            vA.setVisible(true);
            this.VentPrincipal.getEscritorio().add(vA);
        }
        if (e.getSource().equals(this.VentPrincipal.getMenuItemList().get(5))) 
        {
            VentanaModificarArchivo modArchivo = new VentanaModificarArchivo(this.VentPrincipal.getGestionDato());
            modArchivo.setVisible(true);
            this.VentPrincipal.getEscritorio().add(modArchivo);
        }
        if (e.getSource().equals(this.VentPrincipal.getMenuItemList().get(6))) 
        {
            VentanaEliminarArchivo eliArch = new VentanaEliminarArchivo(this.VentPrincipal.getGestionDato());
            eliArch.setVisible(true);
            this.VentPrincipal.getEscritorio().add(eliArch);  
        }
        
        if (e.getSource().equals(this.VentPrincipal.getMenuItemList().get(7))) 
        {
            System.err.println("Agregar Ventana  Informacion/Directorio");
            Arbol ArbolV = new Arbol();
            ArbolV.main();
            
        }
        
       
    }
    
}
