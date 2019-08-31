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
public class Cuadrado extends Figuras2D{
    /**
    * Constructor de la clase 
    * @param valor1 lado
    */
    public Cuadrado(double valor1) {
        super(valor1);
    }
    /**
     * Metodo para hallar perimetro cuadrado
     * @return perimetro
     */
    @Override
    public double hallarPerimetro() {
        setPerimetro(getValor1()*4);
        return getPerimetro();
    }
    /**
     * Metodo para hallar area cuadrado
     * @return area
     */
    @Override
    public double hallarArea() {
        setArea(getValor1()*getValor1());
        return getArea();
    }
    /**
     * Metodo para imprimir valor de los atributos del cuadrado
     */
    @Override
    public void imprimir() {
        System.out.println("Cuadrado");
        System.out.println("Lado: "+getValor1()+"   Area: "+ hallarArea()+ "    Perimetro: "+ hallarPerimetro());
    }
 
}
