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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sruthisivasankar
 */
public class ApplicantJPanel extends javax.swing.JPanel {
    Business business;
    Applicant applicant;
     ArrayList<Applicant> AppArray=new ArrayList<Applicant>();
     ArrayList<Applicant> AppArrayId =new ArrayList<Applicant>();

    /**
     * Creates new form ApplicantJPanel
     */
    public ApplicantJPanel(Business business) {
        initComponents();
        this.business=business;
        populateApplicantCB();
        
        populatePetTable();
        populateVaccineTable();

    }
    public void populatePetTable(){
          
        DefaultTableModel model= (DefaultTableModel )petTbl.getModel();
        model.setRowCount(0);
        for(Applicant  io :this.business.getApplicantDirectory().getApplicantList()){
            Object[]row =new Object[5];
            row[0]=io.getPet().getPetName();
            row[1]=io.getPet().getPetAge();
            row[2]=io.getPet().getPetGender();
            row[3]=io.getPet().getPetbreed();
            row[4]=io.getPet().getPetType();
            
            model.addRow(row);
        }
    }
    public void populateVaccineTable(){
        DefaultTableModel model1= (DefaultTableModel )vaccineTbl.getModel();
                model1.setRowCount(0);
        for(Applicant  io :this.business.getApplicantDirectory().getApplicantList()){
            for(int i=0;i<io.getPet().getVaccineList().size();i++){
            Object[]row =new Object[3];
            row[0]=io.getPet().getVaccineList().get(i).getVaccineName();
            
            row[1]=io.getPet().getVaccineList().get(i).isVaccinated();
            row[2]=io.getPet().getPetName();
            
            model1.addRow(row);
            }
        }
    }
    public  void populateApplicantCB(){
      for(Applicant a:this.business.getApplicantDirectory().getApplicantList()){
          applicantComboBox.addItem(toString(a.getApplicationId()));
          
      }
    }
    public String toString(int a){
        return  String.valueOf(a);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        vaccinated = new javax.swing.ButtonGroup();
        applicantComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        applicantTbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        searchNameField = new javax.swing.JTextField();
        searchNameBtn = new javax.swing.JButton();
        searchIDfield = new javax.swing.JTextField();
        searchIDbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        petNameField = new javax.swing.JTextField();
        petAgeField = new javax.swing.JTextField();
        petTypeField = new javax.swing.JTextField();
        petBreedField = new javax.swing.JTextField();
        maleBtn = new javax.swing.JRadioButton();
        femaleBtn = new javax.swing.JRadioButton();
        petGenderField = new javax.swing.JTextField();
        genderBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        petTbl = new javax.swing.JTable();
        updatePet = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        vaccineNameField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        yesBtn = new javax.swing.JRadioButton();
        noBtn = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        vaccineTbl = new javax.swing.JTable();
        updateVaccine = new javax.swing.JButton();
        createVaccine = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add(applicantComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 220, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel1.setText("SELECT APPLICANT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 17, 180, 30));

        applicantTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "ID", "Date"
            }
        ));
        jScrollPane1.setViewportView(applicantTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 530, 150));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel2.setText("SEARCH APPLICANT");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));
        add(searchNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 130, -1));

        searchNameBtn.setText("Search by Name");
        searchNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchNameBtnActionPerformed(evt);
            }
        });
        add(searchNameBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 130, -1));
        add(searchIDfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 130, -1));

        searchIDbtn.setText("Search by ID");
        searchIDbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchIDbtnActionPerformed(evt);
            }
        });
        add(searchIDbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 130, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel3.setText("ENTER PET DETAILS");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));
        add(petNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 120, -1));
        add(petAgeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 120, -1));

        petTypeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petTypeFieldActionPerformed(evt);
            }
        });
        add(petTypeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 120, -1));
        add(petBreedField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 120, -1));

        gender.add(maleBtn);
        maleBtn.setText("Male");
        add(maleBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, -1, -1));

        gender.add(femaleBtn);
        femaleBtn.setText("Female");
        add(femaleBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, -1, -1));
        add(petGenderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 120, -1));

        genderBtn.setText("Add Gender");
        genderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderBtnActionPerformed(evt);
            }
        });
        add(genderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 120, -1));

        jLabel4.setText("Pet Name:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel5.setText("Pet Age:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jLabel6.setText("Pet Gender:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        jLabel7.setText("Pet  Type:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        jLabel8.setText("Pet Breed:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, -1, -1));

        petTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pet Name", "Pet Age", "Pet Gender", "Pet Breed", "Pet Type"
            }
        ));
        petTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                petTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(petTbl);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 520, 130));

        updatePet.setText("UPDATE PET DETAILS");
        updatePet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePetActionPerformed(evt);
            }
        });
        add(updatePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 170, -1));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel9.setText("EDIT VACCINATION DETAILS");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, -1, -1));
        add(vaccineNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 760, 120, -1));

        jLabel10.setText("Vaccine Name:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 760, -1, -1));

        vaccinated.add(yesBtn);
        yesBtn.setText("Yes");
        add(yesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 830, -1, -1));

        vaccinated.add(noBtn);
        noBtn.setText("No");
        add(noBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 870, -1, -1));

        jLabel11.setText("Vaccinated?");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 830, -1, -1));

        createBtn.setText("CREATE");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, -1, -1));

        vaccineTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccination name", "Vaccinated?", "Pet Name"
            }
        ));
        vaccineTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vaccineTblMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(vaccineTbl);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 700, -1, 130));

        updateVaccine.setText("UPDATE VACCINATION DETAILS");
        updateVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateVaccineActionPerformed(evt);
            }
        });
        add(updateVaccine, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 860, -1, -1));

        createVaccine.setText("CREATE VACCINE");
        createVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createVaccineActionPerformed(evt);
            }
        });
        add(createVaccine, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 860, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void genderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderBtnActionPerformed
        // TODO add your handling code here:
         if(maleBtn.isSelected()==true){
            petGenderField.setText("Male");
        }
        else if(femaleBtn.isSelected()==true){
            petGenderField.setText("Female");
        }
    }//GEN-LAST:event_genderBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        if(petNameField.getText().equals("") || petAgeField.getText().equals("")||petGenderField.getText().equals("")||petTypeField.getText().equals("")||petBreedField.getText().equals("")
               ){
                JOptionPane.showMessageDialog(null, "Enter all details");
   
       }
               
        int applicationId=Integer.parseInt(applicantComboBox.getSelectedItem().toString());
        
        Applicant applicant=this.business.findApplicant(applicationId);
        
        this.applicant=applicant;
        
        String petname=petNameField.getText();
        String type=petTypeField.getText();
        String breed=petBreedField.getText();
        int age=Integer.parseInt(petAgeField.getText());
        String gender=petGenderField.getText();

        Pet pet=new Pet(petname,age,gender,type,breed);
        applicant.setPet(pet);
        JOptionPane.showMessageDialog(null, "pet details added for applicant");
        
        petNameField.setText("");
        petTypeField.setText("");
        petBreedField.setText("");
        petAgeField.setText("");
        petGenderField.setText("");
        vaccineNameField.setText("");
        
        
        DefaultTableModel model= (DefaultTableModel )petTbl.getModel();
        model.setRowCount(0);
        for(Applicant  io :this.business.getApplicantDirectory().getApplicantList()){
            Object[]row =new Object[5];
            row[0]=io.getPet().getPetName();
            row[1]=io.getPet().getPetAge();
            row[2]=io.getPet().getPetGender();
            row[3]=io.getPet().getPetbreed();
            row[4]=io.getPet().getPetType();
            
            model.addRow(row);
        }
                                             
                                           
    }//GEN-LAST:event_createBtnActionPerformed

    private void petTypeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petTypeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_petTypeFieldActionPerformed

    private void searchNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchNameBtnActionPerformed
        // TODO add your handling code here:
        String store=searchNameField.getText();
        
        for (Applicant a: this.business.getApplicantDirectory().getApplicantList()){
            if (a.getOwnerFirstName().equalsIgnoreCase(store)){
                AppArray.add(a);
            }
          }
        System.out.println(AppArray.size());
        
         
       
         DefaultTableModel model= (DefaultTableModel )applicantTbl.getModel();
           // TableColumn insurancecolumn=model.getColumnModel.getColumn(5);
           for(int i=0;i<AppArray.size();i++)
           {   Applicant applicant1=AppArray.get(i);
               model.setRowCount(i);
                System.out.println(applicant1.getApplicationId());

        
                Object[]row =new Object[4];
                row[0]=applicant1;
                row[1]=applicant1.getOwnerLastName();
                row[2]=applicant1.getApplicationId();
                row[3]=applicant1.getApplicationDate();  
                model.addRow(row);
           }
    }//GEN-LAST:event_searchNameBtnActionPerformed

    private void updatePetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePetActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex=petTbl.getSelectedRow();
               
                DefaultTableModel model= (DefaultTableModel )petTbl.getModel();
                String store=model.getValueAt(selectedRowIndex, 0).toString();
                for (Applicant a: this.business.getApplicantDirectory().getApplicantList()){
                    if(a.getPet().getPetName().equals(store)){
                       model.setValueAt(petNameField.getText(),petTbl.getSelectedRow() , 0);
                       model.setValueAt(petAgeField.getText(),petTbl.getSelectedRow() , 1);
                       model.setValueAt(petGenderField.getText(),petTbl.getSelectedRow() , 2);
                       model.setValueAt(petBreedField.getText(),petTbl.getSelectedRow() , 3);
                       model.setValueAt(petTypeField.getText(),petTbl.getSelectedRow() , 4);

                    }
                }

                petNameField.setText("");
                petAgeField.setText("");
                petGenderField.setText("");
                petBreedField.setText("");
                petTypeField.setText("");
    }//GEN-LAST:event_updatePetActionPerformed

    private void updateVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateVaccineActionPerformed
        // TODO add your handling code here:
         int selectedRowIndex=vaccineTbl.getSelectedRow();
               
                DefaultTableModel model= (DefaultTableModel )vaccineTbl.getModel();
                String store=model.getValueAt(selectedRowIndex, 0).toString();
                for (Applicant a: this.business.getApplicantDirectory().getApplicantList()){
                    for (int i=0;i<a.getPet().getVaccineList().size();i++){
                    if(a.getPet().getVaccineList().get(i).getVaccineName().equals(store)){
                       model.setValueAt(vaccineNameField.getText(),vaccineTbl.getSelectedRow() , 0);
                        if(yesBtn.isSelected()==true){
                                model.setValueAt("Yes",vaccineTbl.getSelectedRow() , 1);
                         }
                        else{
                                model.setValueAt("No",vaccineTbl.getSelectedRow() , 1);
                          
                        }

                    }
                }
                }

                vaccineNameField.setText("");
    }//GEN-LAST:event_updateVaccineActionPerformed

    private void searchIDbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchIDbtnActionPerformed
        // TODO add your handling code here:
        int Storeid=Integer.parseInt(searchIDfield.getText());
        for (Applicant a: this.business.getApplicantDirectory().getApplicantList()){
            if (a.getApplicationId()==Storeid){
                AppArrayId.add(a);
            }
        }
        System.out.println(AppArrayId.size());
        DefaultTableModel model= (DefaultTableModel )applicantTbl.getModel();
           // TableColumn insurancecolumn=model.getColumnModel.getColumn(5);
           for(int i=0;i<AppArrayId.size();i++)
           {   Applicant applicant1=AppArrayId.get(i);
               model.setRowCount(i);
                System.out.println(applicant1.getApplicationId());

        
                Object[]row =new Object[4];
                row[0]=applicant1;
                row[1]=applicant1.getOwnerLastName();
                row[2]=applicant1.getApplicationId();
                row[3]=applicant1.getApplicationDate();  
                model.addRow(row);
           }
    }//GEN-LAST:event_searchIDbtnActionPerformed

    private void petTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_petTblMouseClicked
        // TODO add your handling code here:
        if(petTbl.getSelectedRowCount()==1){
        int selectedRowIndex=petTbl.getSelectedRow();
        DefaultTableModel model= (DefaultTableModel )petTbl.getModel();
        petNameField.setText(model.getValueAt(selectedRowIndex, 0).toString());
        petAgeField.setText(model.getValueAt(selectedRowIndex, 1).toString());
        petGenderField.setText(model.getValueAt(selectedRowIndex,2).toString());
        petBreedField.setText(model.getValueAt(selectedRowIndex,3).toString());
        petTypeField.setText(model.getValueAt(selectedRowIndex,4).toString());

         }  
    }//GEN-LAST:event_petTblMouseClicked

    private void vaccineTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vaccineTblMouseClicked
        // TODO add your handling code here:
         if(vaccineTbl.getSelectedRowCount()==1){
        int selectedRowIndex=vaccineTbl.getSelectedRow();
        DefaultTableModel model= (DefaultTableModel )vaccineTbl.getModel();
        vaccineNameField.setText(model.getValueAt(selectedRowIndex, 0).toString());
        String s=model.getValueAt(selectedRowIndex, 1).toString();
        if(s.equals("true")){
            yesBtn.setEnabled(true);
        }
        else{
            noBtn.setEnabled(true);
        }
            
        
         }  
    }//GEN-LAST:event_vaccineTblMouseClicked

    private void createVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createVaccineActionPerformed
        // TODO add your handling code here:
        
         if(vaccineNameField.getText().equals("") 
               ){
                JOptionPane.showMessageDialog(null, "Enter all details");
   
       }
        int aid=Integer.parseInt(applicantComboBox.getSelectedItem().toString());
        
        Applicant applicant=this.business.findApplicant(aid);
         String vaccinename=vaccineNameField.getText();
        Boolean vaccinated;
        if(yesBtn.isSelected()==true){
            vaccinated=true;
        }
        else{
            vaccinated=false;
        }
        applicant.getPet().addVaccine(vaccinename, vaccinated);
       
        DefaultTableModel model1= (DefaultTableModel )vaccineTbl.getModel();
                model1.setRowCount(0);

        for(Applicant  io :this.business.getApplicantDirectory().getApplicantList()){
            int size=io.getPet().getVaccineList().size();
            for(int s=0; s<size ; s++){
            Object[]row =new Object[3];
            row[0]=io.getPet().getVaccineList().get(s).getVaccineName();
            row[1]=io.getPet().getVaccineList().get(s).isVaccinated();
            row[2]=io.getPet().getPetName();
            
            
            model1.addRow(row);
            }
        }
    }//GEN-LAST:event_createVaccineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox applicantComboBox;
    private javax.swing.JTable applicantTbl;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton createVaccine;
    private javax.swing.JRadioButton femaleBtn;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JButton genderBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton maleBtn;
    private javax.swing.JRadioButton noBtn;
    private javax.swing.JTextField petAgeField;
    private javax.swing.JTextField petBreedField;
    private javax.swing.JTextField petGenderField;
    private javax.swing.JTextField petNameField;
    private javax.swing.JTable petTbl;
    private javax.swing.JTextField petTypeField;
    private javax.swing.JButton searchIDbtn;
    private javax.swing.JTextField searchIDfield;
    private javax.swing.JButton searchNameBtn;
    private javax.swing.JTextField searchNameField;
    private javax.swing.JButton updatePet;
    private javax.swing.JButton updateVaccine;
    private javax.swing.ButtonGroup vaccinated;
    private javax.swing.JTextField vaccineNameField;
    private javax.swing.JTable vaccineTbl;
    private javax.swing.JRadioButton yesBtn;
    // End of variables declaration//GEN-END:variables
}
