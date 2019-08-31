/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.herenciainterfaz;

/**
 * Interfaz comportamientos en comun de las figuras. 
 * @author Cristian Perez
 */
public interface InterFiguras {
    
    /*** Metodo para imprimir los atributos de las figuras */
    public void imprimir();
    /**
     * Metodo para hallar area de las figuras
     * @return area
     */
    public double hallarArea();
}//cierre de la clase
