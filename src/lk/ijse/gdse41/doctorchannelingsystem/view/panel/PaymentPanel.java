/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.view.panel;

/**
 *
 * @author Binura Salindra
 */
public class PaymentPanel extends javax.swing.JPanel {

    /**
     * Creates new form PaymentPanel
     */
    public PaymentPanel() {
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

        lblMakeNewPayment = new javax.swing.JLabel();
        lblViewPayments = new javax.swing.JLabel();
        pnlPaymentBase = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblMakeNewPayment.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblMakeNewPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse41/doctorchannelingsystem/resources/Cash In Hand_26px.png"))); // NOI18N
        lblMakeNewPayment.setText("Make New Payment |");
        lblMakeNewPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMakeNewPaymentMouseClicked(evt);
            }
        });

        lblViewPayments.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblViewPayments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse41/doctorchannelingsystem/resources/Transaction List_26px.png"))); // NOI18N
        lblViewPayments.setText("View Payments ");
        lblViewPayments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewPaymentsMouseClicked(evt);
            }
        });

        pnlPaymentBase.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse41/doctorchannelingsystem/resources/Money.png"))); // NOI18N

        javax.swing.GroupLayout pnlPaymentBaseLayout = new javax.swing.GroupLayout(pnlPaymentBase);
        pnlPaymentBase.setLayout(pnlPaymentBaseLayout);
        pnlPaymentBaseLayout.setHorizontalGroup(
            pnlPaymentBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPaymentBaseLayout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPaymentBaseLayout.setVerticalGroup(
            pnlPaymentBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPaymentBaseLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPaymentBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMakeNewPayment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblViewPayments)
                        .addGap(0, 736, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMakeNewPayment)
                    .addComponent(lblViewPayments))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPaymentBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblMakeNewPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMakeNewPaymentMouseClicked
        MakePaymentPanel ap1=new MakePaymentPanel();
        ap1.setSize(pnlPaymentBase.getSize());
        pnlPaymentBase.removeAll();
        pnlPaymentBase.add(ap1);
        pnlPaymentBase.revalidate();
        pnlPaymentBase.repaint();
        ap1.show();
    }//GEN-LAST:event_lblMakeNewPaymentMouseClicked

    private void lblViewPaymentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewPaymentsMouseClicked
        ViewPayments ap1=new ViewPayments();
        ap1.setSize(pnlPaymentBase.getSize());
        pnlPaymentBase.removeAll();
        pnlPaymentBase.add(ap1);
        pnlPaymentBase.revalidate();
        pnlPaymentBase.repaint();
        ap1.show();
    }//GEN-LAST:event_lblViewPaymentsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblMakeNewPayment;
    private javax.swing.JLabel lblViewPayments;
    private javax.swing.JPanel pnlPaymentBase;
    // End of variables declaration//GEN-END:variables
}
