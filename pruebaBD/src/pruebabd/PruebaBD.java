/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebabd;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Home
 */
public class PruebaBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          //Crear instancia a Mysql a la conexion de la base de datos
    
            ConexionMysql con=new ConexionMysql();

            Connection cn= con.conectar();
        
    
        
    }
    
}
