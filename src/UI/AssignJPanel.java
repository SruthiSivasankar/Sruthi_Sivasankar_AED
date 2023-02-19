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
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author sruthisivasankar
 */
public class AssignJPanel extends javax.swing.JPanel {
        Business business;
        Insurance insurance;
        Applicant applicant;

    /**
     * Creates new form AssignJPanel
     */      
        
    public AssignJPanel(Business business) {
        initComponents();
        this.business=business;
        populateTable();
        populateInsuranceCB();
    }
    public void populateTable(){
            DefaultTableModel model= (DefaultTableModel )jTable1.getModel();
            model.setRowCount(0);
            
        for(Applicant  io : business.getApplicantDirectory().getApplicantList()){
            for(int i=0;i<io.getPet().getVaccineList().size();i++){
            Object[]row =new Object[11];
           row[0]=io;
            row[1]=io.getOwnerLastName();
            row[2]=io.getApplicationId();
            row[3]=io.getPet().getPetName();
            row[4]=io.getPet().getPetAge();
            row[5]=io.getPet().getPetGender();
            row[6]=io.getPet().getPetType();
            row[7]=io.getPet().getPetbreed();
            row[8]=io.getPet().getVaccineList().get(i).getVaccineName();
            row[9]=io.getPet().getVaccineList().get(i).isVaccinated();
            
            
            model.addRow(row);
        }
        }
                
    }
    public void populateInsuranceCB(){
        for(Insurance i: this.business.getInsuranceDirectory().getInsuranceList()){
           InsuranceCB.addItem(String.valueOf(i.getPlanId()));
        }
    }
    private void search(String str){
        DefaultTableModel model= (DefaultTableModel )jTable1.getModel();
        TableRowSorter<DefaultTableModel> trs =new TableRowSorter<>(model);
        jTable1.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str ));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        InsuranceCB = new javax.swing.JComboBox();
        assignBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "ID", "Pet Name", "Pet Age", "Pet Gender", "Pet Type", "Pet Breed", "Vaccination Name", "Vaccinated?", "Insurance"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 880, 137));

        add(InsuranceCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 130, -1));

        assignBtn.setText("ASSIGN");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });
        add(assignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 130, -1));

        jLabel1.setText("Select the Insurance:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 130, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel3.setText("ASSIGN INSURANCE");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        // TODO add your handling code here:
         //get the insurance object from combobox
        int iid=Integer.parseInt(InsuranceCB.getSelectedItem().toString());
        //find the insurance object from business class
        Insurance insurance=business.findInsurance(iid);
                //getting the applicatiant object to set his pet insurance
                int selectedRowIndex=jTable1.getSelectedRow();
                if (selectedRowIndex == -1 ){
            JOptionPane.showMessageDialog(null, "Please select an applicant to delete");
        }else {
                int id=Integer.parseInt(jTable1.getValueAt(selectedRowIndex, 2).toString());
                 Applicant applicant=this.business.findApplicant(id);
                 this.applicant=applicant;
                 applicant.getPet().setInsurance(insurance);
        //setting the value of insurance to table
                DefaultTableModel model= (DefaultTableModel )jTable1.getModel();
                model.setValueAt(insurance.getPlanName(), selectedRowIndex, 10);
                }
    }//GEN-LAST:event_assignBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox InsuranceCB;
    private javax.swing.JButton assignBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
