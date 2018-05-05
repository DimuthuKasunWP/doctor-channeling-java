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
public class DoctorPanel extends javax.swing.JPanel {
   

    /**
     * Creates new form DoctorPanel
     */
    public DoctorPanel() {
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

        lblAddnewDoctor = new javax.swing.JLabel();
        lblRemoveDoctor = new javax.swing.JLabel();
        lblViewAndChange = new javax.swing.JLabel();
        pnlBaseDoctor = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblAddnewDoctor.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblAddnewDoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse41/doctorchannelingsystem/resources/Add User Male_26px.png"))); // NOI18N
        lblAddnewDoctor.setText("Add New Doctor  |");
        lblAddnewDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddnewDoctorMouseClicked(evt);
            }
        });

        lblRemoveDoctor.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblRemoveDoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse41/doctorchannelingsystem/resources/Trash_26px.png"))); // NOI18N
        lblRemoveDoctor.setText("Remove Doctor  |");
        lblRemoveDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRemoveDoctorMouseClicked(evt);
            }
        });

        lblViewAndChange.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblViewAndChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse41/doctorchannelingsystem/resources/Edit Property_26px.png"))); // NOI18N
        lblViewAndChange.setText("View & Change Doctor Details  ");
        lblViewAndChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewAndChangeMouseClicked(evt);
            }
        });

        pnlBaseDoctor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlBaseDoctorLayout = new javax.swing.GroupLayout(pnlBaseDoctor);
        pnlBaseDoctor.setLayout(pnlBaseDoctorLayout);
        pnlBaseDoctorLayout.setHorizontalGroup(
            pnlBaseDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        pnlBaseDoctorLayout.setVerticalGroup(
            pnlBaseDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBaseDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAddnewDoctor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRemoveDoctor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblViewAndChange)
                        .addGap(0, 473, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddnewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRemoveDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblViewAndChange, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBaseDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblAddnewDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddnewDoctorMouseClicked
        AddNewDoctorPanel a1=new AddNewDoctorPanel();
        a1.setSize(pnlBaseDoctor.getSize());
        pnlBaseDoctor.removeAll();
        pnlBaseDoctor.add(a1);
        pnlBaseDoctor.revalidate();
        pnlBaseDoctor.repaint();
        a1.show();
    }//GEN-LAST:event_lblAddnewDoctorMouseClicked

    private void lblRemoveDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemoveDoctorMouseClicked
       RemoveDoctorPanel r1=new RemoveDoctorPanel();
       r1.setSize(pnlBaseDoctor.getSize());
       pnlBaseDoctor.removeAll();
       pnlBaseDoctor.add(r1);
       pnlBaseDoctor.revalidate();
       pnlBaseDoctor.repaint();
       r1.show();
    }//GEN-LAST:event_lblRemoveDoctorMouseClicked

    private void lblViewAndChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewAndChangeMouseClicked
       ChangeDoctorPanel d1=new ChangeDoctorPanel();
       d1.setSize(pnlBaseDoctor.getSize());
       pnlBaseDoctor.removeAll();
       pnlBaseDoctor.add(d1);
       pnlBaseDoctor.revalidate();
       pnlBaseDoctor.repaint();
       d1.show();
    }//GEN-LAST:event_lblViewAndChangeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAddnewDoctor;
    private javax.swing.JLabel lblRemoveDoctor;
    private javax.swing.JLabel lblViewAndChange;
    private javax.swing.JPanel pnlBaseDoctor;
    // End of variables declaration//GEN-END:variables
}
