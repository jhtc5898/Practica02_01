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
public class Directorio
{
    private String Direccion;

    public Directorio(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    @Override
    public String toString() {
        return  Direccion ;
    }

  
   

    
    
}
