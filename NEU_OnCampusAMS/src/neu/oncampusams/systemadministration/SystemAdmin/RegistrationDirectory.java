/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neu.oncampusams.systemadministration.SystemAdmin;

import java.sql.Connection;
import java.sql.ResultSet;
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

//    Registration registration = new Registration();
    public void registerStudent(Registration registration) {

        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "INSERT INTO `oncampusamsdb`.`StudentTable` " + "(fName, lName, password, campus, emailId)" + "VALUES ('" + registration.getFirstName()
                    + "' , '" + registration.getLastName() + "' , '" + registration.getPassword() + "', '" + registration.getCampus() + "',  '" + registration.getEmailID() + "');";
            System.out.println(sql + "Query here");
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

    public void registerAccoAdmin(Registration registration) {

        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "INSERT INTO `oncampusamsdb`.`accomodationadmintable` " + "(fName, lName, password, campus, emailId)" + "VALUES ('" + registration.getFirstName()
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

    public Registration findDetails(Registration registration) {
        String sql = null;
        Connection connection = JDBCConnection.Connect();
        System.out.println("Head system admin: " + registration.getRoles());

        try {
            Statement statement = (Statement) connection.createStatement();
            if ("Student".equals(registration.getRoles())) {
                sql = "SELECT * FROM `oncampusamsdb`.`StudentTable` where emailId ='" + registration.getEmailID() + "'";
            }
            if ("Head System Admin".equals(registration.getRoles())) {
                sql = "SELECT * FROM `oncampusamsdb`.`HeadSysAdmin` where emailId ='" + registration.getEmailID() + "'";
            }
            if ("System Admin".equals(registration.getRoles())) {
                sql = "SELECT * FROM `oncampusamsdb`.`SysAdminTable` where emailId ='" + registration.getEmailID() + "'";
            }
            if ("Campus Admin".equals(registration.getRoles())) {
                sql = "SELECT * FROM `oncampusamsdb`.`CampusAdminTable` where emailId ='" + registration.getEmailID() + "'";
            }
            if ("Building Admin".equals(registration.getRoles())) {
                sql = "SELECT * FROM `oncampusamsdb`.`accomodationadmintable` where emailId ='" + registration.getEmailID() + "'";
            }
            if ("Warden".equals(registration.getRoles())) {
                sql = "SELECT * FROM `oncampusamsdb`.`WardenTable` where emailId ='" + registration.getEmailID() + "'";
            }
            if ("Mailing Services Admin".equals(registration.getRoles())) {
                sql = "SELECT * FROM `oncampusamsdb`.`MailAdminTable` where emailId ='" + registration.getEmailID() + "'";

            }

            ResultSet resultSet = statement.executeQuery(sql);
            registration = new Registration();
            while (resultSet.next()) {
                registration.setFirstName(resultSet.getString("fName"));
                registration.setLastName(resultSet.getString("lName"));
                registration.setPassword(resultSet.getString("password"));
                registration.setCampus(resultSet.getString("campus"));

            }
            return registration;
        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void updateStudent(Registration registration) {

        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "UPDATE `oncampusamsdb`.`StudentTable` SET fName = '" + registration.getFirstName() + "' ,lName = '" + registration.getLastName()
                    + "' ,campus = '" + registration.getCampus() + "' ,password = '" + registration.getPassword() + "' where emailId ='" + registration.getEmailID() + "'";
            System.out.println("sql update student: " + sql);
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateHeadSystemAdmin(Registration registration) {
        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "UPDATE `oncampusamsdb`.`HeadSysAdmin` SET fName = '" + registration.getFirstName() + "' ,lName = '" + registration.getLastName()
                    + "' ,campus = '" + registration.getCampus() + "' ,password = '" + registration.getPassword() + "' where emailId ='" + registration.getEmailID() + "'";
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateSystemAdmin(Registration registration) {

        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "UPDATE `oncampusamsdb`.`SysAdminTable` SET fName = '" + registration.getFirstName() + "' ,lName = '" + registration.getLastName()
                    + "' ,campus = '" + registration.getCampus() + "' ,password = '" + registration.getPassword() + "' where emailId ='" + registration.getEmailID() + "'";
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateCampusAdmin(Registration registration) {

        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "UPDATE `oncampusamsdb`.`CampusAdminTable` SET fName = '" + registration.getFirstName() + "' ,lName = '" + registration.getLastName()
                    + "' ,campus = '" + registration.getCampus() + "' ,password = '" + registration.getPassword() + "' where emailId ='" + registration.getEmailID() + "'";
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateBuildingAdmin(Registration registration) {

        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "UPDATE `oncampusamsdb`.`BuildingTable` SET fName = '" + registration.getFirstName() + "' ,lName = '" + registration.getLastName()
                    + "' ,campus = '" + registration.getCampus() + "' ,password = '" + registration.getPassword() + "' where emailId ='" + registration.getEmailID() + "'";
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateWarden(Registration registration) {

        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "UPDATE `oncampusamsdb`.`WardenTable` SET fName = '" + registration.getFirstName() + "' ,lName = '" + registration.getLastName()
                    + "' ,campus = '" + registration.getCampus() + "' ,password = '" + registration.getPassword() + "' where emailId ='" + registration.getEmailID() + "'";
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateMailAdmin(Registration registration) {

        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "UPDATE `oncampusamsdb`.`MailAdminTable` SET fName = '" + registration.getFirstName() + "' ,lName = '" + registration.getLastName()
                    + "' ,campus = '" + registration.getCampus() + "' ,password = '" + registration.getPassword() + "' where emailId ='" + registration.getEmailID() + "'";
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void deleteStudent(Registration registration) {
        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "DELETE FROM `oncampusamsdb`.`StudentTable` where emailId ='" + registration.getEmailID() + "'";
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void deleteHeadSystemAdmin(Registration registration) {
        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "DELETE FROM `oncampusamsdb`.`HeadSysAdmin` where emailId ='" + registration.getEmailID() + "'";
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void deleteSystemAdmin(Registration registration) {
        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "DELETE FROM `oncampusamsdb`.`SysAdminTable` where emailId ='" + registration.getEmailID() + "'";
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void deleteCampusAdmin(Registration registration) {
        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "DELETE FROM `oncampusamsdb`.`CampusAdminTable` where emailId ='" + registration.getEmailID() + "'";
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void deleteBuildingAdmin(Registration registration) {
        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "DELETE FROM `oncampusamsdb`.`BuildingTable` where emailId ='" + registration.getEmailID() + "'";
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void deleteWarden(Registration registration) {
        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "DELETE FROM `oncampusamsdb`.`WardenTable` where emailId ='" + registration.getEmailID() + "'";
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void deleteMailAdmin(Registration registration) {
        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "DELETE FROM `oncampusamsdb`.`MailAdminTable` where emailId ='" + registration.getEmailID() + "'";
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
