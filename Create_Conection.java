package my.project;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
class Create_Conection {
    Connection conn=null;
    int n=0;
     public Connection create_Conection(){
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","shubham");
            System.out.println("Connection Established");//This line for programmers and it's working of debugging purpose
        }
        catch(Exception e){
            System.out.println(e);//This line for programmers and it's working of debugging purpose
        }
        finally{
            return conn;
        }
    }
    public void create_Id(String u_name,String password,JLabel jl,JFrame jf){
        if(u_name.length()>10){
            JOptionPane.showMessageDialog(jf,"USERNAME OUTOF LENGTH ");
            jf.dispose();
        }
        try{ 
        int cheak=0;
        PreparedStatement ps1=conn.prepareStatement("select * from id where username=?");
        ps1.setString(1, u_name);
           ResultSet rs=ps1.executeQuery();
               if(rs.next()){
                  ++cheak;
                  JOptionPane.showMessageDialog(jf,"Already exists please try again");
                  jf.dispose();
               }
        if(cheak==0){
        PreparedStatement ps=conn.prepareStatement("insert into id values(?,?)");
        ps.setString(1,u_name);
        ps.setString(2,password);
        n=ps.executeUpdate();
        }
        if(n==1){
            JOptionPane.showMessageDialog(jf,"USERNAME CREATE SUCCESFULLY");
            jf.dispose();
        }
      }
      catch(Exception e){
          System.out.println(e); //This line for programmers and it's working of debugging purpose
      }
    }
    public static void main(String[]args){
        Create_Conection obj=new Create_Conection();
        obj.create_Conection();
    }
}
