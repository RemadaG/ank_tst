package pl.remadag.madzia.pat;

import java.util.List;

/**
 * Main class
 */
public class RunMe {
    public static final String FILENAME = "/home/marcin/projects/madzia/magister_pat/ankieta_good.csv";


    public static void main(String[] args) {

        CSVReader reader = new CSVReader(FILENAME);
        DBTools dbTool = new DBTools();
        reader.parse();
        dbTool.saveLineInDB(reader.getData());

    }

}
