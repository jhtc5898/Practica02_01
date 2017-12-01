/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02_01.controlador;

import java.util.List;
import practica02_01.modelo.Archivo;
import practica02_01.modelo.Carpeta_SubCarpeta;
import practica02_01.modelo.Directorio;

public class GestionDato 
{
    private List<Directorio> direcrtorioList;
    private List<Carpeta_SubCarpeta> carpList;
    private List<Archivo> archivoList;

    public GestionDato(List<Directorio> direcrtorioList, List<Carpeta_SubCarpeta> carpList, List<Archivo> archivoList) {
        this.direcrtorioList = direcrtorioList;
        this.carpList = carpList;
        this.archivoList = archivoList;
    }

     
    public boolean addDirectorio(Directorio p)
    {
        return this.direcrtorioList.add(p);
    }
    public boolean addCarp(Carpeta_SubCarpeta a)
    {
        return this.carpList.add(a);
    }

    public List<Directorio> getDirecrtorioList() {
        return direcrtorioList;
    }

    public void setDirecrtorioList(List<Directorio> direcrtorioList) {
        this.direcrtorioList = direcrtorioList;
    }

    public List<Carpeta_SubCarpeta> getCarpList() {
        return carpList;
    }

    public void setCarpList(List<Carpeta_SubCarpeta> carpList) {
        this.carpList = carpList;
    }

    public List<Archivo> getArchivoList() {
        return archivoList;
    }

    public void setArchivoList(List<Archivo> archivoList) {
        this.archivoList = archivoList;
    }
    
}
