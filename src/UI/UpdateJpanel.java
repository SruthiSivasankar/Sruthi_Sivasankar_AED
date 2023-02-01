/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Contact;
import Model.Recipe;
import Model.User;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author sruthisivasankar
 */
public class UpdateJpanel extends javax.swing.JPanel {
    
    private User user;
    private Recipe recipe;
    

    /**
     * Creates new form Update
     */
    public UpdateJpanel() {
        initComponents();
    }
    UpdateJpanel(User user){
        initComponents();
        this.user= user;
        
        displayRecipeList();       
        displayUserDetails();
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
        LastNameTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        UserNameTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mailIdTxtField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        phoneTxtField = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        recipeTitleTxtField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        difficultyTxtField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        categoryTxtField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        descTxtField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        imagePathTxtField = new javax.swing.JTextField();
        btnUpdateRecipe = new javax.swing.JButton();
        recipeComboBox1 = new javax.swing.JComboBox<>();
        btnDisplay = new javax.swing.JButton();
        firstNametxt = new javax.swing.JTextField();
        imageLabel = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        glutenTxtField = new javax.swing.JTextField();
        servingsTextField = new javax.swing.JTextField();
        ingredientsTxtField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel1.setText("About Chef:");

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Username:");

        UserNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameTxtFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel5.setText("Contact:");

        jLabel6.setText("Email ID:");

        jLabel7.setText("Phone No:");

        btnEdit.setBackground(new java.awt.Color(204, 51, 0));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("EDIT");
        btnEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel8.setText("Recipe:");

        jLabel9.setText("Recipe Name:");

        recipeTitleTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recipeTitleTxtFieldActionPerformed(evt);
            }
        });

        jLabel10.setText("No. of Servings:");

        jLabel11.setText("Gluten Free:");

        jLabel12.setText("Difficulty level:");

        jLabel13.setText("No. of Ingredients:");

        jLabel14.setText("Category:");

        jLabel15.setText("Description:");

        jLabel16.setText("Image:");

        imagePathTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagePathTxtFieldActionPerformed(evt);
            }
        });

        btnUpdateRecipe.setBackground(new java.awt.Color(204, 51, 0));
        btnUpdateRecipe.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateRecipe.setText("UPDATE RECIPE");
        btnUpdateRecipe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnUpdateRecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateRecipeActionPerformed(evt);
            }
        });

        recipeComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnDisplay.setBackground(new java.awt.Color(153, 153, 153));
        btnDisplay.setText("DISPLAY");
        btnDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        imageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSearch.setBackground(new java.awt.Color(153, 153, 153));
        btnSearch.setText("SEARCH");
        btnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(firstNametxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LastNameTxtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(26, 26, 26)
                                .addComponent(mailIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(phoneTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnUpdateRecipe, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ingredientsTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(servingsTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(glutenTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(recipeTitleTxtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addComponent(difficultyTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(categoryTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(descTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(imagePathTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(recipeComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDisplay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(mailIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(phoneTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnEdit))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(recipeComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDisplay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(recipeTitleTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(glutenTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(difficultyTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(ingredientsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(categoryTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(descTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(imagePathTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSearch)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 87, Short.MAX_VALUE)
                                .addComponent(btnUpdateRecipe))
                            .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(servingsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateRecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateRecipeActionPerformed
        // TODO add your handling code here:
        this.recipe.setRecipeTitle(recipeTitleTxtField.getText());
        this.recipe.setNoOfServing(Integer.valueOf(servingsTextField.getText()));
        this.recipe.setDifficultyLevel(Double.valueOf(difficultyTxtField.getText()));
        this.recipe.setNoOfIngrediaents(Integer.valueOf(ingredientsTxtField.getText()));
        this.recipe.setCategoryOfFood(categoryTxtField.getText());
        this.recipe.setDescription(descTxtField.getText());
        this.recipe.setImage(imagePathTxtField.getText());
        
    }//GEN-LAST:event_btnUpdateRecipeActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        String firstName = firstNametxt.getText();
        String lastName = LastNameTxtField.getText();
        String userName=UserNameTxtField.getText();
        
        String mailId = mailIdTxtField.getText();
        long phoneNo = Long.parseLong(phoneTxtField.getText());
        
        this.user.setChefFirstName(firstName);
        this.user.setChefLastName(lastName);
        this.user.setUserName(userName);
   
        Contact contact=this.user.getContact();
        contact.setEmailId(mailId);
        contact.setPhoneNo(phoneNo);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        FileNameExtensionFilter fnef= new FileNameExtensionFilter("IMAGES","png","jpg","jpeg");
        JFileChooser browseImageFile= new JFileChooser();
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
        if(showOpenDialogue==JFileChooser.APPROVE_OPTION){
            File selectedImageFile= browseImageFile.getSelectedFile();
            String selectedImagePath= selectedImageFile.getAbsolutePath();
            
            imagePathTxtField.setText(selectedImagePath);
            
            JOptionPane.showMessageDialog(null,selectedImagePath );
            
            ImageIcon i1=new ImageIcon(selectedImagePath);
           
            Image image=i1.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(image));
            
            
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void imagePathTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagePathTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imagePathTxtFieldActionPerformed

    private void recipeTitleTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recipeTitleTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recipeTitleTxtFieldActionPerformed

    private void UserNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameTxtFieldActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        // TODO add your handling code here:
        recipeTitleTxtField.setEnabled(false);
        String recipeTitle=(String)recipeComboBox1.getSelectedItem();
        
        Recipe recipe1=this.user.findRecipe(recipeTitle);
        this.recipe=recipe1;
        
        if(!recipe1.equals(null)){
            recipeTitleTxtField.setText(recipe1.getRecipeTitle());
            servingsTextField.setText(String.valueOf(recipe1.getNoOfServing()));
            difficultyTxtField.setText(String.valueOf(recipe1.getDifficultyLevel()));
            ingredientsTxtField.setText(String.valueOf(recipe1.getNoOfIngrediaents()));
            categoryTxtField.setText(recipe1.getCategoryOfFood());
            descTxtField.setText(recipe1.getDescription());
            
            if(recipe1.isIsGlutenFree()){
                glutenTxtField.setText("Yes");
            }
            else{
                glutenTxtField.setText("No");
            }
            imagePathTxtField.setText(recipe1.getImage());
            ImageIcon i=new ImageIcon(recipe1.getImage());
            Image image=i.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(image));
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Recipe not found");
        }
    }//GEN-LAST:event_btnDisplayActionPerformed
 public void displayRecipeList() {

      for(Recipe r : this.user.getRecipeList()){
          recipeComboBox1.addItem(r.getRecipeTitle());
      }
 }
 
    public void displayUserDetails() {
        firstNametxt.setText(String.valueOf(this.user.getChefFirstName()));
        LastNameTxtField.setText(String.valueOf(this.user.getChefLastName()));
        UserNameTxtField.setText(String.valueOf(this.user.getUserName()));

        Contact contact = this.user.getContact();
        mailIdTxtField.setText(String.valueOf(contact.getEmailId()));
        phoneTxtField.setText(String.valueOf(contact.getPhoneNo()));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LastNameTxtField;
    private javax.swing.JTextField UserNameTxtField;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdateRecipe;
    private javax.swing.JTextField categoryTxtField;
    private javax.swing.JTextField descTxtField;
    private javax.swing.JTextField difficultyTxtField;
    private javax.swing.JTextField firstNametxt;
    private javax.swing.JTextField glutenTxtField;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JTextField imagePathTxtField;
    private javax.swing.JTextField ingredientsTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mailIdTxtField;
    private javax.swing.JTextField phoneTxtField;
    private javax.swing.JComboBox<String> recipeComboBox1;
    private javax.swing.JTextField recipeTitleTxtField;
    private javax.swing.JTextField servingsTextField;
    // End of variables declaration//GEN-END:variables
}
