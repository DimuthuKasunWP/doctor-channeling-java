/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse41.doctorchannelingsystem.view.panel;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import lk.ijse.gdse41.doctorchannelingsystem.controller.ControllerFactory;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.QueryController;
import lk.ijse.gdse41.doctorchannelingsystem.controller.custom.impl.QueryControllerImpl;
import lk.ijse.gdse41.doctorchannelingsystem.dto.ScheduleQueryDTO;


/**
 *
 * @author Binura Salindra
 */
public class SchedulePanel extends javax.swing.JPanel {
    private QueryController ctrlQuery;

    /**
     * Creates new form SchedulePanel
     */
    public SchedulePanel() {
        initComponents();
        ctrlQuery=(QueryController) ControllerFactory.getInstance().getController(ControllerFactory.ControllerTypes.QUERY);
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
        tblSchedule = new org.jdesktop.swingx.JXTable();
        btnReload = new org.jdesktop.swingx.JXButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTopic.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTopic.setText("All Doctors' Schedule");

        tblSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Schedule Id", "Doctor Name", "Available Day", "Time Slot", "MaxPatientCount", "Speciality", "Hospital"
            }
        ));
        jScrollPane1.setViewportView(tblSchedule);

        btnReload.setText("Reload");
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(431, 431, 431)
                .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTopic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
     DefaultTableModel dtm=(DefaultTableModel) tblSchedule.getModel();
     dtm.setRowCount(0);
        
            ArrayList<ScheduleQueryDTO> allScheduleIndexs = null;
        try {
            allScheduleIndexs = ctrlQuery.getAllScheduleIndex();
        } catch (Exception ex) {
            Logger.getLogger(SchedulePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
            for(ScheduleQueryDTO get:allScheduleIndexs){
                Object []row={get.getScID(),get.getDrName(),get.getDayName(),get.getTimeSlot(),get.getMaxPatientCount(),get.getSpType(),get.gethName()};
                dtm.addRow(row);
            }
        
      
    }//GEN-LAST:event_btnReloadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton btnReload;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTopic;
    private org.jdesktop.swingx.JXTable tblSchedule;
    // End of variables declaration//GEN-END:variables
}
