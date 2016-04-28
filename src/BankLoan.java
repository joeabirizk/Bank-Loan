/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joeab
 */
public class BankLoan extends javax.swing.JFrame {

    /**
     * Creates new form BankLoan
     */
    public BankLoan() {
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        lblBankLoan = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        lblLoanType = new javax.swing.JLabel();
        RdCar = new javax.swing.JRadioButton();
        RdHouse = new javax.swing.JRadioButton();
        lblNbrOfYearsCars = new javax.swing.JLabel();
        cbxNbreOfYearsCars = new javax.swing.JComboBox<>();
        lblNbreOfYearshouse = new javax.swing.JLabel();
        cbxNbreOfYearsHouse = new javax.swing.JComboBox<>();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBankLoan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBankLoan.setText("  Bank Loan");
        lblBankLoan.setToolTipText("");

        lblAmount.setText("Amount :");

        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        lblLoanType.setText("Loan Type :");

        buttonGroup1.add(RdCar);
        RdCar.setText("Car Loan");
        RdCar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RdCarItemStateChanged(evt);
            }
        });
        RdCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdCarActionPerformed(evt);
            }
        });

        buttonGroup1.add(RdHouse);
        RdHouse.setText("House Loan");
        RdHouse.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RdHouseItemStateChanged(evt);
            }
        });

        lblNbrOfYearsCars.setText("Number Of Years For Cars :");

        cbxNbreOfYearsCars.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", " " }));
        cbxNbreOfYearsCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNbreOfYearsCarsActionPerformed(evt);
            }
        });

        lblNbreOfYearshouse.setText("Number Of Years For House :");

        cbxNbreOfYearsHouse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblBankLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAmount)
                        .addGap(18, 18, 18)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLoanType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RdCar)
                        .addGap(68, 68, 68)
                        .addComponent(RdHouse))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNbrOfYearsCars)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxNbreOfYearsCars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNbreOfYearshouse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxNbreOfYearsHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblBankLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAmount)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoanType)
                    .addComponent(RdCar)
                    .addComponent(RdHouse))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNbrOfYearsCars)
                    .addComponent(cbxNbreOfYearsCars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNbreOfYearshouse, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxNbreOfYearsHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void RdCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RdCarActionPerformed

    private void cbxNbreOfYearsCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNbreOfYearsCarsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNbreOfYearsCarsActionPerformed

    private void RdCarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RdCarItemStateChanged
        if (RdCar.isSelected()){
        
        lblNbreOfYearshouse.setEnabled(false);
        cbxNbreOfYearsHouse.setEnabled(false);
        }
        else{
         lblNbreOfYearshouse.setEnabled(true);
        cbxNbreOfYearsHouse.setEnabled(true);   
        }
     
    }//GEN-LAST:event_RdCarItemStateChanged

    private void RdHouseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RdHouseItemStateChanged
 if (RdHouse.isSelected()){
        
        lblNbrOfYearsCars.setEnabled(false);
        cbxNbreOfYearsCars.setEnabled(false);
        }
        else{
         lblNbrOfYearsCars.setEnabled(true);
        cbxNbreOfYearsCars.setEnabled(true);   
        }        // TODO add your handling code here:
    }//GEN-LAST:event_RdHouseItemStateChanged

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
            java.util.logging.Logger.getLogger(BankLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankLoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RdCar;
    private javax.swing.JRadioButton RdHouse;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxNbreOfYearsCars;
    private javax.swing.JComboBox<String> cbxNbreOfYearsHouse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblBankLoan;
    private javax.swing.JLabel lblLoanType;
    private javax.swing.JLabel lblNbrOfYearsCars;
    private javax.swing.JLabel lblNbreOfYearshouse;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
