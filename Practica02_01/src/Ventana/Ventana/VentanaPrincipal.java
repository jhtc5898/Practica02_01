/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana.Ventana;

import Ventana.Controlador.GestionDato;
import Ventana.Controlador.EventoVentanaPrincipal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


/**
 *
 * @author johne
 */
public class VentanaPrincipal extends JFrame
{
     //private GestionDato gestionDato;
    private JDesktopPane escritorio;
    private JMenuBar barraMenu;
    private java.util.List<JMenu> menuList;
    private ArrayList<JMenuItem> menuItemList;
   // private GestionDato Gd;

    public VentanaPrincipal() {
         super("Archivos");
      //  this.gestionDato = gestionDato;
        this.setSize(800, 600);
        this.iniciaComponentes();
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        
    }
    
    
  
    private void iniciaComponentes() 
    {
       this.escritorio= new JDesktopPane();
        this.barraMenu= new JMenuBar();
        this.menuList=new ArrayList<JMenu>();// llamado al array
        this.menuList.add(new JMenu("Directorio"));// ingreso de datos en el array
        this.menuList.add(new JMenu("Carpeta"));// ingreso de datos en el array
        this.menuList.add(new JMenu("Administar"));// ingreso de datos en el array
        this.menuList.add(new JMenu("Informacion"));// ingreso de datos en el array


        this.menuItemList= new ArrayList<JMenuItem>();
        this.menuItemList.add(new JMenuItem("Crear Directorios"));
        this.menuItemList.add(new JMenuItem("Crear  Carpeta/SubCarpetas"));
        this.menuItemList.add(new JMenuItem("Administrar Carpeta"));
        this.menuItemList.add(new JMenuItem("Directorio"));

        
        this.setContentPane(this.escritorio);
        this.setJMenuBar(barraMenu);
        
        this.barraMenu.add(this.menuList.get(0));
        this.menuList.get(0).add(this.menuItemList.get(0));
        
        this.barraMenu.add(this.menuList.get(1));
        this.menuList.get(1).add(this.menuItemList.get(1));
        
        this.barraMenu.add(this.menuList.get(2));
        this.menuList.get(2).add(this.menuItemList.get(2));
        
        this.barraMenu.add(this.menuList.get(3));
        this.menuList.get(3).add(this.menuItemList.get(3));
        
        
        
        this.menuItemList.get(0).addActionListener(new EventoVentanaPrincipal(this));
        this.menuItemList.get(1).addActionListener(new EventoVentanaPrincipal(this));
        this.menuItemList.get(2).addActionListener(new EventoVentanaPrincipal(this));
        this.menuItemList.get(3).addActionListener(new EventoVentanaPrincipal(this));

    }

    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public JMenuBar getBarraMenu() {
        return barraMenu;
    }

    public void setBarraMenu(JMenuBar barraMenu) {
        this.barraMenu = barraMenu;
    }

    public List<JMenu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<JMenu> menuList) {
        this.menuList = menuList;
    }

    public ArrayList<JMenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(ArrayList<JMenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }
    

    
}
