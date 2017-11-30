/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02_01.controlador;

import practica02_01.vista.VentanaDirectorio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JOptionPane;
import practica02_01.modelo.Directorio;

/**
 *
 * @author johne
 */
public class EventoDirectorio implements ActionListener
{
    private VentanaDirectorio VentDirect;

    public EventoDirectorio(VentanaDirectorio VentDirect) {
        this.VentDirect = VentDirect;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
         if (e.getSource().equals(this.VentDirect.getBoton())) 
        {
            String direccion=this.VentDirect.getTxtList().get(0).getText();
            //System.err.println("Action");
             File fichero=new File("C:\\"+direccion);
        if(fichero.exists()==false)
        {   
           fichero.mkdir();//Creacion de carpeta con el nombre de la raiz
           
        Directorio Dir = new Directorio(direccion);
        this.VentDirect.getGestionDato().addDirectorio(Dir);
        this.VentDirect.getTxtList().get(0).setText("");
        Object [][] datoDir=this.VentDirect.cargaDatosTabla(this.VentDirect.getGestionDato().getDirecrtorioList().size(),1);
        this.VentDirect.setDatos(datoDir);
        this.VentDirect.getModeloTabla().setDataVector(this.VentDirect.getDatos(), this.VentDirect.getEncabezado()); 
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
         
         
        }

    public VentanaDirectorio getVentDirect() {
        return VentDirect;
    }

    public void setVentDirect(VentanaDirectorio VentDirect) {
        this.VentDirect = VentDirect;
    }
    
    
    
}
