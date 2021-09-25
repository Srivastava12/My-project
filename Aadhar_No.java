package my.project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class Aadhar_No extends javax.swing.JFrame {
    public static ResultSet rs;
    public Aadhar_No() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        A_No = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 130, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Enter Last 4 Digit of Aadhar No");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 194, -1, 30));

        A_No.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        A_No.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(A_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 70, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/project/kendriya-vidyalaya-sangathan-Color (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
            try{
                 Connection conn=conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","shubham");
                 PreparedStatement ps=conn.prepareStatement("Select * from student_data where Aadhar_No=(?)");
                 ps.setInt(1,Integer.parseInt(A_No.getText()));
                 rs=ps.executeQuery();
                 if(rs.next()){
                   Get_Details obj=new Get_Details();
                   obj.setVisible(true);
                   obj.show_data();
                   this.setVisible(false);
                 }
                 else
                   JOptionPane.showMessageDialog(this,"WRONG AADHAR NO");
            }catch(Exception e){
                 System.out.println(e); 
            }
    }//GEN-LAST:event_jButton1ActionPerformed
    public static ResultSet get_RS_Object(){
        return rs;
    }
    public void Aadhar_NO() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aadhar_No().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A_No;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
