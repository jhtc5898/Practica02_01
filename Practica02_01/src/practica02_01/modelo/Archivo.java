/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02_01.modelo;

import java.io.File;

/**
 *
 * @author Daniel
 */
public class Archivo {
    
    private String nombre;
    private File fichero;

    public Archivo(String nombre, File fichero) {
        this.nombre = nombre;
        this.fichero = fichero;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public File getFichero() {
        return fichero;
    }
    public void setFichero(File fichero) {
        this.fichero = fichero;
    }
    
}
