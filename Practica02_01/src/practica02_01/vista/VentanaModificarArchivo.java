/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02_01.vista;

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import practica02_01.controlador.EventoModificarArchivo;
import practica02_01.controlador.GestionDato;
import practica02_01.modelo.Archivo;

/**
 *
 * @author Daniel
 */
public class VentanaModificarArchivo extends JInternalFrame{
    
    private GestionDato gestionDato;
    private List<JLabel> etiList;
    private List<JTextField> txtList;
    private List<JButton> botonList;
    private Object[][] datos;
    private Object[] encabezado;
    private JComboBox comboArchivo;
    private JScrollPane scroll;
    private JPanel panel;
    
    public VentanaModificarArchivo(GestionDato gd) 
    {
        super("Modificar Archivo",true,true,true,true);
        this.gestionDato = gd; 
        this.iniciaComponente();
        this.setSize(500, 200);      
    }

    public GestionDato getGestionDato() {
        return gestionDato;
    }
    public void setGestionDato(GestionDato gestionDato) {
        this.gestionDato = gestionDato;
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
    public Object[][] getDatos() {
        return datos;
    }
    public void setDatos(Object[][] datos) {
        this.datos = datos;
    }
    public Object[] getEncabezado() {
        return encabezado;
    }
    public void setEncabezado(Object[] encabezado) {
        this.encabezado = encabezado;
    }
    public JScrollPane getScroll() {
        return scroll;
    }
    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }
    public JPanel getPanel() {
        return panel;
    }
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
    public JComboBox getComboArchivo() {
        return comboArchivo;
    }
    public void setComboArchivo(JComboBox comboArchivo) {
        this.comboArchivo = comboArchivo;
    }
    
   
    public void iniciaComponente()
    {
        this.etiList= new ArrayList<JLabel>();
        this.txtList= new ArrayList<JTextField>();
        this.botonList= new ArrayList<JButton>();
        this.comboArchivo = new JComboBox(this.cargaCombo());
        JPanel panel = new JPanel(new FlowLayout());
        
        this.etiList.add(new JLabel("Nombre del Archivo"));
        this.etiList.add(new JLabel("Nuevo nombre"));
        this.txtList.add(new JTextField(10));
        
        this.botonList.add(new JButton("Modificar"));
        
        panel.add(this.etiList.get(0));
        panel.add(this.comboArchivo);
        panel.add(this.etiList.get(1));
        panel.add(this.txtList.get(0));
        panel.add(this.botonList.get(0));
        
        this.botonList.get(0).addActionListener(new EventoModificarArchivo(this));
        
        this.add(panel);
        
    }
    
    public String[] cargaCombo() 
    {       
        String[] retorno = new String[this.gestionDato.getArchivoList().size()];
        int i=0;
        for(Archivo a: this.gestionDato.getArchivoList()) 
        {
            retorno[i] = a.getNombre();
            i++;
        }
        return retorno;
    }
}
