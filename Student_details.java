package my.project;
import java.sql.*;
import javax.swing.JOptionPane;
import static my.project.Loggin_Form.conn;
public class Student_details extends javax.swing.JFrame {
    public Student_details() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        D_of_B = new javax.swing.JTextField();
        Aadhar_No = new javax.swing.JTextField();
        F_Name = new javax.swing.JTextField();
        M_Name = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Pin_Code = new javax.swing.JTextField();
        C_Add = new javax.swing.JTextField();
        Notiffication = new javax.swing.JLabel();
        Vill_Po = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        PS = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Distric = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        State = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Students Details Foom");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, 45));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Name                                         :-");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 51, 180, 28));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Date of Borth                              :-");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 86, 180, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Aadhar No  Enter last 4 Digit   :-");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 123, 170, 31));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Father Name                              :-");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 160, 180, 31));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Mother Name                              :-");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 197, 180, 32));

        Name.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 278, 28));

        D_of_B.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        D_of_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_of_BActionPerformed(evt);
            }
        });
        getContentPane().add(D_of_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 278, 30));

        Aadhar_No.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        getContentPane().add(Aadhar_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 278, 31));

        F_Name.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        getContentPane().add(F_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 278, 31));

        M_Name.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        getContentPane().add(M_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 278, 34));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/project/kendriya-vidyalaya-sangathan-Color (1).png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 361, 351));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Parmanent Address                    :-");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 339, 220, 42));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Carent  Address                          :-");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 210, 36));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Pin Code=");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, 32));

        Pin_Code.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        Pin_Code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pin_CodeActionPerformed(evt);
            }
        });
        jPanel1.add(Pin_Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 113, 32));

        C_Add.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(C_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 290, 30));

        Notiffication.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Notiffication, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 560, 190, 33));

        Vill_Po.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(Vill_Po, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 230, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Vill+Po=");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 50, 30));

        PS.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(PS, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 230, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("PS=");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 50, 30));

        Distric.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Distric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DistricActionPerformed(evt);
            }
        });
        jPanel1.add(Distric, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 230, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Distric=");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 50, 30));

        State.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        State.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateActionPerformed(evt);
            }
        });
        jPanel1.add(State, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 230, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("State=");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 40, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 193, 34));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void D_of_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_of_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D_of_BActionPerformed

    private void DistricActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DistricActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DistricActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Name1= Name.getText();
        String D_of_B1=D_of_B.getText();
        int Aadhar_NO1=Integer.parseInt(Aadhar_No.getText());
        String F_Name1=F_Name.getText();
        String M_Name1=M_Name.getText();
        String Vill1=Vill_Po.getText();
        String Ps1=PS.getText();
        String Diss1=Distric.getText();
        String State1=State.getText();
        int pin_q1=Integer.parseInt(Pin_Code.getText());
        String C_Add1=C_Add.getText();
        try{
               Connection conn=conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","shubham");
               PreparedStatement ps=conn.prepareStatement("insert into student_data value(?,?,?,?,?,?,?,?,?,?,?,?)");
               ps.setString(1,Name1);
               ps.setString(2,D_of_B1);
               ps.setInt(3, Aadhar_NO1);
               ps.setString(4,F_Name1);
               ps.setString(5,M_Name1);
               ps.setInt(6,194258229);
               ps.setString(7,Vill1);
               ps.setString(8,Ps1);
               ps.setString(9,Diss1);
               ps.setString(10,State1);
               ps.setInt(11,pin_q1);
               ps.setString(12,C_Add1);
               int i=ps.executeUpdate();
               if(i!=0)
                 JOptionPane.showMessageDialog(this,"Detail Submit");
               else
                 Notiffication.setText("Detail Not Submit");  
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void StateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StateActionPerformed

    private void Pin_CodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pin_CodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pin_CodeActionPerformed
    void student_Details() {
        java.awt.EventQueue.invokeLater(() -> {
            new Student_details().setVisible(true);
        });  
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Aadhar_No;
    private javax.swing.JTextField C_Add;
    private javax.swing.JTextField D_of_B;
    private javax.swing.JTextField Distric;
    private javax.swing.JTextField F_Name;
    private javax.swing.JTextField M_Name;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel Notiffication;
    private javax.swing.JTextField PS;
    private javax.swing.JTextField Pin_Code;
    private javax.swing.JTextField State;
    private javax.swing.JTextField Vill_Po;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
