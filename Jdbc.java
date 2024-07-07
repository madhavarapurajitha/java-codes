import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.SQLException;
class DAO
{
    Connection con;
    DAO() throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("loaded");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3333/gecdb2", "root","rajitha");
        System.out.println("connected");
    }
    void insert(int eno,String ename) throws ClassNotFoundException,SQLException{
        Statement stmt=con.createStatement();
        int r=stmt.executeUpdate("insert into emp values("+eno+",'"+ename+"')");
        if(r==1){
            System.out.println("inserted");
        }
        else{
            System.out.println("not inserrted");
        }
    }
    void updateName(int eno,String ename) throws ClassNotFoundException,SQLException{
        String cmd="update emp set ename=? where eno=?";
        PreparedStatement pstmt=con.prepareStatement(cmd);
        pstmt.setString(1,ename);
        pstmt.setInt(2, eno);
        int r=pstmt.executeUpdate();
        if(r==1){
            System.out.println("updated");
        }else{
            System.out.println("updation failed");
        }
    }
    void deleteEmp(int eno) throws ClassNotFoundException,SQLException{
        String cmd="delete from emp where eno=11";
        PreparedStatement pstmt=con.prepareStatement(cmd);
        pstmt.setInt(1,eno);
        int r=pstmt.executeUpdate();
        if(r==1){
            System.out.println("deleted");
        }else{
            System.out.println("deletion failed");
        }
    }
    void viewAll() throws ClassNotFoundException,SQLException{
        String cmd="select * from emp";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(cmd);
        while(rs.next())
        {
            System.out.printf("%-5d%-30s%n",rs.getInt("eno"),rs.getString("ename")); 
        }
    }
}
    public class Jdbc{
        public static void main(String[] args) throws ClassNotFoundException,SQLException{
            DAO dao=new DAO();
            Scanner scan=new Scanner(System.in);
            do{
                System.out.println("1.insert");
                System.out.println("2.update");
                System.out.println("3.delete");
                System.out.println("4.viewAll");
                System.out.println("option");
                int opt=scan.nextInt();
                switch(opt){
                    case 1:dao.insert(20,"seetha");
                           break;
                    case 2:dao.updateName(20,"ram");
                           break;
                    case 3:dao.deleteEmp(20);
                           break;
                    case 4:dao.viewAll();
                           break;
                    default:System.out.println("invalid option");
                           break;
                } 
                  System.out.println("continue(1/0)");
                  int r=scan.nextInt();
                  if(r==0){
                     break;
                  }
                }while(true);
        }
}           
    
