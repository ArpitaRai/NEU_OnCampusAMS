/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neu.oncampusams.studentrelation.StudentRelations;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import neu.oncampusams.databaseConnection.JDBCConnection;
import neu.oncampusams.systemadministration.SystemAdmin.RegistrationDirectory;

/**
 *
 * @author arpitarai
 */
public class WardenDirectory {

    public void registerWardenQuery(WardenInfo wardenInfo) {
        Connection connection = JDBCConnection.Connect();
   try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "INSERT INTO `oncampusamsdb`.`AccQueryTable` " + "(raisedBy, building, description, campus, status, role)" + "VALUES ('" + wardenInfo.getEmailID()
                    + "' , '" + wardenInfo.getBuilding()+ "' , '" + wardenInfo.getDescription()+ "', '" + wardenInfo.getCampus()+ "', '" + wardenInfo.getQueryStatus()+  "', '" + wardenInfo.getRoles()+"');";
            System.out.println(sql + "Query here");
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
