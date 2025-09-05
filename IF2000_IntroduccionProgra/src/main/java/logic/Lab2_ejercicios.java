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
public class Lab2_ejercicios {

    public Lab2_ejercicios() {
    }
    
    public void ejercicio13(){
    int suma = 0;
     for(int i = 2; i <= 1000;i+= 2){
      suma +=i;
     }
      System.out.println("Suma pares 2-1000 :" + suma);
     }
    
    public void ejercicio14(){
     Scanner sc = new Scanner(System.in);
     System.out.print("Digite temperatura en celsius:");
     double celsius = sc.nextDouble();
     double fahrenheit = (9.0 / 5.0)* celsius + 32;
     System.out.println("Temperatura en fihrenheit:" + fahrenheit);
  
    }
    public void ejercicio15(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese numero entero x:");
    int x = sc.nextInt();
    System.out.print("Ingrese numero entero n:");
    int n = sc.nextInt();
    int resultado = 1;
    for(int i = 1; i <=n;i++){
        resultado*=x;
    }
    System.out.println("Resultado:" + x + "^" + n +"=" + resultado);
    
    }
    public void ejercicio16(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese un numero del 1-12:");
    int mes = sc.nextInt();
    String[]meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    if(mes>=1 && mes <=12){
    System.out.println("mes:" + meses[mes - 1]);
    }else{
    }
    }
    public void ejercicio17(){
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingresar el valor de x: ");
    int x = sc.nextInt();
    int resultado;
    if (x > 0) {
    resultado = x + 5;
    } else if (x < 0) {
    resultado = x * x;
    } else {
    resultado = 1;
        }
    System.out.println("resultado F(x): " + resultado);
    }
    public void ejercicio18(){
     Scanner sc = new Scanner(System.in);
    System.out.println("Calcule el area del triangulo.");
    System.out.print("Ingrese el lado a:");
    double a = sc.nextDouble();
    System.out.print("Ingrese lado b:");
    double b = sc.nextDouble();
    System.out.print("Ingrese lado c:");
    double c = sc.nextDouble();
    double p = (a + b + c)/2;
    double area = (p*(p-a)*(p-b)*(p-c));
    System.out.println("area:" + area);
    
    }
    public void ejercicio19(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese A:");
    int a = sc.nextInt();
    System.out.print("Ingrese B:");
    int b = sc.nextInt();
    int temp = a;
    a = b;
    b = temp;
    System.out.println("Sea A = " + a + " y B =" + b);
    
    }
    public void ejercicio20(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese x0:");
    double x0=sc.nextDouble();
    System.out.print("Ingrese y0:");
    double y0=sc.nextDouble();
    System.out.print("Ingrese x1:");
    double x1=sc.nextDouble();
    System.out.print("Ingrese y1:");
    double y1=sc.nextDouble();
    double m=(y0-y1)/(x0-x1);
    double b= y0-(m*x0);
    System.out.println("La ecuacion de la recta es: y = " + m + "x +" + b);
    
    }
    public void ejercicio21(){
     Scanner sc = new Scanner(System.in);
     System.out.print("Ingrese numero K:");
     int k = sc.nextInt();
     int suma = 0;
     for(int i = 1;i<k;i++){
     suma += i;
     System.out.println("Suma de los numeros menores que " + k + " = " + suma);
    
}
    }
    public void ejercicio22(){
     Scanner sc = new Scanner(System.in);
     System.out.print("cuantos numeros se van a ingresar?:");
     int n = sc.nextInt();
     double suma = 0;
     for(int i = 1; i<= n;i++){
     System.out.print("numero" + i + ":");
     suma+=sc.nextDouble();
      
     }
     System.out.println("promedio =" + suma/n);
    }
    
    public void ejercicio23(){
     Scanner sc = new Scanner(System.in);
     int[] numeros = new int[10];
     int sumatotal = 0,sumanumpares = 0, sumanumimpares = 0;
     int cantidadpares = 0, cantidadimpares = 0;

     for (int i = 0; i < 10; i++) {
     System.out.print("numero " + (i+1) + ": ");
     numeros[i] = sc.nextInt();
     sumatotal += numeros[i];
     if (numeros[i] % 2 == 0) {
     sumanumpares += numeros[i];
     cantidadpares++;
     } else {
     sumanumimpares += numeros[i];
     cantidadimpares++;
            }
        }

      System.out.println("Suma total: " + sumatotal);
      System.out.println("Cantidad pares: " + cantidadpares + ", suma pares: " + sumanumpares);
      System.out.println("Cantidad impares: " + cantidadimpares + ", suma impares: " + sumanumimpares);
    }
     public void ejercicio24(){
      int sumanumpares = 0;
      int sumanumimpares = 0;
      for (int i = 1; i <= 200; i++) {
      if (i % 2 == 0) 
      sumanumpares += i;
      else sumanumimpares += i;
      }
      System.out.println("Suma pares 1 y 200: " + sumanumpares);
      System.out.println("Suma impares 1 y 200: " + sumanumimpares);
    }
    public void ejercicio25(){
     int sumacuadrados = 0;
     for (int i = 1; i <= 100; i++) {
     sumacuadrados += i * i;
        }
     System.out.println("La suma de los cuadrados de los primeros 100 numeros naturales es : " + sumacuadrados);
    }
    
public void ejercicio26(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Introducir un numero entero N para calcular su factorial: ");
    int n = sc.nextInt();
    if (n < 0) {
    System.out.println("El factorial no está definido para numeros negativos.");
    } else if (n == 0 || n == 1) {
    System.out.println("El factorial de " + n + " es: 1");
    } else {
    long factorial = 1;
    for (int i = 2; i <= n; i++) {
    factorial *= i;
          }
    System.out.println("El factorial de " + n + " es: " + factorial);
         }
         }
   public void ejercicio27(){
   Scanner sc = new Scanner(System.in);
   int maximo = Integer.MIN_VALUE;
   for (int i = 1; i <= 10; i++) {
   System.out.print("numero " + i + ": ");
   int number = sc.nextInt();
   if (number > maximo) maximo = number;
        }
   System.out.println("El valor maximo de una serie de 10 numeros es: " + maximo);
   }
   }



     
   

   
   


    

