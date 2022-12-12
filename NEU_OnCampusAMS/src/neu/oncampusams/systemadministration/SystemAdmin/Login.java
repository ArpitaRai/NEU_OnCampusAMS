/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package neu.oncampusams.systemadministration.SystemAdmin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import neu.oncampusams.campusadministration.CampusAdmin.AccomodationAdmin;
import neu.oncampusams.campusadministration.CampusAdmin.CampusAdmin;
import neu.oncampusams.campusadministration.CampusAdmin.MailingServicesAdmin;
import neu.oncampusams.databaseConnection.JDBCConnection;
import neu.oncampusams.financeadministration.Finance.FinanceAdmin;
import neu.oncampusams.studentrelation.StudentRelations.*;
/**
 *
 * @author Yamini Manral
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        passwordTF = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        usernameTF = new javax.swing.JTextField();
        roleCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Northeastern University");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 270, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("On-Campus Accommodation");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 270, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Management System");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 270, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neu/oncampusams/images/neulogo1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 700));

        jPanel3.setBackground(new java.awt.Color(211, 97, 53));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neu/oncampusams/images/password.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 32, 48));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neu/oncampusams/images/businessman.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 32, 48));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 220, 10));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 220, 10));

        passwordTF.setBackground(new java.awt.Color(211, 97, 53));
        passwordTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordTF.setForeground(new java.awt.Color(255, 255, 255));
        passwordTF.setBorder(null);
        passwordTF.setCaretColor(new java.awt.Color(204, 0, 0));
        passwordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTFActionPerformed(evt);
            }
        });
        jPanel3.add(passwordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 220, 40));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neu/oncampusams/images/updated.png"))); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 140, 50));

        usernameTF.setBackground(new java.awt.Color(211, 97, 53));
        usernameTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usernameTF.setForeground(new java.awt.Color(255, 255, 255));
        usernameTF.setBorder(null);
        jPanel3.add(usernameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 220, 40));

        roleCB.setBackground(new java.awt.Color(211, 97, 53));
        roleCB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        roleCB.setForeground(new java.awt.Color(255, 255, 255));
        roleCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Head System Admin", "System Admin", "Finance Admin", "Campus Admin", "Accommodation Admin", "Warden", "Mailing Services Admin" }));
        jPanel3.add(roleCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 240, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 710, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String role = roleCB.getSelectedItem().toString();
        String username = usernameTF.getText();
        String password = passwordTF.getText();

        try {
            Connection connection = JDBCConnection.Connect();
            Statement statement = connection.createStatement();
            if (username.equals("") || password.equals("")) {
                JOptionPane.showMessageDialog(null, "Enter credentials to proceed!");
            }else if("Student".equals(role)){//student 1
                ResultSet resultset = statement.executeQuery("SELECT * FROM `oncampusamsdb`.`studenttable` where emailId ='" + username + "' and password = '" + password + "'");
                if(resultset.next()){
                    Student s = new Student(resultset.getString("emailId"));
                    s.SetEmailID();
                    setVisible(false);
                    s.show();
                }else if(!resultset.next()){
                JOptionPane.showMessageDialog(null, "Incorrect credentials! Check your username or password.");
            }
            }else if("Warden".equals(role)){//warden 2
                ResultSet resultset = statement.executeQuery("SELECT * FROM oncampusamsdb.wardentable where emailId ='" + username + "' and password = '" + password + "'");
                if(resultset.next()){
                    Warden w = new Warden(resultset.getString("emailId"));
                    w.SetEmailID();
                    setVisible(false);
                    w.show();
                }else if(!resultset.next()){
                JOptionPane.showMessageDialog(null, "Incorrect credentials! Check your username or password.");
            }
            }else if("Campus Admin".equals(role)){//campus admin 3
                ResultSet resultset = statement.executeQuery("SELECT * FROM oncampusamsdb.campusadmintable where emailId ='" + username + "' and password = '" + password + "'");
                if(resultset.next()){
                    CampusAdmin ca = new CampusAdmin(resultset.getString("emailId"));
                    ca.SetEmailID();
                    setVisible(false);
                    ca.show();
                }else if(!resultset.next()){
                JOptionPane.showMessageDialog(null, "Incorrect credentials! Check your username or password.");
            }
            }else if("Accommodation Admin".equals(role)){//acco admin 4
                ResultSet resultset = statement.executeQuery("SELECT * FROM oncampusamsdb.accomodationadmintable where emailId ='" + username + "' and password = '" + password + "'");
                if(resultset.next()){
                    AccomodationAdmin aa = new AccomodationAdmin(resultset.getString("emailId"));
                    aa.SetEmailID();
                    setVisible(false);
                    aa.show();
                }else if(!resultset.next()){
                JOptionPane.showMessageDialog(null, "Incorrect credentials! Check your username or password.");
            }
            }else if("Mailing Services Admin".equals(role)){ //mailing 5
                ResultSet resultset = statement.executeQuery("SELECT * FROM oncampusamsdb.mailadmintable where emailId ='" + username + "' and password = '" + password + "'");
                if(resultset.next()){
                    MailingServicesAdmin ma = new MailingServicesAdmin(resultset.getString("emailId"));
                    ma.SetEmailID();
                    setVisible(false);
                    ma.show();
                }else if(!resultset.next()){
                JOptionPane.showMessageDialog(null, "Incorrect credentials! Check your username or password.");
            }
            }else if("Finance Admin".equals(role)){ //finance admin 6
                ResultSet resultset = statement.executeQuery("SELECT * FROM oncampusamsdb.mailadmintable where emailId ='" + username + "' and password = '" + password + "'");
                if(resultset.next()){
                    FinanceAdmin fa = new FinanceAdmin(resultset.getString("emailId"));
                    fa.SetEmailID();
                    setVisible(false);
                    fa.show();
                }else if(!resultset.next()){
                JOptionPane.showMessageDialog(null, "Incorrect credentials! Check your username or password.");
            }
            }else if("System Admin".equals(role)){// sys admin 7
                ResultSet resultset = statement.executeQuery("SELECT * FROM oncampusamsdb.sysadmintable where emailId ='" + username + "' and password = '" + password + "'");
                if(resultset.next()){
                    SystemAdmin sa = new SystemAdmin(resultset.getString("emailId"));
                    sa.SetEmailID();
                    setVisible(false);
                    sa.show();
                }else if(!resultset.next()){
                JOptionPane.showMessageDialog(null, "Incorrect credentials! Check your username or password.");
            }
            }else if("Head System Admin".equals(role)){// head sys admin 8
                ResultSet resultset = statement.executeQuery("SELECT * FROM oncampusamsdb.headsysadmin where emailId ='" + username + "' and password = '" + password + "'");
                if(resultset.next()){
                    HeadSystemAdmin hsa = new HeadSystemAdmin(resultset.getString("emailId"));
                    hsa.SetEmailID();
                    setVisible(false);
                    hsa.show();
                }else if(!resultset.next()){
                JOptionPane.showMessageDialog(null, "Incorrect credentials! Check your username or password.");
            }
            }connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    

        
    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JComboBox<String> roleCB;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
