/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Librarian;

import Business.Branch;
import Business.Business;
import Magazine.Magazine;
import Library.RentRequest;
import Book.Book;
import Book.Genre;
import Book.Author;
import UserAccount.UserAccount;
import Library.Library;
import UI.MainJFrame;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author sruthisivasankar
 */
public class LibrarianJFrame extends javax.swing.JFrame {
    Business business;
    UserAccount useraccount;
    Branch branch;

    /**
     * Creates new form LibrarianJFrame
     */
    public LibrarianJFrame(Business business, Branch branch, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.business=business;
        this.useraccount=useraccount;
       
        this.branch=branch;
        branchLbl.setText(this.branch.getName());
      if(this.branch.getLibrary().getBookdirectory().getBookList().size()!=0){
        populatebookstable();}
          if(this.branch.getLibrary().getMagazinedirectory().getMagazinelist().size()!=0){
        populatemagazinetable();}
        checkrentstatus();
    }
    public void checkrentstatus(){
         DefaultTableModel model=(DefaultTableModel)rentalTbl.getModel();
        model.setRowCount(0);
        for (RentRequest r:this.branch.getLibrary().getRentaldirectory().getRequestList()){
             Object[] row=new Object[7];
                  if(r.getBook()==null){
                      
                      row[0]="";
                  }
                  else{
                  row[0]=r.getBook().getName();}
                  row[1]=r.getID();
                if(r.getMagazine()==null){
                     
                      row[2]="";}
                  
                  else{
                    row[2]=r.getMagazine().getName();}
                  row[3]=r.getPrice();
                  row[4]=r.getRentDuration();
                  row[5]=r.getStatus();
                  model.addRow(row);
        }

    }
    public void populatebookstable(){
        DefaultTableModel model=(DefaultTableModel)booksTbl.getModel();
        model.setRowCount(0);
       // System.out.println("running function");
        for(Book u:this.branch.getLibrary().getBookdirectory().getBookList()){
        // System.out.println("1stloop");
          
                Object[] row=new Object[9];
                  row[0]=u;
                  row[1]=u.getSerialNumber();
                  row[2]=u.getLanguage();
                  row[3]=u.getNoOfPages();
                  row[4]=u.getTypeOfBinding();
                  row[5]=u.getRegisterDate();                 
//                  row[6]=u.getAuthor().getAuthorName();
//                  row[7]=u.getAuthor().getAuthorRating();
                  row[6]=u.getAvailabilityflag();
                 if(u.getAuthor() != null && u.getAuthor().getAuthorName()!= null ){
                    row[7]=u.getAuthor().getAuthorName();}
                    
                if( u.getGenre() != null && u.getGenre().getName() != null){
                    row[8]=u.getGenre().getName();
                }
                  
                 // row[6]=String.join(",", s);
                  model.addRow(row);
    
        }
    }

     public void populatemagazinetable(){
         DefaultTableModel model=(DefaultTableModel)magazineTbl.getModel();
        model.setRowCount(0);
       // System.out.println("running function");
        for(Magazine u:this.branch.getLibrary().getMagazinedirectory().getMagazinelist()){
            Object[] row=new Object[6];
                  row[0]=u;
                  row[1]=u.getSerialNumber();
                  row[2]=u.getIssueType();
                  row[3]=u.getCompanyname();
                  row[4]=u.getRegisterDate();
                  row[5]=u.getAvailabilityflag();
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

        jLabel2 = new javax.swing.JLabel();
        bookNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        languageField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pagesField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bindingtypeField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        authorNameField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        authorRatingField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        magazinNameField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        companyNameField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        issuetypeField = new javax.swing.JTextField();
        addBookBtn = new javax.swing.JButton();
        addMagBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        booksTbl = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        magazineTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        branchLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rentalTbl = new javax.swing.JTable();
        bookApproveBtn = new javax.swing.JButton();
        magApproveBtn = new javax.swing.JButton();
        rejectBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        genreField = new javax.swing.JTextField();
        addGenreBtn = new javax.swing.JButton();
        genreCB = new javax.swing.JComboBox<>();
        addAuthorBtn = new javax.swing.JButton();
        authorCB = new javax.swing.JComboBox<>();
        backBTn = new javax.swing.JButton();
        assignAuthBtn = new javax.swing.JButton();
        assignGenreBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("BOOK NAME :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 70, 140, -1));
        getContentPane().add(bookNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 67, 98, -1));

        jLabel4.setText("LANGUAGE :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 111, 140, -1));
        getContentPane().add(languageField, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 108, 98, -1));

        jLabel5.setText("NO. OF PAGES");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 152, 140, -1));
        getContentPane().add(pagesField, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 149, 98, -1));

        jLabel6.setText("BINDING TYPE :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 193, 140, -1));
        getContentPane().add(bindingtypeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 190, 98, -1));

        jLabel8.setText("AUTHOR:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 213, 84, -1));
        getContentPane().add(authorNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 98, -1));

        jLabel15.setText("AUTHOR RATING:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 254, 110, -1));
        getContentPane().add(authorRatingField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 98, -1));

        jLabel7.setText("REGISTER DATE: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 230, 110, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 99, -1));

        jLabel11.setText("MAGAZINE NAME :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 353, -1, -1));
        getContentPane().add(magazinNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 350, 98, -1));

        jLabel13.setText("COMPANY NAME :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 394, -1, -1));
        getContentPane().add(companyNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 391, 100, -1));

        jLabel14.setText("ISSUE TYPE :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 435, -1, -1));
        getContentPane().add(issuetypeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 432, 100, -1));

        addBookBtn.setText("ADD BOOK");
        addBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        addMagBtn.setText("ADD MAGAZINE");
        addMagBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMagBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addMagBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 508, -1, -1));

        booksTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOK NAME", "SERIAL NUMBER", "LANGUAGE", "NO. OF PAGES", "BINDING TYPE", "REGISTER DATE", "AVAILABILITY STATUS", "AUTHOR", "GENRE"
            }
        ));
        jScrollPane1.setViewportView(booksTbl);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 67, 928, 135));

        magazineTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MAGAZINE NAME", "SERIAL NUMER", "ISSUE TYPE", "COMPANY NAME", "ISSUE DATE", "AVAILABILITY STATUS"
            }
        ));
        jScrollPane3.setViewportView(magazineTbl);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 350, 928, 135));

        jLabel1.setText("ISSUE DATE:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 467, -1, -1));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 467, 102, -1));

        branchLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        branchLbl.setForeground(new java.awt.Color(255, 51, 51));
        branchLbl.setText("Branch");
        getContentPane().add(branchLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel3.setText("BRANCH LOCATION:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 20, -1, -1));

        rentalTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOK NAME", "RENTAL ID", "MAGAZINE NAME", "PRICE", "DURATION", "AVAILABILITY STATUS"
            }
        ));
        jScrollPane2.setViewportView(rentalTbl);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 578, 930, 150));

        bookApproveBtn.setText("APPROVE BOOK REQUEST");
        bookApproveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookApproveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(bookApproveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, -1, -1));

        magApproveBtn.setText("APPROVE MAGAZINE REQUEST");
        magApproveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magApproveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(magApproveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, 222, -1));

        rejectBtn.setText("REJECT REQUEST");
        rejectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectBtnActionPerformed(evt);
            }
        });
        getContentPane().add(rejectBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, -1, -1));

        jLabel10.setText("GENRE :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 219, -1, -1));
        getContentPane().add(genreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 213, 104, -1));

        addGenreBtn.setText("ADD GENRE");
        addGenreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGenreBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addGenreBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));

        getContentPane().add(genreCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 260, 104, -1));

        addAuthorBtn.setText("ADD AUTHOR");
        addAuthorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAuthorBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addAuthorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, -1, -1));

        getContentPane().add(authorCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, 98, -1));

        backBTn.setBackground(new java.awt.Color(255, 0, 0));
        backBTn.setText("BACK");
        backBTn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTnActionPerformed(evt);
            }
        });
        getContentPane().add(backBTn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 20, -1, -1));

        assignAuthBtn.setText("ASSIGN AUTHOR");
        assignAuthBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignAuthBtnActionPerformed(evt);
            }
        });
        getContentPane().add(assignAuthBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 220, -1, -1));

        assignGenreBtn.setText("ASSIGN GENRE");
        assignGenreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignGenreBtnActionPerformed(evt);
            }
        });
        getContentPane().add(assignGenreBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 21)); // NOI18N
        jLabel9.setText("LIBRARIAN");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookBtnActionPerformed
        // TODO add your handling code here:
        Date date = jDateChooser1.getDate();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = dateFormat.format(date);
        Library l1=this.branch.getLibrary();
        Book b1=l1.getBookdirectory().createBook(Integer.parseInt(pagesField.getText()), languageField.getText(), bindingtypeField.getText(), bookNameField.getText(), dateString);
        pagesField.setText("");
        languageField.setText("");
        bindingtypeField.setText("");
        bookNameField.setText("");
        jDateChooser1.setDate(null);
        authorNameField.setText("");
        authorRatingField.setText("");
        genreField.setText("");
     //   genreCB.removeAllItems();
        //      System.out.println("b1 has these "+b1.getGenre().get(1));
        populatebookstable();
    }//GEN-LAST:event_addBookBtnActionPerformed

    private void addMagBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMagBtnActionPerformed
        // TODO add your handling code here:
        Date date = jDateChooser2.getDate();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = dateFormat.format(date);
        this.branch.getLibrary().getMagazinedirectory().newMagazine(companyNameField.getText(), issuetypeField.getText(),magazinNameField.getText(),dateString);
        companyNameField.setText("");
        issuetypeField.setText("");
        magazinNameField.setText("");
        jDateChooser2.setDate(null);
        populatemagazinetable();
    }//GEN-LAST:event_addMagBtnActionPerformed

    private void bookApproveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookApproveBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)rentalTbl.getModel();
        int index=rentalTbl.getSelectedRow();
        String s= model.getValueAt(index, 0).toString();
        int i=Integer.parseInt(model.getValueAt(index, 1).toString());
        
        Book tempbook= this.branch.getLibrary().getBookdirectory().searchbook(s);
        RentRequest temprequest=this.branch.getLibrary().getRentaldirectory().searchrequest(i);
        temprequest.setStatus("Booked");

        tempbook.setAvailabilityflag(false);
        checkrentstatus();
        populatebookstable();
    }//GEN-LAST:event_bookApproveBtnActionPerformed

    private void magApproveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magApproveBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)rentalTbl.getModel();
        int index=rentalTbl.getSelectedRow();
        String s= model.getValueAt(index, 2).toString();
        int i=Integer.parseInt(model.getValueAt(index, 1).toString());

        Magazine tempmagazine=this.branch.getLibrary().getMagazinedirectory().searchmagazine(s);
        RentRequest temprequest=this.branch.getLibrary().getRentaldirectory().searchrequest(i);
        temprequest.setStatus("Booked");

        tempmagazine.setAvailabilityflag(false);
        checkrentstatus();
        populatemagazinetable();
    }//GEN-LAST:event_magApproveBtnActionPerformed

    private void rejectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)rentalTbl.getModel();
        int index=rentalTbl.getSelectedRow();
        String s= model.getValueAt(index, 0).toString();
        int i=Integer.parseInt(model.getValueAt(index, 1).toString());
        Book tempbook= this.branch.getLibrary().getBookdirectory().searchbook(s);
        RentRequest temprequest=this.branch.getLibrary().getRentaldirectory().searchrequest(i);
        temprequest.setStatus("Rejected");
        checkrentstatus();
    }//GEN-LAST:event_rejectBtnActionPerformed

    private void addGenreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGenreBtnActionPerformed
        // TODO add your handling code here:
        String s=genreField.getText();

//        DefaultTableModel model=(DefaultTableModel)booksTbl.getModel();
//        int index=booksTbl.getSelectedRow();
//        String sm= model.getValueAt(index, 0).toString();
//
//        Book b=this.branch.getLibrary().getBookdirectory().searchbook(sm);
//        Genre gm=new Genre(s);
//        b.getGenre().add(gm);
//        genreCB.addItem(s);
//        model.setValueAt(s, index, 6);
    //    Genre g= new Genre(s);
        
        this.branch.getLibrary().getGenredirectory().newGenre(s);
        //       b.setGenre(g);

               genreCB.addItem(s);
               genreField.setText("");

       

    }//GEN-LAST:event_addGenreBtnActionPerformed

    private void backBTnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainJFrame(business, branch, useraccount);
    }//GEN-LAST:event_backBTnActionPerformed

    private void addAuthorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAuthorBtnActionPerformed
        // TODO add your handling code here:
        String author = authorNameField.getText();
        double authorRatingDouble = Double.parseDouble(authorRatingField.getText());
     //   Author a= new Author(author,authorRatingDouble);
        this.branch.getLibrary().getAuthordirectory().newAuthor(author, authorRatingDouble);
        authorCB.addItem(author);
        authorNameField.setText("");
    }//GEN-LAST:event_addAuthorBtnActionPerformed

    private void assignAuthBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignAuthBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model =(DefaultTableModel)booksTbl.getModel();
        int index = booksTbl.getSelectedRow();
        String bookname = model.getValueAt(index, 0).toString();
        Book b = this.branch.getLibrary().getBookdirectory().searchbook(bookname);
        
        String value= authorCB.getSelectedItem().toString();
        Author anew=this.branch.getLibrary().getAuthordirectory().searchauthor(value);
        b.setAuthor(anew);
        
        model.setValueAt(anew.getAuthorName(),index,7);
        
    }//GEN-LAST:event_assignAuthBtnActionPerformed

    private void assignGenreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignGenreBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model =(DefaultTableModel)booksTbl.getModel();
        int index = booksTbl.getSelectedRow();
        String bookname = model.getValueAt(index, 0).toString();
        Book b = this.branch.getLibrary().getBookdirectory().searchbook(bookname);
        
        String value= genreCB.getSelectedItem().toString();
        Genre gnew=this.branch.getLibrary().getGenredirectory().searchgenre(value);
        b.setGenre(gnew);
        
        model.setValueAt(gnew.getName(), index, 8);
    }//GEN-LAST:event_assignGenreBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new LibrarianJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAuthorBtn;
    private javax.swing.JButton addBookBtn;
    private javax.swing.JButton addGenreBtn;
    private javax.swing.JButton addMagBtn;
    private javax.swing.JButton assignAuthBtn;
    private javax.swing.JButton assignGenreBtn;
    private javax.swing.JComboBox<String> authorCB;
    private javax.swing.JTextField authorNameField;
    private javax.swing.JTextField authorRatingField;
    private javax.swing.JButton backBTn;
    private javax.swing.JTextField bindingtypeField;
    private javax.swing.JButton bookApproveBtn;
    private javax.swing.JTextField bookNameField;
    private javax.swing.JTable booksTbl;
    private javax.swing.JLabel branchLbl;
    private javax.swing.JTextField companyNameField;
    private javax.swing.JComboBox<String> genreCB;
    private javax.swing.JTextField genreField;
    private javax.swing.JTextField issuetypeField;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JTextField languageField;
    private javax.swing.JButton magApproveBtn;
    private javax.swing.JTextField magazinNameField;
    private javax.swing.JTable magazineTbl;
    private javax.swing.JTextField pagesField;
    private javax.swing.JButton rejectBtn;
    private javax.swing.JTable rentalTbl;
    // End of variables declaration//GEN-END:variables
}
