package pl.remadag.madzia.pat.database.procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * PostgreSQL procedures
 * User: marcin
 * Date: 2010-08-24
 */
public class PostgreSQLProcedures implements SpiderProcedures {

    /**
     * SQL connection.
     */
    private Connection sqlConn = null;

    public PostgreSQLProcedures(final Connection connection) {
        this.sqlConn = connection;
    }

    @Override
    public void callInsert(String statementString) throws SQLException {
/*        String sqlString = statementString;
        CallableStatement statement = sqlConn.prepareCall(sqlString);
        statement.execute();
        int iStatus = statement.getInt(1);
        sqlConn.commit();*/
        Statement statement = sqlConn.createStatement();
//        statement.executeU(statementString);
        Statement s = null;
        try {
          s = sqlConn.createStatement();
        } catch (SQLException se) {
          System.out.println("We got an exception while creating a statement:" +
                             "that probably means we're no longer connected.");
          se.printStackTrace();
          System.exit(1);
        }

        int m = 0;

        try {
          m = s.executeUpdate(statementString);
        } catch (SQLException se) {
          System.out.println("We got an exception while executing our query:" +
                             "that probably means our SQL is invalid");
          se.printStackTrace();
          System.exit(1);
        }

        System.out.println("Successfully modified " + m + " rows.\n");

    }

    @Override
    public void callSelectP1(String filenameP1) throws SQLException {
        CallableStatement statement = sqlConn.prepareCall("COPY (SELECT * FROM ankieta_pat) TO '"+ filenameP1+"' WITH CSV;");
        statement.execute();
        sqlConn.commit();
    }

}
