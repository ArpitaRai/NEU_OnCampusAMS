/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neu.oncampusams.campusadministration.CampusAdmin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import neu.oncampusams.databaseConnection.JDBCConnection;
import neu.oncampusams.systemadministration.SystemAdmin.RegistrationDirectory;

/**
 *
 * @author Yamini Manral
 */
public class CampusAdminInfoDirectory {
    CampusAdminInfo campusAdminInfo= new CampusAdminInfo();
    
    public void addGym(CampusAdminInfo gym) {

        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "INSERT INTO `oncampusamsdb`.`gym` " + "(name, location, contact, gym_admin)" + "VALUES ('" + gym.getGym_name() + "' , '" + gym.getGym_location() + "', '" + gym.getGym_contact() + "',  '" + gym.getGym_admin() + "');";
            System.out.println(sql + "Query here");
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(CampusAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addCanteen(CampusAdminInfo canteen) {

        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "INSERT INTO `oncampusamsdb`.`canteen` " + "(name, location, contact, canteen_admin)" + "VALUES ('" + canteen.getCanteen_name() + "' , '" + canteen.getCanteen_location() + "', '" + canteen.getCanteen_contact() + "',  '" + canteen.getCanteen_admin() + "');";
            System.out.println(sql + "Query here");
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(CampusAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addBuilding(CampusAdminInfo building) {

        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "INSERT INTO oncampusamsdb.buildingtable (buildingName, campus, 1bhkAvail, 2bhkAvail, sharedAvail, studentResiding)" + "VALUES ('" + building.getBuilding_name() 
                    + "' , '" + building.getCampus() + "', '" + building.getOnebhk() + "',  '" + building.getTwobhk() 
                    + "', '" + building.getShared() + "', '" + building.getResiding() + "');";
            System.out.println(sql + "Query here");
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(CampusAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   

    public CampusAdminInfo autoPopulateUpdate(String email) {
        String emailID = email;
        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "SELECT password, phone from oncampusamsdb.CampusAdminTable where emailId = '" + emailID + "'";
            System.out.println("sql update student: " + sql);
            ResultSet resultSet = statement.executeQuery(sql);
            campusAdminInfo = new CampusAdminInfo();
            while (resultSet.next()) {
                campusAdminInfo.setPhone(resultSet.getString("phone"));
                campusAdminInfo.setPassword(resultSet.getString("password"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return campusAdminInfo;
    }

    public void updateCampusAdminDetails(CampusAdminInfo campusAdminInfo) {
            Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "UPDATE `oncampusamsdb`.`CampusAdminTable` SET phone = '" + campusAdminInfo.getPhone() + "' ,password = '" + campusAdminInfo.getPassword()
                    + "' where emailId ='" + campusAdminInfo.getEmailID() + "'";
            System.out.println("sql update student: " + sql);
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
