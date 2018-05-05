/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.view.panel;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lk.ijse.gdse41.doctorchannelingsystem.controller.ControllerFactory;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.SpecialityController;
import lk.ijse.gdse41.doctorchannelingsystem.dto.SpecialityDTO;
import lk.ijse.gdse41.doctorchannelingsystem.idgenarate.IDGenarator;

/**
 *
 * @author Binura Salindra
 */
public class AddNewSpecialityPanel extends javax.swing.JPanel {
    private SpecialityController ctrlSpeciality;

    /**
     * Creates new form AddNewDoctorPanel
     */
    public AddNewSpecialityPanel() {
        initComponents();
        ctrlSpeciality=(SpecialityController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.SPECIALITY);
        genarateSpecialityID();
        txtSpecialityName.requestFocus();
        btnAdd.setEnabled(false);
    }
    public void genarateSpecialityID(){
        try {
            txtSpecialityId.setText(IDGenarator.getNewID("Speciality","spID","E"));
        } catch (SQLException ex) {
            Logger.getLogger(AddNewSpecialityPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddNewSpecialityPanel.class.getName()).log(Level.SEVERE, null, ex);
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

        lblSpecialityID = new javax.swing.JLabel();
        lblSpecialityType = new javax.swing.JLabel();
        txtSpecialityId = new javax.swing.JTextField();
        txtSpecialityName = new javax.swing.JTextField();
        btnAdd = new org.jdesktop.swingx.JXButton();
        lblTopic = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblSpecialityID.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblSpecialityID.setText("Speciality ID :");

        lblSpecialityType.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblSpecialityType.setText("Speciality Type :");

        txtSpecialityId.setFocusable(false);

        txtSpecialityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecialityNameActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblTopic.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTopic.setText("Add New Speciality");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSpecialityType)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSpecialityName, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSpecialityID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSpecialityId, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTopic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpecialityID)
                    .addComponent(txtSpecialityId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpecialityType)
                    .addComponent(txtSpecialityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(411, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        SpecialityDTO speciality=new SpecialityDTO(
                txtSpecialityId.getText(),
                txtSpecialityName.getText());
        try {
            boolean result = ctrlSpeciality.add(speciality);
            if (result){
                JOptionPane.showMessageDialog(this, "Speciality has been successfully added...!");
            }else{
                JOptionPane.showMessageDialog(this, "Speciality has not been added...!");
            }
        } catch (Exception ex) {
            Logger.getLogger(AddNewSpecialityPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtSpecialityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecialityNameActionPerformed
       btnAdd.setEnabled(true);
    }//GEN-LAST:event_txtSpecialityNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton btnAdd;
    private javax.swing.JLabel lblSpecialityID;
    private javax.swing.JLabel lblSpecialityType;
    private javax.swing.JLabel lblTopic;
    private javax.swing.JTextField txtSpecialityId;
    private javax.swing.JTextField txtSpecialityName;
    // End of variables declaration//GEN-END:variables
}
