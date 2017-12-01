/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02_01.vista;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import practica02_01.controlador.GestionDato;
import practica02_01.modelo.Archivo;
import practica02_01.modelo.Carpeta_SubCarpeta;
import practica02_01.modelo.Directorio;

/**
 *
 * @author johne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       
        List<Directorio> Directorio = new ArrayList<Directorio>();
        List<Carpeta_SubCarpeta> Carp = new  ArrayList<Carpeta_SubCarpeta>();
        List<Archivo> Arch = new ArrayList<Archivo>(); 
        GestionDato gD = new GestionDato(Directorio,Carp,Arch);
        VentanaPrincipal VentPrincipal = new VentanaPrincipal(gD);
        /*File fichero=new File("C:\\File");
        
        if(fichero.exists()==false)
        {   
           fichero.mkdir();//Creacion de carpeta con el nombre de la raiz
           
        }
        else
        {   
            System.err.println("Existe la carpeta");
             int i;
             for(i=0;i<100;i++)
             { 
                File fichero1=new File("C:\\File\\NuevaCarpeta"+i);
                 fichero1.mkdir();//Creacion de carpeta con el nombre de la raiz
                // fichero = File.createTempFile(Temp, ".docx" , new File("C:\\Users\\Estudiante\\Desktop\\GUARDE AQUI SUS ARCHIVOS\\File") );
             } 
        }*/
    }
    
}
