package pl.remadag.madzia.pat;

import pl.remadag.madzia.pat.database.LoadDriver;
import pl.remadag.madzia.pat.database.procedure.PostgreSQLProcedures;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

/**
 * DB Tools
 */
public class DBTools {

    public void saveLineInDB(Collection<String> lines) {
            for (String line : lines) {
                String[] recordsOnLine = line.split(";");
                String statement = buildInsertStatememt(recordsOnLine);
                System.out.println("Dodam: " + statement);

                Connection sqlConn = LoadDriver.getPostgresConnection();
                PostgreSQLProcedures procedures = new PostgreSQLProcedures(sqlConn);
                try {
                    procedures.callStatus();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                System.out.println("Udalo sie!");
            }


    }

    private String buildInsertStatememt(String[] recordsOnLine) {
        StringBuilder builder = new StringBuilder();
        builder.append("INSERT INTO bbb (column1, column2, column3 ) VALUES (");
        for (String record : recordsOnLine) {
            builder.append(record.trim()).append(", ");
        }
        builder.deleteCharAt(builder.length()-2).append(")");
        return builder.toString();
    }
}
