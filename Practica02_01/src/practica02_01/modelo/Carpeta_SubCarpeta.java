/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02_01.modelo;

/**
 *
 * @author johne
 */
public class Carpeta_SubCarpeta 
{
    private Directorio Director;
    private String NombreCarp;

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
    

    
}
