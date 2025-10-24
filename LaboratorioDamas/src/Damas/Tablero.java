/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Damas;

/**
 *
 * @author almi0
 */
public class Tablero {
   
private final Ficha[][] matriz;
private final int TAMANO = 8;

public Tablero() {
matriz = new Ficha[TAMANO][TAMANO];
inicializarTablero();
    }
private void inicializarTablero() {
      
for (int i = 0; i < TAMANO; i++) { 
for (int j = 0; j < TAMANO; j++) { 
if ((i + j) % 2 != 0) { 
if (i < 3) {
                    
matriz[i][j] = new Ficha('R'); 
} else if (i > 4) {
                       
matriz[i][j] = new Ficha('B'); 
                    }
                } 
               
            }
        }
    }

public void mostrarTablero() { 
for (int i = 0; i < TAMANO; i++) {
System.out.print(i + " "); 
for (int j = 0; j < TAMANO; j++) {
             
if (matriz[i][j] == null) {
System.out.print(". ");
} else {
                   
System.out.print(matriz[i][j].toString() + " ");
                }
            }
System.out.println(); 
        }
    }

   
public void moverFicha(int fOrigen, int cOrigen, int fDestino, int cDestino) {
Ficha fichaAMover = matriz[fOrigen][cOrigen];

matriz[fDestino][cDestino] = fichaAMover;

matriz[fOrigen][cOrigen] = null;
    }

public Ficha getFicha(int fila, int columna) {
return matriz[fila][columna];
    }
    
    
}
