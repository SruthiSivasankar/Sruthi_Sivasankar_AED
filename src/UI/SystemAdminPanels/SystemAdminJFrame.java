/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdminPanels;

import Business.Branch;
import Business.Business;
import Employee.BranchManager;
import Employee.Librarian;
import Role.BranchAdminRole;
import Role.CustomerRole;
import Role.Role;
import Library.Library;
import Role.LibrarianRole;
import UI.MainJFrame;
import UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nidhi Raghavendra
 */
public class SystemAdminJFrame extends javax.swing.JFrame {

    private Business business;
    private Branch branch;
    private UserAccount useraccount;

    /**
     * Creates new form SystemAdminJFrame
     */
    public SystemAdminJFrame(Business business, Branch branch, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);

        this.business = business;
        this.useraccount = useraccount;
        lblLibrarianExperience.setVisible(false);
        fieldLibrarianExperience.setVisible(false);
        lblBMexperience.setVisible(false);
        fieldBMexperience.setVisible(false);

        populateDropdown();
        populateusertable();
        populateemployeetable();
        populatebranchtable();
        
    }

    public void populateDropdown() {
        jComboBox1.removeAllItems();
        for (String rolename : Role.getAllRoles()) {
            jComboBox1.addItem(rolename);
        }
    }
    public void populatebranchtable(){
         DefaultTableModel model=(DefaultTableModel)branchtable.getModel();
         model.setRowCount(0);
         for(Branch b: this.business.getBranches()){
              Object[] row=new Object[3];
                  row[0]=b;
                  row[1]=b.getLibrary().getBuildingNo();
                  model.addRow(row);
         }
        
    }
    public void  populateemployeetable(){
        DefaultTableModel model=(DefaultTableModel)employeetable.getModel();
        model.setRowCount(0);
        System.out.println("running function");
        for(Branch b:this.business.getBranches()){
         System.out.println("1stloop");
           for(UserAccount u:b.getBranchuseraccountDirectory().getUseraccountList()){
               
                Object[] row=new Object[6];
                  row[0]=u;
                  row[1]=u.getUsername();
                  row[2]=u.getPassword();
                  row[3]=u.getRole();
                  row[4]=u.getBranch();
                  model.addRow(row);

            }
        }
    }
    public void populateusertable(){
        DefaultTableModel model=(DefaultTableModel)usertable.getModel();
        model.setRowCount(0);
        for(UserAccount u:this.business.getTopLevelUserAccountDirectory().getUseraccountList()){
            Object[] row=new Object[5];
            row[0]=u;
            row[1]=u.getUsername();
             row[2]=u.getPassword();
             row[3]=u.getRole();
            model.addRow(row);
        }
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
        fieldBranch = new javax.swing.JTextField();
        FieldPassword = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        FieldUsername = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fieldLibrary = new javax.swing.JTextField();
        btnaddBranch = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        branchtable = new javax.swing.JTable();
        fieldLibrarianExperience = new javax.swing.JTextField();
        fieldBMexperience = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        usertable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        employeetable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblLibrarianExperience = new javax.swing.JLabel();
        lblBMexperience = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(fieldBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 190, 40));
        jPanel1.add(FieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 190, 40));

        registerBtn.setText("REGISTER");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        jPanel1.add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 720, -1, -1));

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 190, 40));
        jPanel1.add(FieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 190, 40));

        backBtn.setBackground(new java.awt.Color(255, 0, 0));
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, -1, -1));

        jLabel1.setText("USER NAME:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));
        jPanel1.add(fieldLibrary, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 190, 40));

        btnaddBranch.setText("ADD BRANCH");
        btnaddBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddBranchActionPerformed(evt);
            }
        });
        jPanel1.add(btnaddBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 120, -1));

        jButton2.setText("DELETE BRANCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        branchtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BRANCH", "LIBRARY"
            }
        ));
        jScrollPane3.setViewportView(branchtable);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 440, 120));

        fieldLibrarianExperience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldLibrarianExperienceActionPerformed(evt);
            }
        });
        jPanel1.add(fieldLibrarianExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 580, 190, 40));

        fieldBMexperience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldBMexperienceActionPerformed(evt);
            }
        });
        jPanel1.add(fieldBMexperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 650, 190, 40));

        usertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ACCOUNT ID", "USERNAME", "PASSWORD", "ROLE"
            }
        ));
        jScrollPane1.setViewportView(usertable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 590, 440, 160));

        employeetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ACCOUNT ID", "USER NAME", "PASSWORD", "ROLE", "BRANCH"
            }
        ));
        jScrollPane2.setViewportView(employeetable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 440, 160));

        jLabel2.setText("LOCATION:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel3.setText("BUILDING NO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 21)); // NOI18N
        jLabel4.setText("SYSTEM ADMIN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel5.setText("BRANCH LIST:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel6.setText("CREATE USERS:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        jLabel7.setText("PASSWORD:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        jLabel8.setText("ROLE:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        lblLibrarianExperience.setText("LIBN EXPERIENCE:");
        jPanel1.add(lblLibrarianExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, -1));

        lblBMexperience.setText("BM EXPERIENCE:");
        jPanel1.add(lblBMexperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, -1, -1));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel11.setText("EMPLOYEE LIST:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel12.setText("USER LIST:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 570, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:

        // based on role selected, we will register the person into those directories
        // remember to check if the credentials are unique
        if (
            jComboBox1.getSelectedItem().equals("customer")) {
//           
//            business.getCustomerdirectory().createCustomer(FieldUsername.getText());
//            System.out.print(business.getCustomerdirectory().getCustomerlist().get(0));
//            JOptionPane.showMessageDialog(null, "CUSTOMER ADDED SUCCESSFULLY.");
//            populateusertable();
                String username = FieldUsername.getText();
            String password = FieldPassword.getText();
    
            boolean isUsernameUnique = true;
            for (UserAccount user : business.getTopLevelUserAccountDirectory().getUseraccountList()){
                if (user.getUsername().equals(username)){
                    isUsernameUnique = false;
                    break;
                }
            }
             if (!isUsernameUnique) {
        JOptionPane.showMessageDialog(null, "Username name already exists. Please enter unique credentials.");
             }else {
                 business.getTopLevelUserAccountDirectory().createUserAccount(FieldUsername.getText(), FieldPassword.getText(), new CustomerRole());          
                 business.getCustomerdirectory().createCustomer((FieldUsername.getText()));
                 JOptionPane.showMessageDialog(null, "CUSTOMER ADDED SUCCESSFULLY");
                 populateusertable();
             }


        }
        
        if (jComboBox1.getSelectedItem().equals("branch manager")) {
            if (fieldBranch.getText() != "") {
                 DefaultTableModel model=(DefaultTableModel)branchtable.getModel();
                 int index=branchtable.getSelectedRow();
                 String s=model.getValueAt(index, 0).toString();
                Branch branch2=this.business.searchbranch(s);
                if(branch2.getLibrary().getBranchmanager()==null){
                //Branch branch2=this.business.searchbranch(txtbranch.getText());
                    UserAccount utemp=branch2.getBranchuseraccountDirectory().createUserAccount(FieldUsername.getText(), FieldPassword.getText(), new BranchAdminRole());
                    utemp.setBranch(branch2);
                    BranchManager lb1=new BranchManager(Integer.parseInt(fieldBMexperience.getText()));
                    branch2.getLibrary().setBranchmanager(lb1);
                    populateemployeetable();
                    JOptionPane.showMessageDialog(null, "BRANCH MANAGER ADDED SUCCESSFULLY.");}
                else{
                JOptionPane.showMessageDialog(null, "ONLY ONE BRANCH MANAGER CAN BE ADDED ");}
                    
                }
                

            } 
//            else {
//                JOptionPane.showMessageDialog(null, "Create a new branch by filling the branch field to add it's branch manager.");
//            }
        
        
         if (jComboBox1.getSelectedItem().equals("librarian")) {
            if (fieldBranch.getText() != "") {
                
//                Branch branch3=this.business.searchbranch(txtbranch.getText());
                 DefaultTableModel model=(DefaultTableModel)branchtable.getModel();
                 int index=branchtable.getSelectedRow();
                 String s=model.getValueAt(index, 0).toString();
                 Branch branch3=this.business.searchbranch(s);
                if(branch3.getLibrary().getLibrarian()==null){
                  
                
                    UserAccount utemp=branch3.getBranchuseraccountDirectory().createUserAccount(FieldUsername.getText(), FieldPassword.getText(), new LibrarianRole());
                    utemp.setBranch(branch3);
                    Librarian lb2=new Librarian(Integer.parseInt(fieldLibrarianExperience.getText()));
                    branch3.getLibrary().setLibrarian(lb2);
                    JOptionPane.showMessageDialog(null, "LIBRARIAN ADDED SUCCESSFULLY.");
                    populateemployeetable();

                 } 
                  else{
                JOptionPane.showMessageDialog(null, "ONLY ONE LIBRARIAN CAN BE ADDED ");}
                    
                }
         
//                else {
//                JOptionPane.showMessageDialog(null, "Create a new branch by filling the branch field to add it's branch manager.");
//            }
        }
        lblLibrarianExperience.setVisible(false);
        fieldLibrarianExperience.setVisible(false);
        lblBMexperience.setVisible(false);
        fieldBMexperience.setVisible(false);

    }//GEN-LAST:event_registerBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainJFrame(business, branch, useraccount);
    }//GEN-LAST:event_backBtnActionPerformed

    private void btnaddBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddBranchActionPerformed
        // TODO add your handling code here:
        this.branch = this.business.createBranch(fieldBranch.getText());
        Library l1= new Library(Integer.parseInt(fieldLibrary.getText()));
        Branch branch1=this.business.searchbranch(fieldBranch.getText());
        branch1.setLibrary(l1);
        JOptionPane.showMessageDialog(null, "Branch Added");
        populatebranchtable();
        

    }//GEN-LAST:event_btnaddBranchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)branchtable.getModel();
        int index=branchtable.getSelectedRow();
        String s=model.getValueAt(index, 0).toString();

        this.business.deletebranch(s);
        populatebranchtable();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void fieldLibrarianExperienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldLibrarianExperienceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldLibrarianExperienceActionPerformed

    private void fieldBMexperienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldBMexperienceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldBMexperienceActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
//        if(jComboBox1.getSelectedItem().equals("customer")){
////            txtcustomerage.setVisible(true);
////            lblcustomerage.setVisible(true);
////            txtcustomerprofession.setVisible(true);
////            
////                    lblcustomerprofession.setVisible(true);
//                  //  JOptionPane.showMessageDialog(null, "Customer ID generated");
//        }

        if(jComboBox1.getSelectedItem().equals("branch manager")){
             lblBMexperience.setVisible(true);
        fieldBMexperience.setVisible(true);
            JOptionPane.showMessageDialog(null, "Enter branch manager experience");
        }
        if (jComboBox1.getSelectedItem().equals("librarian")){
            lblLibrarianExperience.setVisible(true);
            fieldLibrarianExperience.setVisible(true);
                JOptionPane.showMessageDialog(null, "Enter librarian experience");
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new SystemAdminJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FieldPassword;
    private javax.swing.JTextField FieldUsername;
    private javax.swing.JButton backBtn;
    private javax.swing.JTable branchtable;
    private javax.swing.JButton btnaddBranch;
    private javax.swing.JTable employeetable;
    private javax.swing.JTextField fieldBMexperience;
    private javax.swing.JTextField fieldBranch;
    private javax.swing.JTextField fieldLibrarianExperience;
    private javax.swing.JTextField fieldLibrary;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBMexperience;
    private javax.swing.JLabel lblLibrarianExperience;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTable usertable;
    // End of variables declaration//GEN-END:variables
}
