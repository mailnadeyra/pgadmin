import java.sql.*;



public class Main {
    public static void main(String[] args) {
        Connection c = null;
        Statement stmt = null;
        ResultSet r;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Rizwana");
            System.out.println("database connection successfully connected");
            stmt=c.createStatement();
//            String sql="CREATE TABLE COMPANY1" +
//                    "(ID INT PRIMARY KEY NOT NULL," +
//                    "NAME VARCHAR(10) NOT NULL," +
//                    "AGE INT NOT NULL," +
//                    "ADDRESS VARCHAR(50)," +
//                    "SALARY INT)";

//            System.out.println();
//            sql = "INSERT INTO COMPANY1 VALUES(10,'RIZWANA',18,'VJY',2000)";
//          stmt.executeUpdate(sql);
//          sql = "INSERT INTO COMPANY1 VALUES(11,'venkat',19,'bangalore',3000)";
//          stmt.executeUpdate(sql);
//           sql = "INSERT INTO COMPANY1 VALUES(12,'shanu',20,'canada',4000)";
//           stmt.executeUpdate(sql);
//           sql = "INSERT INTO COMPANY1 VALUES(13,'shani',21,'vjy',5000)";
//           stmt.executeUpdate(sql);
//         sql = "INSERT INTO COMPANY1 VALUES(14,'bablu',22,'hyd',6000)";
//        stmt.executeUpdate(sql);
//        sql = "INSERT INTO COMPANY1 VALUES(15,'asha',23,'pune',7000)";
//            stmt.executeUpdate(sql);
//        System.out.println();
//            sql="insert into company1(id,name,age,address,salary) values(23,'bablu',23,'canada',3400)";
//            sql="insert into compan1y(id,name,age,address,salary) values(33,'bab',73,'cr',670)";
//            stmt.executeUpdate(sql);
            r=stmt.executeQuery("select * from company1");
      while(r.next())
       {
               System.out.println(r.getInt("id"));
               System.out.println(r.getString("name"));
                System.out.println(r.getInt("age"));
                System.out.println(r.getInt("address"));
                System.out.println(r.getInt("salary"));


            }


            stmt.close();
            c.close();

        }
        catch (Exception e)
        {
            System.out.println(e.getClass().getName()+":"+e.getMessage());
            System.exit(0);
        }
        System.out.println("table created succeccfuly");

    }
}