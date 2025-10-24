/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Damas;

/**
 *
 * @author almi0
 */
public class Ficha {
    
  private final char color;

  public Ficha(char color) {
  this.color = color; 
    }

  public char getColor() {
        return color;
    }
  
   @Override
   public String toString() {

   return String.valueOf(color);
    }
}
