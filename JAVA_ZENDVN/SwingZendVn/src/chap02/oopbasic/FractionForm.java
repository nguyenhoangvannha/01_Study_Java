/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap02.oopbasic;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class FractionForm extends javax.swing.JFrame {

    /**
     * Creates new form FractionForm
     */
    public FractionForm() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FractionForm.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfPS1Tu = new javax.swing.JTextField();
        tfPS2Mau = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfPS2Tu = new javax.swing.JTextField();
        tfPS1Mau = new javax.swing.JTextField();
        tfPS1In = new javax.swing.JTextField();
        tfPS2In = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bPS1ToiGian = new javax.swing.JButton();
        bPS2ToiGian = new javax.swing.JButton();
        cbOperator = new javax.swing.JComboBox<>();
        bTinh = new javax.swing.JButton();
        tfKQ = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fraction Form");
        setLocation(new java.awt.Point(400, 70));

        jLabel1.setText("Phan so 1");

        jLabel2.setText("Phan so 2");

        jLabel3.setText("Tu");

        jLabel4.setText("Mau");

        jLabel5.setText("Tu");

        jLabel6.setText("Mau");

        jLabel7.setText("In");

        jLabel8.setText("In");

        bPS1ToiGian.setText("Toi gian");
        bPS1ToiGian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPS1ToiGianActionPerformed(evt);
            }
        });

        bPS2ToiGian.setText("Toi gian");
        bPS2ToiGian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPS2ToiGianActionPerformed(evt);
            }
        });

        cbOperator.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/" }));
        cbOperator.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbOperatorItemStateChanged(evt);
            }
        });

        bTinh.setText("Tinh");
        bTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTinhActionPerformed(evt);
            }
        });

        jLabel9.setText("KQ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bPS1ToiGian)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPS1Tu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPS1In, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPS1Mau, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPS2Tu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPS2In, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPS2Mau, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPS2ToiGian))
                        .addContainerGap(82, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(150, 150, 150)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(cbOperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bTinh)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfKQ, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPS1Tu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tfPS2Tu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfPS2Mau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tfPS1Mau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPS1In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPS2In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPS1ToiGian)
                    .addComponent(bPS2ToiGian))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbOperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfKQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(bTinh))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private Fraction fr1 = new Fraction();
    private Fraction fr2 = new Fraction();
    private String operator = "+"; 
    private void nhapPS1(){
        tfPS1In.setText("");
        try{
            fr1.setTu(Integer.parseInt(tfPS1Tu.getText()));
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error: " + ex.toString(), "Loi", JOptionPane.INFORMATION_MESSAGE);
            tfPS1Tu.requestFocus();
            return;
        }
        try{
            fr1.setMau(Integer.parseInt(tfPS1Mau.getText()));
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Loi: Ban nhap sai mau so." , "Loi mau so", JOptionPane.INFORMATION_MESSAGE);
            tfPS1Mau.requestFocus();
            return;
        }
    }
    private void bPS1ToiGianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPS1ToiGianActionPerformed
        // TODO add your handling code here:
        nhapPS1();
        int ucln = Fraction.UCLN(fr1.getTu(), fr1.getMau());
        if(ucln != 1 && ucln <= Math.min(fr1.getTu(), fr1.getMau())){
            int check = JOptionPane.showConfirmDialog(null,"Phan so chua toi gian! \nBan co muon toi gian?");
            if(check == JOptionPane.YES_OPTION){
                fr1.setTu(fr1.getTu() / ucln);
                fr1.setMau(fr1.getMau() / ucln);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Phan so da toi gian!", "Thong bao", JOptionPane.INFORMATION_MESSAGE);
        }
        tfPS1In.setText(fr1.getTu() + "/" + fr1.getMau());
    }//GEN-LAST:event_bPS1ToiGianActionPerformed
    private void nhapPS2(){
        tfPS2In.setText("");
        try{
            fr2.setTu(Integer.parseInt(tfPS2Tu.getText()));
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error: " + ex.toString(), "Loi", JOptionPane.INFORMATION_MESSAGE);
            tfPS1Tu.requestFocus();
            return;
        }
        try{
            fr2.setMau(Integer.parseInt(tfPS2Mau.getText()));
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Loi: Ban nhap sai mau so." , "Loi mau so", JOptionPane.INFORMATION_MESSAGE);
            tfPS2Mau.requestFocus();
            return;
        }
    }
    private void bPS2ToiGianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPS2ToiGianActionPerformed
        // TODO add your handling code here:
        nhapPS2();
        int ucln = Fraction.UCLN(fr2.getTu(), fr2.getMau());
        if(ucln != 1 && ucln <= Math.min(fr2.getTu(), fr2.getMau())){
            int check = JOptionPane.showConfirmDialog(null,"Phan so chua toi gian! \nBan co muon toi gian?");
            if(check == JOptionPane.YES_OPTION){
                fr2.setTu(fr2.getTu() / ucln);
                fr2.setMau(fr2.getMau() / ucln);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Phan so da toi gian!", "Thong bao", JOptionPane.INFORMATION_MESSAGE);
        }
        tfPS2In.setText(fr2.getTu() + "/" + fr2.getMau());
    }//GEN-LAST:event_bPS2ToiGianActionPerformed

    private void bTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTinhActionPerformed
        // TODO add your handling code here:
        nhapPS1();
        nhapPS2();
        Fraction frResult = new Fraction();
        switch(operator){
            case "+":
                tfKQ.setText(Fraction.add(fr1, fr2).toString());
                break;
            case "-":
                tfKQ.setText(Fraction.sub(fr1, fr2).toString());
                break;
            case "*":
                tfKQ.setText(Fraction.mul(fr1, fr2).toString());
                break;
            case "/":
                tfKQ.setText(Fraction.div(fr1, fr2).toString());
                break;
        }
    }//GEN-LAST:event_bTinhActionPerformed

    private void cbOperatorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbOperatorItemStateChanged
        // TODO add your handling code here
        operator = (String)evt.getItem();
    }//GEN-LAST:event_cbOperatorItemStateChanged

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
            java.util.logging.Logger.getLogger(FractionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FractionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FractionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FractionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FractionForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bPS1ToiGian;
    private javax.swing.JButton bPS2ToiGian;
    private javax.swing.JButton bTinh;
    private javax.swing.JComboBox<String> cbOperator;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tfKQ;
    private javax.swing.JTextField tfPS1In;
    private javax.swing.JTextField tfPS1Mau;
    private javax.swing.JTextField tfPS1Tu;
    private javax.swing.JTextField tfPS2In;
    private javax.swing.JTextField tfPS2Mau;
    private javax.swing.JTextField tfPS2Tu;
    // End of variables declaration//GEN-END:variables
}
