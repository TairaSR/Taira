/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizador;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Taira
 */
public class Separar {

    public String[] palabras() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un código");
        String texto = teclado.nextLine();

        String[] palabras = texto.split(" |;");

        return palabras;
    }
    public String[] frases() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un código");
        String texto = sc.nextLine();

        String[] palabras = texto.split("; |;");

        return palabras;
    }
    
}
