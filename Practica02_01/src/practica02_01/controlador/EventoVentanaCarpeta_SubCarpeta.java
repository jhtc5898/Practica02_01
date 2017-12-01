/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02_01.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import practica02_01.modelo.Carpeta_SubCarpeta;
import practica02_01.modelo.Directorio;
import practica02_01.vista.VentanaCarpeta_SubCarpeta;

/**
 *
 * @author johne
 */
public class EventoVentanaCarpeta_SubCarpeta implements ActionListener
{
    private VentanaCarpeta_SubCarpeta VentCarp;
    private Directorio Directorio;

    public EventoVentanaCarpeta_SubCarpeta(VentanaCarpeta_SubCarpeta VentCarp) {
        this.VentCarp = VentCarp;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action Listener");
        int numDir= this.VentCarp.getComboDirectorio().getSelectedIndex();
        this.Directorio = this.VentCarp.getGestionDato().getDirecrtorioList().get(numDir);         
        String Crear=this.VentCarp.getTxtList().get(0).getText();
        String SubCarpeta=this.VentCarp.getTxtList().get(1).getText();
        
         if (e.getSource().equals(this.VentCarp.getBotonList().get(0)))
	        {
         File fichero=new File("C:\\"+this.Directorio+"\\"+Crear);
        if(fichero.exists()==false)
        {   
           fichero.mkdir();//Creacion de carpeta con el nombre de la raiz
            Carpeta_SubCarpeta  Car = new Carpeta_SubCarpeta(this.Directorio,Crear);
            this.VentCarp.getGestionDato().addCarp(Car);
            Object[][] datoCarp = this.VentCarp.cargaDatosTabla(this.VentCarp.getGestionDato().getCarpList().size(), 3);
            this.VentCarp.setDatos(datoCarp);
            this.VentCarp.getModeloTabla().setDataVector(this.VentCarp.getDatos(), this.VentCarp.getEncabezado());
           /*String Temp = "TEMP";
            int i;
           for(i=0;i<100;i++)
             { 
                /* File fichero=new File("C:\\Users\\Estudiante\\Desktop\\GUARDE AQUI SUS ARCHIVOS\\File"+);
                 fichero.mkdir();//Creacion de carpeta con el nombre de la raiz
                 //fichero = File.createTempFile(Temp, ".docx" , new File("C:\\Users\\Estudiante\\Desktop\\GUARDE AQUI SUS ARCHIVOS\\File") );
             } */
        }
       
        else
        {   
            JOptionPane.showMessageDialog(null,"Directorio Repetido .");
            //fichero.delete();
        }
                }
           if (e.getSource().equals(this.VentCarp.getBotonList().get(1)))
	        {
                    System.out.println("SubCarpeta");
                    File fichero=new File("C:\\"+this.Directorio+"\\"+Crear+"\\"+SubCarpeta);
                    if(fichero.exists()==false)
                    {   
           fichero.mkdir();//Creacion de carpeta con el nombre de la raiz
           Carpeta_SubCarpeta  Car = new Carpeta_SubCarpeta(this.Directorio,SubCarpeta);
            this.VentCarp.getGestionDato().addCarp(Car);
            Object[][] datoCarp = this.VentCarp.cargaDatosTabla(this.VentCarp.getGestionDato().getCarpList().size(), 2);
            this.VentCarp.setDatos(datoCarp);
            this.VentCarp.getModeloTabla().setDataVector(this.VentCarp.getDatos(), this.VentCarp.getEncabezado());
                }
                    else
                    {
                         JOptionPane.showMessageDialog(null,"Directorio Repetido .");
                    }
                     }
 
    }

    public VentanaCarpeta_SubCarpeta getVentCarp() {
        return VentCarp;
    }

    public void setVentCarp(VentanaCarpeta_SubCarpeta VentCarp) {
        this.VentCarp = VentCarp;
    }
    
    
}
