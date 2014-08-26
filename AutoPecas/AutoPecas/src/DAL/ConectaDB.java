package DAL;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConectaDB {

    public static Connection conectadb() throws ClassNotFoundException{
        try{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Clientes","postgres","1020");
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso.");
            
            return con;
            
        }    
        catch(SQLException error){
            
             JOptionPane.showMessageDialog(null,error);       
             
             return null;
        }            
        
    }
}
