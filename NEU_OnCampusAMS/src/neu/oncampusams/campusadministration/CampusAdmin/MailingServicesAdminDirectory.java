package neu.oncampusams.campusadministration.CampusAdmin;

import neu.oncampusams.campusadministration.CampusAdmin.MailingServicesAdminInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import neu.oncampusams.databaseConnection.JDBCConnection;
import neu.oncampusams.systemadministration.SystemAdmin.RegistrationDirectory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arpitarai
 */
public class MailingServicesAdminDirectory {

    MailingServicesAdminInfo mailingServicesAdminInfo;

    MailingServicesAdminInfo mailAdmin = new MailingServicesAdminInfo();

    public static MailingServicesAdminInfo getMailAdminInfo(String emailId) {

        Connection connection = JDBCConnection.Connect();
        MailingServicesAdminInfo mailAdmin = new MailingServicesAdminInfo();

        try {
            PreparedStatement pst = connection.prepareStatement("SELECT emailId,password,phone from MailAdminTable where emailId = ?");
            pst.setString(1, emailId);

            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {

                mailAdmin.setEmailID(resultSet.getString(1));
                mailAdmin.setPassword(resultSet.getString(2));
                mailAdmin.setPhone(resultSet.getString(3));

            }
            return mailAdmin;

        } catch (SQLException ex) {
            Logger.getLogger(MailingServicesAdminDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public void updateMailAdminInfo(MailingServicesAdminInfo mailAdmin) {

        Connection connection = JDBCConnection.Connect();
        try {
            PreparedStatement pst = connection.prepareStatement("update MailAdminTable set password = ?, phone = ? where emailId = ?");
            pst.setString(1, mailAdmin.getPassword());
            pst.setString(2, mailAdmin.getPhone());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MailingServicesAdminDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public MailingServicesAdminInfo autoPopulateUpdate(String emailID) {
        String email = emailID;
        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "SELECT password, phone from oncampusamsdb.MailAdminTable where emailId = '" + email + "'";
            System.out.println("sql update student: " + sql);
            ResultSet resultSet = statement.executeQuery(sql);
            mailingServicesAdminInfo = new MailingServicesAdminInfo();
            while (resultSet.next()) {
                mailingServicesAdminInfo.setPhone(resultSet.getString("phone"));
                mailingServicesAdminInfo.setPassword(resultSet.getString("password"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mailingServicesAdminInfo;
    }

    public void updateAdminDetails(MailingServicesAdminInfo mailingServicesAdminInfo) {
        Connection connection = JDBCConnection.Connect();
        try {
            Statement statement = (Statement) connection.createStatement();
            String sql = "UPDATE `oncampusamsdb`.`MailAdminTable` SET phone = '" + mailingServicesAdminInfo.getPhone() + "' ,password = '" + mailingServicesAdminInfo.getPassword()
                    + "' where emailId ='" + mailingServicesAdminInfo.getEmailID() + "'";
            System.out.println("sql update student: " + sql);
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(RegistrationDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
