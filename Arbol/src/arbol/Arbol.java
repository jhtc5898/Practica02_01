/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author johne
 */
public class Arbol
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
             File Directorio =new File("C:\\Program Files");
       if(Directorio.exists()==false)//!
        {   
           Directorio.mkdir();//Creacion de carpeta con el nombre de la raiz
         
            //for(i=0;i<10;i++)
            // { 
               // File fichero=new File("C:\\Progra\\NuevoCarpeta");
                // fichero.mkdir();//Creacion de carpeta con el nombre de la raiz
                 //retname()
               /*  File Archivo = new  File("C:\\Progra\\"+i+"\\Dile.doc");
                 
               try {
                   Archivo.createNewFile();

                   //fichero = File.createTempFile(Temp, ".docx" , new File("C:\\Users\\Estudiante\\Desktop\\GUARDE AQUI SUS ARCHIVOS\\File") );
               } catch (IOException ex) {
                   System.err.println("Error al creal el archivo "+ex.getMessage());
               }
             } 
            
                 
           /* Carpeta_SubCarpeta  Car = new Carpeta_SubCarpeta(this.Directorio,Crear,Modificar);
            this.VentCarp.getGestionDato().addCarp(Car);
            Object[][] datoCarp = this.VentCarp.cargaDatosTabla(this.VentCarp.getGestionDato().getCarpList().size(), 2);
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
               //Cras una lista de archivos de la carpeta 
              /* String [] lista = fichero.list();
                 for(i=0;i<100;i++)
             { 
                 
             }*/

                 //}      
        }
        else
        {   
            //JOptionPane.showMessageDialog(null,"Directorio Repetido .");
            //fichero.delete();
             File [] lista1=Directorio.listFiles();
              for(File a:lista1)
              {
                //  System.out.println(a.getPath());// Musetra la ruta
                   System.out.println(a.toString());//Lsita de datos 
                   //Mostrar(a);
                  
              }
        }
           
    }

    private static void Mostrar(File a) {
          if(a.isFile())
          {
           System.out.println("");
          }
           if(a.isDirectory())
           {
               System.out.println("");
           }
           }
    }

    

