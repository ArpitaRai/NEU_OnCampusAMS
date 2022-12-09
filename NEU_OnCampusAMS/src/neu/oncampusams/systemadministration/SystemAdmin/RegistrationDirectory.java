/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neu.oncampusams.systemadministration.SystemAdmin;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import neu.oncampusams.databaseConnection.JDBCConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arpitarai
 */
public class RegistrationDirectory {

    Registration registration = new Registration();

    public void registerStudent(Registration registration) {

        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "INSERT INTO `oncampusamsdb`.`StudentTable` " + "(fName, lName, password, campus, emailId)" + "VALUES ('" + registration.getFirstName()
                    + "' , '" + registration.getLastName() + "' , '" + registration.getPassword() + "', '" + registration.getCampus() + "',  '" + registration.getEmailID() + "');";
            System.out.println(sql+ "Query here");
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void registerHeadSystemAdmin(Registration registration) {

        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "INSERT INTO `oncampusamsdb`.`HeadSysAdmin` " + "(fName, lName, password, campus, emailId)" + "VALUES ('" + registration.getFirstName()
                    + "' , '" + registration.getLastName() + "' , '" + registration.getPassword() + "', '" + registration.getCampus() + "',  '" + registration.getEmailID() + "');";
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void registerSystemAdmin(Registration registration) {

        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "INSERT INTO `oncampusamsdb`.`SysAdminTable` " + "(fName, lName, password, campus, emailId)" + "VALUES ('" + registration.getFirstName()
                    + "' , '" + registration.getLastName() + "' , '" + registration.getPassword() + "', '" + registration.getCampus() + "',  '" + registration.getEmailID() + "');";
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void registerCampusAdmin(Registration registration) {

        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "INSERT INTO `oncampusamsdb`.`CampusAdminTable` " + "(fName, lName, password, campus, emailId)" + "VALUES ('" + registration.getFirstName()
                    + "' , '" + registration.getLastName() + "' , '" + registration.getPassword() + "', '" + registration.getCampus() + "',  '" + registration.getEmailID() + "');";
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
            
    public void registerBuildingAdmin(Registration registration) {

        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "INSERT INTO `oncampusamsdb`.`BuildingAdminTable` " + "(fName, lName, password, campus, emailId)" + "VALUES ('" + registration.getFirstName()
                    + "' , '" + registration.getLastName() + "' , '" + registration.getPassword() + "', '" + registration.getCampus() + "',  '" + registration.getEmailID() + "');";
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public void registerWarden(Registration registration) {

        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "INSERT INTO `oncampusamsdb`.`WardenTable` " + "(fName, lName, password, campus, emailId)" + "VALUES ('" + registration.getFirstName()
                    + "' , '" + registration.getLastName() + "' , '" + registration.getPassword() + "', '" + registration.getCampus() + "',  '" + registration.getEmailID() + "');";
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public void registerMailAdmin(Registration registration) {

        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "INSERT INTO `oncampusamsdb`.`MailAdminTable` " + "(fName, lName, password, campus, emailId)" + "VALUES ('" + registration.getFirstName()
                    + "' , '" + registration.getLastName() + "' , '" + registration.getPassword() + "', '" + registration.getCampus() + "',  '" + registration.getEmailID() + "');";
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

}
