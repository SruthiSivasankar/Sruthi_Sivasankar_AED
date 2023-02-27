/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdminPanels;

import Business.Branch;
import Business.Business;
import Role.BranchAdminRole;
import Role.CustomerRole;
import Role.Role;
import UI.MainJFrame;
import UserAccount.UserAccount;
import javax.swing.JOptionPane;

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
        
        populateDropdown();
    }

    public void populateDropdown() {
        jComboBox1.removeAllItems();
        for (String rolename : Role.getAllRoles()) {
            jComboBox1.addItem(rolename);
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
        jTextField3 = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(fieldBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 190, 40));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 190, 40));

        registerBtn.setText("REGISTER");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        jPanel1.add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 110, 30));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 190, 40));

        jButton1.setText("ADD BRANCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:

        // based on role selected, we will register the person into those directories
        // remember to check if the credentials are unique
        if (jComboBox1.getSelectedItem().equals("customer")) {
            this.business.getTopLevelUserAccountDirectory().createUserAccount(jTextField4.getText(), jTextField3.getText(), new CustomerRole());
        }
        if (jComboBox1.getSelectedItem().equals("branch manager")) {
            if (fieldBranch.getText() != "") {
                this.branch.getBranchuseraccountDirectory().createUserAccount(jTextField4.getText(), jTextField3.getText(), new BranchAdminRole());
            } else {
                JOptionPane.showMessageDialog(null, "Create a new branch by filling the branch field to add it's branch manager.");
            }
        }

    }//GEN-LAST:event_registerBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // check for unique branch name
        this.branch = this.business.createBranch(fieldBranch.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainJFrame(business, branch, useraccount);
    }//GEN-LAST:event_backBtnActionPerformed

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
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField fieldBranch;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton registerBtn;
    // End of variables declaration//GEN-END:variables
}
