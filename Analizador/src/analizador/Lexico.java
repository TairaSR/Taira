/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizador;

/**
 *
 * @author Taira
 */
public class Lexico {

    public void comparartodo(String palabras) {
        this.palabras_reservadas(palabras);
        this.operadores_aritmeticos(palabras);
        this.identificador(palabras);
        this.operadores_logicos(palabras);
        this.operadores_relacionales(palabras);
        try {
            this.simbolos(Integer.parseInt(palabras));
        } catch (NumberFormatException e) {
        }
    }

    public void palabras_reservadas(String palabras) {
        if (palabras.equals("int")) {
            System.out.println("Token: " + palabras + " es una palabra reservada");
        }
        if (palabras.equals("double")) {
            System.out.println("Token: " + palabras + " es una palabra reservada");
        }
        if (palabras.equals("float")) {
            System.out.println("Token: " + palabras + " es una palabra reservada");
        }
        if (palabras.equals("char")) {
            System.out.println("Token: " + palabras + " es una palabra reservada");
        }
        if (palabras.equals("String")) {
            System.out.println("Token: " + palabras + " es una palabra reservada");
        }
        if (palabras.equals("if")) {
            System.out.println("Token: " + palabras + " es una palabra reservada");
        }
        if (palabras.equals("while")) {
            System.out.println("Token: " + palabras + " es una palabra reservada");
        }
        if (palabras.equals("do")) {
            System.out.println("Token: " + palabras + " es una palabra reservada");
        }
        if (palabras.equals("for")) {
            System.out.println("Token:" + palabras + " es una palabra reservada");
        }
        if (palabras.equals("switch")) {
            System.out.println("Token: " + palabras + " es una palabra reservada");
        }
        if (palabras.equals("this")) {
            System.out.println("Token:" + palabras + " es una palabra reservada");
        }
        if (palabras.equals("break")) {
            System.out.println("Token:" + palabras + " es una palabra reservada");
        }
        if (palabras.equals("case")) {
            System.out.println("Token: " + palabras + " es una palabra reservada");
        }
        if (palabras.equals("public")) {
            System.out.println("Token: " + palabras + " es una palabra reservada");
        }
        if (palabras.equals("private")) {
            System.out.println("Token:" + palabras + " es una palabra reservada");
        }
        if (palabras.equals("protected")) {
            System.out.println("Token:" + palabras + " es una palabra reservada");
        }
        if (palabras.equals("static")) {
            System.out.println("Token: " + palabras + " es una palabra reservada");
        }
        if (palabras.equals("void")) {
            System.out.println("Token:" + palabras + " es una palabra reservada");
        }
    }

    public void operadores_aritmeticos(String palabras) {
        if (palabras.equals("-")) {
            System.out.println("Token:" + palabras + " es un operador aritmetico");
        }
        if (palabras.equals("+")) {
            System.out.println("Token:" + palabras + " es un operador aritmetico");
        }
        if (palabras.equals("*")) {
            System.out.println("Token:" + palabras + " es un operador aritmetico");
        }
        if (palabras.equals("/")) {
            System.out.println("Token:" + palabras + " es un operador aritmetico");
        }
        if (palabras.equals("=")) {
            System.out.println("Token:" + palabras + " es un operador aritmetico");
        }
    }

    public void identificador(String palabras) {
        if (palabras.matches("[a-zA-Z0-9_]+") 
            && !palabras.equals("int") 
            && !palabras.equals("abstract") 
            && !palabras.equals("boolean")
            && !palabras.equals("byte")
            && !palabras.equals("char")
            && !palabras.equals("class")
            && !palabras.equals("boolean")
            && !palabras.equals("break")
            && !palabras.equals("enum")
            && !palabras.equals("final")
            && !palabras.equals("case")
            && !palabras.equals("switch")
            && !palabras.equals("do")
            && !palabras.equals("while")
            && !palabras.equals("if")
            && !palabras.equals("else")
            && !palabras.equals("float")
            && !palabras.equals("interface")
            && !palabras.equals("long")
            && !palabras.equals("native")
            && !palabras.equals("private")
            && !palabras.equals("protected")
                ){
            System.out.println("Token: " + palabras + " es una variable");
        }
    }
     
    
    
    public void operadores_logicos(String palabras) {
        if (palabras.equals("<")) {
            System.out.println("Token: " + palabras + " es un operador logico");
        }
        if (palabras.equals(">")) {
            System.out.println("Token: " + palabras + " es un operador logico");
        }
        if (palabras.equals("==")) {
            System.out.println("Token: " + palabras + " es un operador logico");
        }
        if (palabras.equals("<=")) {
            System.out.println("Token: " + palabras + " es un operador logico");
        }
        if (palabras.equals(">=")) {
            System.out.println("Token: " + palabras + " es un operador logico");
        }
        if (palabras.equals("!=")) {
            System.out.println("Token: " + palabras + " es un operador logico");
        }
    }
    
    public void operadores_relacionales(String palabras){
        if (palabras.equals("&&")){ 
            System.out.println("Token: " + palabras + " es un operdor relacional");
        }
        if (palabras.equals("||")){ 
            System.out.println("Token: " + palabras + " es un operdor relacional");
        }
    }
    
    public void simbolos(int palabras){
        char ascci = (char) palabras;
        if (ascci >= 1 && ascci <=255) {
            System.out.println("Token: " + ascci + " es un simbolo");
        }
    }
}
