package pl.remadag.madzia.pat.database.procedure;

import java.sql.SQLException;

/**
 * Definition of all procedures
 * User: marcin
 * Date: 2010-08-24
 */
public interface SpiderProcedures {

  /**
   * Adding triple words to defined tables in DB
   * @param statementString statement
   * @throws SQLException exception
   */
  public void callInsert(String statementString) throws SQLException;

  public void callSelectP1(String filenameP1) throws SQLException;

}
