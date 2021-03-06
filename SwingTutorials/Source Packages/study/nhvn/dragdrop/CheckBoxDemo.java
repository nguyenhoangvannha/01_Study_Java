/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.nhvn.dragdrop;

import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class CheckBoxDemo extends javax.swing.JFrame {

    /**
     * Creates new form CheckBoxDemo
     */
    public CheckBoxDemo() {
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
        cbJava = new javax.swing.JCheckBox();
        cbCPP = new javax.swing.JCheckBox();
        cbCSharp = new javax.swing.JCheckBox();
        btCheck = new javax.swing.JButton();
        cbSelectAll = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbJava.setText("Java");
        cbJava.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbJavaItemStateChanged(evt);
            }
        });
        cbJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJavaActionPerformed(evt);
            }
        });

        cbCPP.setText("C Plus Plus");
        cbCPP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCPPItemStateChanged(evt);
            }
        });

        cbCSharp.setText("C Sharp");
        cbCSharp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCSharpItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCSharp)
                    .addComponent(cbCPP)
                    .addComponent(cbJava))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cbJava)
                .addGap(18, 18, 18)
                .addComponent(cbCPP)
                .addGap(18, 18, 18)
                .addComponent(cbCSharp)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        btCheck.setText("Check");
        btCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCheckActionPerformed(evt);
            }
        });

        cbSelectAll.setText("Selec all");
        cbSelectAll.setActionCommand("Select All");
        cbSelectAll.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSelectAllItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbSelectAll)
                    .addComponent(btCheck)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSelectAll)
                .addGap(11, 11, 11)
                .addComponent(btCheck)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJavaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJavaActionPerformed

    private void btCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCheckActionPerformed
        // TODO add your handling code here:
        String cbselect = "";
        if(cbJava.isSelected()){
            cbselect = cbJava.getText();
        }
        if(cbCPP.isSelected()){
            cbselect += cbCPP.getText();
        }
        if(cbCSharp.isSelected()){
            cbselect += cbCSharp.getText();
        }
        if(cbselect != ""){
            JOptionPane.showMessageDialog(null,cbselect,"Thong bao",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btCheckActionPerformed

    private void cbJavaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbJavaItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() == ItemEvent.SELECTED){
            System.out.println("You selected " + cbJava.getText());
        }
    }//GEN-LAST:event_cbJavaItemStateChanged

    private void cbCPPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCPPItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() == ItemEvent.SELECTED){
            System.out.println("You selected " + cbCPP.getText());
        }
    }//GEN-LAST:event_cbCPPItemStateChanged

    private void cbCSharpItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCSharpItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() == ItemEvent.SELECTED){
            System.out.println("You selected " + cbCSharp.getText());
        }
    }//GEN-LAST:event_cbCSharpItemStateChanged

    private void cbSelectAllItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSelectAllItemStateChanged
        // TODO add your handling code here:
        boolean check = cbSelectAll.isSelected();
        if(check){
            cbJava.setSelected(true);
            cbCPP.setSelected(true);
            cbCSharp.setSelected(true);
        } else {
            cbJava.setSelected(false);
            cbCPP.setSelected(false);
            cbCSharp.setSelected(false);
        }
    }//GEN-LAST:event_cbSelectAllItemStateChanged

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
            java.util.logging.Logger.getLogger(CheckBoxDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckBoxDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckBoxDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckBoxDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckBoxDemo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCheck;
    private javax.swing.JCheckBox cbCPP;
    private javax.swing.JCheckBox cbCSharp;
    private javax.swing.JCheckBox cbJava;
    private javax.swing.JCheckBox cbSelectAll;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
