/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.herenciainterfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Esta clase contiene los metodos para crear figuras y almacenarlas en un vector
 * @author Cristian Perez
 */
public class Metodos {
    /**
     * Lista para almacenar figuras
     */
     private List<InterFiguras> listaFiguras = new ArrayList<InterFiguras>();
     /**
      * vector para almacenar las figuras
      */
     private InterFiguras[] figuras =new InterFiguras[listaFiguras.size()]; 
     /**
      * Scanner para recibir datos por teclado
      */
     Scanner teclado=new Scanner(System.in);
     
     /**
      * Metodo para llenar lista de figuras
      * @param figura figuras
      */
     public void llenarLista(InterFiguras figura){
         listaFiguras.add(figura);
     }
     
     /**
      * metodo para imprimir las figuras creadas y almacenadas en el vector figuras.
      */
      public void imprimirLista(){
         figuras=listaFiguras.toArray(figuras);
         for (InterFiguras vec : figuras) {
             if(vec instanceof TrianguloEquilatero){
                 ((TrianguloEquilatero)vec).imprimir();
             }else if(vec instanceof TrianguloRectangulo){
                 ((TrianguloRectangulo)vec).imprimir(); 
             }else if(vec instanceof Cuadrado){
                 ((Cuadrado)vec).imprimir(); 
             }else if(vec instanceof Rectangulo){
                 ((Rectangulo)vec).imprimir(); 
             }else if(vec instanceof Circulo){
                 ((Circulo)vec).imprimir(); 
             }else if(vec instanceof PiramideTriangular){
                 ((PiramideTriangular)vec).imprimir(); 
             }else if(vec instanceof Cubo){
                 ((Cubo)vec).imprimir(); 
             }else if(vec instanceof Esfera){
                 ((Esfera)vec).imprimir(); 
             }else System.out.println("No existe");
         }
}
      /**
       * metodo para crear una figura de tipo triangulo equilatero
       */
     public void crearTrianguloE(){
         double valor;
         System.out.println("ingrese valor de un lado: ");
         valor=teclado.nextDouble();
         TrianguloEquilatero triangulo= new TrianguloEquilatero(valor);
         triangulo.hallarArea();
         triangulo.hallarPerimetro();
         llenarLista(triangulo);
     }
     /**
       * metodo para crear una figura de tipo triangulo rectangulo
       */
      public void crearTrianguloR(){
         double base,altura;
         System.out.println("ingrese valor de la base: ");
         base=teclado.nextDouble();
         System.out.println("ingrese valor de la altura: ");
         altura=teclado.nextDouble();
         TrianguloRectangulo triangulo= new TrianguloRectangulo(base,altura);
         triangulo.hallarArea();
         triangulo.hallarPerimetro();
         llenarLista(triangulo);
     }
      /**
       * metodo para crear una figura de tipo cuadrado
       */
      public void crearCuadrado(){
         double valor;
         System.out.println("ingrese valor de un lado: ");
         valor=teclado.nextDouble();
         Cuadrado cuadrado= new Cuadrado(valor);
         cuadrado.hallarArea();
         cuadrado.hallarPerimetro();
         llenarLista(cuadrado);
     }
    /**
       * metodo para crear una figura de tipo rectangulo
       */
      public void crearRectangulo(){
         double base,altura;
         System.out.println("ingrese valor de la base: ");
         base=teclado.nextDouble();
         System.out.println("ingrese valor de la altura: ");
         altura=teclado.nextDouble();
         Rectangulo rectangulo= new Rectangulo(base,altura);
         rectangulo.hallarArea();
         rectangulo.hallarPerimetro();
         llenarLista(rectangulo);
     }
      /**
       * metodo para crear una figura de tipo circulo
       */
     public void crearCirculo(){
         double valor;
         System.out.println("ingrese valor del radio: ");
         valor=teclado.nextDouble();
         Circulo circulo= new Circulo(valor);
         circulo.hallarArea();
         circulo.hallarPerimetro();
         llenarLista(circulo);
     }
     /**
       * metodo para crear una figura de tipo piramide triangular
       */
     public void crearPiramide(){
         double aristaBase,apotema;
         System.out.println("ingrese valor del arista de la base: ");
         aristaBase=teclado.nextDouble();
         System.out.println("ingrese valor del apotema: ");
         apotema=teclado.nextDouble();
         PiramideTriangular piramide= new PiramideTriangular(aristaBase,apotema);
         piramide.hallarArea();
         piramide.hallarVolumen();
         llenarLista(piramide);
     }
     /**
       * metodo para crear una figura de tipo cubo
       */
      public void crearCubo(){
         double valor;
         System.out.println("ingrese valor del arista: ");
         valor=teclado.nextDouble();
         Cubo cubo= new Cubo(valor);
         cubo.hallarArea();
         cubo.hallarVolumen();
         llenarLista(cubo);
     }
      /**
       * metodo para crear una figura de tipo esfera
       */
       public void crearEsfera(){
         double valor;
         System.out.println("ingrese valor del radio: ");
         valor=teclado.nextDouble();
         Esfera esfera= new Esfera(valor);
         esfera.hallarArea();
         esfera.hallarVolumen();
         llenarLista(esfera);
     }
     
}
