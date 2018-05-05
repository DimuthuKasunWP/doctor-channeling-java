/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.view.panel;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lk.ijse.gdse41.doctorchannelingsystem.controller.ControllerFactory;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.PatientController;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.QueryController;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl.QueryControllerImpl;
import lk.ijse.gdse41.doctorchannelingsystem.dto.PatientDTO;

/**
 *
 * @author Binura Salindra
 */
public class RemovePatientPanel extends javax.swing.JPanel {
    private PatientController ctrlPatient;
    private QueryController ctrlQuery;

    /**
     * Creates new form chngPatientDetailPanel
     */
    public RemovePatientPanel() {
        initComponents();
        ctrlQuery=(QueryController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.QUERY);
        ctrlPatient=(PatientController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.PATIENT);
        loadPatientId();
    }
    private void loadPatientId(){
        ArrayList<String> patientIds = null;
        try {
            patientIds = ctrlQuery.getAllPatientId();
        } catch (Exception ex) {
            Logger.getLogger(RemovePatientPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < patientIds.size(); i++){
            cmbPatientId.addItem(patientIds.get(i));
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

        lblPatientId = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        cmbPatientId = new javax.swing.JComboBox<>();
        txtPatientName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        btnDelete = new org.jdesktop.swingx.JXButton();
        lblTelNo = new javax.swing.JLabel();
        txtTelno = new javax.swing.JTextField();
        lblTopic = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        lblPatientId.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblPatientId.setText("Patient ID :");

        lblPatientName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblPatientName.setText("Name :");

        lblAddress.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblAddress.setText("Address :");

        lblAge.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblAge.setText("Age :");

        cmbPatientId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPatientIdItemStateChanged(evt);
            }
        });

        txtPatientName.setFocusable(false);

        txtAddress.setFocusable(false);

        txtAge.setFocusable(false);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblTelNo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblTelNo.setText("Tel No:");

        txtTelno.setFocusable(false);

        lblTopic.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTopic.setText("Remove Patient");

        lblGender.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblGender.setText("Gender:");

        txtGender.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPatientId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(cmbPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPatientName)
                                    .addComponent(lblAddress)
                                    .addComponent(lblAge)
                                    .addComponent(lblTelNo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addComponent(txtPatientName)
                                    .addComponent(txtAddress)
                                    .addComponent(txtTelno)
                                    .addComponent(txtGender))))
                        .addContainerGap(770, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGender))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTopic)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientId)
                    .addComponent(cmbPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientName)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelNo)
                    .addComponent(txtTelno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPatientIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPatientIdItemStateChanged
       String id=(String) cmbPatientId.getSelectedItem();
        try {
            PatientDTO patient=ctrlPatient.search(id);
            txtPatientName.setText(patient.getpName());
            txtAddress.setText(patient.getpAddress());
            txtGender.setText(patient.getGender());
            txtAge.setText(""+patient.getpAge());
            txtTelno.setText(patient.getpTelno());
            
        } catch (Exception ex) {
            Logger.getLogger(RemovePatientPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbPatientIdItemStateChanged

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      String pID=(String) cmbPatientId.getSelectedItem();
 
        
        try {
           boolean result = ctrlPatient.delete(pID);
           if (result){
                JOptionPane.showMessageDialog(this, "Patient has been deleted");
            }else{
                JOptionPane.showMessageDialog(this, "Delete failed");
            }
        } catch (Exception ex) {
            Logger.getLogger(RemovePatientPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton btnDelete;
    private javax.swing.JComboBox<String> cmbPatientId;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblTelNo;
    private javax.swing.JLabel lblTopic;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtTelno;
    // End of variables declaration//GEN-END:variables
}
