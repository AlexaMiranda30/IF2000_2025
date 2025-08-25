/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;


 import java.util.Arrays;
 import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
/**
 *
 * @author almi0
 */
public class Ejercicios_Semana2_PracticaEnClase {

    public Ejercicios_Semana2_PracticaEnClase() {
    }
    
    public void quiz2_A_primos (){
        
    }
    public void quiz2_Piramide(int n){
        for (int i = 1; i <= n ; i++){
            //controla los espacios vacios
       
            for (int j = 1; j <=(n-i); j++){
                System.out.print(" ");
            
        }//endForInterno_A
            //controla los *s de la piramide
            for (int k = 1; k <=(2*i-1); k++){
             System.out.print("*");
    }//endForInterno B
            System.out.println(" ");
        }//endForExterno
        }//endMetodo
            
  public void ejercicioA (int n){
    
            for (int j = 1; j <= n; j++){
                System.out.print("*");
               
            }
               System.out.println();
            
        
               for (int i = 1; i <= n - 2; i++){
               System.out.print("*"); 
            
                 for (int j = 1; j <= n - 2; j++){
                 System.out.print(" ");
    }
                 System.out.print("*"); 
                 System.out.println();
     }
            
                for (int j = 1; j <=n;j++){
                System.out.print("*");
    }
                System.out.println();
}
       public void ejercicioB(int n){
          
           for (int i = n; i>=1;i--){
               
                for (int j = 1; j <= i; j++){
                System.out.print("*");
                }
                System.out.println();
                
               
           }
          
       }
       public void ejercicioC(int n){
      
           for(int i=n;i>=1;i--){
              
              for(int k=1;k<=n-i;k++){
                  System.out.print(" ");
              }
                  
           
              for(int j = 1;j<=i;j++){
                  System.out.print("*");
              }
               System.out.println();
               }
           }
       
         
          
        public void ejercicioD(){
           
          Scanner scanner = new Scanner(System.in);
          int[] numbers= new int[10];
          System.out.println("Please enter 10 interger numbers");
          for(int i = 0; i < 10; i++){
          System.out.print("Number" + (i + 1) + ": ");
          numbers[i]= scanner.nextInt();
               
           }
           Arrays.sort(numbers);
                 
           System.out.println("Sorted numbers in ascending order:");
           System.out.println(Arrays.toString(numbers));
           }
            
            public void ejercicioE(){
            Random random = new Random();
            Integer [] number = new Integer[100];
            for(int i = 0; i < 100; i++){
            number[i] = random.nextInt(100);
            
            }
            Arrays.sort(number, Collections.reverseOrder());
            
            System.out.println("100 random number sorted in descending order:");
            System.out.println(Arrays.toString(number));
            
            }
            
            public void ejercicioF(){
            
            char[][] tablero = new char [8][8];
            
            for(int fila = 0; fila < 3; fila++){
            for(int col = 0; col < 4; col++){
             tablero[fila][col] = 'N';
            }
            }
            
            for(int fila = 3; fila < 5; fila++){
            for(int col = 0; col < 8; col++){
             tablero[fila][col] = ' ';
            }
            }
             for(int fila = 5; fila < 8; fila++){
            for(int col = 0; col < 4; col++){
             tablero[fila][col] = 'R';
            }
            }
             System.out.println("Tablero Inicial:");
             System.out.print(" ");
            for(int col = 1; col <= 8; col++){
            System.out.print(" " + col);
            }
             System.out.println();
             
            for(int fila = 0; fila < 8; fila++){
            System.out.print((char)('A' + fila) + " ");
            for(int col = 0; col < 8; col++){
               System.out.print(" " + tablero[fila][col]);
            }
            System.out.println();
            }
                
            }
    

        }
       

                
     

       
  

 