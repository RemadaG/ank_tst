package pl.remadag.madzia.pat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;

/**
 * CSV Reader
 */
public class CSVReader {

    private Collection<String> data = new ArrayList<String>();
    private String fileName = "";

    public CSVReader(String fileName) {
        this.fileName = fileName;
    }

    public Collection<String> getData() {
        return data;
    }

    public void parse() {
        Collection<String> lines = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(
                    new File(fileName)
            ));
            String line;
            int counter = 0;
            while ((line = br.readLine()) != null) {
                if (counter > 0) {
                    lines.add(line);
                }
                counter++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        lines = prepareLines(lines);
        data = lines;
    }

    private Collection<String> prepareLines(Collection<String> lines) {
        Collection<String> good = new ArrayList<String>();
        for (String line : lines) {
            line = line.replace("\"", "");
            line = line.replace('\\', '_');
            line = line.replace(',', '_');
            good.add(line);
        }
        return good;
    }


}
