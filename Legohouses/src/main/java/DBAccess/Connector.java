package DBAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 The purpose of Connector is to...

 @author rh
 */
public class Connector {

    private static final String IP = "167.99.222.204";
    private static final String port = "3306";
    private static final String Database = "useradmin";
    private static final String USERNAME = "LegoUser";
    private static final String PASSWORD = "SqlPassword1(";

    private static Connection singleton;

    public static void setConnection(Connection con) {
        singleton = con;
    }

    public static Connection connection() throws ClassNotFoundException, SQLException {
        if (singleton == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://" + IP + ":" + port + "/" + Database;
            singleton = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        return singleton;
    }

}
