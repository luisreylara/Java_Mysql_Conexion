
package mierccolesxd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    
    String basededatos="admin_default";
    String usuario= "admin_luis";
    String pass="2023";
    String cadena="jdbc:mysql://datamoviles.tk:3306/";
    Connection cx;
    
    public Connection conectar(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //con = DriverManager.getConnection("jdbc:mysql://129.213.117.192:3306/admin_default","admin_default","121212");
            cx=DriverManager.getConnection(cadena+basededatos,usuario,pass);
            System.out.println("SI se conecto");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("NO se conecto");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cx;
        
    }
    
    public void desconectar(){
        try {
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
 //   public static void main(String[] args) {
 //       Conexion miconexion = new Conexion();
 //       miconexion.conectar();          
 //   }
    
}
