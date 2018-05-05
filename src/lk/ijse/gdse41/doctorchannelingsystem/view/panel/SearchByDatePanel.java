/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.view.panel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import lk.ijse.gdse41.doctorchannelingsystem.controller.ControllerFactory;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.QueryController;
import lk.ijse.gdse41.doctorchannelingsystem.dto.ScheduleQueryDTO;

/**
 *
 * @author Binura Salindra
 */
public class SearchByDatePanel extends javax.swing.JPanel {
    private QueryController ctrlQuery;
    

    /**
     * Creates new form SearchByDoctorPanel
     */
    public SearchByDatePanel() {
        initComponents();
        pnlSearchDatelBase.setVisible(false);
        ctrlQuery=(QueryController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.QUERY);
        disableDates();
    }
    public void disableDates(){
        Calendar c1=Calendar.getInstance();
        c1.add(Calendar.DATE, 0);
        datePicker.getMonthView().setLowerBound(c1.getTime());
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
        lblDate = new javax.swing.JLabel();
        pnlSearchDatelBase = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSearchByDate = new org.jdesktop.swingx.JXTable();
        lblMessage = new javax.swing.JLabel();
        datePicker = new org.jdesktop.swingx.JXDatePicker();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTopic.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTopic.setText("Search By Date :");

        lblDate.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblDate.setText("Date  :");

        pnlSearchDatelBase.setBackground(new java.awt.Color(255, 255, 255));

        tblSearchByDate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Doctor", "Hospital", "Speciality", "Schedule", "Patient Count", "Day", "Time Slot"
            }
        ));
        tblSearchByDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSearchByDateMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSearchByDate);

        lblMessage.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMessage.setText("Tip : Select suitable row on the table");

        javax.swing.GroupLayout pnlSearchDatelBaseLayout = new javax.swing.GroupLayout(pnlSearchDatelBase);
        pnlSearchDatelBase.setLayout(pnlSearchDatelBaseLayout);
        pnlSearchDatelBaseLayout.setHorizontalGroup(
            pnlSearchDatelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchDatelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlSearchDatelBaseLayout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSearchDatelBaseLayout.setVerticalGroup(
            pnlSearchDatelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchDatelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        datePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datePickerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSearchDatelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 763, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTopic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(pnlSearchDatelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void datePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datePickerActionPerformed
      Date d=datePicker.getDate();
        SimpleDateFormat df=new SimpleDateFormat("EEEE");
        String date=df.format(d);
        
        DefaultTableModel dtm=(DefaultTableModel) tblSearchByDate.getModel();
        dtm.setRowCount(0);
        try {
            ArrayList<ScheduleQueryDTO> allSearchIndex=ctrlQuery.searchByDate(date);
             for(ScheduleQueryDTO get:allSearchIndex){
                Object []row={get.getDrName(),get.gethName(),get.getSpType(),get.getScID(),get.getMaxPatientCount(),get.getDayName(),get.getTimeSlot()};
                dtm.addRow(row);
             }
        } catch (Exception ex) {
            Logger.getLogger(SearchByDatePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
       
      pnlSearchDatelBase.setVisible(true);
    }//GEN-LAST:event_datePickerActionPerformed

    private void tblSearchByDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSearchByDateMouseClicked
       DefaultTableModel dtm=(DefaultTableModel) tblSearchByDate.getModel();
        String scheduleId=(String) tblSearchByDate.getValueAt(tblSearchByDate.getSelectedRow(), 3);
        String scheduleDay=(String) tblSearchByDate.getValueAt(tblSearchByDate.getSelectedRow(), 5);
        SelectDatePanel ap=new SelectDatePanel(scheduleId,scheduleDay);
        ap.setSize(pnlSearchDatelBase.getSize());
        pnlSearchDatelBase.removeAll();
        pnlSearchDatelBase.add(ap);
        pnlSearchDatelBase.revalidate();
        pnlSearchDatelBase.repaint();
        ap.show();
        
    }//GEN-LAST:event_tblSearchByDateMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker datePicker;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblTopic;
    private javax.swing.JPanel pnlSearchDatelBase;
    private org.jdesktop.swingx.JXTable tblSearchByDate;
    // End of variables declaration//GEN-END:variables
}