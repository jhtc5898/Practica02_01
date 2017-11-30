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
import javax.swing.JTextField;
import practica02_01.controlador.EventoModificacion;
import practica02_01.controlador.GestionDato;
import practica02_01.modelo.Carpeta_SubCarpeta;

/**
 *
 * @author pedro
 */
public class VentanaModificacion extends JInternalFrame {
    
    private GestionDato gestionDato;
    private List<JLabel> etiList;
    private List<JTextField> txtList;
    private List<JButton> botonList;
    private JPanel panel;
    private JComboBox comboCarpeta;
    
    public VentanaModificacion(GestionDato gestionDato) {
        super("Modificacion",true,true,true,true);
        this.gestionDato = gestionDato;
        this.iniciaComponente();
        this.setLocation(170, 50);
        this.setSize(250, 150);              
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

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JComboBox getComboCarpeta() {
        return comboCarpeta;
    }

    public void setComboCarpeta(JComboBox comboCarpeta) {
        this.comboCarpeta = comboCarpeta;
    }
    
    public void iniciaComponente() {
        
        this.etiList= new ArrayList<JLabel>();
        this.txtList= new ArrayList<JTextField>();
        this.botonList= new ArrayList<JButton>();
        this.comboCarpeta = new JComboBox(this.cargaCombo());
        JPanel panel = new JPanel(new FlowLayout());
        
        this.etiList.add(new JLabel("Carpeta/Subcarpeta:"));
        this.etiList.add(new JLabel("Nuevo Nombre:"));
        
        this.txtList.add(new JTextField(15));
        
        this.botonList.add(new JButton("Modificar"));
        
        panel.add(this.etiList.get(0));
        panel.add(this.comboCarpeta);
        panel.add(this.etiList.get(1));
        panel.add(this.txtList.get(0));
        panel.add(this.botonList.get(0));
        
        this.botonList.get(0).addActionListener(new EventoModificacion(this));
        
        this.add(panel);
        
    }
    
    public String[] cargaCombo() {
        
        String[] retorno = new String[this.gestionDato.getCarpList().size()];
        int i=0;
        for(Carpeta_SubCarpeta c: this.gestionDato.getCarpList()) {
            retorno[i] = c.getNombreCarp() + " | Directorio: " + c.getDirector();
            i++;
        }
        return retorno;
    }
    
    
    
    
}
