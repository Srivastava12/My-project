package my.project;
import java.sql.*;
public class Get_Details extends javax.swing.JFrame {
    ResultSet rs;
    public Get_Details() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        D_of_B = new javax.swing.JLabel();
        A_NO = new javax.swing.JLabel();
        F_Name = new javax.swing.JLabel();
        M_Name = new javax.swing.JLabel();
        Vill = new javax.swing.JLabel();
        Ps = new javax.swing.JLabel();
        Diss = new javax.swing.JLabel();
        State = new javax.swing.JLabel();
        Pin_Cod = new javax.swing.JLabel();
        C_Add = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 40, 20));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Date of Borth");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 90, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Last 4 Digits of Aadhar No");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Father Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Mother Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Parmanent Address");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Carent Address");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        Name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 150, 20));

        D_of_B.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(D_of_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 130, 20));

        A_NO.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(A_NO, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 130, 20));

        F_Name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(F_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 120, 20));

        M_Name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(M_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 110, 20));

        Vill.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Vill, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 130, 20));

        Ps.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 120, 20));

        Diss.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(Diss, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 120, 20));

        State.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(State, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 120, 20));

        Pin_Cod.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Pin_Cod.setText("1");
        jPanel1.add(Pin_Cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 90, 20));

        C_Add.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(C_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 270, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Vill");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 20, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Ps");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Diss");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("State");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 304, -1, 20));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Pin_Code");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/project/kendriya-vidyalaya-sangathan-Color (1).png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 380, 320));

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
    public void get_Details(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aadhar_No().setVisible(true);
            }
        });
    }
    void show_data(){
       rs=Aadhar_No.get_RS_Object();
       try{
           Name.setText(rs.getString("name"));
           D_of_B.setText(rs.getString("D_of_B"));
           A_NO.setText(rs.getInt("Aadhar_No")+"");
           F_Name.setText(rs.getString("Father_name"));
           M_Name.setText(rs.getString("Mother_name"));
           Vill.setText(rs.getString("Vill"));
           Ps.setText(rs.getString("Ps"));
           Diss.setText(rs.getString("Distric"));
           State.setText(rs.getString("State"));
           Pin_Cod.setText(rs.getInt("Pin_code")+"");
           C_Add.setText(rs.getString("Carent_Address"));
       }
       catch(Exception e){
           System.out.println(e);
       }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A_NO;
    private javax.swing.JLabel C_Add;
    private javax.swing.JLabel D_of_B;
    private javax.swing.JLabel Diss;
    private javax.swing.JLabel F_Name;
    private javax.swing.JLabel M_Name;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Pin_Cod;
    private javax.swing.JLabel Ps;
    private javax.swing.JLabel State;
    private javax.swing.JLabel Vill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
