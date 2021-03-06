package pl.remadag.madzia.pat.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


/**
 * Driver
 */
public class LoadDriver {


  public static Connection getPostgresConnection() {
    Connection connection = null;
    try {
      Class.forName("org.postgresql.Driver");

      String url = "jdbc:postgresql://localhost/magister_uj";
      Properties props = new Properties();
      props.setProperty("user", "marcin");
      props.setProperty("password", "marcin");

      connection = DriverManager.getConnection(url, props);
    } catch (Exception ex) {
      System.err.println("[getPostgresConnection] error while getting SQL connection" + ex);
      System.exit(1);
    }
//        System.out.println("[getPostgresConnection] connection get successfully");
    return connection;

  }
}