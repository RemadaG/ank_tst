package pl.gadamer.madzia.pat;

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
