package my.project;
public class menubar extends javax.swing.JFrame {
    public menubar() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Set_Details = new javax.swing.JButton();
        Get_Details = new javax.swing.JButton();
        Fee_Details = new javax.swing.JButton();
        Result = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/project/kendriya-vidyalaya-sangathan-Color (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, 329));

        Set_Details.setBackground(new java.awt.Color(255, 51, 51));
        Set_Details.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Set_Details.setForeground(new java.awt.Color(255, 255, 255));
        Set_Details.setText("Set Details");
        Set_Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Set_DetailsActionPerformed(evt);
            }
        });
        jPanel1.add(Set_Details, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 335, 114, 34));

        Get_Details.setBackground(new java.awt.Color(255, 51, 51));
        Get_Details.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Get_Details.setForeground(new java.awt.Color(255, 255, 255));
        Get_Details.setText("Get Details");
        Get_Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Get_DetailsActionPerformed(evt);
            }
        });
        jPanel1.add(Get_Details, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 335, 112, 34));

        Fee_Details.setBackground(new java.awt.Color(255, 51, 51));
        Fee_Details.setForeground(new java.awt.Color(255, 255, 255));
        Fee_Details.setText("Fee Detail");
        Fee_Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fee_DetailsActionPerformed(evt);
            }
        });
        jPanel1.add(Fee_Details, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 336, 108, 34));

        Result.setBackground(new java.awt.Color(255, 51, 51));
        Result.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Result.setForeground(new java.awt.Color(255, 255, 255));
        Result.setText("Result");
        Result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultActionPerformed(evt);
            }
        });
        jPanel1.add(Result, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 335, 116, 35));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("WELCOME ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Set_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Set_DetailsActionPerformed
        new Student_details().student_Details();
    }//GEN-LAST:event_Set_DetailsActionPerformed

    private void ResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultActionPerformed
        new Result().get_Result();
    }//GEN-LAST:event_ResultActionPerformed

    private void Fee_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fee_DetailsActionPerformed
        new Fee().get_Fee();
    }//GEN-LAST:event_Fee_DetailsActionPerformed

    private void Get_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Get_DetailsActionPerformed
        new Get_Details().get_Details();
    }//GEN-LAST:event_Get_DetailsActionPerformed
    public void get_Menu(String s){
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
            java.util.logging.Logger.getLogger(menubar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menubar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menubar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menubar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menubar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Fee_Details;
    private javax.swing.JButton Get_Details;
    private javax.swing.JButton Result;
    private javax.swing.JButton Set_Details;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
