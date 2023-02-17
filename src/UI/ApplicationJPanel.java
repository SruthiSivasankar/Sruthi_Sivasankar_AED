/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Applicant;
import Model.ApplicantDirectory;
import Model.Business;
import Model.Insurance;
import Model.InsuranceDirectory;
import Model.Pet;
import Model.Vaccination;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sruthisivasankar
 */
public class ApplicationJPanel extends javax.swing.JPanel {
    Business business;
    ApplicantDirectory appliccantList;

    /**
     * Creates new form ManagerJPanel
     */
    public ApplicationJPanel(ApplicantDirectory applicantList) {
        initComponents();
        this.business=business;
        this.appliccantList=applicantList;
        populateApplicantTable();
    }
    public void populateApplicantTable(){
         DefaultTableModel model= (DefaultTableModel )applicantTbl.getModel();
           // TableColumn insurancecolumn=model.getColumnModel.getColumn(5);
         model.setRowCount(0);
            
        for(Applicant  io : appliccantList.getApplicantList()){
            Object[]row =new Object[4];
            row[0]=io;
            row[1]=io.getOwnerLastName();
            row[2]=io.getApplicationId();
            row[3]=io.getApplicationDate();
            
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dateBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();
        dateField = new javax.swing.JTextField();
        AppIDlbl = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        firstNameField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        applicantTbl = new javax.swing.JTable();
        updateBtn = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("First Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 74, -1, -1));

        jLabel2.setText("Last Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 150, 82, -1));

        jLabel3.setText("Application ID:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 216, -1, -1));

        jLabel4.setText("Application Date:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        dateBtn.setText("Get Date");
        dateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateBtnActionPerformed(evt);
            }
        });
        add(dateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 97, -1));

        createBtn.setText("CREATE");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 357, 110, -1));

        dateField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dateFieldKeyReleased(evt);
            }
        });
        add(dateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 110, -1));

        AppIDlbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(AppIDlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 208, 110, 24));

        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });
        lastNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastNameFieldKeyReleased(evt);
            }
        });
        add(lastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 147, 110, -1));

        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });
        firstNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstNameFieldKeyReleased(evt);
            }
        });
        add(firstNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 71, 110, -1));

        applicantTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Application ID", "Application Date"
            }
        ));
        applicantTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                applicantTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(applicantTbl);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, 98));

        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 110, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 110, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel5.setText("REGISTER APPLICANT");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void dateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateBtnActionPerformed
        // TODO add your handling code here:
        String selectdate=((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
        dateField.setText(selectdate);
    }//GEN-LAST:event_dateBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        String fn=firstNameField.getText();
        String ln=lastNameField.getText();
        String date=dateField.getText();
        if(fn.equals("") || ln.equals("") || date.equals("")){
            JOptionPane.showMessageDialog(null, "please enter all details ");

        }
        else{
            Applicant applicant=new Applicant(fn, ln, date);
            appliccantList.getApplicantList().add(applicant);

            AppIDlbl.setText(String.valueOf(applicant.getApplicationId()));
            JOptionPane.showMessageDialog(null, "Applicant details added");

            firstNameField.setText("");
            lastNameField.setText("");
            dateField.setText("");
            AppIDlbl.setText("");
            jDateChooser1.setCalendar(null);

            DefaultTableModel model= (DefaultTableModel )applicantTbl.getModel();
            // TableColumn insurancecolumn=model.getColumnModel.getColumn(5);
            model.setRowCount(0);

            for(Applicant  io : appliccantList.getApplicantList()){
                Object[]row =new Object[4];
                row[0]=io;
                row[1]=io.getOwnerLastName();
                row[2]=io.getApplicationId();
                row[3]=io.getApplicationDate();

                model.addRow(row);
            }
        }
    }//GEN-LAST:event_createBtnActionPerformed

    private void dateFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateFieldKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_dateFieldKeyReleased

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void lastNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameFieldKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_lastNameFieldKeyReleased

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

    private void firstNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameFieldKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_firstNameFieldKeyReleased

    private void applicantTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applicantTblMouseClicked
        // TODO add your handling code here:
        if(applicantTbl.getSelectedRowCount()==1){
            int selectedRowIndex=applicantTbl.getSelectedRow();
            DefaultTableModel model= (DefaultTableModel )applicantTbl.getModel();
            firstNameField.setText(model.getValueAt(selectedRowIndex, 0).toString());
            lastNameField.setText(model.getValueAt(selectedRowIndex, 1).toString());
            AppIDlbl.setText(model.getValueAt(selectedRowIndex,2).toString());
            dateField.setText(model.getValueAt(selectedRowIndex,3).toString());
        }
    }//GEN-LAST:event_applicantTblMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex=applicantTbl.getSelectedRow();

        DefaultTableModel model= (DefaultTableModel )applicantTbl.getModel();
        int store=Integer.parseInt(model.getValueAt(selectedRowIndex, 2).toString());
        for (Applicant a: appliccantList.getApplicantList()){
            if(a.getApplicationId()==store){
                model.setValueAt(firstNameField.getText(),applicantTbl.getSelectedRow() , 0);
                model.setValueAt(lastNameField.getText(),applicantTbl.getSelectedRow() , 1);
                model.setValueAt(AppIDlbl.getText(),applicantTbl.getSelectedRow() , 2);
                model.setValueAt(dateField.getText(),applicantTbl.getSelectedRow() , 3);

            }
        }

        firstNameField.setText("");
        lastNameField.setText("");
        AppIDlbl.setText("");
        dateField.setText("");
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppIDlbl;
    private javax.swing.JTable applicantTbl;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton dateBtn;
    private javax.swing.JTextField dateField;
    private javax.swing.JTextField firstNameField;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
