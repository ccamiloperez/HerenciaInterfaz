/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.herenciainterfaz;

import java.util.Scanner;

/**
 * Clase donde inicia el programa.
 * @author Cristian Perez
 */
public class Inicio {
    /**
     * Scanner para recibir valores por teclado*/
    Scanner teclado=new Scanner(System.in);
    /**
     * Constructor de la clase.
     */
    public Inicio() {
        Metodos crear=new Metodos();
        System.out.println("Bienvenido");
         char seleccion;
        do {
            switch(menu()){
                case 1:
                    crear.crearTrianguloE();
                break;
                    
                case 2:
                    crear.crearTrianguloR();
                break;
                    
                case 3:
                   crear.crearCuadrado();
                break;
                    
                case 4:
                   crear.crearRectangulo();
                break;  
                    
                case 5:
                  crear.crearCirculo();
                break;  
                
                case 6:
                  crear.crearPiramide();
                break;  
                    
                case 7:
                  crear.crearCubo();
                break;
                
                case 8:
                 crear.crearEsfera();
                break;
                    
                case 9:
                break;
            }
            System.out.println("Desea ingresar otra figura? s= si / n= No");
            seleccion=teclado.next().charAt(0);
        } while (seleccion=='s');
        
        System.out.println("\n FIGURAS GUARDADAS:\n");
        crear.imprimirLista();    
    }//cierre constructor
    
    /**
     * Metodo donde se encuentra alojado el menu de opciones
     * @return opcion seleccionada
     */
    public int menu(){
        int opcion=0;
        do {
            System.out.println("Seleccione la figura que desea crear : \n"
                                +"1.Triangulo Equilatero \n"
                                +"2.Triangulo Rectangulo \n"
                                +"3.Cuadrado \n"
                                +"4.Rectangulo \n"
                                +"5.Circulo \n"
                                +"6.Piramide Triangular \n"
                                +"7.Cubo \n"
                                +"8.Esfera \n"
                                +"9.Salir \n");
             opcion=teclado.nextInt();
            
        } while (opcion<1 || opcion>9);
        
    return opcion;
    }//cierre del metodo

    public static void main(String[] args) {
     Inicio inicio= new Inicio();
    }
    
}
