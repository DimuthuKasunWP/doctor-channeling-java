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
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.AppointmentController;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.PatientController;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.QueryController;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl.QueryControllerImpl;
import lk.ijse.gdse41.doctorchannelingsystem.dto.AppointmentDTO;

/**
 *
 * @author Binura Salindra
 */
public class RemovelAppointmentPanel extends javax.swing.JPanel {
    private QueryController ctrlQuery;
    private AppointmentController ctrlAppointment;
    private PatientController ctrlPatient;

    /**
     * Creates new form CancelAppointmentPanel
     */
    public RemovelAppointmentPanel() {
        initComponents();
        ctrlQuery=(QueryController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.QUERY);
        ctrlAppointment=(AppointmentController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.APPOINTMENT);
        ctrlPatient=(PatientController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.PATIENT);
        loadAppointmentId();
    }
    private void loadAppointmentId(){
        ArrayList<String> appointmentIds = null;
        try {
            appointmentIds = ctrlQuery.getAllAppointmentId();
        } catch (Exception ex) {
            Logger.getLogger(RemovelAppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < appointmentIds.size(); i++){
            cmbAppoinmentId.addItem(appointmentIds.get(i));
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

        lblTopic = new javax.swing.JLabel();
        lblAppointmentId = new javax.swing.JLabel();
        cmbAppoinmentId = new com.jidesoft.swing.AutoCompletionComboBox();
        lblPatientID = new javax.swing.JLabel();
        lblScheduleID = new javax.swing.JLabel();
        lblApNo = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        txtScheduleID = new javax.swing.JTextField();
        txtApNo = new javax.swing.JTextField();
        txtAppointmentDate = new javax.swing.JTextField();
        btnCancel = new org.jdesktop.swingx.JXButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTopic.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTopic.setText("Cancel Appointments");

        lblAppointmentId.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblAppointmentId.setText("Appointment ID :");

        cmbAppoinmentId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAppoinmentIdItemStateChanged(evt);
            }
        });

        lblPatientID.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblPatientID.setText("Patient ID :");

        lblScheduleID.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblScheduleID.setText("Schedule ID :");

        lblApNo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblApNo.setText("Ap. No :");

        lblDate.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblDate.setText("Date :");

        txtPatientID.setFocusable(false);

        txtScheduleID.setFocusable(false);

        txtApNo.setFocusable(false);

        txtAppointmentDate.setFocusable(false);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblDate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAppointmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblApNo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                            .addComponent(txtApNo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblScheduleID)
                            .addGap(27, 27, 27)
                            .addComponent(txtScheduleID))
                        .addComponent(lblTopic, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAppointmentId)
                                .addComponent(lblPatientID))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbAppoinmentId, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                .addComponent(txtPatientID)))))
                .addContainerGap(766, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTopic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAppointmentId)
                    .addComponent(cmbAppoinmentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientID)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblScheduleID)
                    .addComponent(txtScheduleID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApNo)
                    .addComponent(txtApNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDate)
                    .addComponent(txtAppointmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(370, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
       String id=(String) cmbAppoinmentId.getSelectedItem();
        
        try {
            boolean result=ctrlAppointment.delete(id);
            if (result){
                JOptionPane.showMessageDialog(this, "Appointment is canceled");
            }else{
                JOptionPane.showMessageDialog(this, "Cancel failed");
            }
        } catch (Exception ex) {
            Logger.getLogger(RemovelAppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
         
    
    }//GEN-LAST:event_btnCancelActionPerformed

    private void cmbAppoinmentIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAppoinmentIdItemStateChanged
      String id=(String) cmbAppoinmentId.getSelectedItem();
        try {
            AppointmentDTO appointment=ctrlAppointment.search(id);
            txtPatientID.setText(appointment.getpID());
            txtScheduleID.setText(appointment.getScID());
            txtApNo.setText(""+appointment.getApNo());
            txtAppointmentDate.setText(appointment.getApDate());
            
        } catch (Exception ex) {
            Logger.getLogger(RemovelAppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    }//GEN-LAST:event_cmbAppoinmentIdItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton btnCancel;
    private com.jidesoft.swing.AutoCompletionComboBox cmbAppoinmentId;
    private javax.swing.JLabel lblApNo;
    private javax.swing.JLabel lblAppointmentId;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JLabel lblScheduleID;
    private javax.swing.JLabel lblTopic;
    private javax.swing.JTextField txtApNo;
    private javax.swing.JTextField txtAppointmentDate;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtScheduleID;
    // End of variables declaration//GEN-END:variables
}
