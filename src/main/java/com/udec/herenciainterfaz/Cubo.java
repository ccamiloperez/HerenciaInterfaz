/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.herenciainterfaz;

/**
 * En esta clase se definen los metodos de la piramide triangular.
 * @author Cristian Perez
 */
public class Cubo extends Figuras3D{
    /**
     * Constructor de la clase
     * @param valor1 arista
     */
    public Cubo(double valor1) {
        super(valor1);
    }
    /**
     * Metodo hallar volumen Cubo
     * @return volumen
     */
    @Override
    public double hallarVolumen() {
        setVolumen(Math.pow(getValor1(),3));
        return getVolumen();
    }
    /**
     * Metodo hallar area del cubo
     * @return area
     */
    @Override
    public double hallarArea() {
        double areaLado;
        areaLado=(Math.pow(getValor1(),2))*6;
        setArea(areaLado);
        return getArea();
    }
    /**
     * Metodo imprimir valor de los atributos del cubo
     */
    @Override
    public void imprimir() {
        System.out.println("Cubo");
        System.out.println("Arista: "+getValor1()+"    Area: "+ hallarArea()+"    Volumen: "+ hallarVolumen());
    }
    
}
