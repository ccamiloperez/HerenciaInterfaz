/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.herenciainterfaz;

/**
 * Clase padre para los triangulos.
 * @author Cristian Perez
 */
public abstract class Triangulo extends Figuras2D {
    /**
     * Constructor de la clase un atributo
     * @param valor1 base triangulo
     */
    public Triangulo(double valor1) {
        super(valor1);
    }//cierre constructor
    
    /**
     * Constructor de la clase dos atributos
     * @param valor1 base triangulo
     * @param altura altura triangulo
     */
    public Triangulo(double valor1, double altura) {
        super(valor1, altura);
    }//cierre constructor
}
