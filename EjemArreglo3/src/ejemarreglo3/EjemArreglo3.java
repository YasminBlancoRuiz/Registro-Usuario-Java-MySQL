/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemarreglo3;

/**
 *
 * @author Home
 */
public class EjemArreglo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int myArray[] = {1, 2, 1, 3, 3, 1, 2, 1, 5, 1};
      
        
        String suma1 ="";
        String suma2 ="";
        String suma3 ="";
        String suma4 ="";
        String suma5 ="";
        var numeroTexto ="";
        
        for(int i=0; i< myArray.length; i++){
            /*if(myArray[i] == 1){
                suma1=suma1+"*";
            }
            else if(myArray[i] == 2){
                suma2=suma2+"*";
            }
            else if(myArray[i] == 3){
                suma3=suma3+"*";
            }
            else if(myArray[i] == 4){
                suma4=suma4+"*";
            }
            else if(myArray[i] == 5){
                suma5=suma5+"*";
            }
            */
            
         switch(myArray[i]){
            case 1 -> suma1=suma1+"*";
            case 2 -> suma2=suma2+"*";
            case 3 -> suma3=suma3+"*";
            case 4 -> suma4=suma4+"*";
            case 5 -> suma5=suma5+"*";
            default -> numeroTexto="Caso no encontrado";
        }
            
            System.out.println("1:" + suma1);
            System.out.println(myArray[i]);
        }
        
        
        
        
    }
    
}
