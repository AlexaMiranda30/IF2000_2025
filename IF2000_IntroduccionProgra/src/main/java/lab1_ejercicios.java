/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
     
  import java.util.Scanner;
/**
 *
 * @author almi0
 */
public class lab1_ejercicios {

    public lab1_ejercicios() {
    }
    
    public void ejercicio1 (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un numero entero:");
        int n = sc.nextInt();
        if(n % 2 == 0)
        System.out.println("Es par");
        else
        System.out.println("Es impar");
    }
    
    public void ejercicio2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un numero:");
        int n = sc.nextInt();
        if(n<0){
            n = -n;
           
        }
        System.out.println("Valor absoluto:" + n);
    }
    
    public void ejercicio3(){
        int i = 3;
        while (i <=99){
            System.out.print(i + " ");
            i = i + 3;
        }
    }
    
    public void ejercicio4(){
      Scanner sc = new Scanner(System.in);
      
      System.out.print("numero 1:");
      int a = sc.nextInt();
      System.out.print("numero 2:");
      int b = sc.nextInt();
      System.out.print("numero 3:");
      int c = sc.nextInt();
      
      if(a > b){
        int temp = a;
        a = b;
        b = temp;
        
      }
      
      if (b > c){
          int temp = b;
          b = c;
          c = temp;
          
      }
      if (a > b){
         int temp = a;
         a = b;
         b = temp;
      }
      System.out.println("Ascendente: " + a + ", " + b + ", " + c);
      
    }
    
    public void ejercicio5(){
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Primer numero: ");
      int a = sc.nextInt();
      System.out.print("segundo numero:");
      int b = sc.nextInt();
      int resultado;
      if(a == b){
      resultado = a * b;
      } else if (a > b){
         resultado = a - b;
         
      } else{
          resultado = a + b;
          
      }
      
      System.out.println("Resultado: " + resultado);
      
    }
    
    public void ejercicio6(){
    Scanner sc = new Scanner(System.in);
    boolean hubo10 = false;
    int nota = 0;
    System.out.print("Ingrese una nota(0 a 10,-1 para terminar):");
    nota = sc.nextInt();
    
    while (nota != -1){
      if (nota == 10){
       hubo10 = true;
       
      }
      System.out.print("Ingrese una nota(0 a 10,-1 para terminar):");
      nota = sc.nextInt();
    }
    if(hubo10){
        System.out.println("Si hubo almenos una nota de 10.");
    }else{
      System.out.println("No hubo una nota de 10.");
    }
      
    }
    
    public void ejercicio7(){
      
     Scanner sc = new Scanner(System.in);
     System.out.print("Sexo (F o M):");
     String sexo = sc.next();
     System.out.print("Edad:");
     int edad = sc.nextInt();
     int pulsaciones;
     if(sexo.equals("F")){
     pulsaciones = (220 - edad)/10;
}else{
         pulsaciones = (210 - edad)/10;
         
     }
     System.out.println("Numero de pulsaciones cada 10s:" + pulsaciones);

    }
    
    public void ejercicio8(){
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Anios en la empresa:");
     int anios = sc.nextInt();
     System.out.print("Salario mensual:");
     int salario = sc.nextInt();
     double porcentaje;
     if(anios < 1){
      porcentaje = 0.05;
     }else if(anios < 2){
       porcentaje = 0.07;
      }else if(anios < 5){
       porcentaje = 0.10;
       }else if(anios < 10){
       porcentaje = 0.15;
       }else{
       porcentaje = 0.20;          
         
     }
     double utilidad = salario * porcentaje;
     System.out.println("Utilidad:" + utilidad);
    }
    
    public void ejercicio9(){
     Scanner sc = new Scanner(System.in);
     System.out.print("Digite un numero:");
     int n = sc.nextInt();
     boolean esprimo = true;
     if(n<=1){
     esprimo = false;
     }else{
      int i = 2;
      while (i < n){
      if(n % i == 0){
        esprimo = false;
        
      }
      i = i + 1;
      }
     }
     if(esprimo){
      
         System.out.println("Es primo");
     }else{
       System.out.println("No es primo");
     }
     
    }
    
    public void ejercicio10(){
     Scanner sc = new Scanner(System.in);
     final int precio = 11000;
     System.out.print("Cantidad de computadoras:");
     int cant = sc.nextInt();
     double subtotal = cant * precio;
     double descuento;
     if(cant < 5){
     descuento = subtotal * 0.10;
     }else if (cant < 10){
      descuento = subtotal * 0.20;
     }else{
         descuento = subtotal * 0.40;
     }
      double total = subtotal - descuento;
      System.out.println("Subtotal:" + subtotal);
      System.out.println("Descuento:" + descuento);
      System.out.println("Total a pagar:" + total);
    
}
    
    public void ejercicio11(){
     Scanner sc = new Scanner(System.in);
     System.out.print("Dijite numero N:");
     int n = sc.nextInt();
     for(int i = 2;i <=n;i++){
      boolean esprimo = true;
      int j = 2;
      while (j < i){
      if(i % j == 0){
        esprimo = false;
      }
      j = j + 1;
      
      }
      if(esprimo){
       System.out.println(i + " ");
      }
      
     }
    }
    
    public void ejercicio12(){
        
    Scanner sc = new Scanner(System.in);
    System.out.print("Base:");
    int base = sc.nextInt();
    System.out.print("Altura:");
    int altura = sc.nextInt();
    
    int area = (base * altura)/2;
    System.out.println("Area:" + area);
    
    }
    }

    
    
        
 
    

