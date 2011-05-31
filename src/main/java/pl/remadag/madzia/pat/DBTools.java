package pl.remadag.madzia.pat;

import pl.remadag.madzia.pat.data.ComplexTriple;
import pl.remadag.madzia.pat.data.TripleComparator;
import pl.remadag.madzia.pat.database.LoadDriver;
import pl.remadag.madzia.pat.database.procedure.PostgreSQLProcedures;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

/**
 * DB Tools
 */
public class DBTools {

    public void saveLineInDB(Collection<String> lines) {
        for (String line : lines) {
            String[] recordsOnLine = line.split(";");
            System.out.println("linia: " + recordsOnLine[0]);
            String statement = buildInsertStatememt(recordsOnLine);
            Connection sqlConn = LoadDriver.getPostgresConnection();
            PostgreSQLProcedures procedures = new PostgreSQLProcedures(sqlConn);
            try {
                procedures.callInsert(statement);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Wywolalem wszystkie INSERTy");
    }

    public void selectStatments(String question) {
        System.out.println("Wywoluje select P_" + question);

        Connection sqlConn = LoadDriver.getPostgresConnection();
        PostgreSQLProcedures procedures = new PostgreSQLProcedures(sqlConn);
        try {
            procedures.callSelectPWykOA(question);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private String buildInsertStatememt(String[] recordsOnLine) {
        StringBuilder builder = new StringBuilder();
        builder.append("INSERT INTO ankieta_pat(" +
                "code, p_1a, p_1b, p_1c, p_1d, p_1e, p_1f, p_1g, p_1h, p_1i, p_1j," +
                "p_1k, p_1l, p_1m, p_1n, p_1o, p_1p, p_1q, p_1r, p_1s, p_1t, p_1u," +
                "p_1v, p_1w, p_1x, p_1y, p_1z, p_2a, p_2b, p_2c, p_2d, p_2e, p_2f," +
                "p_2g, p_2h, p_2i, p_2j, p_2k, p_2l, p_2m, p_2n, p_2o, p_2p, p_2q," +
                "p_2r, p_2s, p_2t, p_2u, p_2v, p_2w, p_3, p_4, p_8, p_9, p_14," +
                "p_16, p_19a, p_19b, p_19c, p_19d, p_19e, p_19f, p_19g, p_19h," +
                "p_19i, p_19j, p_19k, p_19l, p_19ll, p_20, p_22a, p_22b, p_22c," +
                "p_22d, p_22e, p_22f, p_22g, p_22h, p_22i, p_22j, p_22k, p_22l," +
                "p_22ll, p_22m,  p_22n, p_22o, p_23, p_24, p_25, p_26, p_27, p_29, p_30," +
                "m_mz, m_lr, m_wr, m_wm, m_wo, m_wykm, m_wyko) VALUES (");
        for (String record : recordsOnLine) {
            builder.append('\'').append(record.trim()).append("\', ");
        }
        builder.deleteCharAt(builder.length() - 2).append(")");
        return builder.toString();
    }

    public void selectComplex(String question, Map<String, String> letters, String where) {
        System.out.println();
        System.out.println();
        System.out.println(where);
        List<ComplexTriple> triple = new ArrayList<ComplexTriple>();
        for (String letter : letters.keySet()) {
            Connection sqlConn = LoadDriver.getPostgresConnection();
            PostgreSQLProcedures procedures = new PostgreSQLProcedures(sqlConn);
            try {
                ComplexTriple result = procedures.callSelectComplex(question, letter, where);
                triple.add(result);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        printTriples(triple, letters);
    }

    private void printTriples(List<ComplexTriple> triple, Map<String, String> matching) {
        Collections.sort(triple, new TripleComparator());
        for (ComplexTriple complexTriple : triple) {
            for(String key: matching.keySet()) {
                if(key.equals(complexTriple.getLetter())) {
                    System.out.println(matching.get(key));
                }
            }
        }
    }

        public void selectUnionStatments(String question) {
        System.out.println("Wywoluje union select dla P_" + question);

        Connection sqlConn = LoadDriver.getPostgresConnection();
        PostgreSQLProcedures procedures = new PostgreSQLProcedures(sqlConn);
        try {
            procedures.callUnionSelectP(question);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
