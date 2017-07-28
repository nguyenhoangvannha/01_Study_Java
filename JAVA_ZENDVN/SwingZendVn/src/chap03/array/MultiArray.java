/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap03.array;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class MultiArray extends javax.swing.JFrame {

    /**
     * Creates new form MultiArray
     */
    public MultiArray() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MultiArray.class.getName()).log(Level.SEVERE, null, ex);
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

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfLine = new javax.swing.JTextField();
        btNewArray = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfColum = new javax.swing.JTextField();
        btAuto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taShow = new javax.swing.JTextArea();
        btShow = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btInfo = new javax.swing.JButton();
        tfLineOrColum = new javax.swing.JTextField();
        cbLineOrColum = new javax.swing.JComboBox<>();
        btSum = new javax.swing.JButton();
        tfSum = new javax.swing.JTextField();
        btMax = new javax.swing.JButton();
        tfMax = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Multi Array");
        setLocation(new java.awt.Point(400, 50));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Line");
        jLabel1.setToolTipText("Elements number");

        btNewArray.setText("New Array");
        btNewArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewArrayActionPerformed(evt);
            }
        });

        jLabel2.setText("Colum");

        btAuto.setText("Auto");
        btAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfLine, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfColum, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btNewArray)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btAuto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNewArray)
                    .addComponent(jLabel2)
                    .addComponent(tfColum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAuto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        taShow.setColumns(20);
        taShow.setRows(5);
        jScrollPane1.setViewportView(taShow);

        btShow.setText("Show");
        btShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btShowActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btInfo.setText("Info");
        btInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInfoActionPerformed(evt);
            }
        });

        cbLineOrColum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Line", "Colum", "Diagonal" }));
        cbLineOrColum.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbLineOrColumItemStateChanged(evt);
            }
        });

        btSum.setText("Sum");
        btSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSumActionPerformed(evt);
            }
        });

        btMax.setText("Max");
        btMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMaxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbLineOrColum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfLineOrColum, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSum, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btInfo)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btMax)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfMax, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLineOrColum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbLineOrColum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSum)
                    .addComponent(tfSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMax)
                    .addComponent(tfMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btShow)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btShow)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private int[][] arrInt;
    private int line,colum;
    private String sLineOrColum = "Line";
    private int iLineOrColum = 0;
    private void setArrayInfo(){
        try{
            line = 0;
            line = Integer.parseInt(tfLine.getText());
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Element 'line' wrong!", "Warning", JOptionPane.WARNING_MESSAGE);
            tfLine.requestFocus();
            return;
        }
        try{
            colum = 0;
            colum = Integer.parseInt(tfColum.getText());
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Element 'colum' wrong!", "Warning", JOptionPane.WARNING_MESSAGE);
            tfColum.requestFocus();
            return;
        }
    }
    private void btNewArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewArrayActionPerformed
        // TODO add your handling code here:
        setArrayInfo();
        if(line <= 0 || colum <= 0){
            JOptionPane.showMessageDialog(null, "Unsuccessful: lines and colums have to > 0", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            arrInt = new int[line][colum];
            JOptionPane.showMessageDialog(null, "Success!", "Notification", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btNewArrayActionPerformed

    private void btShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btShowActionPerformed
        // TODO add your handling code here:
        //Method 1
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < line; i++){
            for(int j = 0; j < colum; j++){
                str.append(Integer.toString(arrInt[i][j]) + " ");
            }
            str.append("\n");
        }
        taShow.setText(str.toString());
        //Method 2
//        taShow.setText(Arrays.deepToString(arrInt));
    }//GEN-LAST:event_btShowActionPerformed

    private void btAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAutoActionPerformed
        // TODO add your handling code here:
        if(arrInt == null){
            JOptionPane.showMessageDialog(null, "Error: Array does not exist!", "Warning", JOptionPane.WARNING_MESSAGE);
            btNewArray.requestFocus();
            return;
        } else {
            for(int i = 0; i < line; i++){
                for(int j = 0; j < colum; j++){
                    arrInt[i][j] = (int)(Math.random()*(line*colum*2 + 1)) - line*colum;
                }
            }
            JOptionPane.showMessageDialog(null, "Success!", "Notification", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btAutoActionPerformed

    private void btInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInfoActionPerformed
        // TODO add your handling code here:
        if(arrInt == null){
            JOptionPane.showMessageDialog(null, "Error: Array does not exist!", "Warning", JOptionPane.WARNING_MESSAGE);
            btNewArray.requestFocus();
            return;
        } else {
            StringBuilder str = new StringBuilder("Array information");
            str.append("\nLine: " + Integer.toString(arrInt.length));
            str.append("\nColum: " + Integer.toString(arrInt[0].length));
            JOptionPane.showMessageDialog(null, str.toString(), "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        StringBuilder str = new StringBuilder("Array information");
        str.append("\nLine: " + Integer.toString(arrInt.length));
        str.append("\nColum: " + Integer.toString(arrInt[0].length));
        JOptionPane.showMessageDialog(null, str.toString(), "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btInfoActionPerformed
    private void setLineOrColum(){
        try{
            iLineOrColum = Integer.parseInt(tfLineOrColum.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: Line or colum wrong!", "Warning", JOptionPane.WARNING_MESSAGE);
            tfLineOrColum.requestFocus();
            return;
        }
    }
    private void btSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSumActionPerformed
        // TODO add your handling code here:
        if(arrInt == null){
            JOptionPane.showMessageDialog(null, "Error: Array does not exist!", "Warning", JOptionPane.WARNING_MESSAGE);
            btNewArray.requestFocus();
        } else {
            if(sLineOrColum.equals("Diagonal")){
                if(line != colum){
                    JOptionPane.showMessageDialog(null, "Line and colum have to equals", "Warning", JOptionPane.WARNING_MESSAGE);
                    tfLine.requestFocus();
                } else {
                    tfLineOrColum.setText("");
                    int sum = 0;
                    for(int i = 0; i < line; i++){
                        sum += arrInt[i][i];
                    }
                    tfSum.setText(Integer.toString(sum));
                }
                
            } else{
                setLineOrColum();
                if(iLineOrColum <= 0 || (iLineOrColum > line && sLineOrColum.equals("Line")) || (iLineOrColum > colum && sLineOrColum.equals("Colum"))){
                    JOptionPane.showMessageDialog(null, "Line has to > 0 and <= lines\nColum has to > 0 and < colums.", "Warning", JOptionPane.WARNING_MESSAGE);
                    tfLineOrColum.requestFocus();
                } else{
                    int sum = 0;
                    switch(sLineOrColum){
                        case "Line":
                            for(int i = 0; i < colum; i++){
                                sum += arrInt[iLineOrColum - 1][i];
                            }
                            break;
                        case "Colum":
                            for(int i = 0; i < line; i++){
                                sum += arrInt[i][iLineOrColum - 1];
                            }
                            break;
                    }
                    tfSum.setText(Integer.toString(sum));
            }
            }
            
        }
    }//GEN-LAST:event_btSumActionPerformed

    private void cbLineOrColumItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbLineOrColumItemStateChanged
        // TODO add your handling code here:
        sLineOrColum = (String)evt.getItem();
    }//GEN-LAST:event_cbLineOrColumItemStateChanged

    private void btMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMaxActionPerformed
        // TODO add your handling code here:
        if(arrInt == null){
            JOptionPane.showMessageDialog(null, "Error: Array does not exist!", "Warning", JOptionPane.WARNING_MESSAGE);
            btNewArray.requestFocus();
        } else {
            for(int i = 0; i < line; i++){
                Arrays.sort(arrInt[i]);
            }
            int max = 0;
            for(int i = 1; i < line; i++){
                if(arrInt[i][colum - 1] > max) max = arrInt[i][colum - 1];
            }
            tfMax.setText(Integer.toString(max));
        }
    }//GEN-LAST:event_btMaxActionPerformed

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
            java.util.logging.Logger.getLogger(MultiArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultiArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultiArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultiArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultiArray().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAuto;
    private javax.swing.JButton btInfo;
    private javax.swing.JButton btMax;
    private javax.swing.JButton btNewArray;
    private javax.swing.JButton btShow;
    private javax.swing.JButton btSum;
    private javax.swing.JComboBox<String> cbLineOrColum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea taShow;
    private javax.swing.JTextField tfColum;
    private javax.swing.JTextField tfLine;
    private javax.swing.JTextField tfLineOrColum;
    private javax.swing.JTextField tfMax;
    private javax.swing.JTextField tfSum;
    // End of variables declaration//GEN-END:variables
}
