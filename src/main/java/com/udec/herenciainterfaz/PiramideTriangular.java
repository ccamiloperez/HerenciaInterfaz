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
public class PiramideTriangular extends Figuras3D{
    /**
     * Constructor de la clase
     * @param valor1 arista de la base
     * @param valor2 apotema
     */
    public PiramideTriangular(double valor1, double valor2) {
        super(valor1, valor2);
    }
    /**
     * Metodo para hallar volumen de la piramide
     * @return volumen
     */
    @Override
    public double hallarVolumen() {
      double alturaBase, altura, areaBase, volumen;
      alturaBase=(Math.sqrt( ( Math.pow(getValor1(),2) -  Math.pow((getValor1()/2),2))    ))/2;
      altura=Math.sqrt( ( Math.pow(getValor2(),2) -  Math.pow(alturaBase,2)  )    );
      areaBase=(getValor1()*(Math.sqrt( ( Math.pow(getValor1(),2) -  Math.pow((getValor1()/2),2)))))/2;
      volumen=(areaBase*altura)/3;
      setVolumen(volumen);
      return getVolumen();
    }
    /**
     * Metodo para hallar el area de la piramide
     * @return area
     */
    @Override
    public double hallarArea() {
        double valorArea;
        valorArea= (  (Math.sqrt(3)/2)   *   getValor1()  *  (    (getValor1()/2)   +  (Math.sqrt(3)*getValor2())    ) );
        setArea(valorArea);
        return getArea();
    }
    /**
     * Metodo para imprimir atributos de la figura
     */
    @Override
    public void imprimir() {
        System.out.println("Piramide Triangular");
        System.out.println("Arista base: "+getValor1()+"    Apotema: "+getValor2() +"    Area: "+ hallarArea()+"    Volumen: "+ hallarVolumen());
    }
    
    
}
