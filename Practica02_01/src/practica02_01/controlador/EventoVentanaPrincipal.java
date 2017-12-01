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
            System.err.println("Agregar Ventana Modificar Carpeta/SubCarpeta"); 
           
        }
            if (e.getSource().equals(this.VentPrincipal.getMenuItemList().get(3))) 
        {
            System.err.println("Agregar Ventana  Eliminar Carpeta/SubCarpeta"); 
           
        }
            
        if (e.getSource().equals(this.VentPrincipal.getMenuItemList().get(4))) 
        {
            System.err.println("Agregar Ventana Administrar Archivo");  
        }
        if (e.getSource().equals(this.VentPrincipal.getMenuItemList().get(5))) 
        {
            System.err.println("Agregar Ventana Modificar Administrar Archivo");  
        }
        if (e.getSource().equals(this.VentPrincipal.getMenuItemList().get(6))) 
        {
            System.err.println("Agregar Ventana Eliminar Administrar Archivo");  
        }
        
        if (e.getSource().equals(this.VentPrincipal.getMenuItemList().get(7))) 
        {
            System.err.println("Agregar Ventana  Informacion/Directorio");
            Arbol ArbolV = new Arbol();
            ArbolV.main();
            
        }
        
       
    }
    
}
