/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numdivisible;

/**
6) Lee un número por teclado e indica si es divisible entre 2 
* (resto = 0). Si no lo es, también debemos indicarlo.
*/

import java.util.Scanner;

public class NumDivisible {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Instancia la clase Scanner
        Scanner numero = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese un numero entero: ");
        num = Integer.parseInt(numero.nextLine()) ;
        
        if(num % 2 == 0){
            System.out.println("El numero "+ num +" es divisible entre dos");
        }
        else{
            System.out.println("El numero "+ num +" no es divisible entre dos");
        }
    }
    
}
