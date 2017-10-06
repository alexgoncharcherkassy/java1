package task2.Db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
    final private static String url = "jdbc:mysql://localhost:3306/java-test?verifyServerCertificate=false&useSSL=true";
    final private static String user = "root";
    final private static String pass = null;

    private static Connection connection;

    public static Connection connect() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(url, user, pass);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return  connection;
    }

}
