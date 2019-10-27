import java.sql.*;
import javax.swing.JOptionPane;
public class JavaConnect {
    
    Connection conn= null;
    public static Connection ConnecrDb(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\code\\Projects\\Bank Manegment projetc using DB _ GUI(java)\\Bank-Manegment-system-project-using-DB-_-GUI-java-\\test.db");
            return conn;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
        
        
    }
}
