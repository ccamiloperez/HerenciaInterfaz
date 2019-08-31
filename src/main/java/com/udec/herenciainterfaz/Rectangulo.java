/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.herenciainterfaz;

/**
 * En esta clase se definen los metodos del rectangulo.
 * @author Cristian Perez
 */
public class Rectangulo extends Figuras2D{
    /**
     * Constructor de la clase
     * @param valor1 base
     * @param altura altura
     */
    public Rectangulo(double valor1, double altura) {
        super(valor1, altura);
    }
    /**
     * Metodo para hallar perimetro rectangulo
     * @return perimetro
     */
    @Override
    public double hallarPerimetro() {
        setPerimetro((getValor1()*2) + (getAltura()*2));
        return getPerimetro();
    }
    /**
     * Metodo para hallar area rectangulo
     * @return area
     */
    @Override
    public double hallarArea() {
        setArea(getValor1()*getAltura());
        return getArea();
    }
    /**
     * Metodo para imprimir valor de los atributos del rectangulo
     */
    @Override
    public void imprimir() {
        System.out.println("Rectangulo");
        System.out.println("Base: "+getValor1()+ "    Altura: "+getAltura()+"    Area: "+ hallarArea()+ "    Perimetro: "+ hallarPerimetro());
    }
    
}
