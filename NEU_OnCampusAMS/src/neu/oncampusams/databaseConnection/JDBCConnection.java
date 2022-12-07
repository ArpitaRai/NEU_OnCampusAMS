/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neu.oncampusams.databaseConnection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author srushtyr
 */
public class JDBCConnection {
    public static Connection Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/oncampusamsdb", "root", "root");
        } catch (ClassNotFoundException | SQLException exception) {
            return null;
        }
    }   
    
}
