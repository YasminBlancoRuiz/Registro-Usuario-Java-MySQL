/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebabd;

/**
 *
 * @author Home
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionMysql {
    
    Connection cn;
    
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/pruebabd2","root","123");
            System.out.println("CONECTADO");
        
        }
        catch(Exception e){
            System.out.println("NO CONECTADO"+e);
        
        }
        
        return cn;
        
    }
    
}
