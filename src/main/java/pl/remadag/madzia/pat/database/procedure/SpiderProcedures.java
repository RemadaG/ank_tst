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
   * @throws SQLException exception
   */
  public void callStatus() throws SQLException;

}