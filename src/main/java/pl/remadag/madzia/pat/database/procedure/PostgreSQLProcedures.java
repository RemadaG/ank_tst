package pl.remadag.madzia.pat.database.procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

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
    public void callStatus() throws SQLException {
        String sqlString = "SELECT * FROM DUAL}";
        CallableStatement statement = sqlConn.prepareCall(sqlString);
        statement.execute();
        int iStatus = statement.getInt(1);
        sqlConn.commit();
    }

}
