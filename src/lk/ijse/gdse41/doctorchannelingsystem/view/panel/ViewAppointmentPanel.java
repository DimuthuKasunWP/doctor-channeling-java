/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.view.panel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import lk.ijse.gdse41.doctorchannelingsystem.controller.ControllerFactory;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.AppointmentController;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.DoctorController;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.PatientController;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.QueryController;
import lk.ijse.gdse41.doctorchannelingsystem.dto.AppointmentDTO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.AppointmentSearchDTO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.PatientDTO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.SearchQueryDTO;

/**
 *
 * @author Binura Salindra
 */
public class ViewAppointmentPanel extends javax.swing.JPanel {
    private AppointmentController ctrlAppointment;
    private QueryController ctrlQuery;
    private PatientController ctrlPatient;
    private DoctorController ctrlDoctor;

    /**
     * Creates new form ViewAppointmentPanel
     */
    public ViewAppointmentPanel() {
        initComponents();
        ctrlAppointment=(AppointmentController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.APPOINTMENT);
        ctrlQuery=(QueryController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.QUERY);
        ctrlPatient=(PatientController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.PATIENT);
        ctrlDoctor=(DoctorController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.DOCTOR);
        LoadAppointmentID();
        loadDoctorID();
        loadPatientId();
        txtDoctorName.setEditable(false);
        txtPatientName.setEditable(false);
        
    }
    private void LoadAppointmentID(){
        ArrayList<String> allAppointmentIDs = null;
       
        try {
            allAppointmentIDs = ctrlQuery.getAllAppointmentId();
        } catch (Exception ex) {
            Logger.getLogger(ViewAppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < allAppointmentIDs.size(); i++){
            cmbAppointmentID.addItem(allAppointmentIDs.get(i));
        }
    }
    private void loadPatientId(){
        ArrayList<String> patientIds = null;
        
        try {
            patientIds = ctrlQuery.getAllPatientId();
        } catch (Exception ex) {
            Logger.getLogger(ViewAppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < patientIds.size(); i++){
            cmbPatientID.addItem(patientIds.get(i));
        }
    }
    private void loadDoctorID(){
        ArrayList<String> allDoctorIds=null;
        
        try {
            allDoctorIds=ctrlQuery.getAllDoctorId();
        } catch (Exception ex) {
            Logger.getLogger(ViewAppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         for (int i = 0; i < allDoctorIds.size(); i++){
            cmbDoctorId.addItem(allDoctorIds.get(i));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAppointment = new org.jdesktop.swingx.JXTable();
        lblSortByApID = new javax.swing.JLabel();
        lblSortByDate = new javax.swing.JLabel();
        lblSortByPatient = new javax.swing.JLabel();
        lblSortByDoctor = new javax.swing.JLabel();
        cmbAppointmentID = new com.jidesoft.swing.AutoCompletionComboBox();
        datePickerApDate = new org.jdesktop.swingx.JXDatePicker();
        cmbPatientID = new com.jidesoft.swing.AutoCompletionComboBox();
        cmbDoctorId = new com.jidesoft.swing.AutoCompletionComboBox();
        txtPatientName = new org.jdesktop.swingx.JXTextField();
        txtDoctorName = new org.jdesktop.swingx.JXTextField();
        lblAllAp = new javax.swing.JLabel();
        btnReload = new org.jdesktop.swingx.JXButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTopic.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTopic.setText("View Appointments");

        tblAppointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Appointment ID", "App No", "Date", "Time Slot", "Patient ID", "P Name", "Doctor ID", "Dr Name", "Speciality", "Hospital"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAppointment);

        lblSortByApID.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSortByApID.setText("Sort By Appointment ID :");

        lblSortByDate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSortByDate.setText("Sort By Date :");

        lblSortByPatient.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSortByPatient.setText("Sort By Patient  :");

        lblSortByDoctor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSortByDoctor.setText("Sort By Doctor :");

        cmbAppointmentID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cmbAppointmentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAppointmentIDActionPerformed(evt);
            }
        });

        datePickerApDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datePickerApDateActionPerformed(evt);
            }
        });

        cmbPatientID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cmbPatientID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPatientIDItemStateChanged(evt);
            }
        });
        cmbPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPatientIDActionPerformed(evt);
            }
        });

        cmbDoctorId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cmbDoctorId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDoctorIdItemStateChanged(evt);
            }
        });
        cmbDoctorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDoctorIdActionPerformed(evt);
            }
        });

        lblAllAp.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAllAp.setText("All Appointments  :");

        btnReload.setText("Refresh");
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblSortByDoctor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSortByPatient, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSortByDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSortByApID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                    .addComponent(lblAllAp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbAppointmentID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(datePickerApDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbPatientID, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                            .addComponent(cmbDoctorId, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPatientName, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                            .addComponent(txtDoctorName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTopic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAllAp)
                    .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSortByApID)
                    .addComponent(cmbAppointmentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSortByDate)
                    .addComponent(datePickerApDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSortByPatient)
                    .addComponent(cmbPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSortByDoctor)
                    .addComponent(cmbDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPatientIDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPatientIDItemStateChanged
        String pID=(String) cmbPatientID.getSelectedItem();
        try {
            PatientDTO patient=ctrlPatient.search(pID);
            txtPatientName.setText(patient.getpName());
        } catch (Exception ex) {
            Logger.getLogger(ViewAppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbPatientIDItemStateChanged

    private void cmbDoctorIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDoctorIdItemStateChanged
        String drID=(String) cmbDoctorId.getSelectedItem();
        try {
            SearchQueryDTO search=ctrlQuery.getAllDoctorDetails(drID);
            txtDoctorName.setText(search.getDrName());
        } catch (Exception ex) {
            Logger.getLogger(ViewAppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbDoctorIdItemStateChanged

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        DefaultTableModel dtm=(DefaultTableModel) tblAppointment.getModel();
        dtm.setRowCount(0);
        try {
            ArrayList<AppointmentSearchDTO> allAppointmentDetails=ctrlQuery.viewAllAppointmentDetails();
            for(AppointmentSearchDTO values :allAppointmentDetails){
                Object [] row={values.getApID(),values.getApNo(),values.getApDate(),values.getTimeSlot(),values.getpID(),values.getpName(),values.getDrID(),values.getDrName(),values.getSpType(),values.gethName()};
                dtm.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(ViewAppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReloadActionPerformed

    private void cmbAppointmentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAppointmentIDActionPerformed
        String apID=(String) cmbAppointmentID.getSelectedItem();
        DefaultTableModel dtm=(DefaultTableModel) tblAppointment.getModel();
        dtm.setRowCount(0);
        try {
            ArrayList<AppointmentSearchDTO> allAppointmentDetails=ctrlQuery.viewAppointmentDetailsByApId(apID);
            for(AppointmentSearchDTO values :allAppointmentDetails){
                Object [] row={values.getApID(),values.getApNo(),values.getApDate(),values.getTimeSlot(),values.getpID(),values.getpName(),values.getDrID(),values.getDrName(),values.getSpType(),values.gethName()};
                dtm.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(ViewAppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbAppointmentIDActionPerformed

    private void datePickerApDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datePickerApDateActionPerformed
        Date d=datePickerApDate.getDate();
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String apDate=df.format(d);
        DefaultTableModel dtm=(DefaultTableModel) tblAppointment.getModel();
        dtm.setRowCount(0);
        try {
            ArrayList<AppointmentSearchDTO> allAppointmentDetails=ctrlQuery.viewAppointmentDetailsByDate(apDate);
            for(AppointmentSearchDTO values :allAppointmentDetails){
                Object [] row={values.getApID(),values.getApNo(),values.getApDate(),values.getTimeSlot(),values.getpID(),values.getpName(),values.getDrID(),values.getDrName(),values.getSpType(),values.gethName()};
                dtm.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(ViewAppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_datePickerApDateActionPerformed

    private void cmbPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPatientIDActionPerformed
       String pID=(String) cmbPatientID.getSelectedItem();
       DefaultTableModel dtm=(DefaultTableModel) tblAppointment.getModel();
       dtm.setRowCount(0);
        try {
            ArrayList<AppointmentSearchDTO> allAppointmentDetails=ctrlQuery.viewAppointmentDetailsByPid(pID);
            for(AppointmentSearchDTO values :allAppointmentDetails){
                Object [] row={values.getApID(),values.getApNo(),values.getApDate(),values.getTimeSlot(),values.getpID(),values.getpName(),values.getDrID(),values.getDrName(),values.getSpType(),values.gethName()};
                dtm.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(ViewAppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbPatientIDActionPerformed

    private void cmbDoctorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDoctorIdActionPerformed
     String drID=(String) cmbDoctorId.getSelectedItem();
     DefaultTableModel dtm=(DefaultTableModel) tblAppointment.getModel();
     dtm.setRowCount(0);
        try {
            ArrayList<AppointmentSearchDTO> allAppointmentDetails=ctrlQuery.viewAppointmentDetailsByDrId(drID);
            for(AppointmentSearchDTO values :allAppointmentDetails){
                Object [] row={values.getApID(),values.getApNo(),values.getApDate(),values.getTimeSlot(),values.getpID(),values.getpName(),values.getDrID(),values.getDrName(),values.getSpType(),values.gethName()};
                dtm.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(ViewAppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_cmbDoctorIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton btnReload;
    private com.jidesoft.swing.AutoCompletionComboBox cmbAppointmentID;
    private com.jidesoft.swing.AutoCompletionComboBox cmbDoctorId;
    private com.jidesoft.swing.AutoCompletionComboBox cmbPatientID;
    private org.jdesktop.swingx.JXDatePicker datePickerApDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAllAp;
    private javax.swing.JLabel lblSortByApID;
    private javax.swing.JLabel lblSortByDate;
    private javax.swing.JLabel lblSortByDoctor;
    private javax.swing.JLabel lblSortByPatient;
    private javax.swing.JLabel lblTopic;
    private org.jdesktop.swingx.JXTable tblAppointment;
    private org.jdesktop.swingx.JXTextField txtDoctorName;
    private org.jdesktop.swingx.JXTextField txtPatientName;
    // End of variables declaration//GEN-END:variables
}