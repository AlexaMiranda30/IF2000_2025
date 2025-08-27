/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author almi0
 */
public class Quices {

    public Quices() {
      }
    public void Quiz3(int n){
   
   for(int j = 1; j <= n; j++){
      System.out.print(" * ");
      }
      System.out.println();
   
      for(int i = 2; i <= n - 1; i++){
       
      System.out.print(" * ");
       
      for(int j = 2; j <= n - 1; j++){
      if(i == n / 2 + 1 && j == n / 2 + 1){
      System.out.print(" * ");
      }else{
      System.out.print("   ");
               
       }
       }
      System.out.print(" * ");
      System.out.println();
       
       }
      for(int j = 1; j <= n; j++){
      System.out.print(" * ");
       
       }
      System.out.println();
       }
       }