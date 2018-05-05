/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.view.panel;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lk.ijse.gdse41.doctorchannelingsystem.controller.ControllerFactory;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.AppointmentController;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.PatientController;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.QueryController;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl.QueryControllerImpl;
import lk.ijse.gdse41.doctorchannelingsystem.dto.AppointmentDTO;
import lk.ijse.gdse41.doctorchannelingsystem.dto.SearchQueryDTO;

/**
 *
 * @author Binura Salindra
 */
public class ChangeAppointmentPanel1 extends javax.swing.JPanel {
    private QueryController ctrlQuery;
    private AppointmentController ctrlAppointment;
    private PatientController ctrlPatient;
   

    /**
     * Creates new form CancelAppointmentPanel
     */
    public ChangeAppointmentPanel1() {
        initComponents();
        ctrlQuery=(QueryController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.QUERY);
        ctrlAppointment=(AppointmentController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.APPOINTMENT);
        ctrlPatient=(PatientController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.PATIENT);
        disableDates();
        loadAppointmentId();
    }
    private void loadAppointmentId(){
        ArrayList<String> appointmentIds = null;
        try {
            appointmentIds = ctrlQuery.getAllAppointmentId();
        } catch (Exception ex) {
            Logger.getLogger(ChangeAppointmentPanel1.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < appointmentIds.size(); i++){
            cmbAppoinmentId.addItem(appointmentIds.get(i));
        }
    }
    public void disableDates(){
        Calendar c1=Calendar.getInstance();
        c1.add(Calendar.DATE, 0);
        datePickerSelectDate1.getMonthView().setLowerBound(c1.getTime());
        
    }
    public void highLightDate(String scDay){
        String scheduleDay=scDay;
        if(scheduleDay.matches("Monday")){
            datePickerSelectDate1.getMonthView().setDayForeground(2, Color.GREEN);
            datePickerSelectDate1.getMonthView().setDayForeground(1, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(7, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(3, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(4, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(5, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(6, Color.RED);
        }else if (scheduleDay.matches("Tuesday")) {
            datePickerSelectDate1.getMonthView().setDayForeground(3, Color.GREEN);
            datePickerSelectDate1.getMonthView().setDayForeground(1, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(7, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(2, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(4, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(5, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(6, Color.RED);
            
        }else if (scheduleDay.matches("Wednesday")) {
            datePickerSelectDate1.getMonthView().setDayForeground(4, Color.GREEN);
            datePickerSelectDate1.getMonthView().setDayForeground(1, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(7, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(3, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(2, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(5, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(6, Color.RED);
            
        }else if (scheduleDay.matches("Thursday")) {
            datePickerSelectDate1.getMonthView().setDayForeground(5, Color.GREEN);
            datePickerSelectDate1.getMonthView().setDayForeground(1, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(7, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(3, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(4, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(2, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(6, Color.RED);
            
        }else if (scheduleDay.matches("Friday")) {
            datePickerSelectDate1.getMonthView().setDayForeground(6, Color.GREEN);
            datePickerSelectDate1.getMonthView().setDayForeground(1, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(7, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(3, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(4, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(5, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(2, Color.RED);
            
        }else if (scheduleDay.matches("Saturday")) {
            datePickerSelectDate1.getMonthView().setDayForeground(7, Color.GREEN);
            datePickerSelectDate1.getMonthView().setDayForeground(1, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(2, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(3, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(4, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(5, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(6, Color.RED);
            
        }else{
            datePickerSelectDate1.getMonthView().setDayForeground(1, Color.GREEN);
            datePickerSelectDate1.getMonthView().setDayForeground(2, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(7, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(3, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(4, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(5, Color.RED);
            datePickerSelectDate1.getMonthView().setDayForeground(6, Color.RED);
            
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
        lblApID = new javax.swing.JLabel();
        cmbAppoinmentId = new com.jidesoft.swing.AutoCompletionComboBox();
        lblPId = new javax.swing.JLabel();
        lblScID = new javax.swing.JLabel();
        lblApNo = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        txtScheduleID = new javax.swing.JTextField();
        txtApNo = new javax.swing.JTextField();
        btnUpdate = new org.jdesktop.swingx.JXButton();
        datePickerSelectDate1 = new org.jdesktop.swingx.JXDatePicker();
        lblChangeDate = new javax.swing.JLabel();
        txtAppointmentDate = new javax.swing.JTextField();
        lblAvaDays = new javax.swing.JLabel();
        lblUnavaDays = new javax.swing.JLabel();
        lblPastDates = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTopic.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTopic.setText("Postpone or Change Appointment Details");

        lblApID.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblApID.setText("Appointment ID :");

        cmbAppoinmentId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAppoinmentIdItemStateChanged(evt);
            }
        });

        lblPId.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblPId.setText("Patient ID :");

        lblScID.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblScID.setText("Schedule ID :");

        lblApNo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblApNo.setText("Ap. No :");

        lblDate.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblDate.setText("Date :");

        txtScheduleID.setFocusable(false);

        txtApNo.setFocusable(false);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        datePickerSelectDate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datePickerSelectDate1ActionPerformed(evt);
            }
        });

        lblChangeDate.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblChangeDate.setText("Change date :");

        txtAppointmentDate.setFocusable(false);

        lblAvaDays.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblAvaDays.setForeground(new java.awt.Color(0, 204, 0));
        lblAvaDays.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse41/doctorchannelingsystem/resources/13_26px.png"))); // NOI18N
        lblAvaDays.setText("Doctor Available days");

        lblUnavaDays.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUnavaDays.setForeground(new java.awt.Color(255, 0, 0));
        lblUnavaDays.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse41/doctorchannelingsystem/resources/13_126px.png"))); // NOI18N
        lblUnavaDays.setText("Doctor Unavailable days");

        lblPastDates.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPastDates.setForeground(new java.awt.Color(255, 0, 0));
        lblPastDates.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse41/doctorchannelingsystem/resources/Delete_26px.png"))); // NOI18N
        lblPastDates.setText("Past Days");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblChangeDate)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(datePickerSelectDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblApNo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                    .addComponent(txtApNo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblScID)
                                    .addGap(27, 27, 27)
                                    .addComponent(txtScheduleID))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblApID)
                                        .addComponent(lblPId))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmbAppoinmentId, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                        .addComponent(txtPatientID)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblDate)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAppointmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUnavaDays)
                            .addComponent(lblAvaDays)
                            .addComponent(lblPastDates)))
                    .addComponent(lblTopic))
                .addContainerGap(456, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTopic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApID)
                    .addComponent(cmbAppoinmentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPId)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblScID)
                    .addComponent(txtScheduleID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApNo)
                    .addComponent(txtApNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(txtAppointmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblChangeDate)
                        .addComponent(datePickerSelectDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAvaDays, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblUnavaDays, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPastDates, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
      try {
            AppointmentDTO appointmentDTO=new AppointmentDTO(
            (String) cmbAppoinmentId.getSelectedItem(),
            txtPatientID.getText(),
            txtScheduleID.getText(),
            Integer.parseInt(txtApNo.getText()),
            txtAppointmentDate.getText());
        
            boolean result = ctrlAppointment.update(appointmentDTO);
            if (result){
                JOptionPane.showMessageDialog(this, "Appointment Details has been successfully Updated...!");
            }else{
                JOptionPane.showMessageDialog(this, "Appointment Details has not been Updated...!");
            }
        } catch (Exception ex) {
            Logger.getLogger(ChangeAppointmentPanel1.class.getName()).log(Level.SEVERE, null, ex);
        }
     

    
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void cmbAppoinmentIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAppoinmentIdItemStateChanged
      String id=(String) cmbAppoinmentId.getSelectedItem();
        try {
            AppointmentDTO appointment=ctrlAppointment.search(id);
            txtPatientID.setText(appointment.getpID());
            txtScheduleID.setText(appointment.getScID());
            txtApNo.setText(""+appointment.getApNo());
            txtAppointmentDate.setText(appointment.getApDate());
            
            String scheduleID=txtScheduleID.getText();
            SearchQueryDTO search=ctrlQuery.getScheduleDetails(scheduleID);
            
            String scheduleDay=search.getDayName();
            
            highLightDate(scheduleDay);
            
        } catch (Exception ex) {
            Logger.getLogger(ChangeAppointmentPanel1.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    }//GEN-LAST:event_cmbAppoinmentIdItemStateChanged

    private void datePickerSelectDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datePickerSelectDate1ActionPerformed
        Date day=datePickerSelectDate1.getDate();
        SimpleDateFormat sdf=new SimpleDateFormat("EEEE");
        String dayName=sdf.format(day);
        String schID=txtScheduleID.getText();
        try {
            SearchQueryDTO search=ctrlQuery.getScheduleDetails(schID);
            String scDayName=search.getDayName();
            if(dayName.matches(scDayName)){
                Date d=datePickerSelectDate1.getDate();
                SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
                String date=df.format(d);

                int maxPatientCount;
                try {
                    maxPatientCount = ctrlQuery.getMaxPatientCount(txtScheduleID.getText());
                    String scID=txtScheduleID.getText();
                    int count ;

                    count = ctrlQuery.countAppointmentNo(date, scID);
                    if(maxPatientCount>=count){
                        int newCount = count+1;
                        txtApNo.setText(Integer.toString(newCount));
                    }else{
                        JOptionPane.showMessageDialog(this,"Max patient count is full, please try with another date");
                }

                } catch (Exception ex) {
                     Logger.getLogger(SelectDatePanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                txtAppointmentDate.setText(date);
                
            }else{
                JOptionPane.showMessageDialog(this,"Please select green colour date");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ChangeAppointmentPanel1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
       
    }//GEN-LAST:event_datePickerSelectDate1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton btnUpdate;
    private com.jidesoft.swing.AutoCompletionComboBox cmbAppoinmentId;
    private org.jdesktop.swingx.JXDatePicker datePickerSelectDate1;
    private javax.swing.JLabel lblApID;
    private javax.swing.JLabel lblApNo;
    private javax.swing.JLabel lblAvaDays;
    private javax.swing.JLabel lblChangeDate;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblPId;
    private javax.swing.JLabel lblPastDates;
    private javax.swing.JLabel lblScID;
    private javax.swing.JLabel lblTopic;
    private javax.swing.JLabel lblUnavaDays;
    private javax.swing.JTextField txtApNo;
    private javax.swing.JTextField txtAppointmentDate;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtScheduleID;
    // End of variables declaration//GEN-END:variables
}
