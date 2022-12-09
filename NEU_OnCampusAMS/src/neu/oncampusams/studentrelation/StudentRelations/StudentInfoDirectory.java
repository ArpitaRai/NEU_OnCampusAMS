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
    
    
    
    
    
    
}
