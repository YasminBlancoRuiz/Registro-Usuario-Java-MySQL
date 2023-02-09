/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciomayor;


import java.util.Scanner;

/**
 *
 * @author Home
 */


//Lee un número por teclado y comprueba que este numero es mayor o igual que cero, 
//si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
public class EjercicioMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instancia el objeto
        
        Scanner mayor = new Scanner(System.in);
        
        int numero;
        

        
        do{
            System.out.println("Ingrese un numero mayor o igual a cero: ");
            numero = Integer.parseInt(mayor.nextLine());
            if(numero >=0){
                System.out.println(" El numero = " + numero);
            }
        }
        while(numero <0); 
    }
}
