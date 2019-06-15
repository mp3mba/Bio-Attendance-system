/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biosys;

/**
 *
 * @author Ejiga Samuel
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        logout = new javax.swing.JButton();
        mStaff = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        vAtt = new javax.swing.JButton();
        attReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logout.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        mStaff.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        mStaff.setText("Manage Staff");
        mStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mStaffActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Garamond", 0, 11)); // NOI18N
        jLabel1.setText("STAFF ATTENDANCE");

        vAtt.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        vAtt.setText("View Attendance");
        vAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vAttActionPerformed(evt);
            }
        });

        attReport.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        attReport.setText("Attendance Report");
        attReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(attReport)
                    .addComponent(vAtt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logout)
                    .addComponent(jLabel1))
                .addGap(55, 55, 55)
                .addComponent(mStaff)
                .addGap(27, 27, 27)
                .addComponent(vAtt)
                .addGap(18, 18, 18)
                .addComponent(attReport)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mStaffActionPerformed
        // TODO add your handling code here:
        ManageStaff f2 = new ManageStaff();
        f2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mStaffActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        Login f1 = new Login();
         f1.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void vAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vAttActionPerformed
        // TODO add your handling code here:
        ViewAttend f3 = new ViewAttend();
        f3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_vAttActionPerformed

    private void attReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attReportActionPerformed
        // TODO add your handling code here:
        AttReport b4 = new AttReport();
        b4.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_attReportActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton mStaff;
    private javax.swing.JButton vAtt;
    // End of variables declaration//GEN-END:variables
}