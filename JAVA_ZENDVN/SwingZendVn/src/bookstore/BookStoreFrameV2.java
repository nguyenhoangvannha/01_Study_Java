/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class BookStoreFrameV2 extends javax.swing.JFrame {

    /**
     * Creates new form BookStoreFrameV2
     */
    public BookStoreFrameV2() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(BookStoreFrameV2.class.getName()).log(Level.SEVERE, null, ex);
        }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfBookName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfBookID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfBookPrice = new javax.swing.JTextField();
        btAddBook = new javax.swing.JButton();
        btEditBook = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taListBook = new javax.swing.JTextArea();
        btListBook = new javax.swing.JButton();
        tfFindBook = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btFindBook = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tfFindBookResult = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tfDeleteBookID = new javax.swing.JTextField();
        btDeleteBook = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btCheckFull = new javax.swing.JButton();
        btCheckEmpty = new javax.swing.JButton();
        btStoreInfo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tfAuto = new javax.swing.JTextField();
        btAuto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book Store V2");
        setLocation(new java.awt.Point(400, 50));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Name");

        jLabel2.setText("ID");

        jLabel3.setText("Price");

        btAddBook.setText("Add Book");
        btAddBook.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddBookActionPerformed(evt);
            }
        });

        btEditBook.setText("Edit Book");
        btEditBook.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btEditBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfBookPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEditBook)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfBookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfBookPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAddBook)
                    .addComponent(btEditBook))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        taListBook.setColumns(20);
        taListBook.setRows(5);
        jScrollPane1.setViewportView(taListBook);

        btListBook.setText("List Book");
        btListBook.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btListBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListBookActionPerformed(evt);
            }
        });

        jLabel4.setText("Book ID");

        btFindBook.setText("Find Book");
        btFindBook.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btFindBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFindBookActionPerformed(evt);
            }
        });

        jLabel5.setText("Result");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("ID");

        btDeleteBook.setText("Delete Book");
        btDeleteBook.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btDeleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDeleteBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btDeleteBook, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfDeleteBookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDeleteBook))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btCheckFull.setText("Check Full");
        btCheckFull.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCheckFull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCheckFullActionPerformed(evt);
            }
        });

        btCheckEmpty.setText("Check Empty");
        btCheckEmpty.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCheckEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCheckEmptyActionPerformed(evt);
            }
        });

        btStoreInfo.setText("Store Info");
        btStoreInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btStoreInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btStoreInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCheckFull, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCheckEmpty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btStoreInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btStoreInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btCheckFull)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCheckEmpty)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setText("Number");

        btAuto.setText("Auto create book info");
        btAuto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btAuto, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAuto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfFindBook, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btFindBook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfFindBookResult, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btListBook))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btListBook)
                    .addComponent(tfFindBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btFindBook)
                    .addComponent(jLabel5)
                    .addComponent(tfFindBookResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Store storeObj = new Store();
    private Book bookObj = new Book();
    private void btAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddBookActionPerformed
        // TODO add your handling code here:
        if(storeObj.isFull()){
            JOptionPane.showMessageDialog(null, "Error: Store is full.", "Error", JOptionPane.ERROR_MESSAGE);
        } else{
            Book temp = new Book();
            temp.setID(tfBookID.getText());
            if(temp.getID().equals("")){
                JOptionPane.showMessageDialog(null, "You have to fill the book ID first!", "Warning", JOptionPane.ERROR_MESSAGE);
                tfBookID.requestFocus();
                return;
            }
            if(tfBookName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "You have to fill the book Name first!", "Warning", JOptionPane.ERROR_MESSAGE);
                tfBookName.requestFocus();
                return;
            }
            if(storeObj.isExistID(temp.getID())){
                JOptionPane.showMessageDialog(null, "Book ID is exist!", "Warning", JOptionPane.ERROR_MESSAGE);
                tfBookID.requestFocus();
                return;
            } else{
                try{
                    temp.setPrice(Double.parseDouble(tfBookPrice.getText()));
                } catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Wrong price", "Warning", JOptionPane.ERROR_MESSAGE);
                    tfBookPrice.requestFocus();
                    return;
                }
                temp.setName(tfBookName.getText());
                storeObj.addBook(temp);
                JOptionPane.showMessageDialog(null, "Success!\n" + temp.toString() , "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btAddBookActionPerformed

    private void btListBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListBookActionPerformed
        // TODO add your handling code here:
        if(storeObj.isEmpty()){
            JOptionPane.showMessageDialog(null, "Store is empty.", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else taListBook.setText(storeObj.toString());
    }//GEN-LAST:event_btListBookActionPerformed

    private void btEditBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditBookActionPerformed
        // TODO add your handling code here:
        if(!storeObj.isExistID(tfBookID.getText())){
            JOptionPane.showMessageDialog(null, "Error: The book does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
        } else{
            double price;
            try{
                price = Double.parseDouble(tfBookPrice.getText());
            } catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error: wrong price", "Error", JOptionPane.ERROR_MESSAGE);
                tfBookPrice.requestFocus();
                return;
            }
            storeObj.editBook(tfBookName.getText(), tfBookID.getText(), price);
            JOptionPane.showMessageDialog(null, "Success!", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btEditBookActionPerformed

    private void btDeleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteBookActionPerformed
        // TODO add your handling code here:
        if(storeObj.isEmpty()){
            JOptionPane.showMessageDialog(null, "Error: Store have no any book.", "Error", JOptionPane.ERROR_MESSAGE);
            btAddBook.requestFocus();
        } else if(!storeObj.isExistID(tfDeleteBookID.getText())){
            JOptionPane.showMessageDialog(null, "Error: Book ID does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
            tfDeleteBookID.requestFocus();
        } else{
            storeObj.deleteBook(tfDeleteBookID.getText());
            JOptionPane.showMessageDialog(null, "Success!", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btDeleteBookActionPerformed

    private void btCheckFullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCheckFullActionPerformed
        // TODO add your handling code here:
        if(storeObj.isFull()){
            JOptionPane.showMessageDialog(null, "Info: Store is full", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null, "Info: Store is not full", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btCheckFullActionPerformed

    private void btCheckEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCheckEmptyActionPerformed
        // TODO add your handling code here:
        if(storeObj.isEmpty()){
            JOptionPane.showMessageDialog(null, "Info: Store is empty", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null, "Info: Store is not empty", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btCheckEmptyActionPerformed

    private void btFindBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindBookActionPerformed
        // TODO add your handling code here:
        Book temp = storeObj.findBook(tfFindBook.getText());
        if(temp == null){
            JOptionPane.showMessageDialog(null, "The book does not exist!", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null, "The book exist!", "Information", JOptionPane.INFORMATION_MESSAGE);
            tfFindBookResult.setText(temp.toString());
            tfFindBookResult.requestFocus();
        }
    }//GEN-LAST:event_btFindBookActionPerformed

    private void btStoreInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStoreInfoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, storeObj.info(), "Store info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btStoreInfoActionPerformed

    private void btAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAutoActionPerformed
        // TODO add your handling code here:
        int number;
        try{
            number = Integer.parseInt(tfAuto.getText());
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Wrong number of book.");
            tfAuto.requestFocus();
            return;
        }
        if(number > (storeObj.getMaxItems() - storeObj.getTotalItems())){
            JOptionPane.showMessageDialog(null, "Number of books have to <= " + (storeObj.getMaxItems() - storeObj.getTotalItems()));
            tfAuto.requestFocus();
        } else {
            Book temp;
            for(int i = 0; i < number; i++){
                temp = new Book("Book " + i, "A12S" + i , i +12 );
                storeObj.addBook(temp);
            }
            JOptionPane.showMessageDialog(null, "Success!");
        }
    }//GEN-LAST:event_btAutoActionPerformed

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
            java.util.logging.Logger.getLogger(BookStoreFrameV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookStoreFrameV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookStoreFrameV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookStoreFrameV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookStoreFrameV2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddBook;
    private javax.swing.JButton btAuto;
    private javax.swing.JButton btCheckEmpty;
    private javax.swing.JButton btCheckFull;
    private javax.swing.JButton btDeleteBook;
    private javax.swing.JButton btEditBook;
    private javax.swing.JButton btFindBook;
    private javax.swing.JButton btListBook;
    private javax.swing.JButton btStoreInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taListBook;
    private javax.swing.JTextField tfAuto;
    private javax.swing.JTextField tfBookID;
    private javax.swing.JTextField tfBookName;
    private javax.swing.JTextField tfBookPrice;
    private javax.swing.JTextField tfDeleteBookID;
    private javax.swing.JTextField tfFindBook;
    private javax.swing.JTextField tfFindBookResult;
    // End of variables declaration//GEN-END:variables
}
