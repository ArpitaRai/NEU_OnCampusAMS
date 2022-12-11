/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neu.oncampusams.campusadministration.CampusAdmin;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import neu.oncampusams.databaseConnection.JDBCConnection;

/**
 *
 * @author Yamini Manral
 */
public class CampusAdminInfoDirectory {
    
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
    
    public void updateAccoAdmin(){
        
    }
}
