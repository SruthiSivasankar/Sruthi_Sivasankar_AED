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
public class InsuranceJPanel extends javax.swing.JPanel {
    Business business;
    InsuranceDirectory insuranceList;

    /**
     * Creates new form InsuranceJPanel
     */
    public InsuranceJPanel(InsuranceDirectory insuranceList) {
        initComponents();
        this.business=business;
        this.insuranceList=insuranceList;
        populateInsuranceTable();
    }
    public void populateInsuranceTable(){
           DefaultTableModel model= (DefaultTableModel )insuranceTbl.getModel();
           // TableColumn insurancecolumn=model.getColumnModel.getColumn(5);
            model.setRowCount(0);
            
        for(Insurance  io : insuranceList.getInsuranceList()){
            Object[]row =new Object[4];
            row[0]=io;
            row[1]=io.getPlanName();
            row[2]=io.getCostPerMonth();
                    
            row[3]=io.getCostPerAnnum();
            
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

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        IdLable = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        cpmField = new javax.swing.JTextField();
        cpaLable = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        insuranceTbl = new javax.swing.JTable();
        updateBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Plan ID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel6.setText("Plan Name:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel7.setText("Cost per Month:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel8.setText("Cost per Annum:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, 30));

        IdLable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(IdLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 110, 24));

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameFieldKeyReleased(evt);
            }
        });
        add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 110, -1));

        cpmField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpmFieldActionPerformed(evt);
            }
        });
        cpmField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cpmFieldKeyReleased(evt);
            }
        });
        add(cpmField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 110, -1));

        cpaLable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(cpaLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 110, 24));

        insuranceTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plan ID", "Plan Name", "Cost For a Month", "Annum cost"
            }
        ));
        insuranceTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insuranceTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(insuranceTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, 98));

        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 120, -1));

        createBtn.setText("CREATE");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 127, 20));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel1.setText("ADD INSURANCE PLAN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void nameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_nameFieldKeyReleased

    private void cpmFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpmFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpmFieldActionPerformed

    private void cpmFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpmFieldKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_cpmFieldKeyReleased

    private void insuranceTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insuranceTblMouseClicked
        // TODO add your handling code here:
        if(insuranceTbl.getSelectedRowCount()==1){
            int selectedRowIndex=insuranceTbl.getSelectedRow();
            DefaultTableModel model= (DefaultTableModel )insuranceTbl.getModel();
            IdLable.setText(model.getValueAt(selectedRowIndex, 0).toString());
            nameField.setText(model.getValueAt(selectedRowIndex, 1).toString());
            cpmField.setText(model.getValueAt(selectedRowIndex,2).toString());
            cpaLable.setText(model.getValueAt(selectedRowIndex,3).toString());
        }
    }//GEN-LAST:event_insuranceTblMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex=insuranceTbl.getSelectedRow();

        DefaultTableModel model= (DefaultTableModel )insuranceTbl.getModel();
        int store=Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString());
        for (Insurance a: insuranceList.getInsuranceList()){
            if(a.getPlanId()==store){
                model.setValueAt(IdLable.getText(),insuranceTbl.getSelectedRow() , 0);
                model.setValueAt(nameField.getText(),insuranceTbl.getSelectedRow() , 1);
                model.setValueAt(cpmField.getText(),insuranceTbl.getSelectedRow() , 2);
                cpaLable.setText(String.valueOf(Integer.parseInt(cpmField.getText())*12));
                model.setValueAt(cpaLable.getText(),insuranceTbl.getSelectedRow() , 3);

            }
        }

        nameField.setText("");
        cpmField.setText("");
        IdLable.setText("");
        cpaLable.setText("");
    }//GEN-LAST:event_updateBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        String pn=nameField.getText();

        if(pn.equals("") ) {
            JOptionPane.showMessageDialog(null, "please enter all details ");

        }
        else if(cpmField.getText().length()==0){
            JOptionPane.showMessageDialog(null, "please enter all details ");
        }
        else{
            double cpm=Double.parseDouble(cpmField.getText());
            Insurance insurance=new Insurance(pn,cpm);
            insuranceList.getInsuranceList().add(insurance);
            //      //  Insurance insurance= this.business.getInsurancedirectory().getInsurancelist().add(pn)newInsurance(pn, cpm);
            //       // System.out.println(insurance.toString());
            IdLable.setText(String.valueOf(insurance.getPlanId()));
            cpaLable.setText(String.valueOf(insurance.getCostPerAnnum()));
            JOptionPane.showMessageDialog(null, "plan details added");
            IdLable.setText("");
            cpaLable.setText("");
            nameField.setText("");
            cpmField.setText("");
            DefaultTableModel model= (DefaultTableModel )insuranceTbl.getModel();
            // TableColumn insurancecolumn=model.getColumnModel.getColumn(5);
            model.setRowCount(0);

            for(Insurance  io : insuranceList.getInsuranceList()){
                Object[]row =new Object[4];
                row[0]=io;
                row[1]=io.getPlanName();
                row[2]=io.getCostPerMonth();

                row[3]=io.getCostPerAnnum();

                model.addRow(row);
            }
        }

    }//GEN-LAST:event_createBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdLable;
    private javax.swing.JLabel cpaLable;
    private javax.swing.JTextField cpmField;
    private javax.swing.JButton createBtn;
    private javax.swing.JTable insuranceTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
