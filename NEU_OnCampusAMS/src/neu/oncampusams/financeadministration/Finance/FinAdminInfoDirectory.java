/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neu.oncampusams.financeadministration.Finance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import neu.oncampusams.campusadministration.CampusAdmin.AccomodationAdminInfoDirectory;
import neu.oncampusams.databaseConnection.JDBCConnection;

/**
 *
 * @author Yamini Manral
 */
public class FinAdminInfoDirectory {
    
    public void updateQueryTable(String note, String status, int queryId){
    
    Connection connection = JDBCConnection.Connect();
        try {
            PreparedStatement  pst = connection.prepareStatement("update financequerytable set note = ?, status = ? where queryId = ?");
            pst.setString(1, note);
            pst.setString(2,status);
            pst.setInt(3,queryId);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccomodationAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
