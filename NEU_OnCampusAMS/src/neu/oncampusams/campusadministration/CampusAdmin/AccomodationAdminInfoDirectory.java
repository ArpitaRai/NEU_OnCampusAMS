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
    public void assignWardenInBuilding(String wardenEmail,String buildingName){
    
    Connection connection = JDBCConnection.Connect();
        try {
            PreparedStatement  pst = connection.prepareStatement("update BuildingTable set wardenAssigned = ? where buildingName = ?");
            pst.setString(1, wardenEmail);
            pst.setString(2,buildingName);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccomodationAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void assignBuildingInWarden(String wardenEmail,String buildingName){
    
    Connection connection = JDBCConnection.Connect();
        try {
            PreparedStatement  pst = connection.prepareStatement("update WardenTable set buildingName = ? where emailId = ?");
            pst.setString(1, buildingName);
            pst.setString(2,wardenEmail);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccomodationAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void assignWardenInStudent(String wardenEmail,String buildingName){
    
    Connection connection = JDBCConnection.Connect();
    int wardenId = getWardenId(wardenEmail);
        try {
            PreparedStatement  pst = connection.prepareStatement("update StudentTable set wardenId = ? where buildingName = ?");
            pst.setInt(1,wardenId);
            pst.setString(2, buildingName);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccomodationAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getWardenId(String wardenEmail){
    
    Connection connection = JDBCConnection.Connect();
    int wardenId = 0;
        try {
            PreparedStatement  pst = connection.prepareStatement("select wardenId from WardenTable where emailId = ?");
            pst.setString(1,wardenEmail);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                wardenId = rs.getInt("wardenId");
            }
            return wardenId;
        } catch (SQLException ex) {
            Logger.getLogger(AccomodationAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return wardenId;
    }
    
    public void assignRoomDetails(String stdEmail,String buildingName, String roomType){
    
        Connection connection = JDBCConnection.Connect();
        String wardenEmail = getWardenEmailFromBuilding(buildingName);
        int wardenId = getWardenId(wardenEmail);
    
        try {
            PreparedStatement  pst = connection.prepareStatement("update StudentTable set buildingName = ?, roomType = ?, wardenId = ? where emailId = ?");
            pst.setString(1,buildingName);
            pst.setString(2, roomType);
            pst.setInt(3, wardenId);
            pst.setString(4, stdEmail);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccomodationAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void changeAvailability(String stdEmail, String buildingName, String roomType){
        Connection connection = JDBCConnection.Connect();
        String[] prevStdInfo = getStudentRoomInfo(stdEmail);
         String prevRoomType = prevStdInfo[0];
         String prevBuildingName = prevStdInfo[1];
         String prevRoomNo = prevStdInfo[2];
         int[] roomAvailInfo = getRoomAvail(buildingName, roomType);
         int roomAvail = roomAvailInfo[0]-1;
         int totAvail = roomAvailInfo[1]-1;
         int stdRes = roomAvailInfo[2]+1;
         System.out.println(roomAvail);
         System.out.println(prevRoomType);
         int[] prevRoomAvailInfo = getRoomAvail(prevBuildingName, prevRoomType);
         int prevRoomAvail = prevRoomAvailInfo[0]+1;
         int prevTotAvail = prevRoomAvailInfo[1]+1;
         int prevStdRes = prevRoomAvailInfo[2]-1;
        if(prevRoomType.equals("a") && prevBuildingName.equals("a") && prevRoomNo.equals("a")){
            if(roomType.equals("1 BHK")){
                try {
            PreparedStatement  pst = connection.prepareStatement("update BuildingTable set 1BhkAvail = ?, totalAvail = ? where buildingName = ?");
            pst.setInt(1,roomAvail);
            pst.setInt(2, totAvail);
            pst.setString(3, buildingName);
            pst.executeUpdate();
            System.out.println("yes");
        } catch (SQLException ex) {
            Logger.getLogger(AccomodationAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
            else if(roomType.equals("2 BHK")){
                try {
            PreparedStatement  pst = connection.prepareStatement("update BuildingTable set 2BhkAvail = ?, totalAvail = ? where buildingName = ?");
            pst.setInt(1,roomAvail);
            pst.setInt(2, totAvail);
            pst.setString(3, buildingName);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccomodationAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
            else if(roomType.equals("Shared")){
                try {
            PreparedStatement  pst = connection.prepareStatement("update BuildingTable set sharedAvail = ?, totalAvail = ? where buildingName = ?");
            pst.setInt(1,roomAvail);
            pst.setInt(2, totAvail);
            pst.setString(3, buildingName);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccomodationAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
            }  
        }
        else {
           if(prevRoomType.equals("1 BHK")){
                try {
            PreparedStatement  pst = connection.prepareStatement("update BuildingTable set 1BhkAvail = ?, totalAvail = ? where buildingName = ?");
            pst.setInt(1,prevRoomAvail);
            pst.setInt(2, prevTotAvail);
            pst.setString(3, prevBuildingName);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccomodationAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
            else if(prevRoomType.equals("2 BHK")){
                try {
            PreparedStatement  pst = connection.prepareStatement("update BuildingTable set 2BhkAvail = ?, totalAvail = ? where buildingName = ?");
            pst.setInt(1,prevRoomAvail);
            pst.setInt(2, prevTotAvail);
            pst.setString(3, prevBuildingName);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccomodationAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
            else if(prevRoomType.equals("Shared")){
                try {
            PreparedStatement  pst = connection.prepareStatement("update BuildingTable set sharedAvail = ?, totalAvail = ? where buildingName = ?");
            pst.setInt(1,prevRoomAvail);
            pst.setInt(2, prevTotAvail);
            pst.setString(3, prevBuildingName);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccomodationAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
           if(roomType.equals("1 BHK")){
                try {
            PreparedStatement  pst = connection.prepareStatement("update BuildingTable set 1BhkAvail = ?, totalAvail = ? where buildingName = ?");
            pst.setInt(1,roomAvail);
            pst.setInt(2, totAvail+1);
            pst.setString(3, buildingName);
            pst.executeUpdate();
            System.out.println("yes");
        } catch (SQLException ex) {
            Logger.getLogger(AccomodationAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
            else if(roomType.equals("2 BHK")){
                try {
            PreparedStatement  pst = connection.prepareStatement("update BuildingTable set 2BhkAvail = ?, totalAvail = ? where buildingName = ?");
            pst.setInt(1,roomAvail);
            pst.setInt(2, totAvail+1);
            pst.setString(3, buildingName);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccomodationAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
            else if(roomType.equals("Shared")){
                try {
            PreparedStatement  pst = connection.prepareStatement("update BuildingTable set sharedAvail = ?, totalAvail = ? where buildingName = ?");
            pst.setInt(1,roomAvail);
            pst.setInt(2, totAvail+1);
            pst.setString(3, buildingName);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccomodationAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
           
        }
        
    }
    
    
    
    
    public String[] getStudentRoomInfo(String stdEmail){
    
    Connection connection = JDBCConnection.Connect();
    String roomType = "";
    String buildingName = "";
    String roomNo = "";
    String[] stdInfo= {roomType,buildingName,roomNo};
        try {
            PreparedStatement  pst = connection.prepareStatement("select * from StudentTable where EmailId = ?");
            pst.setString(1,stdEmail);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                roomType = rs.getString("roomType");
                buildingName = rs.getString("buildingName");
                roomNo = rs.getString("roomNo");
                stdInfo[0] = roomType;
                stdInfo[1] = buildingName;
                stdInfo[2] = roomNo;
                System.out.println(stdInfo[0]);
            }
            
            return stdInfo;
        } catch (SQLException ex) {
            Logger.getLogger(AccomodationAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stdInfo;
    }
    
    public int[] getRoomAvail(String buildingName,String roomType){
    
    Connection connection = JDBCConnection.Connect();
    int[] roomDet = {0,0,0};
    
    if(roomType.equals("1 BHK")){
        try {
            PreparedStatement  pst = connection.prepareStatement("select 1BhkAvail,totalAvail,studentResiding from BuildingTable where buildingName = ?");
            pst.setString(1,buildingName);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                int bhk1Avail = rs.getInt("1BhkAvail");
                int totAvail = rs.getInt("totalAvail");
                int stdRes = rs.getInt("studentResiding");
                roomDet[0] = bhk1Avail;
                roomDet[1] = totAvail;
                roomDet[2] = stdRes;
            }
            return roomDet;
        } catch (SQLException ex) {
            Logger.getLogger(AccomodationAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    else if(roomType.equals("2 BHK")){
        try {
            PreparedStatement  pst = connection.prepareStatement("select 2BhkAvail,totalAvail,studentResiding from BuildingTable where buildingName = ?");
            pst.setString(1,buildingName);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                int bhk1Avail = rs.getInt("2BhkAvail");
                int totAvail = rs.getInt("totalAvail");
                int stdRes = rs.getInt("studentResiding");
                roomDet[0] = bhk1Avail;
                roomDet[1] = totAvail;
                roomDet[2] = stdRes;
            }
            return roomDet;
        } catch (SQLException ex) {
            Logger.getLogger(AccomodationAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    else if(roomType.equals("Shared")){
        try {
            PreparedStatement  pst = connection.prepareStatement("select sharedAvail,totalAvail,studentResiding from BuildingTable where buildingName = ?");
            pst.setString(1,buildingName);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                int bhk1Avail = rs.getInt("sharedAvail");
                int totAvail = rs.getInt("totalAvail");
                int stdRes = rs.getInt("studentResiding");
                roomDet[0] = bhk1Avail;
                roomDet[1] = totAvail;
                roomDet[2] = stdRes;
            }
            return roomDet;
        } catch (SQLException ex) {
            Logger.getLogger(AccomodationAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        
    return roomDet;
        
    }
    
    public String getWardenEmailFromBuilding(String buildingName){
    
    Connection connection = JDBCConnection.Connect();
    String wardenEmail = "";
        try {
            PreparedStatement  pst = connection.prepareStatement("select wardenAssigned from BuildingTable where buildingName = ?");
            pst.setString(1,buildingName);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                wardenEmail = rs.getString("wardenAssigned");
            }
            return wardenEmail;
        } catch (SQLException ex) {
            Logger.getLogger(AccomodationAdminInfoDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return wardenEmail;
    }
    
    
    
    
    
}
