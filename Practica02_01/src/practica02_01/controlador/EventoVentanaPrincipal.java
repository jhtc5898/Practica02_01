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
            VentanaDirectorio VentDirec = new VentanaDirectorio();
            VentDirec.setVisible(true);
            this.VentPrincipal.getEscritorio().add(VentDirec);
        }
        if (e.getSource().equals(this.VentPrincipal.getMenuItemList().get(1))) 
        {
            System.err.println("Agregar Ventana Carpeta/SubCarpeta");  
        }
        if (e.getSource().equals(this.VentPrincipal.getMenuItemList().get(2))) 
        {
            System.err.println("Agregar Ventana Administrar Carpeta");  
        }
        if (e.getSource().equals(this.VentPrincipal.getMenuItemList().get(3))) 
        {
            System.err.println("Agregar Ventana  Informacion/Directorio");  
        }
        
       
    }
    
}
