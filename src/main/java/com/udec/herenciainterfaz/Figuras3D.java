/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.herenciainterfaz;

/**
 * Clase padre que define los atributos y metodos de las figuras 3D
 * @author Cristian Perez
 */
public abstract class Figuras3D implements InterFiguras {
    /**
     * Atributo que representa: Piramide--> arista base, Cubo--> arista, Esfera--> radio.
     */
    private double valor1;
    /**
     * Atributo que representa apotema Piramide.
     */
    private double valor2;
    /**
     * Atributo que representa area de las figuras.*/
    private double area;
    /**
     * Atributo que representa volumen de las figuras.*/
    private double volumen;

    /**
     * Constructor de la clase un solo atributo
     * @param valor1 arista o radio
     */
    public Figuras3D(double valor1) {
        this.valor1 = valor1;
    }//cierre constructor
    
    /**
     * Constructor de la clase dos atributos
     * @param valor1 arista 
     * @param valor2 apotema
     */
    public Figuras3D(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }//cierre constructor

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    /**
     * Metodo para hallar volumen de las figuras
     * @return volumen
     */
    public abstract double hallarVolumen();
    
    
}
