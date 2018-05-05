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
import lk.ijse.gdse41.doctorchannelingsystem.dto.AppointmentDTO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.PatientDTO;

/**
 *
 * @author Binura Salindra
 */
public class RegisteredPatientPanel extends javax.swing.JPanel {
    private QueryController ctrlQuery;
    private PatientController ctrlPatient;
    private AppointmentController ctrlAppointment;

    /**
     * Creates new form RegisteredPatientPanel
     */
    public RegisteredPatientPanel() {
        initComponents();
        ctrlQuery=(QueryController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.QUERY);
        ctrlPatient=(PatientController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.PATIENT);
        ctrlAppointment=(AppointmentController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.APPOINTMENT);
        loadPatientId();
    }
    public RegisteredPatientPanel(String apNo, String apID, String scheduleID, String apDate){
        initComponents();
        ctrlQuery=(QueryController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.QUERY);
        ctrlPatient=(PatientController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.PATIENT);
        ctrlAppointment=(AppointmentController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.APPOINTMENT);
        loadPatientId();
        txtAppNo.setText(apNo);
        txtAppId.setText(apID);
        txtScheduleId1.setText(scheduleID);
        txtApDate.setText(apDate);
    }
    private void loadPatientId(){
        ArrayList<String> patientIds = null;
        try {
            patientIds = ctrlQuery.getAllPatientId();
        } catch (Exception ex) {
            Logger.getLogger(ChangePatientDetailPanel.class.getName()).log(Level.SEVERE, null, ex);
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

        lblPatientID = new javax.swing.JLabel();
        cmbPatientId = new javax.swing.JComboBox<>();
        lblPatientName = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        lblTopic = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblTelNo = new javax.swing.JLabel();
        txtTelno = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblTopic2 = new javax.swing.JLabel();
        lblApNo = new javax.swing.JLabel();
        txtAppNo = new org.jdesktop.swingx.JXTextField();
        txtAppId = new org.jdesktop.swingx.JXTextField();
        lblApId = new javax.swing.JLabel();
        lblScheduleID = new javax.swing.JLabel();
        txtScheduleId1 = new org.jdesktop.swingx.JXTextField();
        lblDate = new javax.swing.JLabel();
        txtApDate = new org.jdesktop.swingx.JXTextField();
        btnAdd = new org.jdesktop.swingx.JXButton();
        lblMessage1 = new javax.swing.JLabel();
        lblMessage2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPatientID.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblPatientID.setText("Patient ID :");
        add(lblPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 58, -1, -1));

        cmbPatientId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPatientIdItemStateChanged(evt);
            }
        });
        add(cmbPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 59, 205, -1));

        lblPatientName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblPatientName.setText("Name :");
        add(lblPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, -1, -1));

        txtPatientName.setFocusable(false);
        add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 88, 205, -1));

        lblAddress.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblAddress.setText("Address :");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 119, -1, -1));

        lblTopic.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTopic.setText("Patient Details");
        add(lblTopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 280, -1));

        txtAddress.setFocusable(false);
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 120, 205, -1));

        lblAge.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblAge.setText("Age :");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 151, -1, -1));

        txtAge.setFocusable(false);
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 152, 205, -1));

        lblTelNo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblTelNo.setText("Tel No:");
        add(lblTelNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 183, -1, -1));

        txtTelno.setFocusable(false);
        add(txtTelno, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 184, 205, -1));

        lblGender.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblGender.setText("Gender:");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        txtGender.setFocusable(false);
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 200, -1));

        lblTopic2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTopic2.setText("Appointment Details :");
        add(lblTopic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 280, 31));

        lblApNo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblApNo.setText("Appointment No :");
        add(lblApNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        txtAppNo.setFocusable(false);
        add(txtAppNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 160, -1));

        txtAppId.setFocusable(false);
        add(txtAppId, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 160, -1));

        lblApId.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblApId.setText("Appointment ID :");
        add(lblApId, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        lblScheduleID.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblScheduleID.setText("Schedule ID :");
        add(lblScheduleID, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        txtScheduleId1.setFocusable(false);
        add(txtScheduleId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 160, -1));

        lblDate.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblDate.setText("Date :");
        add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        txtApDate.setFocusable(false);
        add(txtApDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 160, -1));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 67, -1));

        lblMessage1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMessage1.setText("Tip : If you did worng in past step..?");
        add(lblMessage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        lblMessage2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMessage2.setText("        please press select search types again..");
        add(lblMessage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));
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
            Logger.getLogger(RegisteredPatientPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbPatientIdItemStateChanged

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
           String patientID=(String) cmbPatientId.getSelectedItem();
  
        AppointmentDTO appointmentDTO=new AppointmentDTO(
            txtAppId.getText(),
            patientID,
            txtScheduleId1.getText(),
            Integer.parseInt(txtAppNo.getText()),
            txtApDate.getText());

        try {
            boolean result=ctrlAppointment.add(appointmentDTO);
            if (result){
                JOptionPane.showMessageDialog(this, "Appointmetn is done.If you want to do payments, Click payments");
            }else{
                JOptionPane.showMessageDialog(this, "Operation failed..!");
            }
        } catch (Exception ex) {
            Logger.getLogger(AddNewPatientPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton btnAdd;
    private javax.swing.JComboBox<String> cmbPatientId;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblApId;
    private javax.swing.JLabel lblApNo;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblMessage1;
    private javax.swing.JLabel lblMessage2;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblScheduleID;
    private javax.swing.JLabel lblTelNo;
    private javax.swing.JLabel lblTopic;
    private javax.swing.JLabel lblTopic2;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private org.jdesktop.swingx.JXTextField txtApDate;
    private org.jdesktop.swingx.JXTextField txtAppId;
    private org.jdesktop.swingx.JXTextField txtAppNo;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtPatientName;
    private org.jdesktop.swingx.JXTextField txtScheduleId1;
    private javax.swing.JTextField txtTelno;
    // End of variables declaration//GEN-END:variables
}