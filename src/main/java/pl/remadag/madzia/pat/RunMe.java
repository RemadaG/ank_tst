package pl.remadag.madzia.pat;

import java.util.List;

/**
 * Main class
 */
public class RunMe {
    public static final String FILENAME = "/home/marcin/projects/madzia/magister_pat/ank_tst/ankieta_last_rows.csv";
//    public static final String FILENAME_P1 = "/home/marcin/projects/madzia/magister_pat/ank_tst/p1.csv";


    public static void main(String[] args) {

        CSVReader reader = new CSVReader(FILENAME);
        DBTools dbTool = new DBTools();
        reader.parse();
//        dbTool.saveLineInDB(reader.getData());

//        dbTool.selectStatments("1a");
//        dbTool.selectStatments("1b");
//        dbTool.selectStatments("1c");
//        dbTool.selectStatments("1d");
//        dbTool.selectStatments("1e");

//        dbTool.selectStatments("1f");
        dbTool.selectStatments("1g");
        dbTool.selectStatments("1h");
        dbTool.selectStatments("1i");
        dbTool.selectStatments("1j");
        dbTool.selectStatments("1k");
        dbTool.selectStatments("1l");
        dbTool.selectStatments("1m");
        dbTool.selectStatments("1n");
        dbTool.selectStatments("1o");
        dbTool.selectStatments("1p");
        dbTool.selectStatments("1q");
        dbTool.selectStatments("1r");
        dbTool.selectStatments("1s");
        dbTool.selectStatments("1t");
        dbTool.selectStatments("1u");
        dbTool.selectStatments("1v");
        dbTool.selectStatments("1w");
        dbTool.selectStatments("1x");
        dbTool.selectStatments("1y");
        dbTool.selectStatments("1z");

    }

}
