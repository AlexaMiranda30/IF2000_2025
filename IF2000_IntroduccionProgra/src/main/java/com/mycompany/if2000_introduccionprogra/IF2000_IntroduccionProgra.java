/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.if2000_introduccionprogra;

/**
 *
 * @author almi0
 */
import domain.Person;
public class IF2000_IntroduccionProgra {

    public static void main(String[] args) {
      
        
        /*
        //Data Types
        String name = "Lionel";
        int age = 40;
        
          System.out.println("Hello World!");
          System.out.println ("Name: " + name);
          System.out.println ("Age: " + age);
        
        /* 
           Tipos de datos numericos: 
          int,long,short,float,double,numeric,money,decimal

           Manejo de fechas:
           Date
           
           Cadena de caracteres:
            String

           Objetos:
           Object

           Data Structures:
           Arrays or Vectors: int[] x;
                              int [] [] y;
           True/False
           boolean
           */
        
        Person p = new Person ("Alexa", "Miranda", "402510087","14525455", 20);
            System.out.println(p.toString()); 
    }
}
