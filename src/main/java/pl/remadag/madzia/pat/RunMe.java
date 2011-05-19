package pl.remadag.madzia.pat;

import java.util.List;

/**
 * Main class
 */
public class RunMe {
    public static final String FILENAME = "/home/marcin/projects/madzia/magister_pat/ank_tst/ankieta_good.csv";
//    public static final String FILENAME_P1 = "/home/marcin/projects/madzia/magister_pat/ank_tst/p1.csv";
    public static final String FILENAME_P1 = "/tmp/p1.csv";


    public static void main(String[] args) {

        CSVReader reader = new CSVReader(FILENAME);
        DBTools dbTool = new DBTools();
        reader.parse();
//        dbTool.saveLineInDB(reader.getData());
        dbTool.selectStatments(FILENAME_P1);

    }

}
