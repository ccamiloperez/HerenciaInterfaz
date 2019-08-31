/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.herenciainterfaz;

/**
 * Clase padre que define los atributos y metodos de las figuras 2D
 * @author Cristian Perez
 */
public abstract class Figuras2D implements InterFiguras {
    /**
     * Atributo que representa base,lado o radio.
     */
    private double valor1;
    /**
     * Atributo que representa Altura Triangulo, Rectangulo.
     */
    private double altura;
    /**
     * Atributo que representa area de las figuras.*/
    private double area;
   /**
    * Atributo que representa el perimetro de las figuras.*/
    private double perimetro;

    /**
     * Constructor de la clase con un solo atributo.
     * @param valor1  base,lado o radio.
     */
    public Figuras2D(double valor1) {
        this.valor1 = valor1;
    }//cierre del constructor
    
    /**
     * Constructor de la clase dos atributos.
     * @param valor1 Base figura
     * @param altura Altura figura
     */
    public Figuras2D(double valor1, double altura) {
        this.valor1 = valor1;
        this.altura = altura;
    }//cierre del constructor
    
    
    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    /**
     * Metodo para hallar el perimetro de las figuras
     * @return perimerto
     */
    public abstract double hallarPerimetro();
    
}//cierre de la clase
