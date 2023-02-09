/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemmatriz_1;

/**
 *
 * @author Home
 */
public class EjemMatriz_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declarar e inicializar variables
        
        //String letras;
        int contador=0;
        int m=4;
        String matriz[][] = new String[m][m];
        String myArray[]= {"A","C","D","D","C","A","D","B","C","D","A","B","D","B","B","A"};
        
        
    
        
        
        
        int bandera1=0;
        int bandera2=0;
        int banderaMala1=0;
        int banderaMala2=0;
        
        

        //Se llena la matriz con las letras ingresadas y en sus posiciones
        for(int f=0; f< matriz.length; f++){
            for(int c=0; c < matriz.length; c++){
                matriz[f][c]= myArray[contador];
                contador= contador+1;  
            }  
        }
       
        
        //Reccorrer Diagonal de izquierda a derecha e ir ccomparando la fila con la columna
        for(int f=0; f<matriz.length; f++){
            if(matriz[f][f]  == matriz[0][0] ){
                bandera1=1;
            }
            else banderaMala1=1;
        }
        
    
        
        //Reccorrer Diagonal de derecha a izquierda e ir comparando los números
        for(int f=0; f<matriz.length; f++){
            if(matriz[f][m-1-f] == matriz[0][m-1]){
                bandera2=1;
            }
            else banderaMala2=1;
        }
        
        //Se muestra la matriz llena
        if(bandera1==1 && banderaMala1==0 && bandera2==1 && banderaMala2==0){
            for(int f=0; f< matriz.length; f++){
                for(int c=0; c < matriz.length; c++){
                    System.out.print(matriz[f][c]+ " ");
                    
                }
                System.out.println(" ");
            }
            System.out.println("Se ha detectado el Gen z");           
        }
        else{
            System.out.println("No se ha detectado el Gen z");
        }

        
    }
    
}
