package searchPublicWifi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverTest {
    public static Connection getMySqlConnection() {
        // TODO Auto-generated method stub
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // DB URL
            String url = "jdbc:mysql://localhost:3306/mysql?serverTimezone=UTC";
            // DB ID
            String userId = "root";
            // DB PW
            String password = "hello12!";

            con = DriverManager.getConnection(url, userId, password);

            System.out.println("Success");

            return con;
        } catch (SQLException ex) {
            System.out.println("SQLException" + ex);
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Exception:" + ex);
            ex.printStackTrace();
        }

        return con;
    }

}