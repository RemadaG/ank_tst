package pl.remadag.madzia.pat.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JdbcUtil class used for closing statement, resultSet and connection
 * User: Marcin
 * Date: 2009-12-13
 * Time: 12:47:47
 */
public class JdbcUtils {

  public static void close(Connection connection) {
    if (connection != null) try {
      connection.close();
    } catch (SQLException ex) {
      System.err.println("[close] Problem closing connection." + ex);
    }
  }

  public static void close(Statement statement) {
    if (statement != null) try {
      statement.close();
    } catch (SQLException ex) {
      System.err.println("[close] Problem closing statement." + ex);
    }
  }

  public static void close(ResultSet resultSet) {
    if (resultSet != null) try {
      resultSet.close();
    } catch (SQLException ex) {
      System.err.println("[close] Problem closing result set." + ex);
    }
  }
}