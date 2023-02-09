/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemarreglo2;

/**
 *
 * @author Home
 */
public class EjemArreglo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Mostrar el arreglo de mayor valor
        
        int f=0;
        int myArreglo[] =  {13, 2, 4, 35, 1};
        int Mayor = myArreglo[0];
        //int static []myArrglo = {13,2, 4, 35, 1};
        
        /*for(f = 0; f < myArreglo.length; f++){
            for(c = 0; c < myArreglo.length; c++){
                if(myArreglo[f] > myArreglo[c]){
                    Mayor=myArreglo[f];
                }
                else{
                    Mayor=myArreglo[c];
                }
            }
            System.out.println(Mayor);
        }
        */
        for(f = 0; f < myArreglo.length; f++){
            if(myArreglo[f] > Mayor){
                Mayor = myArreglo[f];
            }
        }
            
        System.out.println(Mayor);
        
    }
    
}
