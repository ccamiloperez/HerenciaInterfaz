/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.herenciainterfaz;

/**
 * En esta clase se definen los metodos de la esfera
 * @author Cristian Perez
 */
public class Esfera extends Figuras3D{
    /**
     * Constructor de la clase
     * @param valor1 radio
     */
    public Esfera(double valor1) {
        super(valor1);
    }
    /**
     * Metodo hallar volumen de la esfera
     * @return volumen
     */
    @Override
    public double hallarVolumen() {
        double valorVolumen;
        valorVolumen=((4*Math.PI)/3)*(Math.pow(getValor1(),3));
        setVolumen(valorVolumen);
        return getVolumen();
    }
    /**
     * Metodo para hallar el area de la esfera
     * @return area
     */
    @Override
    public double hallarArea() {
        setArea(4*Math.PI*(Math.pow(getValor1(),2)));
        return getArea();
    }
    /**
     * Metodo para imprimir valor de los atributos de la esfera
     */
    @Override
    public void imprimir() {
        System.out.println("Esfera");
        System.out.println("Radio: "+getValor1()+"    Area: "+ hallarArea()+"    Volumen: "+ hallarVolumen());
    }
    
}
