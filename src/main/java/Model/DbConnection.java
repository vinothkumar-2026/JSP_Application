package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    static String url = "jdbc:mysql://localhost:3306/exammanagement";
    static String user = "root";
    static String password = "Vinoth04$";

    public static Connection dbconnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("sql error" + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("class no found error" + e.getMessage());
        }
        return conn;
    }
}