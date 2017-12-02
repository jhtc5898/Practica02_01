 package practica02_01.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.WindowConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import practica02_01.controlador.GestionDato;
import practica02_01.modelo.Carpeta_SubCarpeta;

/**
 *
 * @author johne
 */
public class Arbol
{
//private Carpeta_SubCarpeta carpeta;

 private VentanaDirectorio VentDirect;


    public  void main()
            
    {
       // System.out.println(this.carpeta.getDirector().getDireccion());
 
           File Directorio =new File("C:\\Program Files (x86)" );
        
        DefaultMutableTreeNode Nodo = new DefaultMutableTreeNode(Directorio.getName());//Padre
        DefaultTreeModel modelo = new DefaultTreeModel(Nodo);
        JTree tree = new JTree(modelo);
        
       
       if(Directorio.exists()==false)//!
        {   
           Directorio.mkdir();//Creacion de carpeta con el nombre de la raiz
   }//Eliminar Comentario 
        else
        {   
            
             File [] lista1=Directorio.listFiles();
            
              for(File a:lista1)
              {
                 DefaultMutableTreeNode hijo = new DefaultMutableTreeNode(a.getName());
                // modelo.insertNodeInto(hijo, Nodo, 0);
                   mostrar(a,modelo,hijo,Nodo);
                  
              }
        } 
        JFrame v = new JFrame();
        JScrollPane scroll = new JScrollPane(tree);
        v.getContentPane().add(scroll);
        v.pack();
        v.setVisible(true);
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//Eliminar Comentario 
           
    }

    private static void  mostrar(File a, DefaultTreeModel modelo, DefaultMutableTreeNode hijo, DefaultMutableTreeNode Nodo) {
          if(a.isDirectory())
          {
             File subCarp=new File (a.toString());
              File [] lista1=subCarp.listFiles();
              for(File b:lista1)
              {
                  DefaultMutableTreeNode Nodo1= new DefaultMutableTreeNode(b.getName());
                  modelo.insertNodeInto(Nodo1, hijo, 0);
                    System.out.println(b.toString());
                    if(b.isDirectory())
                        {
                             mostrar(b, modelo, hijo, Nodo); 
                        }
                    if(b.isFile())
                    {
                    DefaultMutableTreeNode hija = new DefaultMutableTreeNode(b.getName());
                    modelo.insertNodeInto(hija, Nodo1, 0);
                    }
                    
                  
              }
           if(a.isFile())
          {
               System.out.println(a.toString());
               
          } 
    }
         modelo.insertNodeInto(hijo, Nodo, 0);
         System.err.println(a.toString());
    }


    }
    

    

    

