/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02_01.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import practica02_01.modelo.Archivo;
import practica02_01.modelo.Carpeta_SubCarpeta;
import practica02_01.vista.VentanaCrearArchivo;

/**
 *
 * @author Jose
 */
public class EventoCrearArchivo implements ActionListener {

    private VentanaCrearArchivo crearArchivo;
    private Carpeta_SubCarpeta Fichero;

    public EventoCrearArchivo(VentanaCrearArchivo crearArchivo) {
        this.crearArchivo = crearArchivo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String nA = this.crearArchivo.getTxtList().get(0).getText();
        int pF = this.crearArchivo.getComboFichero().getSelectedIndex();
        this.Fichero = this.crearArchivo.getGestionDato().getCarpList().get(pF);

        Archivo a = new Archivo(nA, this.Fichero);

        File archivo = new File(this.Fichero.getFichero()+"\\"+nA);
       
        

        try {
            archivo.createNewFile();
        } catch (IOException ex) {
            System.err.println("Error al crear archivo");

        } finally {
        }

        this.crearArchivo.getGestionDato().addArchivo(a);
        Object[][] datoArchivo = this.crearArchivo.cargaDatosTabla(this.crearArchivo.getGestionDato().getArchivoList().size(), 2);
        this.crearArchivo.setDatos(datoArchivo);
        this.crearArchivo.getModeloTabla().setDataVector(this.crearArchivo.getDatos(), this.crearArchivo.getEncabezado());

    }

}
