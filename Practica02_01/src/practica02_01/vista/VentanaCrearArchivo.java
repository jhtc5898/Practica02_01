/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02_01.vista;

import java.awt.FlowLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import practica02_01.controlador.EventoCrearArchivo;
import practica02_01.controlador.EventoDirectorio;
import practica02_01.controlador.GestionDato;
import practica02_01.modelo.Archivo;
import practica02_01.modelo.Carpeta_SubCarpeta;

/**
 *
 * @author johne
 */
public class VentanaCrearArchivo extends JInternalFrame
{
    private GestionDato gestionDato;
    private JComboBox comboFichero;
    private List<JLabel> etiList;
    private List<JTextField> txtList;
    private List<JButton> botonList;
    private JPanel panel;
    private JScrollPane scroll;
    private JTable tabla;
    private DefaultTableModel modeloTabla;
    private Object[] encabezado;
    private Object[][] datos;
    private EventoDirectorio ficheroP;

    public VentanaCrearArchivo(GestionDato gestionDato) {
        super("Crear Archivo",true,true,true,true);
        this.gestionDato = gestionDato;
        this.iniciaComponente();
        this.setSize(750,400);
    }
    
    public void iniciaComponente() {
        
        this.etiList= new ArrayList<JLabel>();
        this.txtList= new ArrayList<JTextField>();
        this.botonList= new ArrayList<JButton>();
        this.comboFichero = new JComboBox(this.cargaComboDirectorio());
       
        JPanel panel = new JPanel(new FlowLayout());
        
        this.etiList.add(new JLabel("Direccion donde desea crear:"));
        this.etiList.add(new JLabel("Nombre archivo:"));
        this.txtList.add(new JTextField(7));
        
        this.botonList.add(new JButton("Crear"));
       
        
        this.encabezado = new Object[2];               
        this.encabezado[0] = "Directorio";
        this.encabezado[1] = "Archivo";
       
        
        this.datos = cargaDatosTabla(this.gestionDato.getArchivoList().size(),2);

        this.modeloTabla = new DefaultTableModel(this.datos, this.encabezado);        
        this.tabla = new JTable(this.modeloTabla);
        this.scroll = new JScrollPane(this.tabla);
        
        panel.add(this.etiList.get(0));
        panel.add(this.comboFichero);
        panel.add(this.etiList.get(1));
        panel.add(this.txtList.get(0));
        panel.add(this.botonList.get(0));
       
       
        
       
        panel.add(this.scroll);
        
        this.botonList.get(0).addActionListener(new EventoCrearArchivo (this));
        
        
        this.add(panel);
        
    }
    
    public File[] cargaComboDirectorio() { 
        
        File[] retorno = new File[this.gestionDato.getCarpList().size()];
       
        
        
        int i=0;
        
        for(Carpeta_SubCarpeta cS: this.gestionDato.getCarpList()) {
            
            
           
            retorno[i] = cS.getFichero();
            i++;
            
        }
        return retorno;
    }
    
   
    
    public Object[][] cargaDatosTabla(int m, int n) {
        Object[][] retorno = new Object[m][n];
        int i=0;
        for(Archivo a: this.gestionDato.getArchivoList()) {
            retorno[i][0] = a.getFichero().getFichero();
            retorno[i][1] = a.getNombre();
            i++;
        }        
        return retorno;
    }

    public GestionDato getGestionDato() {
        return gestionDato;
    }

    public void setGestionDato(GestionDato gestionDato) {
        this.gestionDato = gestionDato;
    }

    public JComboBox getComboFichero() {
        return comboFichero;
    }

    public void setComboFichero(JComboBox comboFichero) {
        this.comboFichero = comboFichero;
    }

    public List<JLabel> getEtiList() {
        return etiList;
    }

    public void setEtiList(List<JLabel> etiList) {
        this.etiList = etiList;
    }

    public List<JTextField> getTxtList() {
        return txtList;
    }

    public void setTxtList(List<JTextField> txtList) {
        this.txtList = txtList;
    }

    public List<JButton> getBotonList() {
        return botonList;
    }

    public void setBotonList(List<JButton> botonList) {
        this.botonList = botonList;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public void setModeloTabla(DefaultTableModel modeloTabla) {
        this.modeloTabla = modeloTabla;
    }

    public Object[] getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(Object[] encabezado) {
        this.encabezado = encabezado;
    }

    public Object[][] getDatos() {
        return datos;
    }

    public void setDatos(Object[][] datos) {
        this.datos = datos;
    }
    
    
    

}
