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
    public void callSelectP(String question) throws SQLException {
        CallableStatement statement = sqlConn.prepareCall("COPY ( select p_" + question + "," +
                "sum(case when null is null then 1 else 0 end) as all,''," +
                "sum(case when code like '%M%' then 1 else 0 end) as m,''," +
                "sum(case when code like '%K%' then 1 else 0 end) as k,''," +

                "sum(case when m_mz = 'a' then 1 else 0 end) as m_mza,''," +
                "sum(case when m_mz = 'b' then 1 else 0 end) as m_mzb,''," +
                "sum(case when m_mz = 'c' then 1 else 0 end) as m_mzc,''," +
                "sum(case when m_mz = 'd' then 1 else 0 end) as m_mzd,''," +
                "sum(case when m_mz = 'e' then 1 else 0 end) as m_mze,''," +


                "sum(case when m_wm not in ('a','b','c','d','e', 'f', 'g') then 1 else 0 end) as wmnic,''," +
                "sum(case when m_wm = 'c' then 1 else 0 end) as wmc,''," +
                "sum(case when m_wm = 'd' then 1 else 0 end) as wmd,''," +
                "sum(case when m_wm = 'e' then 1 else 0 end) as wme,''," +
                "sum(case when m_wm = 'f' then 1 else 0 end) as wmf,''," +
                "sum(case when m_wm = 'g' then 1 else 0 end) as wmg,''," +

                "sum(case when m_wo = 'c' then 1 else 0 end) as woc,''," +
                "sum(case when m_wo = 'd' then 1 else 0 end) as wod,''," +
                "sum(case when m_wo = 'e' then 1 else 0 end) as woe,''," +
                "sum(case when m_wo = 'f' then 1 else 0 end) as wof,''," +
                "sum(case when m_wo = 'g' then 1 else 0 end) as wog,''," +


                "sum(case when m_wykm not in ('a','b','c','d') then 1 else 0 end) as wykmnic,''," +
                "sum(case when m_wykm = 'a' then 1 else 0 end) as wykma,''," +
                "sum(case when m_wykm = 'b' then 1 else 0 end) as wykmb,''," +
                "sum(case when m_wykm = 'c' then 1 else 0 end) as wykmc,''," +
                "sum(case when m_wykm = 'd' then 1 else 0 end) as wykmd,''," +

                "sum(case when m_wyko = 'a' then 1 else 0 end) as wykoa,''," +
                "sum(case when m_wyko = 'b' then 1 else 0 end) as wykob,''," +
                "sum(case when m_wyko = 'c' then 1 else 0 end) as wykoc,''," +
                "sum(case when m_wyko = 'd' then 1 else 0 end) as wykod, ''," +

                "sum(case when m_lr = '0' then 1 else 0 end) as lr_0, ''," +
                "sum(case when m_lr = '1' then 1 else 0 end) as lr_1, ''," +
                "sum(case when m_lr = '2' then 1 else 0 end) as lr_2, ''," +
                "sum(case when m_lr = '3' then 1 else 0 end) as lr_3, ''," +
                "sum(case when m_lr = '4' then 1 else 0 end) as lr_4, ''," +
                "sum(case when m_lr = '5' then 1 else 0 end) as lr_5, ''," +
                "sum(case when m_lr = '6' then 1 else 0 end) as lr_6, ''," +
                "sum(case when m_lr = '7' then 1 else 0 end) as lr_7, ''," +

                "sum(case when m_wr not in ('a','b','c') then 1 else 0 end) as wr_nic, ''," +
                "sum(case when m_wr = 'a' then 1 else 0 end) as wr_a, ''," +
                "sum(case when m_wr LIKE '%b%' then 1 else 0 end) as wr_b, ''," +
                "sum(case when m_wr LIKE '%c%' then 1 else 0 end) as wr_c, ''" +

                "    from ankieta_pat group by p_" + question + " order by p_" + question + " " +

                ") TO '/tmp/p_" + question + ".csv' WITH CSV;");
        statement.execute();
        sqlConn.commit();
    }

}
