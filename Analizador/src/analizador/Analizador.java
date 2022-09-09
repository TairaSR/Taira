/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analizador;

import java.util.ArrayList;
import java.util.Scanner;
import analizador.Lexico.*;

/**
 *
 * @author Taira
 */
public class Analizador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        Separar separar = new Separar();
        boolean salir = false;
        int opcion;
        
        while (!salir) { 
            System.out.println("Menu");
            System.out.print("1.- Lexico \n"
                    + "2.- Sintactico \n"
                    + "3.- Salir\n");

            try {
                System.out.print("Elige una opcion: ");
                opcion = Integer.parseInt(sc.nextLine());
                
                switch (opcion) {
                    case 1:
                        Lexico lexico = new Lexico();
                        for (String palabra : separar.palabras()) {
                            lexico.comparartodo(palabra);
                        }
                        break;
                    case 2:
                        Sintactico sintactico = new Sintactico();
                        for (String frase : separar.frases()) {
                            System.out.println(frase);
                            sintactico.palabras_reservadas(frase);
                        }
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Ingrese un valor del 1 al 3");
                }
            } catch (Exception e) {
                System.out.println("Introduce un numero");
                sc.next();
            }
        }
    }
}
