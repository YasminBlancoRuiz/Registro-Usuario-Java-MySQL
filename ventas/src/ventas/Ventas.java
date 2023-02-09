/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventas;

/*
13: Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá tantas 
ventas por teclado como número de ventas se hayan indicado. Al final mostrara la suma de todas 
las ventas. Piensa que es lo que se repite y lo que no. */


import java.util.Scanner;

public class Ventas {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Instanciamos el scanner
        Scanner ventas = new Scanner(System.in);
        
        //Declaro variables
        double suma=0, valor=0;
        int cantidad;
        
        System.out.println("Ingrese la cantidad de ventas: ");
        cantidad = Integer.parseInt(ventas.nextLine());
        
        for(int i=1; i<=cantidad; i++){
            System.out.println("Ingrese valor de la venta: "+i);
            valor = Double.parseDouble(ventas.nextLine());
            
            //Acumulo el valor de las ventas
            suma = suma + valor;   
        }
        //Imprimo el valor total de las ventas
        System.out.println("La suma total de las ventas es: " + suma);
        
    }
    
}
