/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neu.oncampusams.studentrelation.StudentRelations;

/**
 *
 * @author srushtyr
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import neu.oncampusams.databaseConnection.JDBCConnection;

public class StudentInfoDirectory {
    
    StudentInfo student = new StudentInfo();
    
    
    public void updateStudentInfo(StudentInfo student){
    
    Connection connection = JDBCConnection.Connect();
        try {
            PreparedStatement  pst = connection.prepareStatement("update StudentTable set personalEmailId = ?, password = ?, phone = ? where emailId = ?");
            pst.setString(1, student.getPersonalEmailId());
            pst.setString(2,student.getPassword());
            pst.setString(3,student.getPhone());
            pst.setString(4,student.getEmailId());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static StudentInfo getStudentInfo(String emailId){
      Connection connection = JDBCConnection.Connect();
      StudentInfo student = new StudentInfo();
      
        try {
            PreparedStatement  pst = connection.prepareStatement("SELECT emailId,personalEmailId,password,phone from StudentTable where emailId = ?");
            pst.setString(1, emailId);
            
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                
                student.setEmailId(resultSet.getString(1));
                student.setPersonalEmailId(resultSet.getString(2));
                student.setPassword(resultSet.getString(3));
                student.setPhone(resultSet.getString(4));
                
            }
        return student;
        
        
        } catch (SQLException ex) {
            Logger.getLogger(StudentInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
            
      
      return null;
      
    }
    
    public static double calculateTotalCost(int pringlessNo,int caesarNo, int cokeNo, int spriteNo ){
        
        double total = 0;
        double pringless = 1.50;
        double caesar = 4.50;
        double coke = 1.0;
        double sprite = 1.0;
        
        total = (pringless * pringlessNo) + (caesar * caesarNo) + (coke * cokeNo) + (sprite * spriteNo);
        
        return total;
    }
    
    public static StudentInfo getStudentHuskyD(String emailId){
      Connection connection = JDBCConnection.Connect();
      StudentInfo student = new StudentInfo();
      
        try {
            PreparedStatement  pst = connection.prepareStatement("SELECT emailId,huskyDollars from StudentTable where emailId = ?");
            pst.setString(1, emailId);
            
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                
                student.setEmailId(resultSet.getString(1));
                student.setHuskyDollars(Double.parseDouble(resultSet.getString(2)));
         
            }
        return student;
        
        
        } catch (SQLException ex) {
            Logger.getLogger(StudentInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
            
      
      return null;
      
    }
    
    public void updateHuskyDollars(double dlr,String emailId){
    
    Connection connection = JDBCConnection.Connect();
        try {
            PreparedStatement  pst = connection.prepareStatement("update StudentTable set huskyDollars = ? where emailId = ?");
            pst.setDouble(1, dlr);
            pst.setString(2,emailId);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void addFinanceQuery(String emailId,String description){
        
        Connection connection = JDBCConnection.Connect();
        String status = "Query Raised";
        String role = "Student";
        
        try {
            PreparedStatement  pst = connection.prepareStatement("insert into FinanceQueryTable (raisedBy,status,description,role) values(?,?,?,?)");
            pst.setString(1,emailId);
            pst.setString(2, status);
            pst.setString(3, description);
            pst.setString(4,role);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    public void addMailQuery(String emailId,String description,String contact){
        
        Connection connection = JDBCConnection.Connect();
        String status = "Query Raised";
        String role = "Student";
        
        try {
            PreparedStatement  pst = connection.prepareStatement("insert into MailPkQueryTable (raisedBy,status,description,role,contact) values(?,?,?,?,?)");
            pst.setString(1,emailId);
            pst.setString(2, status);
            pst.setString(3, description);
            pst.setString(4,role);
            pst.setString(5,contact);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
   
    public void addHouseKeepingQuery(String emailId,String description,String contact){
        
        Connection connection = JDBCConnection.Connect();
        String status = "Query Raised";
        String role = "Student";
        StudentInfo std = getStudentInfo(emailId);
        int wardenId = std.getWardenId();
        System.out.println(wardenId+" c");
        String wardenEmail = getWardenInfo(wardenId);
        
        
        try {
            PreparedStatement  pst = connection.prepareStatement("insert into WardenQueryTable (raisedBy,status,description,role,contact,wardenEmail) values(?,?,?,?,?,?)");
            pst.setString(1,emailId);
            pst.setString(2, status);
            pst.setString(3, description);
            pst.setString(4,role);
            pst.setString(5,contact);
            pst.setString(6,wardenEmail);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    public void addRoomChangeQuery(String emailId,String description,String roomType){
        
        Connection connection = JDBCConnection.Connect();
        String status = "Query Raised";
        String role = "Student";
        
        
        try {
            PreparedStatement  pst = connection.prepareStatement("insert into AccQueryTable (raisedBy,status,description,role,roomType) values(?,?,?,?,?)");
            pst.setString(1,emailId);
            pst.setString(2, status);
            pst.setString(3, description);
            pst.setString(4,role);
            pst.setString(5,roomType);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    public String getWardenInfo(int wardenId){
      Connection connection = JDBCConnection.Connect();
      String wardenEmail = "";
      
        try {
            PreparedStatement  pst = connection.prepareStatement("SELECT wardenId,emailId from WardenTable where wardenId = ?");
            pst.setInt(1, wardenId);
            
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                
                wardenEmail = resultSet.getString(2);
                
                
            }
        return wardenEmail;
        
        
        } catch (SQLException ex) {
            Logger.getLogger(StudentInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
            
      
      return null;
      
    }
    
    
    
    
}
