/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.herenciainterfaz;

/**
 * En esta clase se definen los metodos del cuadrado.
 * @author Cristian Perez
 */
public class Circulo extends Figuras2D{
    /**
     * Constructor de la clase
     * @param valor1 radio
     */
    public Circulo(double valor1) {
        super(valor1);
    }
    /**
     * Metodo para hallar perimetro circulo
     * @return perimetro
     */
    @Override
    public double hallarPerimetro() {
        setPerimetro(2*Math.PI*getValor1());
        return getPerimetro();
    }
    /**
     * Metodo para hallar area circulo
     * @return area
     */
    @Override
    public double hallarArea() {
        setArea(Math.PI*( Math.pow(getValor1(),2)));
        return getArea();
    }
    /**
     * Metodo para imprimir valor de los atributos del circulo
     */
    @Override
    public void imprimir() {
        System.out.println("Circulo");
        System.out.println("Radio: "+getValor1()+"   Area: "+ hallarArea()+ "    Perimetro: "+ hallarPerimetro());
    }
}
