/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Damas;

import java.util.Scanner;

/**
 *
 * @author almi0
 */
public class Juego {
    
private final Tablero tablero;
private char turnoActual; 
private final Scanner scanner;

    
public Juego() {
tablero = new Tablero();
turnoActual = 'R'; 
scanner = new Scanner(System.in);
    }

public void iniciarJuego() {
       
while (true) { 
tablero.mostrarTablero();

System.out.println("\nTurno de las fichas " + (turnoActual == 'R' ? "Rojas (R)" : "Negras (B)") + ".");

int fOrigen, cOrigen, fDestino, cDestino;
boolean movimientoValido = false;

while (!movimientoValido) {
               
System.out.print("Introduce la fila y columna de Origen (ej: 5 0): ");
fOrigen = scanner.nextInt();
cOrigen = scanner.nextInt();
System.out.print("Introduce la fila y columna de Destino (ej: 4 1): ");
fDestino = scanner.nextInt();
cDestino = scanner.nextInt();

if (validarMovimiento(fOrigen, cOrigen, fDestino, cDestino)) {
tablero.moverFicha(fOrigen, cOrigen, fDestino, cDestino);
movimientoValido = true;
} else {
System.out.println("️ Movimiento Ilegal. Intente de nuevo.");
                }
            }
cambiarTurno();
            
        }
    }

private void cambiarTurno() {
turnoActual = (turnoActual == 'R') ? 'B' : 'R';
    }

private boolean validarMovimiento(int fOrigen, int cOrigen, int fDestino, int cDestino) {
if (fOrigen < 0 || fOrigen >= 8 || cOrigen < 0 || cOrigen >= 8 ||
            fDestino < 0 || fDestino >= 8 || cDestino < 0 || cDestino >= 8) {
System.out.println(" Error: coordenadas fuera del tablero.");
return false;
        }
Ficha fichaOrigen = tablero.getFicha(fOrigen, cOrigen);

if (fichaOrigen == null) {
System.out.println(" Error: La casilla de origen está vacía.");
            return false;
        }

if (fichaOrigen.getColor() != turnoActual) {
System.out.println(" Error: No puede mover una ficha del color que no está en turno.");
return false;
        }

Ficha fichaDestino = tablero.getFicha(fDestino, cDestino);
if (fichaDestino != null) {
System.out.println(" Error: La casilla de destino está ocupada.");
            return false;
        }

int deltaFila = fDestino - fOrigen;
int deltaColumna = cDestino - cOrigen;

if (Math.abs(deltaFila) != 1 || Math.abs(deltaColumna) != 1) {
System.out.println(" Error: El movimiento debe ser exactamente una casilla en diagonal.");
            return false;
        }
        
if (turnoActual == 'R') {
if (deltaFila != 1) {
System.out.println(" Error: Las fichas Rojas solo se mueven hacia abajo.");
return false;
            }
} else { 
if (deltaFila != -1) {
System.out.println(" Error: Las fichas Negras solo se mueven hacia arriba.");
return false;
            }
        }

return true;
    }

public static void main(String[] args) {
Juego juego = new Juego(); 
juego.iniciarJuego(); 
    }
    
}
