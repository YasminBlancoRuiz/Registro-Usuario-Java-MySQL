/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bienvenidastring;

/**
 3) Declara un String que contenga tu nombre, después muestra un mensaje 
 * de bienvenida por consola. Por ejemplo: si introduzco «Fernando», 
 * me aparezca «Bienvenido Fernando».
 */

import java.util.Scanner;

public class BienvenidaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Se instancia la clase Scanner
        Scanner nombre = new Scanner(System.in);
        
        //Se declara la variable
        String nombres;
        
        //Se captura el nombre del usuario
        System.out.println("Ingrese su nombre: ");
        nombres = nombre.nextLine();
        
        //Se muetra la bienvenida
        System.out.println("<<Bienvenid@ "+ nombres + ">>");
    } 
    
}
