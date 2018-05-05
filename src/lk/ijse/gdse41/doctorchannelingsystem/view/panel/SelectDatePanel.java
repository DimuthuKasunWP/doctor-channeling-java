/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.view.panel;

import java.awt.Color;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lk.ijse.gdse41.doctorchannelingsystem.controller.ControllerFactory;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.QueryController;
import lk.ijse.gdse41.doctorchannelingsystem.dto.SearchQueryDTO;
import lk.ijse.gdse41.doctorchannelingsystem.idgenarate.IDGenarator;

/**
 *
 * @author Binura Salindra
 */
public class SelectDatePanel extends javax.swing.JPanel {
    private QueryController ctrlQuery;

    /**
     * Creates new form SelectDatePanel
     */
    public SelectDatePanel() {
        initComponents();
        ctrlQuery=(QueryController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.QUERY);
    }
    public SelectDatePanel(String scID,String scDay){
        initComponents();
        ctrlQuery=(QueryController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.QUERY);
        txtScheduleId.setText(scID);
        genarateAppointmentID();
        disableDates();
        highLightDate(scDay);
        lblAddNewPatient.setEnabled(false);
        lblRegisteredPatient.setEnabled(false);
    }
    public void genarateAppointmentID(){
        try {
            txtAppId.setText(IDGenarator.getNewID("Appointment","apID","A"));
        } catch (SQLException ex) {
            Logger.getLogger(SelectDatePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SelectDatePanel.class.getName()).log(Level.SEVERE, null, ex);
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

        pnlSelectDateBase = new javax.swing.JPanel();
        lblTopic = new javax.swing.JLabel();
        lblAppointmentNo = new javax.swing.JLabel();
        txtAppNo = new org.jdesktop.swingx.JXTextField();
        txtAppId = new org.jdesktop.swingx.JXTextField();
        lblAppointmentId = new javax.swing.JLabel();
        lblScheduleID = new javax.swing.JLabel();
        txtScheduleId = new org.jdesktop.swingx.JXTextField();
        lblDate = new javax.swing.JLabel();
        txtAppointmentDate = new org.jdesktop.swingx.JXTextField();
        lblSelectDate = new javax.swing.JLabel();
        datePickerSelectDate1 = new org.jdesktop.swingx.JXDatePicker();
        lblSelectPatientType = new javax.swing.JLabel();
        lblAddNewPatient = new javax.swing.JLabel();
        lblRegisteredPatient = new javax.swing.JLabel();
        lblAvaDay = new javax.swing.JLabel();
        lblUnAvaDay = new javax.swing.JLabel();
        lblPastDay = new javax.swing.JLabel();
        lblMessage1 = new javax.swing.JLabel();
        lblMessage2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        pnlSelectDateBase.setBackground(new java.awt.Color(255, 255, 255));

        lblTopic.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTopic.setText("Appointment Details :");

        lblAppointmentNo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblAppointmentNo.setText("Appointment No :");

        txtAppNo.setFocusable(false);

        txtAppId.setFocusable(false);

        lblAppointmentId.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblAppointmentId.setText("Appointment ID :");

        lblScheduleID.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblScheduleID.setText("Schedule ID :");

        txtScheduleId.setFocusable(false);

        lblDate.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblDate.setText("Date");

        txtAppointmentDate.setFocusable(false);

        lblSelectDate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSelectDate.setText("Select Date :");

        datePickerSelectDate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datePickerSelectDate1ActionPerformed(evt);
            }
        });

        lblSelectPatientType.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSelectPatientType.setText("Select Patient Type:");

        lblAddNewPatient.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblAddNewPatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse41/doctorchannelingsystem/resources/Add User Male_26px.png"))); // NOI18N
        lblAddNewPatient.setText("New Patient");
        lblAddNewPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddNewPatientMouseClicked(evt);
            }
        });

        lblRegisteredPatient.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblRegisteredPatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse41/doctorchannelingsystem/resources/User Groups_26px.png"))); // NOI18N
        lblRegisteredPatient.setText("Registered Patient");
        lblRegisteredPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisteredPatientMouseClicked(evt);
            }
        });

        lblAvaDay.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblAvaDay.setForeground(new java.awt.Color(0, 204, 0));
        lblAvaDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse41/doctorchannelingsystem/resources/13_26px.png"))); // NOI18N
        lblAvaDay.setText("Doctor Available days");

        lblUnAvaDay.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUnAvaDay.setForeground(new java.awt.Color(255, 0, 0));
        lblUnAvaDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse41/doctorchannelingsystem/resources/13_126px.png"))); // NOI18N
        lblUnAvaDay.setText("Doctor Unavailable days");

        lblPastDay.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPastDay.setForeground(new java.awt.Color(255, 0, 0));
        lblPastDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse41/doctorchannelingsystem/resources/Delete_26px.png"))); // NOI18N
        lblPastDay.setText("Past Days");

        lblMessage1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMessage1.setText("Tip : If you did worng in past step..?");

        lblMessage2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMessage2.setText("        please press select search types again..");

        javax.swing.GroupLayout pnlSelectDateBaseLayout = new javax.swing.GroupLayout(pnlSelectDateBase);
        pnlSelectDateBase.setLayout(pnlSelectDateBaseLayout);
        pnlSelectDateBaseLayout.setHorizontalGroup(
            pnlSelectDateBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSelectDateBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSelectDateBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSelectDateBaseLayout.createSequentialGroup()
                        .addGroup(pnlSelectDateBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSelectDateBaseLayout.createSequentialGroup()
                                .addComponent(lblSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(datePickerSelectDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlSelectDateBaseLayout.createSequentialGroup()
                                .addComponent(lblAppointmentNo)
                                .addGap(10, 10, 10)
                                .addComponent(txtAppNo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlSelectDateBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlSelectDateBaseLayout.createSequentialGroup()
                                    .addComponent(lblAddNewPatient)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblRegisteredPatient))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSelectDateBaseLayout.createSequentialGroup()
                                    .addGroup(pnlSelectDateBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblScheduleID)
                                        .addComponent(lblDate))
                                    .addGap(38, 38, 38)
                                    .addGroup(pnlSelectDateBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAppointmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtScheduleId, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(pnlSelectDateBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUnAvaDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAvaDay)
                            .addComponent(lblPastDay)
                            .addComponent(lblMessage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMessage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlSelectDateBaseLayout.createSequentialGroup()
                        .addComponent(lblAppointmentId)
                        .addGap(15, 15, 15)
                        .addComponent(txtAppId, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblSelectPatientType, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnlSelectDateBaseLayout.setVerticalGroup(
            pnlSelectDateBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSelectDateBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSelectDateBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlSelectDateBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSelectDate)
                        .addComponent(datePickerSelectDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAvaDay, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSelectDateBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSelectDateBaseLayout.createSequentialGroup()
                        .addComponent(lblTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(pnlSelectDateBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAppointmentNo)
                            .addComponent(txtAppNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(pnlSelectDateBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAppointmentId)
                            .addComponent(txtAppId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(pnlSelectDateBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblScheduleID)
                            .addComponent(txtScheduleId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlSelectDateBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDate)
                            .addComponent(txtAppointmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblSelectPatientType, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlSelectDateBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddNewPatient)
                            .addComponent(lblRegisteredPatient)))
                    .addGroup(pnlSelectDateBaseLayout.createSequentialGroup()
                        .addComponent(lblUnAvaDay, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPastDay, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lblMessage1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMessage2)))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSelectDateBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSelectDateBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void datePickerSelectDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datePickerSelectDate1ActionPerformed
        Date day=datePickerSelectDate1.getDate();
        SimpleDateFormat sdf=new SimpleDateFormat("EEEE");
        String dayName=sdf.format(day);
        String schID=txtScheduleId.getText();
        try {
            SearchQueryDTO search=ctrlQuery.getScheduleDetails(schID);
            String scDayName=search.getDayName();
            if(dayName.matches(scDayName)){
                Date d=datePickerSelectDate1.getDate();
                SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
                String date=df.format(d);

                int maxPatientCount;
                try {
                    maxPatientCount = ctrlQuery.getMaxPatientCount(txtScheduleId.getText());
                    String scID=txtScheduleId.getText();
                    int count ;

                    count = ctrlQuery.countAppointmentNo(date, scID);
                    if(maxPatientCount>=count){
                        int newCount = count+1;
                        txtAppNo.setText(Integer.toString(newCount));
                    }else{
                        JOptionPane.showMessageDialog(this,"Max patient count is full, please try with another date");
                }

                } catch (Exception ex) {
                     Logger.getLogger(SelectDatePanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                txtAppointmentDate.setText(date);
                lblAddNewPatient.setEnabled(true);
                lblRegisteredPatient.setEnabled(true);
                
            }else{
                JOptionPane.showMessageDialog(this,"Please select green colour date");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ChangeAppointmentPanel1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_datePickerSelectDate1ActionPerformed

    private void lblAddNewPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddNewPatientMouseClicked
        String apNo=txtAppNo.getText();
        String apID=txtAppId.getText();
        String scheduleID=txtScheduleId.getText();
        String apDate=txtAppointmentDate.getText();
        
        AddNewPatientPanel ap=new AddNewPatientPanel(apNo, apID, scheduleID, apDate);
        ap.setSize(pnlSelectDateBase.getSize());
        pnlSelectDateBase.removeAll();
        pnlSelectDateBase.add(ap);
        pnlSelectDateBase.revalidate();
        pnlSelectDateBase.repaint();
    }//GEN-LAST:event_lblAddNewPatientMouseClicked

    private void lblRegisteredPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisteredPatientMouseClicked
        String apNo=txtAppNo.getText();
        String apID=txtAppId.getText();
        String scheduleID=txtScheduleId.getText();
        String apDate=txtAppointmentDate.getText();
        
        RegisteredPatientPanel ap=new RegisteredPatientPanel(apNo, apID, scheduleID, apDate);
        ap.setSize(pnlSelectDateBase.getSize());
        pnlSelectDateBase.removeAll();
        pnlSelectDateBase.add(ap);
        pnlSelectDateBase.revalidate();
        pnlSelectDateBase.repaint();
    }//GEN-LAST:event_lblRegisteredPatientMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker datePickerSelectDate1;
    private javax.swing.JLabel lblAddNewPatient;
    private javax.swing.JLabel lblAppointmentId;
    private javax.swing.JLabel lblAppointmentNo;
    private javax.swing.JLabel lblAvaDay;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblMessage1;
    private javax.swing.JLabel lblMessage2;
    private javax.swing.JLabel lblPastDay;
    private javax.swing.JLabel lblRegisteredPatient;
    private javax.swing.JLabel lblScheduleID;
    private javax.swing.JLabel lblSelectDate;
    private javax.swing.JLabel lblSelectPatientType;
    private javax.swing.JLabel lblTopic;
    private javax.swing.JLabel lblUnAvaDay;
    private javax.swing.JPanel pnlSelectDateBase;
    private org.jdesktop.swingx.JXTextField txtAppId;
    private org.jdesktop.swingx.JXTextField txtAppNo;
    private org.jdesktop.swingx.JXTextField txtAppointmentDate;
    private org.jdesktop.swingx.JXTextField txtScheduleId;
    // End of variables declaration//GEN-END:variables
}
