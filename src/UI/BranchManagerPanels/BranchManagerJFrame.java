/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.BranchManagerPanels;

import Business.Branch;
import Business.Business;
import Magazine.Magazine;
import UI.MainJFrame;
import UserAccount.UserAccount;
import javax.swing.table.DefaultTableModel;
import Book.Book;
import Library.RentRequest;
/**
 *
 * @author Nidhi Raghavendra
 */
public class BranchManagerJFrame extends javax.swing.JFrame {

    private final Business business;
    private final Branch branch;
    private final UserAccount useraccount;

    /**
     * Creates new form BranchManagerJFrame
     */
    

    public BranchManagerJFrame(Business business, Branch branch, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.business = business;
        this.branch = branch;
        this.useraccount = useraccount;
        
        jLabel1.setText(branch.getName());
        if(this.branch.getLibrary().getBookdirectory().getBookList().size()!=0){
        populatebookstable();}
        if(this.branch.getLibrary().getMagazinedirectory().getMagazinelist().size()!=0){
        populatemagazinetable();}
        checkrentstatus();
  
    }
     public void populatebookstable(){
        DefaultTableModel model=(DefaultTableModel)bookTbl.getModel();
        model.setRowCount(0);
       // System.out.println("running function");
        for(Book u:this.branch.getLibrary().getBookdirectory().getBookList()){
        // System.out.println("1stloop");
          
                Object[] row=new Object[7];
                  row[0]=u;
                  row[1]=u.getSerialNumber();
                  row[2]=u.getLanguage();
                  row[3]=u.getTypeOfBinding();
                  row[4]=u.getAuthor().getAuthorName();
                  row[5]=u.getAvailabilityflag();
                 
                  
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
                  row[2]=u.getCompanyname();
                  row[3]=u.getIssueType();
                  row[4]=u.getAvailabilityflag();
                  model.addRow(row);

        }
                
     }
      
      public void checkrentstatus(){
         DefaultTableModel model=(DefaultTableModel)rentTbl.getModel();
        model.setRowCount(0);
        for (RentRequest r:this.branch.getLibrary().getRentaldirectory().getRequestList()){
             Object[] row=new Object[6];
                  row[0]=r;
                  row[1]=r.getID();
                  row[2]=r.getPrice();
                  row[3]=r.getRentDuration();
                  row[4]=r.getStatus();
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
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        bookTbl = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        magazineTbl = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        rentTbl = new javax.swing.JTable();
        revenueBtn = new javax.swing.JButton();
        RevenueDisplay = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Branch Name");

        bookTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "BOOK NAME", "SERIAL NUMBER", "LANGUAGE", "BINDING TYPE", "AUTHOR", "AVAILABILITY STATUS", "GENRE"
            }
        ));
        jScrollPane3.setViewportView(bookTbl);

        magazineTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MAGAZINE NAME", "SERIAL NUMBER", "COMPANY NAME", "ISSUE TYPE", "AVAILABILITY STATUS"
            }
        ));
        jScrollPane4.setViewportView(magazineTbl);

        rentTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "BOOK NAME", "RENT ID", "PRICE", "RENT DURATION", "RENTAL STATUS"
            }
        ));
        jScrollPane2.setViewportView(rentTbl);

        revenueBtn.setText("CHECK REVENUE");
        revenueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revenueBtnActionPerformed(evt);
            }
        });

        RevenueDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RevenueDisplayActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 21)); // NOI18N
        jLabel2.setText("BRANCH MANAGER");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel3.setText("BOOKS LIST");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel4.setText("MAGAZINE LIST");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        jLabel5.setText("RENATAL LIST");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jScrollPane4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(backBtn)
                                .addComponent(revenueBtn))
                            .addComponent(RevenueDisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(304, 304, 304)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(revenueBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RevenueDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainJFrame(business, branch, useraccount);
    }//GEN-LAST:event_backBtnActionPerformed

    private void revenueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revenueBtnActionPerformed
        // TODO add your handling code here:
        int  sum = 0;
        for (RentRequest r:this.branch.getLibrary().getRentaldirectory().getRequestList()){
            if ((r.getStatus().equalsIgnoreCase("Pending") || r.getStatus().equalsIgnoreCase("Rejected"))){
                sum = sum;
            }else{
                sum = sum+ r.getPrice();}
        }
        RevenueDisplay.setText(String.valueOf(sum));
    }//GEN-LAST:event_revenueBtnActionPerformed

    private void RevenueDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RevenueDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RevenueDisplayActionPerformed

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
            java.util.logging.Logger.getLogger(BranchManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BranchManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BranchManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BranchManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new BranchManagerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RevenueDisplay;
    private javax.swing.JButton backBtn;
    private javax.swing.JTable bookTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable magazineTbl;
    private javax.swing.JTable rentTbl;
    private javax.swing.JButton revenueBtn;
    // End of variables declaration//GEN-END:variables
}
