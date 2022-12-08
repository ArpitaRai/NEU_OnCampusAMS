/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package neu.oncampusams.systemadministration.SystemAdmin;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import neu.oncampusams.databaseConnection.JDBCConnection;

/**
 *
 * @author Yamini Manral
 */
public class ITAdmin extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    public ITAdmin() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        campusCombo = new javax.swing.JComboBox<>();
        roleCombo = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        lName = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel36 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1500, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator10);
        jSeparator10.setBounds(270, 220, 240, 30);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel30.setText("First Name");
        jPanel5.add(jLabel30);
        jLabel30.setBounds(120, 90, 100, 33);

        fName.setBackground(new java.awt.Color(242, 242, 242));
        fName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fName.setBorder(null);
        fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameActionPerformed(evt);
            }
        });
        jPanel5.add(fName);
        fName.setBounds(270, 90, 240, 30);

        password.setBackground(new java.awt.Color(242, 242, 242));
        password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password.setBorder(null);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel5.add(password);
        password.setBounds(270, 240, 240, 30);

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel31.setText("Password");
        jPanel5.add(jLabel31);
        jLabel31.setBounds(150, 240, 70, 33);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel17.setText("Campus");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(150, 300, 70, 33);

        campusCombo.setBackground(new java.awt.Color(242, 242, 242));
        campusCombo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campusCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "Charlotte", "San Francisco", "Seattle", "Silicon Valley", "Portland (Maine)", "Toronto", "Vancouver", "London" }));
        jPanel5.add(campusCombo);
        campusCombo.setBounds(270, 300, 190, 30);

        roleCombo.setBackground(new java.awt.Color(242, 242, 242));
        roleCombo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        roleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Head System Admin", "System Admin", "Campus Admin", "Building Admin", "Warden", "Mailing Services Admin" }));
        roleCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleComboActionPerformed(evt);
            }
        });
        jPanel5.add(roleCombo);
        roleCombo.setBounds(270, 350, 190, 30);

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel32.setText("Role");
        jPanel5.add(jLabel32);
        jLabel32.setBounds(150, 350, 70, 33);

        createButton.setBackground(new java.awt.Color(255, 0, 0));
        createButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        createButton.setForeground(new java.awt.Color(255, 255, 255));
        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        jPanel5.add(createButton);
        createButton.setBounds(310, 430, 90, 40);

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator11);
        jSeparator11.setBounds(270, 120, 240, 20);

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator12);
        jSeparator12.setBounds(270, 270, 240, 10);

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel29.setText("Email");
        jPanel5.add(jLabel29);
        jLabel29.setBounds(150, 190, 70, 33);

        jTextField14.setBackground(new java.awt.Color(242, 242, 242));
        jTextField14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField14.setBorder(null);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField14);
        jTextField14.setBounds(270, 190, 240, 30);

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel37.setText("Last Name");
        jPanel5.add(jLabel37);
        jLabel37.setBounds(120, 140, 100, 33);

        lName.setBackground(new java.awt.Color(242, 242, 242));
        lName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lName.setBorder(null);
        lName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameActionPerformed(evt);
            }
        });
        jPanel5.add(lName);
        lName.setBounds(270, 140, 240, 30);

        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator16);
        jSeparator16.setBounds(270, 170, 240, 20);

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 680, 540));

        jTabbedPane1.addTab("User Registration", new javax.swing.ImageIcon(getClass().getResource("/neu/oncampusams/images/register.png")), jPanel2); // NOI18N

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(null);

        jButton9.setBackground(new java.awt.Color(255, 0, 0));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Search");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton9);
        jButton9.setBounds(510, 70, 90, 40);

        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.add(jSeparator13);
        jSeparator13.setBounds(210, 110, 270, 30);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel33.setText("Name");
        jPanel6.add(jLabel33);
        jLabel33.setBounds(150, 190, 70, 33);

        jTextField17.setBackground(new java.awt.Color(242, 242, 242));
        jTextField17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField17.setBorder(null);
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField17);
        jTextField17.setBounds(270, 190, 240, 30);

        jTextField18.setBackground(new java.awt.Color(242, 242, 242));
        jTextField18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField18.setBorder(null);
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField18);
        jTextField18.setBounds(270, 240, 240, 30);

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel34.setText("Password");
        jPanel6.add(jLabel34);
        jLabel34.setBounds(150, 240, 70, 33);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel18.setText("Campus");
        jPanel6.add(jLabel18);
        jLabel18.setBounds(150, 300, 70, 33);

        jComboBox11.setBackground(new java.awt.Color(242, 242, 242));
        jComboBox11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "Charlotte", "San Francisco", "Seattle", "Silicon Valley", "Portland (Maine)", "Toronto", "Vancouver", "London" }));
        jPanel6.add(jComboBox11);
        jComboBox11.setBounds(270, 300, 190, 30);

        jComboBox12.setBackground(new java.awt.Color(242, 242, 242));
        jComboBox12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Head System Admin", "System Admin", "Campus Admin", "Building Admin", "Warden", "Mailing Services Admin" }));
        jComboBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox12ActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBox12);
        jComboBox12.setBounds(270, 350, 190, 30);

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel35.setText("Role");
        jPanel6.add(jLabel35);
        jLabel35.setBounds(150, 350, 70, 33);

        jButton10.setBackground(new java.awt.Color(255, 0, 0));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Update");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10);
        jButton10.setBounds(250, 430, 90, 40);

        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.add(jSeparator14);
        jSeparator14.setBounds(270, 220, 240, 20);

        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.add(jSeparator15);
        jSeparator15.setBounds(270, 270, 240, 10);

        jLabel36.setBackground(new java.awt.Color(0, 0, 0));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel36.setText("Email");
        jPanel6.add(jLabel36);
        jLabel36.setBounds(90, 80, 70, 33);

        jTextField19.setBackground(new java.awt.Color(242, 242, 242));
        jTextField19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField19.setBorder(null);
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField19);
        jTextField19.setBounds(210, 70, 270, 40);

        jButton11.setBackground(new java.awt.Color(255, 0, 0));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Delete");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11);
        jButton11.setBounds(370, 430, 90, 40);

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 680, 540));

        jTabbedPane1.addTab("Update User", new javax.swing.ImageIcon(getClass().getResource("/neu/oncampusams/images/Update.png")), jPanel3); // NOI18N

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1310, 1000));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Northeastern University");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 270, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("On-Campus Accommodation");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 270, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Management System");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 270, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neu/oncampusams/images/neulogo1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 170, 150));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Location:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Name:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, 90, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void roleComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleComboActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        Registration registration = new Registration();
        registration.setFirstName(fName.getText());
        registration.setLastName(lName.getText());
        String lastN = fName.getText();
        String emailId;
        emailId = (lName.getText() + '.' + lastN.charAt(0) + "@northeastern.edu").toLowerCase();
        registration.setPassword(password.getText());
        registration.setRoles((String) roleCombo.getSelectedItem());
        registration.setCampus((String) campusCombo.getSelectedItem());

        if ( registration.getPassword() == null || registration.getPassword().trim().isEmpty() || "".equals(registration.getPassword())
                || registration.getFirstName() == null || registration.getFirstName().trim().isEmpty() || "".equals(registration.getFirstName())
                || registration.getLastName() == null || registration.getLastName().trim().isEmpty() || "".equals(registration.getLastName())) {
            JOptionPane.showMessageDialog(this, "Please Enter all the Fields!");
            return;
        }
        if("Student".equals((String)roleCombo.getSelectedItem())){

        try ( Connection connection = JDBCConnection.Connect()) {
            Statement statement = (Statement) connection.createStatement();
            String sql = "INSERT INTO `oncampusamsdb`.`StudentTable` " + "(fName, lName, password, campus, emailId)" + "VALUES ('" + registration.getFirstName()
                    + "' , '" + registration.getLastName()+ "' , '" + registration.getPassword()+ "', '" + registration.getCampus()+ "',  '" + emailId+ "');";
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Student Registered secccessfully");
            fName.setText("");
            lName.setText("");
            password.setText("");
            connection.close();
            System.out.println("DB Connection Close!!!");
        } catch (HeadlessException | SQLException exception) {
            JOptionPane.showMessageDialog(this, exception);
        }}
        
        if("Head System Admin".equals((String)roleCombo.getSelectedItem())){
        try ( Connection connection = JDBCConnection.Connect()) {
            Statement statement = (Statement) connection.createStatement();
            String sql = "INSERT INTO `oncampusamsdb`.`HeadSysAdmin` " + "(fName, lName, password, campus,  emailId)" + "VALUES ('" + registration.getFirstName()
                    + "' , '" + registration.getLastName()+ "' , '" + registration.getPassword()+ "', '" + registration.getCampus()+ "', '" + emailId+ "');";
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Head System Admin Registered secccessfully");
            fName.setText("");
            lName.setText("");
            password.setText("");
            connection.close();
            System.out.println("DB Connection Close!!!");
        } catch (HeadlessException | SQLException exception) {
            JOptionPane.showMessageDialog(this, exception);
        }}
         if("System Admin".equals((String)roleCombo.getSelectedItem())){
        try ( Connection connection = JDBCConnection.Connect()) {
            Statement statement = (Statement) connection.createStatement();
            String sql = "INSERT INTO `oncampusamsdb`.`SysAdminTable` " + "(fName, lName, password, campus,  emailId)" + "VALUES ('" + registration.getFirstName()
                    + "' , '" + registration.getLastName()+ "' , '" + registration.getPassword()+ "', '" + registration.getCampus()+ "',  '" + emailId+ "');";
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "System Admin Registered secccessfully");
            fName.setText("");
            lName.setText("");
            password.setText("");
            connection.close();
            System.out.println("DB Connection Close!!!");
        } catch (HeadlessException | SQLException exception) {
            JOptionPane.showMessageDialog(this, exception);
        }} 
         
         if("Campus Admin".equals((String)roleCombo.getSelectedItem())){
        try ( Connection connection = JDBCConnection.Connect()) {
            Statement statement = (Statement) connection.createStatement();
            String sql = "INSERT INTO `oncampusamsdb`.`CampusAdminTable` " + "(fName, lName, password, campus, emailId)" + "VALUES ('" + registration.getFirstName()
                    + "' , '" + registration.getLastName()+ "' , '" + registration.getPassword()+ "', '" + registration.getCampus()+ "',  '" + emailId+ "');";
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Campus Admin Registered secccessfully");
            fName.setText("");
            lName.setText("");
            password.setText("");
            connection.close();
            System.out.println("DB Connection Close!!!");
        } catch (HeadlessException | SQLException exception) {
            JOptionPane.showMessageDialog(this, exception);
        }}    
         
         if("Building Admin".equals((String)roleCombo.getSelectedItem())){
        try ( Connection connection = JDBCConnection.Connect()) {
            Statement statement = (Statement) connection.createStatement();
            String sql = "INSERT INTO `oncampusamsdb`.`BuildingAdminTable` " + "(fName, lName, password, campus,  emailId)" + "VALUES ('" + registration.getFirstName()
                    + "' , '" + registration.getLastName()+ "' , '" + registration.getPassword()+ "', '" + registration.getCampus()+ "',  '" + emailId+ "');";
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Building Admin Registered secccessfully");
            fName.setText("");
            lName.setText("");
            password.setText("");
            connection.close();
            System.out.println("DB Connection Close!!!");
        } catch (HeadlessException | SQLException exception) {
            JOptionPane.showMessageDialog(this, exception);
        }}   
         
         if("Warden".equals((String)roleCombo.getSelectedItem())){
        try ( Connection connection = JDBCConnection.Connect()) {
            Statement statement = (Statement) connection.createStatement();
            String sql = "INSERT INTO `oncampusamsdb`.`WardenTable` " + "(fName, lName, password, campus,  emailId)" + "VALUES ('" + registration.getFirstName()
                    + "' , '" + registration.getLastName()+ "' , '" + registration.getPassword()+ "', '" + registration.getCampus()+ "',  '" + emailId+ "');";
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Warden Registered secccessfully");
            fName.setText("");
            lName.setText("");
            password.setText("");
            connection.close();
            System.out.println("DB Connection Close!!!");
        } catch (HeadlessException | SQLException exception) {
            JOptionPane.showMessageDialog(this, exception);
        }}         
         if("Mailing Services Admin".equals((String)roleCombo.getSelectedItem())){
        try ( Connection connection = JDBCConnection.Connect()) {
            Statement statement = (Statement) connection.createStatement();
            String sql = "INSERT INTO `oncampusamsdb`.`MailAdminTable` " + "(fName, lName, password, campus, emailId)" + "VALUES ('" + registration.getFirstName()
                    + "' , '" + registration.getLastName()+ "' , '" + registration.getPassword()+ "', '" + registration.getCampus()+ "', '" + emailId+ "');";
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Mailing Services Admin Registered secccessfully");
            fName.setText("");
            lName.setText("");
            password.setText("");
            connection.close();
            System.out.println("DB Connection Close!!!");
        } catch (HeadlessException | SQLException exception) {
            JOptionPane.showMessageDialog(this, exception);
        }} 
    }//GEN-LAST:event_createButtonActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jComboBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox12ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void lNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameActionPerformed

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
            java.util.logging.Logger.getLogger(ITAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ITAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ITAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ITAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ITAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> campusCombo;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField fName;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField lName;
    private javax.swing.JTextField password;
    private javax.swing.JComboBox<String> roleCombo;
    // End of variables declaration//GEN-END:variables
}
