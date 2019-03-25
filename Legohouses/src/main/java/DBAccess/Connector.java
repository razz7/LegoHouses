package DBAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 The purpose of Connector is to...

 @author rh
 */
public class Connector {


    private static final String URL = "jdbc:mysql://167.99.222.204:3306/useradmin?autoReconnect=true&useSSL=false";
    private static final String USERNAME = "LegoUser";
    private static final String PASSWORD = "SqlPassword1(";
    
    //private static final String URL = "jdbc:mysql://localhost:3306/useradmin";
    //private static final String USERNAME = "root";
    //private static final String PASSWORD = "1234";

    private static Connection singleton;

    public static void setConnection( Connection con ) {
        singleton = con;
    }

    public static Connection connection() throws ClassNotFoundException, SQLException {
        if ( singleton == null ) {
            Class.forName( "com.mysql.cj.jdbc.Driver" );
            singleton = DriverManager.getConnection( URL, USERNAME, PASSWORD );
        }
        return singleton;
    }

}

