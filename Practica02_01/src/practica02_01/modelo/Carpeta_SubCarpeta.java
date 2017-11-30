/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02_01.modelo;

import java.io.File;

/**
 *
 * @author johne
 */
public class Carpeta_SubCarpeta 
{
    private Directorio Director;
    private String NombreCarp;
    private File fichero;

    public Carpeta_SubCarpeta(Directorio Director, String NombreCarp) {
        this.Director = Director;
        this.NombreCarp = NombreCarp;
    }

    public Directorio getDirector() {
        return Director;
    }

    public void setDirector(Directorio Director) {
        this.Director = Director;
    }

    public String getNombreCarp() {
        return NombreCarp;
    }

    public void setNombreCarp(String NombreCarp) {
        this.NombreCarp = NombreCarp;
    }

    public File getFichero() {
        return fichero;
    }

    public void setFichero(File fichero) {
        this.fichero = fichero;
    }
    
    
    
}
