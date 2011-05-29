package pl.remadag.madzia.pat;

import pl.remadag.madzia.pat.data.ComplexTriple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
//        dbTool.selectStatments("1g");
//        dbTool.selectStatments("1h");
//        dbTool.selectStatments("1i");
//        dbTool.selectStatments("1j");
//        dbTool.selectStatments("1k");
//        dbTool.selectStatments("1l");
//        dbTool.selectStatments("1m");
//        dbTool.selectStatments("1n");
//        dbTool.selectStatments("1o");
//        dbTool.selectStatments("1p");
//        dbTool.selectStatments("1q");
//        dbTool.selectStatments("1r");
//        dbTool.selectStatments("1s");
//        dbTool.selectStatments("1t");
//        dbTool.selectStatments("1u");
//        dbTool.selectStatments("1v");
//        dbTool.selectStatments("1w");
//        dbTool.selectStatments("1x");
//        dbTool.selectStatments("1y");
//        dbTool.selectStatments("1z");

//        dbTool.selectStatments("2a");
//        dbTool.selectStatments("2b");
//        dbTool.selectStatments("2c");
//        dbTool.selectStatments("2d");
//        dbTool.selectStatments("2e");
//        dbTool.selectStatments("2f");
//        dbTool.selectStatments("2g");
//        dbTool.selectStatments("2h");
//        dbTool.selectStatments("2i");
//        dbTool.selectStatments("2j");
//        dbTool.selectStatments("2k");
//        dbTool.selectStatments("2l");
//        dbTool.selectStatments("2m");
//        dbTool.selectStatments("2n");
//        dbTool.selectStatments("2o");
//        dbTool.selectStatments("2p");
//        dbTool.selectStatments("2q");
//        dbTool.selectStatments("2r");
//        dbTool.selectStatments("2s");
//        dbTool.selectStatments("2t");
//        dbTool.selectStatments("2u");
//        dbTool.selectStatments("2v");
//        dbTool.selectStatments("2w");

//        dbTool.selectStatments("19a");
//        dbTool.selectStatments("19b");
//        dbTool.selectStatments("19c");
//        dbTool.selectStatments("19d");
//        dbTool.selectStatments("19e");
//        dbTool.selectStatments("19f");
//        dbTool.selectStatments("19g");
//        dbTool.selectStatments("19h");
//        dbTool.selectStatments("19i");
//        dbTool.selectStatments("19j");
//        dbTool.selectStatments("19k");
//        dbTool.selectStatments("19l");
//        dbTool.selectStatments("19ll");

//        dbTool.selectStatments("22a");
//        dbTool.selectStatments("22b");
//        dbTool.selectStatments("22c");
//        dbTool.selectStatments("22d");
//        dbTool.selectStatments("22e");
//        dbTool.selectStatments("22f");
//        dbTool.selectStatments("22g");
//        dbTool.selectStatments("22h");
//        dbTool.selectStatments("22i");
//        dbTool.selectStatments("22j");
//        dbTool.selectStatments("22k");
//        dbTool.selectStatments("22l");
//        dbTool.selectStatments("22ll");
//        dbTool.selectStatments("22m");
//        dbTool.selectStatments("22n");
//        dbTool.selectStatments("22o");

//        dbTool.selectStatments("3");
//        dbTool.selectStatments("4");
//        dbTool.selectStatments("8");
//        dbTool.selectStatments("9");
//        dbTool.selectStatments("14");
//        dbTool.selectStatments("23");
//        dbTool.selectStatments("24");
//        dbTool.selectStatments("25");
//        dbTool.selectStatments("26");
//        dbTool.selectStatments("27");
//        dbTool.selectStatments("29");
//        dbTool.selectStatments("30");

        Map<String, String> lettersMatching = new HashMap<String, String>();
        lettersMatching.put("a", "alicja");
        lettersMatching.put("b", "bachleda");
        lettersMatching.put("c", "c");
        lettersMatching.put("d", "d");
        lettersMatching.put("e", "e");
        lettersMatching.put("f", "f");
        lettersMatching.put("g", "g");
        lettersMatching.put("h", "h");
        lettersMatching.put("i", "i");
        lettersMatching.put("j", "j");
        lettersMatching.put("k", "k");
        lettersMatching.put("l", "l");
        lettersMatching.put("m", "m");
        lettersMatching.put("n", "n");
        lettersMatching.put("o", "o");
        lettersMatching.put("p", "p");
        lettersMatching.put("q", "q");
        lettersMatching.put("r", "r");
        lettersMatching.put("s", "s");
        lettersMatching.put("t", "t");
        lettersMatching.put("u", "u");
        lettersMatching.put("v", "v");
        lettersMatching.put("w", "w");
        lettersMatching.put("x", "x");
        lettersMatching.put("y", "ąężóź");
        lettersMatching.put("z", "zżź");


//        dbTool.selectComplex("1", lettersMatching, "");
//        dbTool.selectComplex("1", lettersMatching, "where code like '%m%' or code like '%M%'");
//        dbTool.selectComplex("1", lettersMatching, "where code like '%k%' or code like '%K%'");

//        dbTool.selectComplex("1", lettersMatching, "where m_mz = 'a'");
//        dbTool.selectComplex("1", lettersMatching, "where m_mz = 'b'");
//        dbTool.selectComplex("1", lettersMatching, "where m_mz = 'c'");
//        dbTool.selectComplex("1", lettersMatching, "where m_mz = 'd'");
//        dbTool.selectComplex("1", lettersMatching, "where m_mz = 'e'");
//
//        dbTool.selectComplex("1", lettersMatching, "where m_wm not in ('a','b','c','d','e', 'f', 'g')'");
//        dbTool.selectComplex("1", lettersMatching, "where m_wm = 'c'");
//        dbTool.selectComplex("1", lettersMatching, "where m_wm = 'd'");
//        dbTool.selectComplex("1", lettersMatching, "where m_wm = 'e'");
//        dbTool.selectComplex("1", lettersMatching, "where m_wm = 'f'");
//        dbTool.selectComplex("1", lettersMatching, "where m_wm = 'g'");
//
//        dbTool.selectComplex("1", lettersMatching, "where m_wo = 'c'");
//        dbTool.selectComplex("1", lettersMatching, "where m_wo = 'd'");
//        dbTool.selectComplex("1", lettersMatching, "where m_wo = 'e'");
//        dbTool.selectComplex("1", lettersMatching, "where m_wo = 'f'");
//        dbTool.selectComplex("1", lettersMatching, "where m_wo = 'g'");
//
//        dbTool.selectComplex("1", lettersMatching, "where m_wykm not in ('a','b','c','d')");
//        dbTool.selectComplex("1", lettersMatching, "where m_wykm = 'a'");
//        dbTool.selectComplex("1", lettersMatching, "where m_wykm = 'b'");
//        dbTool.selectComplex("1", lettersMatching, "where m_wykm = 'c'");
//        dbTool.selectComplex("1", lettersMatching, "where m_wykm = 'd'");
//
//        dbTool.selectComplex("1", lettersMatching, "where m_wyko = 'a'");
//        dbTool.selectComplex("1", lettersMatching, "where m_wyko = 'b'");
//        dbTool.selectComplex("1", lettersMatching, "where m_wyko = 'c'");
//        dbTool.selectComplex("1", lettersMatching, "where m_wyko = 'd'");

//        dbTool.selectComplex("1", lettersMatching, "where m_lr = '0'");
//        dbTool.selectComplex("1", lettersMatching, "where m_lr = '1'");
//        dbTool.selectComplex("1", lettersMatching, "where m_lr = '2'");
//        dbTool.selectComplex("1", lettersMatching, "where m_lr = '3'");
//        dbTool.selectComplex("1", lettersMatching, "where m_lr in ('4', '5', '6', '7')");
//
//        dbTool.selectComplex("1", lettersMatching, "where m_wr not in ('a','b','c')");
//        dbTool.selectComplex("1", lettersMatching, "where m_wr LIKE '%a%'");
//        dbTool.selectComplex("1", lettersMatching, "where m_wr LIKE '%b%'");
//        dbTool.selectComplex("1", lettersMatching, "where m_wr LIKE '%c%'");

    }

}
