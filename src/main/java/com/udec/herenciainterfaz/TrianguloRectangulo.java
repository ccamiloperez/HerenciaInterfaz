/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.herenciainterfaz;

/**
 * En esta clase se definen los metodos de triangulo rectangulo.
 * @author Cristian Perez
 */
public class TrianguloRectangulo extends Triangulo{
    /**
     * Constructor de la clase
     * @param valor1 base
     * @param altura altura
     */
    public TrianguloRectangulo(double valor1, double altura) {
        super(valor1, altura);
    }
    /**
     * Metodo para hallar area triangulo rectangulo
     * @return area
     */
    @Override
    public double hallarArea() {
        setArea((getValor1()*getAltura())/2);
       return getArea();
    }

    /**
     * Metodo para hallar perimetro triangulo rectangulo
     * @return perimetro
     */
    @Override
    public double hallarPerimetro() {
        double hipotenusa;
        hipotenusa=Math.sqrt(((Math.pow(getValor1(),2))+(Math.pow(getAltura(),2))));
        setPerimetro(hipotenusa+getValor1()+getAltura());
        return getPerimetro();
    }
    /**
     * Metodo para imprimir valor de los atributos del triangulo rectangulo
     */
     @Override
    public void imprimir() {
        System.out.println("Triangulo Rectangulo");
        System.out.println("Base: "+getValor1()+ "   Altura: "+getAltura()+"    Area: "+ hallarArea()+ "    Perimetro: "+ hallarPerimetro());
    }
    
    
}
