package pl.gadamer.phd.spider.database.procedure;

/**
 * Class representing procedures in DB.
 * User: Marcin
 * Date: 2009-12-13
 * Time: 13:38:04
 */
public class ProcedureConst {

  public static final String ADD_WORDS_PROC_NAME = "addWords";
  public static final String ADD_WORDS_PROC_PARAMS = "(?, ?, ?)";

  public static final String ADD_LINK_PROC_NAME = "addLink";
  public static final String ADD_LINK_PROC_PARAMS = "(?)";
  public static final String ADD_SAVE_LINK = "{call " + ADD_LINK_PROC_NAME + ADD_LINK_PROC_PARAMS + "}";

  public static final String MAKE_STATISTICS_PROC_NAME = "makeStatistics";
  public static final String MAKE_STATISTICS_PROC_PARAMS = "(?, ?, ?, ?)";
  public static final String MAKE_STATISTICS = "{call " + MAKE_STATISTICS_PROC_NAME + MAKE_STATISTICS_PROC_PARAMS + "}";
}