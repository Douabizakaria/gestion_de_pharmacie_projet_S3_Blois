package main;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;


public class Connection {
    public static java.sql.Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pharmacie","root","");
            if(con!=null)return con ;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
        }
        return null ;
    }
}


