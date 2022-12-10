/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neu.oncampusams.campusadministration.CampusAdmin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import neu.oncampusams.databaseConnection.JDBCConnection;


/**
 *
 * @author srushtyr
 */
public class AccomodationAdminInfoDirectory {
    
    AccomodationAdminInfo accAdmin = new AccomodationAdminInfo();
    
    public void updateQueryTable(String note, String status, int queryId){
    
    Connection connection = JDBCConnection.Connect();
        try {
            PreparedStatement  pst = connection.prepareStatement("update AccQueryTable set note = ?, status = ? where queryId = ?");
            pst.setString(1, note);
            pst.setString(2,status);
            pst.setInt(3,queryId);
            pst.executeUpdate();
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccomodationAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   public static boolean checkBuildingName(String buildingName) {
        Connection connection = JDBCConnection.Connect();
        boolean validation = true;
         try {
            PreparedStatement  pst = connection.prepareStatement("SELECT buildingName from BuildingTable where buildingName = ?");
            pst.setString(1, buildingName);
            ResultSet resultSet = pst.executeQuery();
            //System.out.println(resultSet);
            if (resultSet.next()) {
                validation = false;
            }
            return validation;
         } catch (SQLException ex) {
              Logger.getLogger(AccomodationAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
         }
         return validation;
    } 
    
    
}
