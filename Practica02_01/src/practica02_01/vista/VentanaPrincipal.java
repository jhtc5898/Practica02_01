/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02_01.vista;

import practica02_01.controlador.GestionDato;
import practica02_01.controlador.EventoVentanaPrincipal;
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
     private GestionDato gestionDato;
    private JDesktopPane escritorio;
    private JMenuBar barraMenu;
    private java.util.List<JMenu> menuList;
    private ArrayList<JMenuItem> menuItemList;
   // private GestionDato Gd;

    public VentanaPrincipal(GestionDato gD) {
         super("Archivos");
        this.gestionDato = gD;
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
        this.menuItemList.add(new JMenuItem("Modificar Carpeta/SubCarpetas"));
        this.menuItemList.add(new JMenuItem("Eliminar  Carpeta/SubCarpetas"));
        
        this.menuItemList.add(new JMenuItem("Crear Archivo"));
        this.menuItemList.add(new JMenuItem("Modificar Archivo"));
        this.menuItemList.add(new JMenuItem("Eliminar Archivo"));
        
        this.menuItemList.add(new JMenuItem("Directorio"));

        
        this.setContentPane(this.escritorio);
        this.setJMenuBar(barraMenu);
        
        this.barraMenu.add(this.menuList.get(0));
        this.menuList.get(0).add(this.menuItemList.get(0));
        
        this.barraMenu.add(this.menuList.get(1));
        this.menuList.get(1).add(this.menuItemList.get(1));
        this.menuList.get(1).add(this.menuItemList.get(2));
        this.menuList.get(1).add(this.menuItemList.get(3));
        
        this.barraMenu.add(this.menuList.get(2));
        this.menuList.get(2).add(this.menuItemList.get(4));
        this.menuList.get(2).add(this.menuItemList.get(5));
        this.menuList.get(2).add(this.menuItemList.get(6));
        
        
        this.barraMenu.add(this.menuList.get(3));
        this.menuList.get(3).add(this.menuItemList.get(7));
        
        
        
        this.menuItemList.get(0).addActionListener(new EventoVentanaPrincipal(this));
        this.menuItemList.get(1).addActionListener(new EventoVentanaPrincipal(this));
        this.menuItemList.get(2).addActionListener(new EventoVentanaPrincipal(this));
        this.menuItemList.get(3).addActionListener(new EventoVentanaPrincipal(this));
        this.menuItemList.get(4).addActionListener(new EventoVentanaPrincipal(this));
        this.menuItemList.get(5).addActionListener(new EventoVentanaPrincipal(this));
        this.menuItemList.get(6).addActionListener(new EventoVentanaPrincipal(this));
        this.menuItemList.get(7).addActionListener(new EventoVentanaPrincipal(this));

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

    public GestionDato getGestionDato() {
        return gestionDato;
    }

    public void setGestionDato(GestionDato gestionDato) {
        this.gestionDato = gestionDato;
    }

  
    
    

    
}
