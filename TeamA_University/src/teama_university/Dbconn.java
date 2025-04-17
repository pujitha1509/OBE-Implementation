package teama_university;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconn {
    public static Connection connectDB() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:university.sqlite");
            System.out.println("Connection Successful");
            return con;
        } catch (Exception e) {
            System.out.println("Connection Failed " + e);
            return null;
        }
    }
}
