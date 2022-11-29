import java.sql.*;
public class Main {
    public static void main(String[] args) {
        Connection c=null;
        Statement st=null;
        ResultSet r;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c=DriverManager.getConnection(("jdbc:oracle:thin:@localhost:1521:xe","system","Rizwana");
            System.out.println("successs");
            st=c.



        }


    }
}