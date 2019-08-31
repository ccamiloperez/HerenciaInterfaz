/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.herenciainterfaz;
/**
 * En esta clase se definen los metodos de triangulo equilatero.
 * @author Cristian Perez
 */
public class TrianguloEquilatero extends Triangulo {
    /**
     * Constructor de la clase
     * @param valor1 base triangulo
     */
    public TrianguloEquilatero(double valor1) {
        super(valor1);
    }//cierre constructor
    
    /**
     * Metodo para hallar perimetro triangulo equilatero
     * @return perimetro
     */
    @Override
    public double hallarPerimetro(){
        setPerimetro(getValor1()*3);
        return getPerimetro();
    }
    /**
     * Metodo para hallar area triangulo equilatero
     * @return area
     */
    @Override
    public double hallarArea() {
        double valorArea;
        valorArea=(((Math.sqrt(3))/4)*Math.pow(getValor1(),2));
        setArea(valorArea);
        return getArea();
    }
    /**
     * Metodo para imprimir valor de los atributos del triangulo equilatero
     */
     @Override
    public void imprimir() {
        System.out.println("Triangulo Equilatero");
        System.out.println("Lado: "+getValor1()+"    Area: "+ hallarArea()+ "    Perimetro: "+ hallarPerimetro());
    }
}