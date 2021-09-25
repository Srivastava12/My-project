package my.project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static my.project.Aadhar_No.rs;
import static my.project.Loggin_Form.conn;
public class Forgot_Password extends javax.swing.JFrame {
    static String u_name;
    public Forgot_Password() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Aadhar_No = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        U_Name = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Enter Last 4 Digit of Aadhar No");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 92, -1, 28));

        Aadhar_No.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Aadhar_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 60, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Enter User Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 176, -1, 32));

        U_Name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(U_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 219, 146, 28));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 106, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/project/kendriya-vidyalaya-sangathan-Color (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
               Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","shubham");
               PreparedStatement ps1=conn1.prepareStatement("Select * from student_data where Aadhar_No=(?)");
               ps1.setInt(1,Integer.parseInt(Aadhar_No.getText()));
               ResultSet rs1=ps1.executeQuery();
               if(rs1.next()){
                   Connection conn2=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","shubham");
                   PreparedStatement ps2= conn2.prepareStatement("select * from id where username=?");
                   ps2.setString(1,U_Name.getText());
                   u_name=U_Name.getText();
                   ResultSet rs2=ps2.executeQuery();
                      if(rs2.next()){
                          this.setVisible(false);
                          new Forgot_PS2().forgot_PS2();
                      }
               }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void get_Forgot() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forgot_Password().setVisible(true);
            }
        });
    }
    public static String getUserName(){
        return u_name;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Aadhar_No;
    private javax.swing.JTextField U_Name;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
