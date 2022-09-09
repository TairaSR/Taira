/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizador;

/**
 *
 * @author Taira
 */
public class Sintactico {
    public void palabras_reservadas(String frase){
        if (frase.matches("int [[a-zA-Z0-9_]]+")) {
            System.out.println("es correcto");
        }else if (frase.matches("double [[a-zA-Z0-9_]]+")) {
            System.out.println("es correcto");
        }else if (frase.matches("float [[a-zA-Z0-9_]]+")) {
            System.out.println("es correcto");
        }else if (frase.matches("String [[a-zA-Z0-9_]]+")) {
            System.out.println("es correcto");
        }else if (frase.matches("char [[a-zA-Z0-9_]]+")) {
            System.out.println("es correcto");
        }else if (frase.matches("boolean [[a-zA-Z0-9_]]+")) {
            System.out.println("es correcto");
        }else if (frase.matches("do [{[a-zA-Z0-9_]]+")) {
            System.out.println("es correcto");
        }else {
            System.out.println("Incorrecto");
        }
    }
}
